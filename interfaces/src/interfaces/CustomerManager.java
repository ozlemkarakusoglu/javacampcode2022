package interfaces;

public class CustomerManager { 
	//alttaki 9-11 aralýðýndaki kod ikinci yöntem 
	//ama bunu kullandýðýmýzda maindeki 7. satýrý dilmemiz gerekiyor ve 6. satýrý da þu hale getirmemiz gerekiyor.
	//CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());----böyle oracle basar, oracle ý mysql yaparsak mysql basar
	//private ICustomerDal customerDal;  //stratejimiz custtomerDal'dýr
	ICustomerDal customerDal;
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}
	public void add() {
		//buraya iþ kodlarý yazýlýr
		customerDal.add();
		
	}
}
