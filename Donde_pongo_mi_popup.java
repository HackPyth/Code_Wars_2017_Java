import java.util.Scanner;


public class Donde_pongo_mi_popup {
	public static void main(String[] args) {
		
		Scanner target = new Scanner(System.in);
		System.out.println("Altura de la ventana principal: ");
		String targetH = target.next();
		int targetH_int = Integer.parseInt(targetH);
		
		System.out.println("Ancho de la ventana principal: ");
		String targetW = target.next();
		int targetW_int = Integer.parseInt(targetW);
		
		System.out.println("Altura de la segunda ventana: ");
		String popupH = target.next();
		int popupH_int = Integer.parseInt(targetH);
		
		System.out.println("Ancho de la segunda ventana: ");
		String popupW = target.next();
		int popupW_int = Integer.parseInt(popupW);
		
		System.out.println("Alineamiento vertical de la segunda ventana(T,C,B): ");
		String popupVA = target.next();
		
		System.out.println("Alineamiento horizontal de la segunda ventana(L,C,R): ");
		String popupHA = target.next();
		
		int T = (popupH_int);
		int B = (-1*popupH_int);
		
		float W_resta = targetW_int-popupW_int;
		float H_resta = targetH_int-popupH_int;

		float Ca = (float) ((H_resta)/2.0);
		float Cb = (float) ((W_resta)/2.0);

		int L = (-targetW_int+popupW_int);
		int R = (targetW_int+popupW_int);
		

		if (popupVA.equals("B") && popupHA.equals("L")){
			int popupX = L;
			int popupY = B;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("B") && popupHA.equals("C")){
			float popupX = Cb;
			int popupY = B;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("B") && popupHA.equals("R")){
			int popupX = R;
    		int popupY = B;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("C") && popupHA.equals("L")){
			int popupX = L;
			float popupY = Ca;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("C") && popupHA.equals("C")){
			float popupX = Cb;
			float popupY = Ca;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("C") && popupHA.equals("R")){
			int popupX = R;
			float popupY = Ca;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("T") && popupHA.equals("L")){
			int popupX = L;
			int popupY = T;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("T") && popupHA.equals("C")){
    		float popupX = Cb;
    		int popupY = T;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else if (popupVA.equals("T") && popupHA.equals("R")){
    		int popupX = R;
    		int popupY = T;
			System.out.println("\ntargetH="+targetH);
			System.out.println("targetW="+targetW);
			System.out.println("popupH="+popupH);
			System.out.println("popupW="+popupW);
			System.out.println("popupVA="+popupVA);
			System.out.println("popupHA="+popupHA);
			System.out.println("popupX="+popupX);
			System.out.println("popupY="+popupY);
		}else{
			System.out.println("ERR_CODE=100");
		}
	}

}
