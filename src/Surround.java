public class Surround {
	static int size;
	static int grid[][];
	static boolean oneHasStarted;
	static boolean twoHasStarted;

	// Initialize game
	static void initialize(int x) {
		oneHasStarted = false;
		twoHasStarted = false;
		size = x;
		createMatrix();
	}

	// Show Start Status (debugging only)
	static void showStartStatus() {
		System.out.println(oneHasStarted);
		System.out.println(twoHasStarted);
	}

	// Initialize a null matrix
	private static void createMatrix() {
		grid = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				grid[i][j] = 0;
	}

	// Display the matrix
	static void displayMatrix() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(grid[i][j] + " ");
			System.out.println();
		}
	}

	// Move for first player
	static void oneMove(int x, int y) {
		if (grid[x - 1][y - 1] == 0) {
			grid[x - 1][y - 1] = 1;
			if (!oneHasStarted)
				oneHasStarted = true;
		} else
			System.out.println("Already filled");
	}

	// Move for second player
	static void twoMove(int x, int y) {
		if (grid[x - 1][y - 1] == 0) {
			grid[x - 1][y - 1] = 2;
			if (!twoHasStarted)
				twoHasStarted = true;
		} else
			System.out.println("Already filled");
	}

	// Check matrix for implicit changes
	static boolean checkMatrix() {
		int e,sOne,sTwo;
		boolean hasChanged=false;
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				e=grid[i][j];
				sOne=0;sTwo=0;
				if(e!=0){
					
				}
			}
		}
		return hasChanged;
	}

	// Check if somebody won
	static int checkMatrixFinal() {
		int sOne = 0;
		int sTwo = 0;
		if (!oneHasStarted || !twoHasStarted)
			return 0;
		else {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (grid[i][j] == 1)
						sOne++;
					if (grid[i][j] == 2)
						sTwo++;
				}
			}
			if (sOne == 0)
				return 2;
			else if (sTwo == 0)
				return 1;
			else
				return 0;
		}
	}

}
