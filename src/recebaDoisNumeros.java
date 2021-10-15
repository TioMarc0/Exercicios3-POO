import java.util.Scanner;
public class recebaDoisNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner ent = new Scanner(System.in);
		System.out.println("informe o menor numero");
		int men = ent.nextInt();
		System.out.println("informe o maior numero");
		 int mai= ent.nextInt();
		men = men+1;
		
		 for (int i = men; i <mai; i++) 
				System.out.print(i+"|");
			
		ent.close();	
			
			}	
		
			
	}