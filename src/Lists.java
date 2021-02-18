import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Lists {

	public static void main(String[] args) {
		
		// Create an array list
		ArrayList<String> al = new ArrayList<String>();
		// add elements to the array list
		al.add("J");
		al.add("A");
		al.add("V");
		al.add("A");
		al.add("J");
		al.add("D");
		al.add("K");
		// Use iterator to display contents of al
		System.out.print("Original contents of al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
		Object element = itr.next();
		System.out.print(element + " ");
		}
		System.out.println();
		// Modify objects being iterated
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext())
		{
		Object element = litr.next();
		litr.set(element + "+");
		}
		System.out.print("Modified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext())
		{
		Object element = itr.next();
		System.out.print(element + " ");
		}
		System.out.println();
		// Now, display the list backwards
		System.out.print("Modified list backwards: ");
		while(litr.hasPrevious())
		{
		Object element = litr.previous();
		System.out.print(element + " ");
		}
		System.out.println();

	}

}
