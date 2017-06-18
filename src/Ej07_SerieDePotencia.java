import helper.Input;

public class Ej07_SerieDePotencia {

	public static void main(String[] args) {
		// Calculo de formula exponencial

		System.out.print("Introduzca x: ");
		int x = Input.scannInt();

		System.out.print("Introduzca numero iteraciones n: ");
		int n = Input.scannInt();
		
		double resultado = 1;
		
		// BUCLE DE SERIE DE POTENCIA
		
		double factorial = 1;
		double potencia = 1;
		
		for(int i=1 ; i<=n ; i++ ){
		
			potencia = potencia * x;
			factorial = factorial * i;
			
			resultado = resultado + (potencia/factorial);
			
			//CALCULO DE FACTORIAL	
			//int factorial = 1 ;
			//for(int j=i ; j>1 ; j--){
			//	factorial=factorial*j;
			//}
			//System.out.println("Factorial de " + i + " es :" + factorial);
			
			//CALCULO DE POTENCIA
			//int potencia=1;
			//for(int k=1;k<=i;k++){
			//	potencia = potencia * x ;
			//}
			//System.out.println("Potencia de " + x + " elevado a " + i + " es igual a : " + potencia);
			
		}
		
		System.out.print("El resultado es igual a : " + resultado);
		
	}

}
