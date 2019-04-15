package befaster.solutions.CHK;

import java.util.TreeMap;

public class ItemOffers {
	String item;	 
	Integer quantity;
	Integer price;
	public ItemOffers(String item, Integer quantity, Integer price) {
		this.item=item;
		this.quantity=quantity;
		this.price=price;
	}
	
	public static TreeMap<String, ItemOffers> itemOffers = new TreeMap<String, ItemOffers>();
	
	static {
		itemOffers.put("B", new ItemOffers("B", 2, 45));
		itemOffers.put("K", new ItemOffers("K", 2, 120));
		itemOffers.put("P", new ItemOffers("P", 5, 200));
		itemOffers.put("Q", new ItemOffers("Q", 3, 80));
	}
}	
