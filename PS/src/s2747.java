import java.util.Scanner;

public class s2747 {

    public void calculateFibonacci() throws Exception {

        // 피보나치 수열 배열 초기화 (최대 45개의 요소)
        int[] fibo = new int[46];
        // 피보나치 수는 0과 1로 시작
        fibo[0] = 0; // 0번째 피보나치 수
        fibo[1] = 1; // 1번째 피보나치 수

        for(int i = 2; i <= 45; i++) { // n은 45보다 작거나 같은 자연수
            fibo[i] = fibo[i-2] + fibo[i-1];
        }

        // n 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n은 45보다 작거나 같은 자연수 // 1 <= n <= 45

        System.out.println(fibo[n]); // n번째 피보나치 수 출력
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        new s2747().calculateFibonacci();
    }
}
