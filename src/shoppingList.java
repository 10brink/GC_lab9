import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class shoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		ArrayList<String> items = new ArrayList<>();
		ArrayList<Double> prices = new ArrayList<>();

		Map m1 = new HashMap();
		m1.put("apple", 0.99);
		m1.put("banana", 0.59);
		m1.put("cauliflower", 1.50);
		m1.put("grapefruit", 1.99);
		m1.put("milk", 1.99);
		m1.put("juice", 3.99);
		m1.put("cucumber", .59);
		m1.put("bread", 2.99);

		String escape = "";

		System.out.println("welcome to my market");

		boolean flag = true;

		do {
		// System.out.println(m1.get("bread"));

			do {
				System.out.println("enter an item to buy: ");
				String item = scan.next();
				try {

					double e = (double) m1.get(item);
					items.add(item);
					prices.add(e);

					System.out.println("you added " + item + ", price: " + e);

					flag = false;
				} catch (NullPointerException e) {
					System.out.println("item does not exist");
				}
			} while (flag);

			System.out.println("do you want to buy more (yes/no) ");
			escape = scan.next();
		} while (!escape.equalsIgnoreCase("no"));

		// System.out.println(items.toString());

		// System.out.println(prices.toString());

		System.out.println("you bought: ");
		printArray(items, prices);
		System.out.println();
		System.out.println("your total is: " + sumArray(prices));

		System.out.println("average price: " + aveArray(prices));

		System.out.println("highest price item: " + highestArray(prices));
		System.out.println("lowest price item: " + lowestArray(prices));

	}
	
	public static double aveArray(ArrayList<Double> prices) {
		double ave;
		double sum =0;
		for (int i = 0; i < prices.size(); i++) {
			sum += prices.get(i);
			// System.out.println(prices.get(i));
		}
		ave = sum / prices.size();
		
		return ave;}
	
	public static double highestArray(ArrayList<Double> prices) {
		double highPrice = 0;
		for (int i = 0; i < prices.size(); i++) {
			if (highPrice < prices.get(i)) {
				highPrice = prices.get(i);
			}
			// System.out.println(prices.get(i));
		}
		return highPrice;
	}

	public static double lowestArray(ArrayList<Double> prices) {
		double lowPrice = prices.get(0);
		for (int i = 0; i < prices.size(); i++) {
			if (lowPrice > prices.get(i)) {
				lowPrice = prices.get(i);
			}
			// System.out.println(prices.get(i));
		}
		return lowPrice;
	}

	public static double sumArray(ArrayList<Double> prices) {
		double sum = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum += prices.get(i);
		}
		return sum;
		// System.out.println(prices.get(i));
	}
	
	public static void printArray(ArrayList<String> items, ArrayList<Double> prices) {

		for (int i = 0; i < prices.size(); i++) {
			System.out.print(items.get(i));
			System.out.print("    ");
			System.out.println(prices.get(i));
		}
	}

}
