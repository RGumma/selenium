package sample;

public class StringBuilderMethods {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("animals");
		
		String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));
		
		int len = sb.length();
		
		char ch = sb.charAt(6);
		
		System.out.println(sub + " "+len +" " +ch);
		
		
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		
		sb1.append("-").append(true);
		
		System.out.println(sb1);
		
		
		StringBuilder sb2 = new StringBuilder("animals");
		
		sb2.insert(7, "-");
		sb2.insert(0, "-");
		sb2.insert(4, "-"); 
		System.out.println(sb2);
		
		
		StringBuilder sb3 = new StringBuilder("abcdef");
		
		sb3.delete(1, 3);
		
		sb3.deleteCharAt(5);
		
		
		
		
		
		
		
		
		System.out.println((char)123456778);
		String str = "Rajani";
		String st1 = "Vasisht";
		char[] strarr = str.toCharArray();
		System.out.println(strarr.length);
		byte[] bytes = str.getBytes();
		System.out.println(bytes.length);
		for(byte bt : bytes){
			
			System.out.println(bt);
		}
		
		for(int i=0;i<strarr.length;i++){
		//for(char ch:strarr){
			
			System.out.println(strarr[i]+":"+(int)strarr[i]);
			
		}
		//System.out.println(str.indexOf(1));
		 System.out.println((int)'k');
		System.out.println(str.indexOf('a',2));
		System.out.println(str.indexOf(97));
		
		System.out.println(str.indexOf('k'));
		System.out.println(str.indexOf(107));
		
		
		//str.
		//System.out.println(str.in);
		
	}

}
