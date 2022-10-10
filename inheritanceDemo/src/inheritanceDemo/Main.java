package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//kredi hesaplama modülü
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		//bu polimorfizm'dir
	}
}
