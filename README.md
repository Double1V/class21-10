# class21-10
## kata task1

[Task link](https://www.codewars.com/kata/5547929140907378f9000039)    
My solution
    
    public class Kata {
      public static String shortcut(String input) {
        return input.replaceAll("(?)[aeiou]", "");
      }
    }
    
My fav solution

     public class Kata {
      public static String shortcut(String input) {
        String[] glas = {"a", "e", "o", "i", "u"};
        for (int i = 0; i < glas.length; i++) {
            input = input.replace(glas[i], "");
        }
        return input;
      }
    }
    
 [Task link](https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af)   
 My solution
 
    public class Fibonacci {
      public static long fib(int n) {
        if (n == 1) return 1;
        n = n + 1;
        long[] fibo = new long[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n - 1; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n - 1];
      }
    }
    
My fav solution

    public class Fibonacci {
      public static long fib (int n) {
        if (n <= 1) {
         return n;
      }
      return fib(n - 1) + fib(n -2);
      }
    }
