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
		int num1 = 0;
		int num2 = 0;
		
		do {

			System.out.println("1. Sumar 2 números \n"
							 + "2. Multiplicar 2 números\n"
							 + "3. Restar 2 números\n"
							 + "4. Dividir 2 números\n"
							 + "5. Salir\n"
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
				case 3:
					System.out.println("Dime un número");
					num1 = sn.nextInt();
					System.out.println("Dime un número");
					num2 = sn.nextInt();
					restar2(num1, num2);
					break;
				case 4:
					System.out.println("Dime un número");
					num1 = sn.nextInt();
					System.out.println("Dime un número");
					num2 = sn.nextInt();
					dividir2(num1, num2);
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
	
	public static void restar2(int num1, int num2) {
		
		
		int resul = num1 - num2;
		
		System.out.println(resul);
	}
	
	public static void dividir2(int num1, int num2) {
		
		int resul = num1 / num2;
		
		System.out.println(resul);
	}
	
	

}
