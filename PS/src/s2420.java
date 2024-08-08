import java.util.Scanner;
import static java.lang.Math.abs;

public class s2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        long result = abs(N - M);
        System.out.println(result);

        sc.close();
    }
}
