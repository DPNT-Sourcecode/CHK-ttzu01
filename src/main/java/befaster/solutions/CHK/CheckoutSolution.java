package befaster.solutions.CHK;

import java.util.TreeMap;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        //throw new SolutionNotImplementedException();
    	
    	byte[] items = skus.getBytes();
    	
    	int countA=0 , countB=0, countC = 0, countD = 0 ;
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
			default : return -1;			
    		}
    		
    	}
    	TreeMap<String, Integer> itemList = new TreeMap<String, Integer>();
    	itemList.put("A", countA);
    	itemList.put("B",countB);
    	itemList.put("C", countC);
    	itemList.put("D",countD);
    	
    	int amount = calculatePrice(itemList);
    	
    	
    	return null;
    }

	private int calculatePrice(TreeMap<String, Integer> itemList) {
		// TODO Auto-generated method stub
		return 0;
	}
    
	/*
	 * private int calculatePrice() { // TODO Auto-generated method stub int
	 * priceOfA = 0; int priceOfB = 0; if(countA > 3 || countB > 2) { priceOfA +=
	 * (countA/3) * ItemOffers.itemOffers.get("AAA") +
	 * (countA%3)*ItemPriceList.itemPriceList.get("A"); } if(countB % 2 == 0) {
	 * priceOfB += (countB/2) * ItemOffers.itemOffers.get("BB"); }
	 * 
	 * }
	 */


}

