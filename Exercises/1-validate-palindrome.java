/* Validate Palindrome: A string that reads the same when read forward or backward. 
For example:  
  "abba", The palindrome center is the position of the vertical line in "ab|ba" 
  "abcba" The palindrome center is c-- "ab(c)ba
Q:Input: s="A man, a plan, a canal: Panama” Output: true 
*/
//Method1: two pointer
public class Main{
  public static void main(String[] args){
    String p="A man, a plan, a canal: Panama";
    boolean result=validatePalindrom(p);
    System.out.println(result);
  }
  public static boolean validatePalindrom(String p){
    //clean up and convert to character array
    String cleaned=p.replaceAll("[^a-zA-Z0-9]","").toLowCase();
    char[] chars=cleaned.toCharArray();
    //Two-pointer comparison
    for(int i=0, j=chars.length-1; i<j; i++, j-- ){
      if(chars[i]!=chars[j]){
        return false;
      }
    }
    return true;
  }
    
}
//Method2: Direct comparison of two Pointers on the original string (saving memory)
public class Main{
  public static void main(String[] args){
    String p="A man, a plan, a canal: Panama";
    boolean result=validatePalindrom(p);
    System.out.println(result);
  }
  public static boolean validatePalindrom(String p){
    int left=0;
    int right=p.length()-1;
    while(left<right){
      //Skip all non-letter or digit characters
      while(left<right && !Character.isLetterOrDigit(p.charAt(left))){
        left++;
      }
       while(left<right && !Character.isLetterOrDigit(p.charAt(right))){
        right--;
      }
      if(Character.toLowerCase(p,charAt(left))!=Character.toLowerCase(p.charAt(right))){
        return false;
      }
      left++;
      left--
    }
    return true;
  }
}
//Method3: StringBuilder  
public class Main{
  public static void main(String[] args){
    String p="A man, a plan, a canal: Panama";
    boolean result=validatePalindrom(p);
    System.out.println(result);
  }
  public static boolean validatePalindrom(String p){
    String cleaned=p.replaceAll("[^a-zA-Z0-1]","").toLowerCase();
    //compare the original string with reverse string
    return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
  }
}
  
