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
		itemOffers.put("A", new ItemOffers("A", 3, 130));
		itemOffers.put("B", new ItemOffers("B", 2, 45));
	}
}	

