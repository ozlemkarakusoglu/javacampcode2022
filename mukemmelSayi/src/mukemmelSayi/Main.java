package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 7 ;
		
		int total = 0 ;
		
		for (int i=1; i<number; i++) {
			if (number%i==0) {
				total = total+i ;
				
			}
			
		 }
		if (number==total) {
			System.out.println("m�kemmel say�d�r");
		}
		else {
			System.out.println("m�kemmel say� de�ildir");
		}

	}

}
