import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s30501 {

    public void suspects() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 용의자 수


        for(int i = 0; i < N; i++) {
            String name = br.readLine().trim();

            // 이름에 'S'가 포함되어 있는지 확인합니다.
            if (name.contains("S")) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new s30501().suspects();
    }
}
