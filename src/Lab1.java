public class Lab1 {
    public static void main(String[] args) {

        double S = 0;
        int a = -1;
        int n = 9;
        int b = 1;
        int m = 10;
        final int C = 2;

        if (a <= -C && -C <= n){
            System.out.println("Zero in the denominator!");
            return;
        }
        for ( int i = a; i <= n; i++) {
            for ( int j = b; j <= m; j++)
                S += ((double)(i - j) / (i + C));
        }
        System.out.println("Result:" + S);

    }
}