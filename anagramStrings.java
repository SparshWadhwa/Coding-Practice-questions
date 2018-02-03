import java.util.Arrays;

public class anagramStrings {
	
	private static boolean isAnagram( String s1 , String s2) {
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		String s_1 = new String(str1);
		String s_2 = new String(str2);
		System.out.println(s_1);
		System.out.println(s_2);
		if(s_1.equals(s_2))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one= "triangle";
		String two =  "integral";
		System.out.print(isAnagram(one , two));
	}

}
