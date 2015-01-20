
public class TestGame {
	public static void main(String args[]){
		Surround.initialize(5);
		Surround.displayMatrix();System.out.println(Surround.checkMatrixFinal());System.out.println();Surround.showStartStatus();
		Surround.oneMove(4, 4);
		Surround.displayMatrix();System.out.println(Surround.checkMatrixFinal());System.out.println();Surround.showStartStatus();
		Surround.twoMove(1, 4);
		Surround.displayMatrix();System.out.println(Surround.checkMatrixFinal());System.out.println();Surround.showStartStatus();
	}
}
