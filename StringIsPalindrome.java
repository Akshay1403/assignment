public class StringIsPalindrome {
 
  
    static boolean isPalindrome(String str)
    {
 
       
        int i = 0, j = str.length() - 1;
 
      
        while (i < j) {
 
            
            if (str.charAt(i) != str.charAt(j))
                return false;
 
           
            i++;
            j--;
        }
 
     
        return true;
    }
 
    
    public static void main(String[] args)
    {
        String str = "wow";
 
        if (isPalindrome(str))

            System.out.print("The String is Palindrome\n The String is:\t"+str);
        else
        	
            System.out.print("The String is not Palindrome\n The Strings is:\t"+str);
    }
}