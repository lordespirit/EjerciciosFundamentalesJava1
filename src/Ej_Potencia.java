import helper.Input;

public class Ej_Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduce el número a calcular : ");
		int x = Input.scannInt();
		System.out.print("Introduce a cuanto deseas elevar : ");
		int y = Input.scannInt();
		
		int resultado = 1;
		
		for(int i=1; i<=y; i++){

			resultado = resultado * x;
			
		}
		
		System.out.println(resultado);
	}

}
