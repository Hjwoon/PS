import java.util.Scanner;

public class s14659 {

    public void hanzo() {

        Scanner sc =  new Scanner(System.in);

        // 봉우리의 수, 높이 입력받기
        int n = sc.nextInt(); // 봉우리(활잡이)의 수
        int [] archer = new int[n];
        for(int i = 0; i < n; i++) {
            archer[i] = sc.nextInt(); // 각각의 봉우리 높이
        }

        // 오른쪽 방향으로만
        int maxKilledEnemies = 0; // 최대 처치한 적의 수

        for(int i = 0; i < n; i++) {
            int killedEnemies = 0; // 각각의 활잡이가 처치한 최대 적의 수
            for(int j = i + 1; j < n; j++) { // 오른쪽으로 진행
                if (archer[j] > archer[i]) {
                    break; // 더 높은 봉우리를 만나면 처치를 멈춤
                }
                killedEnemies++; // 더 낮은 봉우리를 만나면 처치 수 증가
            }

            // 최대 처치 수 업데이트
            if (killedEnemies > maxKilledEnemies) {
                maxKilledEnemies = killedEnemies;
            }
        }

        System.out.println(maxKilledEnemies);
    }

    public static void main(String[] args) {
        new s14659().hanzo();
    }
}
