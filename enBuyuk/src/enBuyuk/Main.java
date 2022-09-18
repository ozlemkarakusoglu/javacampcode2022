package enBuyuk;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 155;
		int sayi2 = 29;
		int sayi3 = 88;
		int enBuyuk = sayi1;
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("en büyük "+ enBuyuk);

	}

}
