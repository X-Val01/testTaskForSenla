package TaskSix;

public class myBag {
	/**There is a set of things that need to be put in a backpack. 
	 *  The backpack has a given carrying capacity. Things, in turn, 
	 *  have two parameters - weight and value. 
	 *  The goal of the task is to fill the backpack without 
	 *  exceeding its carrying capacity and maximize the 
	 *  total value of the cargo. 
	 */
	
	public static void main(String[] args) {
		int maxWeight = 100;
		int maxPrice = 100;

		int i;

		for (i = 1; i >= 0; i++) {
			int weightItem = (int) Math.round(Math.random() * 10);
			int priceItem = (int) Math.round(Math.random() * 10);
			maxWeight -= weightItem;
			maxPrice -= priceItem;
			System.out.print("item №" + i + " weight - " +
			weightItem + "	price - " + priceItem+"\n");
			System.out.print("Bag weight - " + maxWeight +
					"	Bag price - " + maxPrice+"\n");

			if (maxWeight <= 0 || maxPrice <= 0) {
				System.out.print("Last item excess\n");
				break;
			}

		}
		System.out.print(--i + " things in а bag\n");
	}
	}
	

	
	


