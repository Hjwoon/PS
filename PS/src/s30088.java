import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s30088 {

    public void interview() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 부서의 수
        long TotalTimes = 0; // 모든 부서의 총합 시간 누적
        int [] TotalTimesPerDepartment = new int[N]; // 각 부서당 걸리는 시간 수

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int DepartN = Integer.parseInt(st.nextToken()); // 해당 부서의 직원 수
            for(int j = 0; j < DepartN; j++) {
                TotalTimesPerDepartment[i] += Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(TotalTimesPerDepartment); // 부서별 면담 시간 합 배열을 오름차순으로 정렬
        long prefixSum = 0; // 누적 합을 계산하기 위한 변수
        for (int i = 0; i < N; i++) { // 정렬된 부서별 면담 시간 합에 대해 반복
            prefixSum += TotalTimesPerDepartment[i]; // 현재 부서까지의 누적 합 계산
            TotalTimes += prefixSum; // 누적 합을 결과에 더함
        }

        System.out.println(TotalTimes);
    }

    public static void main(String[] args) throws IOException {
        new s30088().interview();
    }
}