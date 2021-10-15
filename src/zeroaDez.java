import java.util.Scanner;
public class zeroaDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float n = 20;
		
		do {
			System.out.println("Digite a nota de 0 a 10");
			  n = entrada.nextFloat();
		
		}while((n<0)||(n>10));
		
		entrada.close();
		
	}

}