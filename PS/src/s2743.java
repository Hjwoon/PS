import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2743 {

    public void wordLenght() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input.length());
    }

    public static void main(String[] args) throws Exception {
        new s2743().wordLenght();
    }
}