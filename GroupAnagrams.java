import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] s = { "eat", "tea", "tan", "ate", "nat", "bat", "BAT" };

		HashMap<Integer, ArrayList<String>> h = new HashMap<Integer, ArrayList<String>>();
		h = groupAnagrams(s);
		System.out.println(h);
		 groupAnagrams2(s);
		
	}

	public static int calculateHash(String a) {
		int ascii = 0;
		for (int i = 0; i < a.length(); i++) {
			ascii += (int) a.charAt(i);
		}
		return ascii;
	}

	public static HashMap<Integer, ArrayList<String>> groupAnagrams(String[] s) {

		HashMap<Integer, ArrayList<String>> list = new HashMap<Integer, ArrayList<String>>();
		for (int i = 0; i < s.length; i++) {
			int code = calculateHash(s[i].toLowerCase());
			if (list.containsKey(code)) {
				ArrayList<String> l = list.get(code);
				l.add(s[i]);
			} else {
				ArrayList<String> l = new ArrayList<String>();
				l.add(s[i]);
				list.put(code, l);
			}
		}

		return list;
	}

	public static void groupAnagrams2(String[] s) {

		Map<Integer, ArrayList<String>> list = new TreeMap<Integer, ArrayList<String>>();
	for (int i = 0; i < s.length; i++) {
			int code = calculateHash(s[i].toLowerCase());
			if (list.containsKey(code)) {
				ArrayList<String> l = list.get(code);
				l.add(s[i]);
			} else {
				ArrayList<String> l = new ArrayList<String>();
				l.add(s[i]);
				list.put(code, l);
			}
		}

		for (Entry<Integer, ArrayList<String>> entry : list.entrySet()) {
		    Integer key = entry.getKey();
		    ArrayList<String> value = entry.getValue();
		 
		     for(String aString : value){
		        System.out.print(aString+" ");
		        
		    }
		     System.out.println();
		}
	}

}
