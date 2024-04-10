import java.util.Scanner;

public class Main {

	public static Scanner sn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
		
	}

	public static void menu() {
		int opc = 0;
		int num = 0;
		
		do {
			System.out.println("1. Sumar números \n"
							 + "2. Multiplicar números\n"
							 + "3. Salir\n"
							 + "Elige una opción: ");
			opc = sn.nextInt();
			switch(opc) {
				case 1:
					System.out.println("Dime cuantos números quieres sumar:");
					num = sn.nextInt();
					sumar2(num);
					break;
				case 2:
					System.out.println("Dime cuantos números quieres multiplicar:");
					num = sn.nextInt();
					multiplicar2(num);
					break;
				default:
					System.out.println("No has elegido una opción correcta");
					break;
			}
			
		}while(opc!=3);
	}

	public static void sumar2(int cant) {
		int resul = 0;
		
		for (int i = 1; i <= cant; i++) {
			System.out.println("Dime el Nº" + i+":");
			resul+=sn.nextInt();
		}
		
		
		System.out.println(resul);
	}
	
	public static void multiplicar2(int cant) {
		
		int resul = 1;
		
		for (int i = 1; i <= cant; i++) {
			System.out.println("Dime el Nº" + i +":");
			resul*=sn.nextInt();
		}
		
		
		System.out.println(resul);
	}
	
	

}
