import java.util.*;


public class El_metro_de_Tatooine {
	public static void main(String[] args) {
		
		String [] numeros_uno_dos={
				"0","1","2","3","4","5","6","7","8","9","10"
		};
		
		String [] numeros_cero_cincuenta={
				"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
		};
		
		String [] credito_via_1_string ={
				"1","3","5","7","9"
		};
		
		int a = numeros_uno_dos.length;
		int creditos_1 = ((int) (Math.random()*a));
		
		int b = numeros_uno_dos.length;
		int creditos_2 = ((int) (Math.random()*b));

		int c = numeros_cero_cincuenta.length;
		int creditos_05 = ((int) (Math.random()*c));
		
		System.out.println("--Bienvenido-Ciudadano-al-metro-de-TATOOINE!--");
		System.out.println("----------------------------------------------");
		System.out.println("----------------¿Que-Via-desea?---------------");
		System.out.println("--1.-Via 1------------------------------------");
		System.out.println("--2.-Via 2------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");
		System.out.println("------:=)----------(o_>_o)-----------(=:------");
		
		Scanner via_scan = new Scanner(System.in);
		System.out.println("Ponga la Via escogida(numero): ");
		String via = via_scan.next();
		
		if(via.equals("1")){
			
			System.out.println("Creditos Maquina de 0.50: " + creditos_05);
		    System.out.println("Creditos Maquina de 1: " + creditos_1);
		    System.out.println("Creditos Maquina de 2: " + creditos_2);

		    int d = credito_via_1_string.length;
		    int credito_via_1 = ((int) (Math.random()*d));
		    System.out.println("\nLa Via escogida cuesta: " + credito_via_1 +" creditos");
		    
		    Scanner inserte_creditos_scan = new Scanner(System.in);
		    System.out.println("Inserte sus creditos: ");
		    String inserte_creditos = inserte_creditos_scan.next();
		    int inserte_creditos_int = Integer.parseInt(inserte_creditos);
		    
		    if(inserte_creditos_int >= inserte_creditos_int){

		        int cambio = inserte_creditos_int - credito_via_1;

		        if(creditos_2 > inserte_creditos_int){

		            int creditos_2_utilizadas = (creditos_2)*2 - inserte_creditos_int;

		            System.out.println("-----Creditos-de-la-maquina--------------------");
		            System.out.println("---------Creditos-de-1:-"+creditos_1+"----------------------");
		            System.out.println("---------Creditos-de-2:-"+creditos_2_utilizadas+"----------------------");
		            System.out.println("---------Creditos-de-0.5:-"+creditos_05+"--------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("-----------------Gracias-por-su-compra--------");
		            System.out.println("--------Aqui-tine-su-cambio:"+cambio+"-credito/s-------");


		        }else if(creditos_1 > inserte_creditos_int && creditos_1 > creditos_2){

		            int creditos_1_utilizados = creditos_1 - inserte_creditos_int;

		            System.out.println("-----Creditos-de-la-maquina--------------------");
		            System.out.println("---------Creditos-de-1:-"+creditos_1_utilizados+"----------------------");
		            System.out.println("---------Creditos-de-2:-"+creditos_2+"----------------------");
		            System.out.println("---------Creditos-de-0.5:-"+creditos_05+"--------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("-----------------Gracias-por-su-compra--------");
		            System.out.println("--------Aqui-tine-su-cambio:"+cambio+"-credito/s-------");

		    	}else if(creditos_05 > inserte_creditos_int && creditos_05 > creditos_2 && creditos_05 > creditos_1){
		    		
		            double creditos_cero_cincuenta_utilizadas = 0.5*(creditos_05) - inserte_creditos_int;

		            System.out.println("-----Creditos-de-la-maquina--------------------");
		            System.out.println("---------Creditos-de-1:-"+creditos_1+"----------------------");
		            System.out.println("---------Creditos-de-2:-"+creditos_2+"----------------------");
		            System.out.println("---------Creditos-de-0.5:-"+creditos_cero_cincuenta_utilizadas+"------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("-----------------Gracias-por-su-compra--------");
		            System.out.println("--------Aqui-tine-su-cambio:"+cambio+"-credito/s-------");
		    	}else{
		    		System.out.println("----------No-hay-cambio-en-la-maquina---------");
		        }

		    }else{
		    	System.out.println("-----No-ha-insertado-los-creditos-necesarios-----");
		    }
		}else if(via.equals("2")){
			
			
			System.out.println("Creditos Maquina de 0.50: " + creditos_05);
		    System.out.println("Creditos Maquina de 1: " + creditos_1);
		    System.out.println("Creditos Maquina de 2: " + creditos_2);

		    int d = credito_via_1_string.length;
		    int credito_via_1 = ((int) (Math.random()*d));
		    System.out.println("\nLa Via escogida cuesta: " + credito_via_1 +" creditos");
		    
		    Scanner inserte_creditos_scan = new Scanner(System.in);
		    System.out.println("Inserte sus creditos: ");
		    String inserte_creditos = inserte_creditos_scan.next();
		    int inserte_creditos_int = Integer.parseInt(inserte_creditos);
		    
		    if(inserte_creditos_int >= inserte_creditos_int){

		        int cambio = inserte_creditos_int - credito_via_1;

		        if(creditos_2 > inserte_creditos_int){

		            int creditos_2_utilizadas = (creditos_2)*2 - inserte_creditos_int;

		            System.out.println("-----Creditos-de-la-maquina--------------------");
		            System.out.println("---------Creditos-de-1:-"+creditos_1+"----------------------");
		            System.out.println("---------Creditos-de-2:-"+creditos_2_utilizadas+"----------------------");
		            System.out.println("---------Creditos-de-0.5:-"+creditos_05+"--------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("-----------------Gracias-por-su-compra--------");
		            System.out.println("--------Aqui-tine-su-cambio:"+cambio+"-credito/s-------");


		        }else if(creditos_1 > inserte_creditos_int && creditos_1 > creditos_2){

		            int creditos_1_utilizados = creditos_1 - inserte_creditos_int;

		            System.out.println("-----Creditos-de-la-maquina--------------------");
		            System.out.println("---------Creditos-de-1:-"+creditos_1_utilizados+"----------------------");
		            System.out.println("---------Creditos-de-2:-"+creditos_2+"----------------------");
		            System.out.println("---------Creditos-de-0.5:-"+creditos_05+"--------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("-----------------Gracias-por-su-compra--------");
		            System.out.println("--------Aqui-tine-su-cambio:"+cambio+"-credito/s-------");

		    	}else if(creditos_05 > inserte_creditos_int && creditos_05 > creditos_2 && creditos_05 > creditos_1){
		    		
		            double creditos_cero_cincuenta_utilizadas = 0.5*(creditos_05) - inserte_creditos_int;

		            System.out.println("-----Creditos-de-la-maquina--------------------");
		            System.out.println("---------Creditos-de-1:-"+creditos_1+"----------------------");
		            System.out.println("---------Creditos-de-2:-"+creditos_2+"----------------------");
		            System.out.println("---------Creditos-de-0.5:-"+creditos_cero_cincuenta_utilizadas+"------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("----------------------------------------------");
		            System.out.println("-----------------Gracias-por-su-compra--------");
		            System.out.println("--------Aqui-tine-su-cambio:"+cambio+"-credito/s-------");
		    	}else{
		    		System.out.println("----------No-hay-cambio-en-la-maquina---------");
		        }

		    }else{
		    	System.out.println("-----No-ha-insertado-los-creditos-necesarios-----");
		    }	
		}else{
			System.out.println("--------------Esa-Via-no-existe---------------");
		}	
	}
}
