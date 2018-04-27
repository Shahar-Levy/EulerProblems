import java.util.ArrayList;

public class ProblemSeven {
    //By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
    //we can see that the 6th prime is 13.
    //What is the 10 001st prime number?

    static ArrayList<Long> primeList = new ArrayList<Long>(){{
        add(2L);
    }};

    public static void main (String[] args){

        System.out.println(nthPrimeNum(10001));
    }

    public static boolean isPrime(long num){
        for (Long prime : primeList) {
            if (num % prime == 0){
                return false;
            }
        }
        primeList.add(num);
        return true;
    }

    public static long nthPrimeNum(long num){
        long primeCount = 1; //2 is already added
        long index = 2;

        while (primeCount < num){
            if(isPrime(index)){
                primeCount++;
            }
            index++;
        }
        return index-1;
    }

}
