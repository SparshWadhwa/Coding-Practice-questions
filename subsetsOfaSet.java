
public class ubsetsOfaSet {
	
	public static void findSubSet(char[] array ,int n) {
		//int n = array.length;
		n = (int)Math.pow(2,n);
		for(int i=0;i<n;i++) {
			String j =  Integer.toBinaryString(i);
			int z = array.length;
			j = binaryHelper(j,z);
			//System.out.println(j);
			String subSet="";
			for(int m=0;m<j.length();m++) {
				if(j.charAt(m)=='1')
					subSet = subSet + array[m];
			}
			System.out.println("{"+subSet+"}");
			
		
		}
	}
	public static String binaryHelper(String binary , int len) {
		if(binary.length()!=len)
		{
			binary = '0' + binary;
			//System.out.println(binary);
			binary = binaryHelper(binary , len);
		}
		return binary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] set = {'a','b','c','d'};
		String s = "abcd";
		
		char[] set = s.toCharArray();
		int l =set.length;
		findSubSet(set,l);
		
	}

}
