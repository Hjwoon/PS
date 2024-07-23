import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s11536 {

    public void lineUp() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 인원

        String[] player = new String[N];
        for(int i = 0; i < N; i++) {
            player[i] = br.readLine(); // 선수 이름 배열에 입력
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < N - 1; i++) {
            if (player[i].compareTo(player[i + 1]) < 0) {
                decreasing = false;
            } else if (player[i].compareTo(player[i + 1]) > 0) {
                increasing = false;
            }
        }

        if (increasing) {
            System.out.println("INCREASING");
        } else if (decreasing) {
            System.out.println("DECREASING");
        } else {
            System.out.println("NEITHER");
        }
    }

    public static void main(String[] args) throws IOException {
        new s11536().lineUp();
    }
}