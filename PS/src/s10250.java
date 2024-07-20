import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s10250 {

    public void ACM() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 데이터 수

        for(int i = 0; i < T; i++) { // 테스트 데이터 입력
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            int W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님인지

            int floor = (N - 1) % H + 1; // 손님이 머물 층 // int floor = N % H == 0 ? H : N % H; //  N % H가 0일 경우, 이는 호텔의 마지막 층을 의미
            int roomNumber = (N - 1) / H + 1; // 손님이 머물 방 번호

            System.out.printf("%d%02d\n", floor, roomNumber); // 결과 출력
        }
    }

    public static void main(String[] args) throws Exception {
        new s10250().ACM();
    }
}
