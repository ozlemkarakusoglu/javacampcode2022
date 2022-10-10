package classesWithAttribute;

public class Product {
	//YAPICI BLOK "Product" yani class �n ismiyle ayn� olmal�
	public Product(int id, String name, String descrption, double price, int stockAmount, String renk) {
		System.out.println("yap�c� blok cal��t�");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = descrption;
		this.stockAmount = stockAmount;

	}

	public Product() {

	}

	// attribute & field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter blo�u
	public int getId() {
		// getid yap�nca id'yi yazamaz ama okuyabilir
		return id;
	}

	// setter blo�u
	public void setId(int id) {
		// this product'�n id'si. i�inde bulundu�u class'�n id'si
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
