public class ProblemFour {

    //A palindromic number reads the same both ways. The largest palindrome
    //made from the product of two 2-digit numbers is 9009 = 91 × 99.
    //Find the largest palindrome made from the product of two 3-digit numbers.

    public static void main(String[] args){
        System.out.println(largestPalindrome());
    }

    public static int largestPalindrome(){
        int max = -1;
        for(int i = 999; i >= 100; i--){
            for (int j = 999; j >= 100; j--){
                int product = (int) i * j;
                if(isPalindrome(String.valueOf(product)) && product > max){
                    max = product;
                }
            }
        }
        return max;
    }

    public static boolean isPalindrome (String str){
        int length = str.length();
        for(int i = 0; i < length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

}
