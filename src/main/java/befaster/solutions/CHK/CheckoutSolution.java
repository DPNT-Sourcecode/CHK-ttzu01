package befaster.solutions.CHK;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
	public Integer checkout(String skus) {
		//throw new SolutionNotImplementedException();

		byte[] items = skus.getBytes();

		int countA=0 , countB=0, countC = 0, countD = 0, countE=0 ;
		for(int i =0 ; i < items.length ; i++) {
			switch (items[i]) {
			case 'A' : countA++;
			break;
			case 'B' : countB++;
			break;
			case 'C' : countC++;
			break;
			case 'D' : countD++;
			break;	
			case 'E' : countE++;
			break;
			default : return -1;			
			}

		}
		
		if(countB > 0) {
		countB = countB - (countE/2);
		}
		TreeMap<String, Integer> itemList = new TreeMap<String, Integer>();
		itemList.put("A", countA);
		itemList.put("B",countB);
		itemList.put("C", countC);
		itemList.put("D",countD);
		itemList.put("E", countE);
		System.out.println("CountE="+ countE);

		int amount = calculatePrice(itemList);


		return amount;
	}

	private int calculatePrice(TreeMap<String, Integer> itemList) {
		int total =0 ;
		Set<String> keys = itemList.keySet();
		for(Iterator<String> i = keys.iterator(); i.hasNext();) {
			String item = i.next();
			Integer quantity = itemList.get(item);			
			//Calculating price for items those are in offers
			if(ItemOffers.itemOffers.containsKey(item) || (item == "A" && quantity > 0)) {				
				ItemOffers offer = ItemOffers.itemOffers.get(item);
				if(item == "A") {					
					if(quantity >= 5) {
						total += ((quantity/5)*200) + (((quantity%5)/3) * 130) + ((quantity% 5)%3)*ItemPriceList.itemPriceList.get(item);
					}
					else if(quantity >= 3) {
						total += (quantity/3)*130 + (quantity%3)*ItemPriceList.itemPriceList.get(item);
					}
					else {
						total += quantity*ItemPriceList.itemPriceList.get(item);
					}
				}
				else if(offer.quantity < quantity) {
					total += (quantity% offer.quantity)*ItemPriceList.itemPriceList.get(item) + (quantity/offer.quantity)*offer.price;					
				}
				else if(offer.quantity == quantity) {
					
					total += (quantity/offer.quantity)*offer.price;					
				}
				else {
					total += quantity*ItemPriceList.itemPriceList.get(item);
				}
			}
			else // calculating price for items that are not in offer
			{
				
				total += quantity*ItemPriceList.itemPriceList.get(item);
				
				
			}
		}
		return total;
	}    


}



