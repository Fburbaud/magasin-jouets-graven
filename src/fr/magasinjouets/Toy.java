package fr.magasinjouets;

public class Toy {
	
	private String name;
	private int price;
	private String description;
	private int promo;
	
public Toy(String name, int price, String desc, int promo) {
	
	this.name = name;
	this.price = price;
	this.description = desc;
	this.promo = promo;
	
	
}

public String getName() {
	return name;
}

public int getPrice() {
	return price;
}

public String getDescription() {
	return description;
}

public int getPromo() {
	return promo;
}

}
