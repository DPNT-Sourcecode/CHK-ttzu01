package befaster.solutions.CHK;

import java.util.TreeMap;

public class MultiOffers {
	String item;
	Integer quantity;
	Integer price;
	
	public MultiOffers(String item, Integer quantity, Integer price) {
		this.item = item;
		this.price = price;
		this.quantity= quantity;
	}
	public static TreeMap<String, MultiOffers> multiOffers = new TreeMap<String, MultiOffers>();
	
	static {
		multiOffers.put("E", new MultiOffers("E", 2, 50));
		
	}
}

