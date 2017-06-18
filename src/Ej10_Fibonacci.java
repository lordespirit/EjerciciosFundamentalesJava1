import helper.Input;

public class Ej10_Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("Cuantas series de fibonacci deseas ver: ");
		int n = Input.scannInt();
		
		
		for(int i=0;i<n;i++){
			System.out.println(fibonacci(i) + " ");
		}	
	}

	private static int fibonacci(int n) {
		if (n>1){
		       return fibonacci(n-1) + fibonacci(n-2); 
		    }
		    else if (n==1) {
		        return 1;
		    }
		    else if (n==0){
		        return 0;
		    }
		    else{
		        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
		        return -1; 
		    }
	}

}
