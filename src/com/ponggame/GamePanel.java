package com.ponggame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import com.crud.Crud;
import com.game.Lobby;

public class GamePanel extends JPanel implements Runnable {

	static final int GAME_WIDTH = 1090;
	static final int GAME_HEIGHT = 555;
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
	static final int BALL_DIAMETER = 20;
	static final int PADDLE_WIDTH = 25;
	static final int PADDLE_HEIGHT = 100;

	static Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Ball ball;
	Score score;

	public static Thread countdownThread;
	public static int countdown;
	private static volatile boolean gameRunning = true;
	public static volatile boolean moveBol;
	private volatile boolean running = false;

	public static int scorePastP1;
	public static int scorePastP2;

	public static int winPastP1;
	public static int winPastP2;

	private static PongGame pongGameInstance;

	GamePanel() {
		startGame();

	}

	private void startGame() {
		JOptionPane.showMessageDialog(null, "Game Start");
		Crud.setScoreAndWinPastP1(Lobby.usernamePlayer1);
		Crud.setScoreAndWinPastP2(Lobby.usernamePlayer2);
		// stopGameThread();
		GamePanel.countdown = 10;
		gameRunning = true;
		running = true;
		moveBol = true;
		

		Score.player1 = 0;
		Score.player2 = 0;
		newPaddles();
		newBall();

		score = new Score(GAME_WIDTH, GAME_HEIGHT);
		this.setFocusable(true);
		this.addKeyListener(new AL());
		this.setPreferredSize(SCREEN_SIZE);

		gameThread = new Thread(this);
		PongGame.startTime();
		gameThread.start();
	}

	public void newBall() {
		random = new Random();
		ball = new Ball((GAME_WIDTH / 2) - (BALL_DIAMETER / 2), random.nextInt(GAME_HEIGHT - BALL_DIAMETER),
				BALL_DIAMETER, BALL_DIAMETER);
	}

	public void newPaddles() {
		paddle1 = new Paddle(0, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
		paddle2 = new Paddle(GAME_WIDTH - PADDLE_WIDTH, (GAME_HEIGHT / 2) - (PADDLE_HEIGHT / 2), PADDLE_WIDTH,
				PADDLE_HEIGHT, 2);
	}

	public void paint(Graphics g) {
		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image, 0, 0, this);
	}

	public void draw(Graphics g) {
		paddle1.draw(g);
		paddle2.draw(g);
		ball.draw(g);
		score.draw(g);
		Toolkit.getDefaultToolkit().sync();

	}

	public void move() {
		if (moveBol) {

			paddle1.move();
			paddle2.move();
			ball.move();
		}

	}

	public void checkCollision() {

		if (ball.y <= 0) {
			ball.setYDirection(-ball.yVelocity);
		}
		if (ball.y >= GAME_HEIGHT - BALL_DIAMETER) {
			ball.setYDirection(-ball.yVelocity);
		}

		if (ball.intersects(paddle1)) {
			ball.xVelocity = Math.abs(ball.xVelocity);
			ball.xVelocity++;
			if (ball.yVelocity > 0)
				ball.yVelocity++;
			else
				ball.yVelocity--;
			ball.setXDirection(ball.xVelocity);
			ball.setYDirection(ball.yVelocity);
		}
		if (ball.intersects(paddle2)) {
			ball.xVelocity = Math.abs(ball.xVelocity);
			ball.xVelocity++;
			if (ball.yVelocity > 0)
				ball.yVelocity++;
			else
				ball.yVelocity--;
			ball.setXDirection(-ball.xVelocity);
			ball.setYDirection(ball.yVelocity);
		}
		// membuat kedua paddle masing-masing tetap berada di sisi kanan atau sisi
		// bagian kiri panel
		if (paddle1.y <= 0)
			paddle1.y = 0;
		if (paddle1.y >= (GAME_HEIGHT - PADDLE_HEIGHT))
			paddle1.y = GAME_HEIGHT - PADDLE_HEIGHT;
		if (paddle2.y <= 0)
			paddle2.y = 0;
		if (paddle2.y >= (GAME_HEIGHT - PADDLE_HEIGHT))
			paddle2.y = GAME_HEIGHT - PADDLE_HEIGHT;
		// jika salah satu paddle berhasil membuat bola melewati paddle, maka diberikan
		// 1 poin
		// yang akan ditampilkan diatas layar dan langsung memunculkan bola baru
		if (ball.x <= 0) {
			Score.player2++;
			newPaddles();
			newBall();
			SwingUtilities.invokeLater(() -> {
				PongGame.jLabel3.setText(String.valueOf(Score.player2 / 10) + String.valueOf(Score.player2 % 10));
			});
			System.out.println("Player 2: " + Score.player2);
		}
		if (ball.x >= GAME_WIDTH - BALL_DIAMETER) {
			Score.player1++;
			newPaddles();
			newBall();
			SwingUtilities.invokeLater(() -> {
				PongGame.jLabel5.setText(String.valueOf(Score.player1 / 10) + String.valueOf(Score.player1 % 10));
			});
			System.out.println("Player 1: " + Score.player1);
		}
	}

	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks;
		double ns;
		double delta;
		amountOfTicks = 60.0;
		ns = 1000000000 / amountOfTicks;
		delta = 0;
		while (gameRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;

			while (running && delta >= 1) {
				move();
				checkCollision();
				delta--;
			}

			repaint();
		}
	}

	public class AL extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			paddle1.keyPressed(e);
			paddle2.keyPressed(e);
		}

		public void keyReleased(KeyEvent e) {
			paddle1.keyReleased(e);
			paddle2.keyReleased(e);
		}
	}

	public static void setPongGameInstance(PongGame pongGame) {
		pongGameInstance = pongGame;
	}

	public static void closed() {
		if (pongGameInstance != null) {
			pongGameInstance.dispose();
		}
		System.out.println("method berjalan");
	}

	// public void stopGameThread() {
	// isGameRunning = false;
	// if (gameThread != null) {
	// System.out.println("berhasil");
	// try {
	// gameThread.join(); // Wait for the thread to finish execution
	// } catch (InterruptedException e) {
	// e.printStackTrace();
	// }
	// }
	// gameThread = null;
	// }

	public static void endGame() {
		moveBol = false;
		gameRunning = false;
		if (scorePastP1 < Score.player1) {
			Crud.updateScoreP1(Lobby.usernamePlayer1, Score.player1);
		}

		if (scorePastP2 < Score.player2) {
			Crud.updateScoreP2(Lobby.usernamePlayer2, Score.player2);
		}

		if (Score.player1 > Score.player2) {

			Crud.updateWin(Lobby.usernamePlayer1, 1, winPastP1);
			// Crud.updateScore(Lobby.usernamePlayer1, Score.player1, winP1);
			JOptionPane.showMessageDialog(null, Lobby.usernamePlayer1 + " WIN", "Game Over",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (Score.player1 < Score.player2) {

			Crud.updateWin(Lobby.usernamePlayer2, 1, winPastP2);
			JOptionPane.showMessageDialog(null, Lobby.usernamePlayer2 + " WIN", "Game Over",
					JOptionPane.INFORMATION_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "DRAW", "Game Over", JOptionPane.INFORMATION_MESSAGE);
		}
		// Score.player1 = 0;
		// Score.player2 = 0;
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(() -> {
			PongGame.jLabel5.setText("00");
			PongGame.jLabel3.setText("00");
		});
		closed();

	}

}