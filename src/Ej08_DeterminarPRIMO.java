import helper.Input;

public class Ej08_DeterminarPRIMO {

	public static void main(String[] args) {
		// Programa para identificar si un numero es primo o no
		// Numero es primo si: (num-1)! + 1, si este es multiplo de num, entonces es primo
		
		System.out.print("Introduce un número entero : ");
		int x = Input.scannInt();
		
		if(x<=0){
			System.out.println("El número introducido debe ser mayor que 0");
		}else{
			
			if(x==1){

				System.out.println("El número " + x + " no es primo.");
				
			}else{
					int d = 0;
					for(int counter=1;counter<=x;counter++){
						if(x%counter==0){
							d++;
						}
					}
					if(d==2){
						System.out.println("Es primo");
					}else{
						System.out.println("No es primo");
					}
									
				}
		
		}

	}
		
}

