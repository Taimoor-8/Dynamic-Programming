import java.util.Scanner;

public class Dynamic_Programming {

//    Bottom-Up approach

    public int fib(int n){
        int [] tab = new int[n+1];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i <= n; i++){
            tab [i] = tab [i-1] + tab [i-2];
        }
        return tab[n];
    }

    public int fib(int [] memo , int n){
        if (memo[n] < 2){
            memo [n] = n;
        }
        else {
            int left = fib(memo , n-1);
            int right = fib(memo , n-2);
            memo [n] = left + right;
        }
        return memo[n];
    }

    public static void main(String[] args) {

        Dynamic_Programming dp = new Dynamic_Programming();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number wo be evaluated");
        int n = sc.nextInt();

        System.out.println("The number in the fibonacci series corresponding to the given number is " + dp.fib(n));


        System.out.println("The number in the fibonacci series corresponding to the given number is " + dp.fib(new int[n+1],n));
    }
}
