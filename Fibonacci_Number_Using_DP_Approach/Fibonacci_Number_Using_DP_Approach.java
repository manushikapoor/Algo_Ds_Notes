import java.util.*;

class findingFib
{
    int dp[] = new int[100005];

    int fibDP(int n)
    {
        if(n == 0 || n == 1)
	{
	    return n;	
	}
	    
        /* This is used to print the values or series of given fibonacci number.
        if(dp[n] != 0)
	{
            return dp[n];
	}*/
	
	/* This recursion is to hold the values till cand1 = 1(from 5-4-3-2-1), cand2 = 1(5-3-1) */
	int cand1 = fibDP(n-1);
	int cand2 = fibDP(n-2);
	    
	/* Later, it will go back to its previous values(2-3), cand1, cand2 values will be updated.
	after, getting values (1,1), those values get added and updated at 5th index.
	this will repeat in each iteration,
	You can check(print) manually the values of cand1, cand2, n and dp[n] 
	at multiple instances to get a proper idea of structure of the program
	dp[n] = cand1 + cand2; This statement is used to store the fibonacci series in the array
	here, we will be returning the final values of cand1, cand2. */
	return (cand1 + cand2);
    }
}

class Mainer
{
    public static void main(String args[])
    {
        findingFib ob1 = new findingFib();
	int n, result;
	    
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a Number to find the Fibonacci using DP apporach: ");
	n = s.nextInt();
	    
	result = ob1.fibDP(n);
	System.out.println("Fibonacci of " + n + " is: " + result);  
    }
}

/*
TestCase-1: 
Sample Input: 6
Sample Output: 8

TestCase-2:
Sample Input: 10
Sample Output: 55
*/
 
