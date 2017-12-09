import java.util.Scanner;


public class La_Nomina_Del_Sith {

	public static void main(String[] args) {
		int creditos_de_trabajo = 10; //10 creditos
		int creditos_de_extra = 20; //20 creditos
		
		int horas_semanales = 40;
		
		Scanner horas_normales_scan = new Scanner(System.in);
		System.out.println("Horas trabajadas(Semanal): ");
		String horas_normales_str = horas_normales_scan.next();
		int horas_normales = Integer.parseInt(horas_normales_str);
		
		Scanner horas_extra_scan = new Scanner(System.in);
		System.out.println("Horas extras trabajadas: ");
		String horas_extra_str = horas_extra_scan.next();
		int horas_extra = Integer.parseInt(horas_extra_str);
		
		if(horas_normales >= horas_semanales){
			System.out.println("Nomina semanal: " + (horas_normales*creditos_de_trabajo));
			System.out.println("Nomina extra: " + (horas_extra*creditos_de_extra));
			System.out.println("Nomina total: " + ((horas_normales*creditos_de_trabajo)+(horas_extra*creditos_de_extra)));
		}else if(horas_normales < horas_semanales){
			System.out.println("Ha tebajado menos de: " + horas_semanales + ", lo siento.");
		}	
	}
}
