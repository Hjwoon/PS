import java.util.*;

public class s4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 종료 조건: 두 정수가 모두 0일 때
            if (a == 0 && b == 0) {
                break;
            }

            // 첫 번째 정수가 두 번째 정수보다 크면 "Yes", 아니면 "No"
            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
