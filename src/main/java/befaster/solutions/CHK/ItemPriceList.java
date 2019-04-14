package befaster.solutions.CHK;

import java.util.TreeMap;

public class ItemPriceList {
	
	public static TreeMap<String,Integer> itemPriceList = new TreeMap<String, Integer>();
	
	static {
		itemPriceList.put("A",50);
		itemPriceList.put("B",30);
		itemPriceList.put("C",20);
		itemPriceList.put("D",15);
	}
}
