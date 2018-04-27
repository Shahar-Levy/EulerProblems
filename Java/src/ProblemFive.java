public class ProblemFive {

    //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static void main(String[] args){
        System.out.println(divisibleByFirst20());
    }

    public static long divisibleByFirst20(){
        long result = 1;
        boolean numFound = false;

        while(!numFound){
            for (int i = 1; i <= 20; i++){
                if(i == 20){
                    return result;
                }
                if(result % i != 0){
                    break;
                }
            }
            result ++;
        }
        return -1;
    }
}
