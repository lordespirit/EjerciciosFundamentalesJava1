import helper.Input;

public class Ej09_CalculoNprimerosTerminos {

	public static void main(String[] args) {

		double factorial = 1;
		double result = 0;


		System.out.print("Introduce los 'n' primeros terminos de la serie: ");
		int n = Input.scannInt();
		int control = 1;
		for(int i=1 ; i<=n ; i++ ){
	
			factorial = factorial * i;
			
			if(i%2!=0){
				
				if(control%2==0){
				
					result = result - (control++/factorial);
					
				}else{
					
					result = result + (control++/factorial);
				
				}
				
			
			}
			
		
		}
		
		System.out.print("Resultado: " + result);

	}

}
