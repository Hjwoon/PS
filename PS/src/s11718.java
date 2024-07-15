import java.io.BufferedReader;
import java.io.InputStreamReader;

public class s11718 {
    public void print() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = br.readLine()) != null) { // 입력이 없을 때까지 반복
            System.out.println(input);
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        new s11718().print();
    }
}
