package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        //0,1 are prime by definition
        //Eliminate all even numbers
        //Check for multiples
        if (n == 0 || n == 1 || n == 2){
            if(n==2) {
                return true;
            } else {
                return false;
            }
        }
        else if (n%2==0){
            return false;
        } else {
            //if not, then just check the odds
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
}
