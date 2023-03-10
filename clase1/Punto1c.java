package clase1;

public class Punto1c {
	public static void main(String[] args) {
		
		boolean soloPares = true;
		int a = 1;
		int b = 10;
		
		if(soloPares) {
		while(a<=b) {
			a++;
			if(a % 2 == 0) {
			System.out.println(a);
		}
	}
    } else {
    	System.out.println(a);
    	while(a < b) {
    		a++;
    		if(a % 2 != 0) {
    			System.out.println(a);
    		}
    	}
    }
}
}