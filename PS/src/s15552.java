import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class s15552 {

    public void s15552() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //할당된 버퍼에 값 넣어주기

        String input = br.readLine();
        int T = Integer.parseInt(input); // 테스트케이스 수

        for(int i = 0; i < T; i++) {
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());


            bw.write((a + b) +"\n");
        }

        bw.flush(); // 버퍼에 남아있는 내용을 모두 출력
    }

    public static void main(String[] args) throws Exception {
        new s15552().s15552();
    }
}