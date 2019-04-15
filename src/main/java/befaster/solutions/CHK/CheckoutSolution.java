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
		itemList.put("G",countG);
		itemList.put("H",countH);
		itemList.put("I",countI);
		itemList.put("J",countJ);
		itemList.put("K",countK);
		itemList.put("L",countL);
		itemList.put("M",countM);
		itemList.put("N",countN);
		itemList.put("O",countO);
		itemList.put("P",countP);
		itemList.put("Q",countQ);
		itemList.put("R",countR);
		itemList.put("S",countS);
		itemList.put("T",countT);
		itemList.put("U",countU);
		itemList.put("V",countV);
		itemList.put("W",countW);
		itemList.put("X",countX);
		itemList.put("Y",countY);
		itemList.put("Z",countZ);

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
			if(ItemOffers.itemOffers.containsKey(item) || item == "A" || item == "H" || item == "V") {				
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
				else if(item == "H") {					
					if(quantity >= 10) {
						total += ((quantity/10)*80) + (((quantity%10)/5) * 45) + ((quantity% 10)%5)*ItemPriceList.itemPriceList.get(item);
					}
					else if(quantity >= 5) {
						total += (quantity/5)*45 + (quantity%5)*ItemPriceList.itemPriceList.get(item);
					}
					else {
						total += quantity*ItemPriceList.itemPriceList.get(item);
					}
				}
				else if(item == "V") {					
					if(quantity >= 3) {
						total += ((quantity/3)*130) + (((quantity%3)/2) * 90) + ((quantity% 3)%2)*ItemPriceList.itemPriceList.get(item);
					}
					else if(quantity >= 2) {
						total += (quantity/2)*90 + (quantity%2)*ItemPriceList.itemPriceList.get(item);
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


