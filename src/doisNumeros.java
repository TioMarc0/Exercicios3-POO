import java.util.Scanner;
public class doisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		System.out.println("digite o numero Base");
		int base = ent.nextInt();
		System.out.println("didgite o número expoente");
		int expo = ent.nextInt();
		int numero = 1;
		
		for(int a=1;a<=expo;a++) {
			 numero = (numero*base);
		}
		
		System.out.println("O resultado de "+base+" elevado a "+expo+" é "+numero);
		ent.close();
	}

}