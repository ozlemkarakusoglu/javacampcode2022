package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};
		//BaseKrediManager t�r�ndeki krediManagerlar, neredeki, krediManagers taki
		for (BaseKrediManager krediManager : krediManagers ) {
			
			System.out.println(krediManager.hesapla(1000));
		}

	}

}
