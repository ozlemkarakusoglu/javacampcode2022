package methods;

public class Main {

	public static void main(String[] args) {
		//main'de bir metoddur
		sayiBulmaca();
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 7;
		boolean varMi=false ;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;				
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "say� mevcuttur: " +aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("say� mevcut de�ildir: " +aranacak);	
		}
	
	}
	
	
}
