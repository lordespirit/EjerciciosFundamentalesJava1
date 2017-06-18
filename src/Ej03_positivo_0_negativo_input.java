import helper.Input;

public class Ej03_positivo_0_negativo_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduza una cifra : ");
		int valor = Input.scannInt();
		
		if(valor>0){
			
			System.out.println("El número es positivo");
			
		}else if(valor<0){
			
			System.out.println("El número es negativo");
			
		}else{
			
			System.out.println("El número es 0");
			
		}
		
	}

}
