import helper.Input;

public class Ej06_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Introduzca un número entero: ");
		int valor = Input.scannInt();
		int resultado = valor;
		
		//	VERSION WHILE
		
		//	while(valor>1){
		//	valor--;
		//	resultado=resultado*valor;
		//	}
		
		// VERSION FOR
		
		for(int i=valor-1 ; i>1 ; i--)
			resultado=resultado*i;
		
		System.out.println("El resultado factorial es igual a : " + resultado);
		
	}

}
