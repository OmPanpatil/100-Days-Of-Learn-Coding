public class functions7{
    /**
     * @param n
     * @param r
     * @param nmr
     * @return
     */
    public static int bico(int n, int r, int nmr){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(nmr);
        int bico = (fact_n/(fact_r * fact_nmr));
        return bico;

    }
    private static int factorial(int n) {
        return 0;
    }
    public static void main(String[] args){
        System.out.println(bico(5,2, 0));
    }
    
}