package leetcoder;

import java.util.HashMap;

public class no_290 {
    public boolean wordPattern(String pattern, String str) {
     if (pattern.equals(str)) return false;
     HashMap<Character, String> map = new HashMap<Character,String>();
     String[] strsp = str.split(" ");
     if (pattern.length()!=strsp.length) return false;
     for (int i = 0; i < strsp.length; i++) {
		if (map.containsKey(pattern.charAt(i))){
			
			System.out.println(map.get(pattern.charAt(i)));
			System.out.println(strsp[i]);
			if (map.get(pattern.charAt(i)).equals(strsp[i])) continue;
			else return false;
		}
		else {if (map.containsValue(strsp[i])) return false;
			map.put(pattern.charAt(i), strsp[i]);}
		
	}
    return true;
    }
    
    public static void main(String[] args) {
		no_290 test = new no_290();
		System.out.println(test.wordPattern("abba", "dog dog dog dog"));
	}
}
