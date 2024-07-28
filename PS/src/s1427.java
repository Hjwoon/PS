import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s1427 {

    public static long sortInside(long N) {
        // 자연수 N을 문자열로 변환
        String stringN = Long.toString(N);

        // 문자열을 문자 배열로 변환하여 내림차순 정렬
        char[] chars = stringN.toCharArray();
        Arrays.sort(chars);

        // 내림차순으로 정렬된 문자 배열을 뒤집기
        StringBuilder sortedString = new StringBuilder(new String(chars)).reverse();

        // 정렬된 문자열을 Long형으로 변환
        return Long.parseLong(sortedString.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()); // 1,000,000,000보다 작거나 같은 자연수

        long sortedNumber = sortInside(N);

        System.out.println(sortedNumber);
    }
}
