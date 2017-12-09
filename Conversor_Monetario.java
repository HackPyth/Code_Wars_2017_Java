import java.util.Scanner;


public class Conversor_Monetario {
	public static void main(String[] args) {
		Scanner numeroscanner = new Scanner(System.in);
		System.out.println("Ponga el numero que necesite para el cambio: ");
		System.out.println("1 = euro\n2 = libra \n3 = dolar");
		String numerostr = numeroscanner.nextLine();
		int numero = Integer.parseInt(numerostr);
		
		int euro = 1;
		int libra = 2;
		int dolar = 3;
		
		if(numero == euro){
			Scanner Eur = new Scanner(System.in);
			System.out.println("Dinero en EUR: ");
			String Eurstr = Eur.nextLine();
			double Eurs = Integer.parseInt(Eurstr);
		
			double creditosEurs = Eurs * 1.08;
			System.out.println("Sus creditos son: "+creditosEurs);
		
		}else if(numero == libra){
			Scanner GBP = new Scanner(System.in);
			System.out.println("Dinero en GBP: ");
			String GBPstr = GBP.nextLine();
			double GBPs = Integer.parseInt(GBPstr);
		
			double creditosGBP = GBPs * 1.56;
			System.out.println("Sus creditos son: "+creditosGBP);
		
		}else if(numero == dolar){
			Scanner USD = new Scanner(System.in);
			System.out.println("Dinero en USD: ");
			String USDstr = USD.nextLine();
			double USDs = Integer.parseInt(USDstr);
		
			double creditosUSD = USDs * 0.99;
			System.out.println("Sus creditos son: "+creditosUSD);
		}else{
			System.out.println("No change sorry.");
		}

	}

}
