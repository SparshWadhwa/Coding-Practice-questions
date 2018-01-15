
public class SelfDescriptiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 2020;
		if(isSelfDescriptive(no))
			System.out.print("yeas it is self descriptive");
		else
			System.out.print("No,its not");
		

	}
	
	public static boolean isSelfDescriptive(int n) {
		
		int freq[] = new int[10];
		int number = n , d;
		while(number>0) {
			d = number%10;
			freq[d]++;
			number=number/10;
		}
		String s = Integer.toString(n);
		Boolean flag = false;
		new StringBuilder(s).reverse().toString();
		for(int j=0;j<s.length();j++) {
			char temp = Integer.toString(freq[j]).charAt(0);
			if(s.charAt(j)==temp)
			{	flag = true;
				continue;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}

}
