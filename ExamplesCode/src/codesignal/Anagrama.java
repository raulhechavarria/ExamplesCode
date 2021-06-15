package codesignal;

public class Anagrama {

	
	boolean checkBlanagrams(String word1, String word2) {
        int[] arr = new int[26];

        for(int i = 0; i < word1.length(); i++){
               arr[word1.charAt(i)-'a']++;
               arr[word2.charAt(i)-'a']--;
        }

       int str = 0;
      for(int i : arr) {
              str += Math.abs(i);
     }
     return str ==2;
}
	
	
	
	
	
}



 
