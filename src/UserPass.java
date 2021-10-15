import java.util.Scanner;
public class UserPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		String user = "usuario";
		String pass = "senha";		
		do {
		System.out.println("Digite seu Usuario");
		user = ent.nextLine();
		System.out.println("Digite sua senha ");
		pass =  ent.nextLine();
		if (user==pass);
			System.out.println("Erro");
		
		}while(user.equals(pass));	
		ent.close();
}
}