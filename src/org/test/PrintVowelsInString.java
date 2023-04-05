package org.test;

public class PrintVowelsInString {
	public static void main(String[] args) {
//		String s="Welcome to java class today";
//		char[] ch = s.toCharArray();
//		int countofa=0,countofe=0,countofi=0,countofo=0,countofu=0;
//		for (int i = 0; i < ch.length; i++) {
//			char c=ch[i];
//			switch(c) {
//			case'a':countofa++;break;
//			case'e':countofe++;break;
//			case'i':countofi++;break;
//			case'o':countofo++;break;
//			case'u':countofu++;break;
//			
//			}
//		}
//		System.out.println("Value of a= "+countofa);
//		System.out.println("Value of e= "+countofe);
//		System.out.println("Value of i= "+countofi);
//		System.out.println("Value of o= "+countofo);
//		System.out.println("Value of u= "+countofu);

		String s = "Welcome to java class today";
		char[] ch = s.toCharArray();
		int countofa = 0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
					|| c == 'O' || c == 'U')) {
				countofa++;
			}
		}
		System.out.println("Value of a= " + countofa);

//		Map<Character,Integer>mp=new TreeMap<Character,Integer>();
//		for(int i=0;i<ch.length;i++) {
//			char c=ch[i];
//			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
//				if(mp.containsKey(c));
//				Integer inte=mp.get(ch[i]);
//				mp.put(c, inte++);
//			}
//			else {
//				mp.put(c, 1);
//				
//			}
//		}
//		Set<Entry<Character,Integer>>entrySet=mp.entrySet();
//		for (Entry<Character, Integer> entry : entrySet) {
//			System.out.println(entry);
//		}

	}
}
