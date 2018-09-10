## Kadane algo is used to find a continous SubArray having MAx sum

    import java.util.*;
    import java.lang.*;
    import java.io.*;

    class SPA {
      public static void main (String[] args) {
        //code
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++)
            {
                a[i] = s.nextInt();
            }
              System.out.println(kadane(a));
		   
		}
	}
	public static int kadane(int[] a)
	{
	    int maxSoFar = a[0], maxEndHere = a[0];
	    for(int i =1;i<a.length;i++)
	    {
	        maxEndHere = Math.max(a[i] , maxEndHere+a[i]);
	       // if(maxEndHere<0)
	       // maxEndHere = 0;
	        if(maxEndHere>maxSoFar)
	        maxSoFar = maxEndHere;
	    }
	    return maxSoFar;
	}
	
}
