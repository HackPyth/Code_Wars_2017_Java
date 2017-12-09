import java.util.Scanner;


public class Un_diamante_es_para_siempre {
	public static void main(String[] args) {
		

		Scanner ancho_diamante_scan = new Scanner(System.in);
		System.out.println("Ancho del diamante(1-5): ");
		String ancho_diamante = ancho_diamante_scan.next();
		
		if(ancho_diamante.equals("1")){
			System.out.println("  x  ");
		}else if(ancho_diamante.equals("2")){
			System.out.println("  xx ");
		}else if(ancho_diamante.equals("3")){
			System.out.println("  x  ");
			System.out.println(" xxx ");
			System.out.println("  x  ");
		}else 		if(ancho_diamante.equals("4")){
			System.out.println("  xx  ");
			System.out.println(" xxxx ");
			System.out.println("  xx  ");
		}else 		if(ancho_diamante.equals("5")){
			System.out.println("  x  ");
			System.out.println(" xxx ");
			System.out.println("xxxxx");
			System.out.println(" xxx ");
			System.out.println("  x  ");
		}else{
			System.out.println("ERR_CODE=100");
		}
		
	}
}
