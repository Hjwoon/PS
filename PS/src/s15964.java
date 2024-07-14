import java.io.*;
import java.util.StringTokenizer;

public class s15964 {

    public void calAB() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            System.out.print((a+b) * (a-b));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new s15964().calAB();
    }
}
