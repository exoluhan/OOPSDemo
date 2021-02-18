import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		 
		// Create a hash map
	      HashMap<String, Double> hm = new HashMap<String, Double>();
	      // Put elements to the map
	      hm.put("John", (3434.34));
	      hm.put("Jim", (123.22));
	      hm.put("Ayan", (1378.00));
	      hm.put("Daisy", (99.22));
	      hm.put("Jack", (-19.08));
	      
	      // Get a set of the entrie s
	      Set set = hm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      // Deposit 1000 into Jim's account
	      double balance = ((Double)hm.get("Jim")).doubleValue();
	      hm.put("Jim", (balance + 1000));
	      System.out.println("Jim's new balance: " +hm.get("Jim"));

	}

}
