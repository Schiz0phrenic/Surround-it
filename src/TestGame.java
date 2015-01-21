import java.io.*;

public class TestGame {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter grid size");
		int gs = Integer.parseInt(br.readLine());
		Surround.initialize(gs);
		Surround.displayMatrix();
		int moveFlag = 2;
		while (!Surround.isFull()) {
			if (moveFlag % 2 == 0) {
				// First player
				System.out.println("Enter first player move coordinates");
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				boolean moveCheck = Surround.oneMove(a, b);
				Surround.displayMatrix();
				Surround.checkMatrixOne();
				Surround.displayMatrix();
				int res = Surround.checkMatrixFinal();
				if (res == 1) {
					System.out.println("Player 1 has won");
					System.exit(0);
				} else if (res == 2) {
					System.out.println("Player 2 has won");
					System.exit(0);
				}
				if (moveCheck)
					moveFlag++;
			} else {
				// Second player
				System.out.println("Enter second player move coordinates");
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				boolean moveCheck = Surround.twoMove(a, b);
				Surround.displayMatrix();
				Surround.checkMatrixTwo();
				Surround.displayMatrix();
				int res = Surround.checkMatrixFinal();
				if (res == 1) {
					System.out.println("Player 1 has won");
					System.exit(0);
				} else if (res == 2) {
					System.out.println("Player 2 has won");
					System.exit(0);
				}
				if (moveCheck)
					moveFlag++;
			}
		}
		System.out.println("Match drawn");
	}
}
