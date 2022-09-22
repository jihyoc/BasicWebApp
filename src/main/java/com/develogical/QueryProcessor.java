package com.develogical;

public class QueryProcessor {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

    public String process(String query) {
        
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        // if (query.toLowerCase().contains("name")) {
        //     return "MyTeam";
        // }
        if (query.toLowerCase().contains("cmu")) {
            return "17313";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "jcsa";
        }
        if (query.toLowerCase().contains("which year was Theresa May first elected as the Prime Minister of Great Britain")) {
            return "2016";
        }
        if (query.toLowerCase().contains("which of the following numbers are primes:")) {
            String[] num_arr = query.toLowerCase().split(":")[1].split(",");
            int num1 = Integer.parseInt(num_arr[0]);
            int num2 = Integer.parseInt(num_arr[1]);
            if (isPrime(num1)) {
                return num1;
            }
            else if (isPrime(num2)) {
                return num2;
            }
            return "";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest:")) {
            String[] num_arr = query.toLowerCase().split(":")[1].split(",");
            int num1 = Integer.parseInt(num_arr[0]);
            int num2 = Integer.parseInt(num_arr[1]);
            
            return math.max(num1, num2);
        }

        return "";
    }
}
