import java.util.Scanner;
public class zeroaDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		int n = 20;
		
		do {
			System.out.println("Digite a nota de 0 a 10");
			  n = ent.nextInt();
		
		}while ((n<0)||(n>10));
		
		ent.close();
		
	}

}