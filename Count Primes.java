/*
Given an integer n, return the number of prime numbers that are strictly less than n.

Example:-
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
*/


class Solution {
    public int countPrimes(int n) {
        if( n==0 || n==1)
        {
            return 0;
        }
        
        int Primes[] = new int[n];
        Primes[0] = 0;
        Primes[1] = 0;
        
        for(int i=2;i<n;i++)
        {
            Primes[i]=1;
        }
        
        int i = 2;
        while(i<n){
            int temp = i;
            if(Primes[i] == 1)
            {
                temp = temp+i;
                while (temp<n)
                {
                    Primes[temp] = 0;
                    temp = temp+i;
                }
            }
            i=i+1;
        }
        
        int count =0;
        for(int j=0;j<n;j++)
        {
            if(Primes[j]==1)
            {
                count=count+1;
            }
        }
        
        return (count);
    }
}
