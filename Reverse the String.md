## Given an input string, reverse the string word by word.

### Example:

Given s = "the sky is blue",

return "blue is sky the".
### Code:

public class Solution {
    public String reverseWords(String a) {
        String[] s = a.split(" ");
        String ans = "";
        for( int i=s.length-1;i>=0;i--)
        {
            if(i==0)
            ans = ans+ s[i]; 
            else
            ans = ans+ s[i]+" "; 
        }
        return ans;
    }
}
