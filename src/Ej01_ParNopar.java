
public class Ej01_ParNopar {

	public static void main(String[] args) {
		// Programa de comprobacion de si el n�mero es par o no
		
		if(args.length!=1){
			
			System.out.println("Debes introducir un par�metro, �nicamente UNO");
			
		}else{
			
			if(Integer.valueOf(args[0])%2==0)
				System.out.println("S� es un n�mero par");
			else
				System.out.println("NO es un n�mero par");
			
		}

	}

}