package amazon;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

//CLASS BEGINS, THIS CLASS IS REQUIRED
class Solution {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public ArrayList<String> popularNFeatures(int numFeatures, int topFeatures, List<String> possibleFeatures,
			int numFeatureRequests, List<String> featureRequests) {
		// String[] array = new String[topFeatures];
		HashMap<String, Integer> array = new HashMap<>();

		// List<Map.Entry<String, Integer> > array = new LinkedList()<Map.Entry<String,
		// Integer> >(hm.entrySet());

		for (int i = 0; i < numFeatures; i++) {
			String pf = possibleFeatures.get(i);
			int count = 0;
			for (int j = 0; j < numFeatureRequests; j++) {
				String fr = featureRequests.get(j);
				if (fr.contains(pf)) {
					count++;
				}
			}
			array.put(pf, count);
		}

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(array.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		ArrayList<String> result = new ArrayList<>();

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		int index = 0;
		for (Entry<String, Integer> s : temp.entrySet()) {
			result.add(s.getKey());
			index++;
			if (index == topFeatures) {
				break;
			}
		}

		return result;
		// WRITE YOUR CODE HERE
	}

	List<Integer> lengthEachScene(List<Character> inputList) {
		String scene1 = "abc";
		String scene2 = "defg";
		String scene3 = "hijk";
		List<Integer> result = new ArrayList<Integer>();
		int index = 0;
		for (int i = 0; i < inputList.size(); i++) {
			Character ch = inputList.get(i);
			if (scene1.indexOf(ch) != -1) {
				//index++;
			} else {
				
				result.add(i-index);
				index = i;
				break;
			}
		}
		for (int i = index; i < inputList.size(); i++) {
			Character ch = inputList.get(i);
			if (scene2.indexOf(ch) != -1) {
				//index++;
			}else {
				result.add(i-index);
				index = i;
				break;
			}
		}
		for (int i = index; i < inputList.size(); i++) {
			Character ch = inputList.get(i);
			if (scene3.indexOf(ch) != -1) {
			//	index++;
			}else {
				if (i - index != 0) {
					result.add(i - index);	
				}
				
				
				break;
			}
				
		}
		return result;
	}
	
	public static void main(String[] args) {
		Object lengthEachScene;
		
	}


	// METHOD SIGNATURE ENDS
}