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
	public static TreeMap<Integer, Integer> multiOffers = new TreeMap<Integer, Integer>();
	public static TreeMap<String, TreeMap> offer = new TreeMap<String, TreeMap>();
	
	static {
		multiOffers.put(5,200);
		multiOffers.put(3,130);
		offer.put("A", multiOffers);
		itemOffers.put("B", new ItemOffers("B", 2, 45));
		itemOffers.put("E", new ItemOffers("E", 2, -30));
	}
}	

