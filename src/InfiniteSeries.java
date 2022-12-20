public class InfiniteSeries {
    public static double myexp(double x, int n){
        double total = 1.0;
        double numerator = 1.0;
        double denominator = 1.0;

        for(int i = 1; i<=n; i++){
            numerator *= x;
            denominator *= i;
            total += numerator/denominator;
        }
        return total;
    }

    public static void check(double x){
        System.out.println(x);
        System.out.println(myexp(x, 50));
        System.out.println(Math.exp(x));

    }


    public static void main(String[] args) {
        for(double x : new double[] {0.1, 1, 10, 100}) {
            check(x);
        }
        for(double x : new double[] {-0.1, -1, 10, 100}){
            check(x);
        }
    }

}
