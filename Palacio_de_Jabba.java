import java.util.Scanner;


public class Palacio_de_Jabba {
	public static void main(String[] args) {
		
		Scanner posiones_scan = new Scanner(System.in);
		String Posiciones = posiones_scan.nextLine();
		
		String Luke = "L";
		String Jabba = "J";
		String gamorreanos = "s";
		String espacio = " ";

		String Lukes = Luke + Luke;
		String Jabbas = Jabba + Jabba;
		String JabbasLuke = Jabba + espacio + gamorreanos + espacio +Luke;
		String LukesJabba = Luke + espacio + gamorreanos + espacio + Jabba;
		String Jabba_Luke = Jabba + espacio + Luke;
		String Luke_Jabba = Luke + espacio + Jabba;
		String Luke_Luke = Luke + espacio + Luke;
		String Jabba_Jabba = Jabba + espacio + Jabba;

		if(Posiciones.equals("LJ") || Posiciones.equals("JL")){
		    System.out.println("Jabba is dead");
		}else if(Posiciones.equals("J")){
			System.out.println("Jabba can sleep");
		}else if(Posiciones.equals("L")){
			System.out.println("Jabba is on a trip");
		}else if(Posiciones.equals(Lukes) || Posiciones.equals(Jabbas) || Posiciones.equals(Luke_Luke) || Posiciones.equals(Jabba_Jabba)){
			System.out.println("Wrong palace");
		}else if(Posiciones.equals(JabbasLuke) || Posiciones.equals(LukesJabba)){
			System.out.println("Jabba is safe for now");
		}else if(Posiciones.equals(Jabba_Luke) || Posiciones.equals(Luke_Jabba)){
			System.out.println("Jabba is at risk");
		}else{
			System.out.println("Wrong palace");
		}
		
		
	
	}
}
