import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2738 {
    public void s2738() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에서 행렬의 크기를 입력받음
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // r x c 짜리 행렬 생성
        int[][] matrix = new int[r][c];

        // 두 개의 행렬을 입력받아 합을 구함
        for(int matNum = 0; matNum < 2; matNum++) { // 2개의 행렬
            for(int i = 0; i < r; i++) {
                input = br.readLine();
                st = new StringTokenizer(input);
                for(int j = 0; j < c; j++) {
                    matrix[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        // 행렬 출력
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        new s2738().s2738();
    }

}
