import java.util.Scanner;
public class tabuada{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner ent = new Scanner(System.in);
		System.out.println("coloque o número e saiba sua tabuada");
		int numero = ent.nextInt();
		int TAM = 10;
		
		for (int a = 1; a<=TAM; a++)
			System.out.println(numero+ "X"+a+" ="+(a*numero) );
		
		ent.close();

	}

}
