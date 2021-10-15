import java.util.Scanner;
public class somaFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner ent = new Scanner(System.in);
		System.out.println("informe o menor numero");
		int men = ent.nextInt();
		System.out.println("informe o maior numero");
		 int mai= ent.nextInt();
		men = men+1;
		int soma = 0; 
		 for (int i = men; i <mai; i++) { 
				System.out.print(i+"|");
				soma = soma+i;
				
		 }	
		 System.out.println("a soma dos dois numeros é "+soma );
		ent.close();	
}
}