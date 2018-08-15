### Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem

code:

    public class Solution {
        public int isPalindrome(String A) {
            A = A.toUpperCase();
            //System.out.println(A);
            int l = A.length()-1;
            for(int i =0;i<A.length()/2 ; i++){
                //System.out.println(A.charAt(i) + " and" + A.charAt(l) + i+" " +l);
                if(!Character.isLetterOrDigit(A.charAt(i)) || A.charAt(i) == ' ')
                {
                    continue;
                }
                else if(!Character.isLetterOrDigit(A.charAt(l)) || A.charAt(i) == ' ')
                {
                    l--;
                    i--;
                }
                else
                {
                    if(!(A.charAt(i) == A.charAt(l)))
                    {
                       // System.out.print(A.charAt(i) + " and" + A.charAt(l) + i+" " +l);
                    return 0 ;
                    }
                    l--;
                }
            }
            return 1;
        }
    }
