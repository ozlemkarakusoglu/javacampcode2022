package miniProjeAsalSayý;

public class Main {
	public static void main(String[] args) {
		int number = 25;
		//int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if (number<1) {
			System.out.println("geçersiz sayý."); 
		} 
		if (number==1) {
			System.out.println("sayý asal deðildir");
			return;
		}
		if (number==2) {
			System.out.println("asal deðildir");
			return;
		}
			
		for (int i=2; i<number; i++) {
			if(number % i == 0 ) {
				isPrime = false;	
			}
			
		}
		if (isPrime) {
			System.out.println("sayý asaldýr.");
		}else {
			System.out.println("sayý asal deðildir.");
		}
		
	}

}
