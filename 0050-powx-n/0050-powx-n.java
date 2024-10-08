class Solution {
    public static double pow_util(double x,long n){
        if(n == 0) return 1.0;
        if(n == 1) return x;
        if(n < 0) return pow_util(1/x,-n);
        double result = pow_util(x*x,n/2);
        if(n%2 != 0){
            result *= x;
        }
        
        return result;
    }
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        return (pow_util(x,n));
        
    }
}