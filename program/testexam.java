import java.math.BigInteger;

public class testexam {
    private static final BigInteger MODULO = BigInteger.valueOf(1_000_000_007);
    
    public static void main(String[] args) {
        int N = 4;
        long result = bitonicArrangements(N);
        System.out.println(result);
    }
    
    private static long bitonicArrangements(int N) {
        BigInteger result = BigInteger.valueOf(2).pow(N-2);
        return result.mod(MODULO).longValue();
    }
}