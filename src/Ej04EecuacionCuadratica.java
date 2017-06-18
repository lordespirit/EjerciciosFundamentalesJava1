
public class Ej04EecuacionCuadratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=3){
			
			System.out.println("No has introducido los parámetros correctos, deben ser 3");
			System.out.println("Es una ecuación cuadrática (ecuación de segundo grado):");
			System.out.println("Debes introducir tres parámetros para los valores 'a', 'b' y 'c' en el orden marcado");
			
		}else{
			
			double valorA = Float.valueOf(args[0]);
			double valorB = Float.valueOf(args[1]);
			double valorC = Float.valueOf(args[2]);
			
			if(valorA==0){
				
				System.out.println("El primer valor, A, no puede ser 0");
			
			}else{
				
				double resultado = ((Math.pow(valorB,2))-(4*(valorA * valorC)));
				
					if(resultado>0){
						
						double resultado1 = (-valorB-(Math.sqrt(resultado)))/(2*valorA);
						double resultado2 = (-valorB+(Math.sqrt(resultado)))/(2*valorA);
						System.out.println("Valor x1 : " + resultado1);
						System.out.println("Valor x2 : " + resultado2);
						
					}else if(resultado<0){
						System.out.println("El resultado no tiene raíces");		
					}else{
						System.out.print("Una única raiz, x1=x2, que es igual a : ");
						System.out.println(resultado);
					}
								
			}
			
		}
		
	}

}
