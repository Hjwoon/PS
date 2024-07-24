import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s29731 {

    public void meme() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String [] promise = {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        boolean isModified = false;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            boolean found = false;
            for (String p : promise) {
                if (input.equals(p)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isModified = true;
                break;
            }
        }

        if (isModified) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) throws IOException {
        new s29731().meme();
    }
}
