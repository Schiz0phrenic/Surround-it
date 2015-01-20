import java.io.*;
public class TestGame {
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter grid size");
		int gs=Integer.parseInt(br.readLine());
		Surround.initialize(gs);
		Surround.displayMatrix();
		int moveFlag=2;
		while(true){
			if(moveFlag%2==0){
				//First player
				System.out.println("Enter first player move coordinates");
				int a=Integer.parseInt(br.readLine());
				int b=Integer.parseInt(br.readLine());
				Surround.oneMove(a, b);
				Surround.displayMatrix();
				boolean cont;
				do{
					cont=Surround.checkMatrix();
				}while(cont);
				Surround.displayMatrix();
				int res=Surround.checkMatrixFinal();
				if(res==1){
					System.out.println("Player 1 has won");System.exit(0);
				}
				else if(res==2){
					System.out.println("Player 2 has won");System.exit(0);
				}
				moveFlag++;
			}
			else{
				//Second player
				System.out.println("Enter second player move coordinates");
				int a=Integer.parseInt(br.readLine());
				int b=Integer.parseInt(br.readLine());
				Surround.twoMove(a, b);
				Surround.displayMatrix();
				boolean cont;
				do{
					cont=Surround.checkMatrix();
				}while(cont);
				Surround.displayMatrix();
				int res=Surround.checkMatrixFinal();
				if(res==1){
					System.out.println("Player 1 has won");System.exit(0);
				}
				else if(res==2){
					System.out.println("Player 2 has won");System.exit(0);
				}
				moveFlag++;
			}
		}
	}
}
