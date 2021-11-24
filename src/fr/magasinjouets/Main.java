package fr.magasinjouets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Toy> jouets = new ArrayList<>();
		jouets.add(new Toy("Figurine Grenouille", 15, "Pièce de petite taille verte", 10));
		jouets.add(new Toy("Peluche Potame", 30, "Hippo tout doux", 60));
		jouets.add(new Toy("Laigo HelloChatoune", 40, "Magasin de glace avec HelloChatoune", 50));
		jouets.add(new Toy("Puzzle Chat", 10, "Pour les enfants débrouillards", 5));
		jouets.add(new Toy("Livre Roule Galette", 5, "Histoire d'une galette qui roule", 20));
		jouets.add(new Toy("Coloriage chat à gogo", 15, "60 pages de coloriages sur le monde des chats", 40));
		jouets.add(new Toy("Figurine Lion", 30, "Gros lion en plastique sans BPA", 30));
		jouets.add(new Toy("Peluche Girafe", 80, "Enorme girafe de 1m", 40));
		jouets.add(new Toy("JeuMobile Pirate", 80, "Bateau pirate et ses figurines", 25));
		jouets.add(new Toy("Fauteuil Patrouille Chienchien", 40, "Siege pour bébé rose et violet", 15));
		
		Collections.sort(jouets, new PriceComparator());
		
		for(Toy jouet : jouets) {
			System.out.println(jouet.getName()+" - "+jouet.getPrice()+"€ - "+jouet.getDescription()+" - "+jouet.getPromo()+'%');
		}
	}

}
