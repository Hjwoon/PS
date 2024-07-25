import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s11637 {

    public void voteGetter() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 전체 테스트케이스 수

        for(int i = 0; i < T; i++) { // 각 테스트케이스마다
            int candidateNum = Integer.parseInt(br.readLine()); // 후보자 수
            int[] votes = new int[candidateNum];
            int voteSum = 0; // 득표수 총합
            int mostVote = 0; // 최다 득표 수
            int mostVoteCandidate = -1; // 최다 득표를 한 후보자 번호 (0-based index)
            boolean tie = false; // 동점 여부

            for (int j = 0; j < candidateNum; j++) {
                votes[j] = Integer.parseInt(br.readLine());
                voteSum += votes[j];

                if (votes[j] > mostVote) {
                    mostVote = votes[j];
                    mostVoteCandidate = j;
                    tie = false; // 최다 득표자가 바뀌면 동점 여부 초기화
                } else if (votes[j] == mostVote) {
                    tie = true; // 최다 득표자가 여러 명일 경우
                }
            }

            if (tie) {
                System.out.println("no winner");
            } else {
                if (votes[mostVoteCandidate] > voteSum / 2) {
                    System.out.println("majority winner " + (mostVoteCandidate + 1));
                } else {
                    System.out.println("minority winner " + (mostVoteCandidate + 1));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new s11637().voteGetter();
    }
}