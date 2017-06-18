
public class Ej01_ParNopar {

	public static void main(String[] args) {
		// Programa de comprobacion de si el número es par o no
		
		if(args.length!=1){
			
			System.out.println("Debes introducir un parámetro, únicamente UNO");
			
		}else{
			
			if(Integer.valueOf(args[0])%2==0)
				System.out.println("Sí es un número par");
			else
				System.out.println("NO es un número par");
			
		}

	}

}