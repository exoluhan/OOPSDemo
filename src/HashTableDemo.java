import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		 // Create a hash map
	      Hashtable<String, Double> balance = new Hashtable<String, Double>();
	      Enumeration<String> names;
	      String str;
	      double bal;

	      balance.put("Jack", (3434.34));
	      balance.put("Ravi", (123.22));
	      balance.put("Mike", (1378.00));
	      balance.put("Daisy", (99.22));
	      balance.put("Navi", (-19.08));

	      // Show all balances in hash table.
	      names = balance.keys();
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " +
	         balance.get(str));
	      }
	      System.out.println();
	      // Deposit 1,000 into Daisy's account
	      bal = ((Double)balance.get("Daisy")).doubleValue();
	      balance.put("Daisy", (bal+1000));
	      System.out.println("Daisy's new balance: " +
	      balance.get("Daisy"));

	}

}
