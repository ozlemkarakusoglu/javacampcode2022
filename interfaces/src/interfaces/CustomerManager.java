package interfaces;

public class CustomerManager { 
	//alttaki 9-11 aral���ndaki kod ikinci y�ntem 
	//ama bunu kulland���m�zda maindeki 7. sat�r� dilmemiz gerekiyor ve 6. sat�r� da �u hale getirmemiz gerekiyor.
	//CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());----b�yle oracle basar, oracle � mysql yaparsak mysql basar
	//private ICustomerDal customerDal;  //stratejimiz custtomerDal'd�r
	ICustomerDal customerDal;
	//public CustomerManager(ICustomerDal customerDal) {
		//this.customerDal = customerDal;
	//}
	public void add() {
		//buraya i� kodlar� yaz�l�r
		customerDal.add();
		
	}
}
