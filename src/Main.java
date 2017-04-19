/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Boolean isPrime;
        int largestPalindromePrime = 0;
        
        // Iterate through numbers 1 to 1000
        for(int i = 1; i < 1000; i++)
        {
            isPrime = true; //Assume number is prime
            
            // Test if number is actually prime
            //  by dividing it by itself and each number less than it
            for(int j = i; j > 1; j--)
            {
                // If the number divided by a lesser number is not 1
                //  and has no remainder, the original number is not prime
                if((i / j != 1) && i % j == 0)
                    isPrime = false;
            }
            
            // If the number is prime, test if the number is a palindrome
            if(isPrime)
            {
                int temp = i;
                int r;
                int sum = 0;
                
                // Flips the number around using a temporary variable
                while(temp > 0)
                {
                    r = temp % 10;
                    sum = (sum * 10) + r;
                    temp = temp / 10;
                }
                
                // If the number is a palindrome prime, it's the largest one yet
                if(i == sum)
                {
                    largestPalindromePrime = i;
                }
            }   
        }
        System.out.println(largestPalindromePrime);
    }
}