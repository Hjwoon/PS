import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class s15312 {

    public void Compatibility() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 두 줄의 입력을 받음
        String A = br.readLine().trim(); // 종민이의 이름
        String B = br.readLine().trim(); // 그녀의 이름
        int n = A.length();
        int[] mixedNameStroke = new int[2 * n];


        // 종민이와 그녀의 이름을 알파벳 단위로 섞기
        StringBuilder mixedNames = new StringBuilder();
        for (int i = 0; i < n; i++) {
            mixedNames.append(A.charAt(i));
            mixedNames.append(B.charAt(i));
        }

        // 알파벳과 획수를 저장할 해시맵 생성
        HashMap<Character, Integer> alphabetStrokeCount = new HashMap<>();
        char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int[] strokeCounts = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        for (int i = 0; i < alphabets.length; i++) {
            alphabetStrokeCount.put(alphabets[i], strokeCounts[i]);
        }

        // 섞인 이름을 획수로 바꾸기
        for (int i = 0; i < mixedNames.length(); i++) {
            char letter = mixedNames.charAt(i);
            mixedNameStroke[i] = alphabetStrokeCount.get(letter);
        }

        // parentArr 초기화
        int[] parentArr = mixedNameStroke;

        // 반복문을 통해 childArr 생성
        while (parentArr.length > 2) {
            int[] childArr = new int[parentArr.length - 1];
            for (int i = 0; i < childArr.length; i++) {
                childArr[i] = (parentArr[i] + parentArr[i + 1]) % 10;
            }
            parentArr = childArr; // childArr를 새로운 parentArr로 설정
        }

        // 최종 결과 출력
        System.out.printf("%02d\n", parentArr[0] * 10 + parentArr[1]);
    }

    public static void main(String[] args) throws Exception {
        new s15312().Compatibility();
    }
}
