package befaster.solutions.CHK;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
	public Integer checkout(String skus) {
		//throw new SolutionNotImplementedException();		
		byte[] items = skus.getBytes();
		int countA=0 , countB=0, countC = 0, countD = 0, countE=0, countF=0, countG=0, countH=0,countI=0,countJ=0,countK=0,countL=0,countM=0,countN=0,countO=0,
				countP=0,countQ=0,countR=0,countS=0,countT=0,countU=0,countV=0,countW=0,countX=0,countY=0,countZ=0;
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
			case 'F' : countF++;
			break;
			case 'G' : countG++;break;
			case 'H' : countH++;break;
			case 'I' : countI++;break;
			case 'J' : countJ++;break;
			case 'K' : countK++;break;
			case 'L' : countL++;break;
			case 'M' : countM++;break;
			case 'N' : countN++;break;
			case 'O' : countO++;break;
			case 'P' : countP++;break;
			case 'Q' : countQ++;break;
			case 'R' : countR++;break;
			case 'S' : countS++;break;
			case 'T' : countT++;break;
			case 'U' : countU++;break;
			case 'V' : countV++;break;
			case 'W' : countW++;break;
			case 'X' : countX++;break;
			case 'Y' : countY++;break;
			case 'Z' : countZ++;break;
			default : return -1;			
			}

		}
		
		if(countB > 0) {
		countB = countB - (countE/2);
		}
		if(countF >2) {
		countF = countF - (countF/3);
		}
		if(countM > 0) {
		countM = countM - (countN/3);
		}
		if(countQ > 0) {
			countQ = countQ - (countR/3);
		}
		if(countU > 3) {
			countU = countU - (countU/4);
		}
		
		TreeMap<String, Integer> itemList = new TreeMap<String, Integer>();
		itemList.put("A", countA);
		itemList.put("B",countB);
		itemList.put("C", countC);
		itemList.put("D",countD);
		itemList.put("E", countE);	
		itemList.put("F",countF);
		itemList.put("G",countF);
		itemList.put("H",countF);
		itemList.put("I",countF);
		itemList.put("J",countF);
		itemList.put("K",countF);
		itemList.put("L",countF);
		itemList.put("M",countF);
		itemList.put("N",countF);
		itemList.put("O",countF);
		itemList.put("P",countF);
		itemList.put("Q",countF);
		itemList.put("R",countF);
		itemList.put("S",countF);
		itemList.put("T",countF);
		itemList.put("U",countF);
		itemList.put("V",countF);
		itemList.put("W",countF);
		itemList.put("X",countF);
		itemList.put("Y",countF);
		itemList.put("Z",countF);

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




