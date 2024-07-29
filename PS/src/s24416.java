import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s24416 {

    public static int countFib = 0;
    public static int countFibonacci = 0;

    // 재귀호출
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            countFib++; // 코드1 실행 횟수 증가
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // 동적 프로그래밍
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int[] f = new int[n + 1];
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            countFibonacci++; // 코드2 실행 횟수 증가
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib(n); // 재귀 호출
        fibonacci(n); // 동적 프로그래밍

        System.out.println(countFib + " " + countFibonacci);
    }
}