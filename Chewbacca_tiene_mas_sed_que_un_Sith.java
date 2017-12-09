import java.util.*;

public class Chewbacca_tiene_mas_sed_que_un_Sith {
	public static void main(String[] args) {
		
		Scanner frase_Chewbacca_scan = new Scanner(System.in);
		System.out.println("Frase en Chewbacca: ");
		String frase_Chewbacca = frase_Chewbacca_scan.nextLine();
		
		String frase_robot = frase_Chewbacca.replace("GGWWWRGHH","beep").replace("RAWRGWAWGGR","boop").replace("RWGWGWARAHHHHWWRGGWRWRW","chuit").replace("WWWWWWWGGGGHHHRRRRW","tui").replace("GGGWARRRHHWWWW","pupi").replace("AAARARRRGWWWH","pipu");
		
		System.out.println("Frase en Binario Vocalizado: " + frase_robot);
	}
}
