package fr.magasinjouets;

import java.util.Comparator;

public class PriceComparator implements Comparator<Toy>{

	@Override
	public int compare(Toy toy1, Toy toy2) {
		
		if(toy1.getPrice() == toy2.getPrice()) {
			return -1;
		}
		return toy1.getPrice() - toy2.getPrice();
	}

}
