
public class Ej02_mayor3numeros {

	public static void main(String[] args) {
		// Programa calculo numero mayor de 5 numeros

		if(args.length==0){
			
			System.out.println("No has introducido ningún parámetro");
			
		}else if(args.length!=3){
			
			System.out.println("Tienes que introducir 3 parámetros para el cálculo");
			
		}else{
			
			if((Float.valueOf(args[0]) > Float.valueOf(args[1])) && (Float.valueOf(args[0]) > Float.valueOf(args[2]))){
				System.out.println("El mayor número es : " + Float.valueOf(args[0]));
			}else if((Float.valueOf(args[2]) > Float.valueOf(args[1])) && (Float.valueOf(args[2]) > Float.valueOf(args[0]))){
				System.out.println("El mayor número es : " + Float.valueOf(args[2]));
			}else{
				System.out.println("El mayor número es : " + Float.valueOf(args[1]));
			}
			
		}
		
	}

}
