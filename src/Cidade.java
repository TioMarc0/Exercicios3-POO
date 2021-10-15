import java.util.Scanner;
public class Cidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double PA = 80000;
		double PB = 200000;
		int Km = 0;
		while(PA<PB) {
			Km = Km+1;
			PA = PA * 1.03;
			PB = PB * 1.015;
			if (PA>=PB)
				System.out.println("A Cidade A levou "+Km+" anos para superar a população da cidade B");
		}
		entrada.close();
	}

}