import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s14568 {

    public void shareCandy() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사탕 개수 입력

        int a, b, c; // 택희, 영훈, 남규
        int createdSet = 0;

        for(b = 1; b < N; b++) {
            for(c = b + 2; c < N; c++) {
                a = N - b - c;
                if (a > 0 && a % 2 == 0 && a + b + c == N) {
                    createdSet++;
                }
            }
        }

        System.out.println(createdSet);
    }

    public static void main(String[] args) throws Exception {
        new s14568().shareCandy();
    }
}
