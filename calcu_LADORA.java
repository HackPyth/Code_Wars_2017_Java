import java.util.*;

public class calcu_LADORA {
	public static void main(String[] args) {
		Scanner Primer_Numero_scan = new Scanner(System.in);
		System.out.println("Primer Numero: ");
		String Primer_Numero_str = Primer_Numero_scan.nextLine();
		float Primer_Numero = Integer.parseInt(Primer_Numero_str);
		int Primer_Numero_int = Integer.parseInt(Primer_Numero_str);
		
		Scanner Operando_scan = new Scanner(System.in);
		System.out.println("Operando(+ , -, *, /, ^): ");
		String Operando = Operando_scan.nextLine();
		
		Scanner Segundo_Numero_scan = new Scanner(System.in);
		System.out.println("Segundo numero: ");
		String Segundo_Numero_str = Segundo_Numero_scan.nextLine();
		float Segundo_Numero = Integer.parseInt(Segundo_Numero_str);
		int Segundo_Numero_int = Integer.parseInt(Segundo_Numero_str);
		
		if(Operando.equals("+")){
			System.out.println("Su resultado es: " + (Primer_Numero + Segundo_Numero));
		}else if(Operando.equals("-")){
			System.out.println("Su resultado es: " + (Primer_Numero - Segundo_Numero));
		}else if(Operando.equals("/")){
			System.out.println("Su resultado es: " + (Primer_Numero / Segundo_Numero));
		}else if(Operando.equals("*")){
			System.out.println("Su resultado es: " + (Primer_Numero * Segundo_Numero));
		}else if(Operando.equals("^")){
			System.out.println("Su resultado es: " + (Primer_Numero_int ^ Segundo_Numero_int));
		}		
		
	}

}
