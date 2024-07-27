import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class s11866 {

    // List
    public static List<Integer> josephusList(int N, int K) {
        List<Integer> res = new ArrayList<>();
        List<Integer> people = new ArrayList<>();

        // 초기화: 사람 리스트에 1부터 N까지 추가
        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;

        // 사람들이 모두 제거될 때까지 반복
        while (people.size() > 1) {
            // 현재 인덱스에서 K-1만큼 이동한 다음 사람 제거
            index = (index + K - 1) % people.size();
            res.add(people.remove(index));
        }

        // 마지막 남은 사람 추가
        res.add(people.get(0));

        return res;
    }

    // Queue
    public static List<Integer> josephusQueue(int N, int K) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // 큐 초기화: 1부터 N까지 숫자를 큐에 추가
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 큐가 빌 때까지 반복
        while (queue.size() > 1) {
            // K-1번 맨 앞의 사람을 뒤로 보냄
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            // K번째 사람 제거하고 결과 리스트에 추가
            res.add(queue.poll());
        }

        // 마지막 남은 사람 추가
        res.add(queue.poll());

        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // N명의 사람이 원을 이루면서 앉아있고
        int K = Integer.parseInt(st.nextToken()); // K번째 사람을 제거

        // josephusQueue 메서드 호출
        List<Integer> result = josephusQueue(N, K); // 리스트 자료구조 사용 시 메서드 josephusQueue 호출

        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

}