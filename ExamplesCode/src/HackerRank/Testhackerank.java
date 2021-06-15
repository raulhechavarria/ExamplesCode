package HackerRank;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Testhackerank {

	public Testhackerank() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
		
		items.stream().sorted();
		
		
		for (Iterator iterator = items.iterator(); iterator.hasNext();) {
			List<String> list = (List<String>) iterator.next();
			
		}
		
		
		
		return null;
	    // Write your code here
	    
	    }

}
