import helper.Input;

public class Ej05_calculo_suma_de_sus_cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		
		System.out.print("Introduzca un número entero : ");
		valor = Input.scannInt();

		// VERSION WHILE
		
		//	int resultado = 0;
		//	while(valor>0){
		//	resultado=resultado+valor%10;
		//	valor=valor/10;
		//	}
		
		//	VERSION FOR
		
		int resultado = 0;
		for(int x=0;x<valor;valor=valor/10)
			resultado=resultado+valor%10;
		
		System.out.println("Resultado: " + resultado);
		
	}

}
