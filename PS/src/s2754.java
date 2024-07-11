import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class s2754 {

    public void s2754() throws Exception {

        // 평정
        /*A+: 4.3, A0: 4.0, A-: 3.7

        B+: 3.3, B0: 3.0, B-: 2.7

        C+: 2.3, C0: 2.0, C-: 1.7

        D+: 1.3, D0: 1.0, D-: 0.7

        F: 0.0*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();
        Double gradeToInt = null;

        switch (grade) {
            case "A+":
                gradeToInt = 4.3;
                break;
            case "A0" :
                gradeToInt = 4.0;
                break;
            case "A-" :
                gradeToInt = 3.7;
                break;

            case "B+" :
                gradeToInt = 3.3;
                break;
            case "B0" :
                gradeToInt = 3.0;
                break;
            case "B-" :
                gradeToInt = 2.7;
                break;

            case "C+" :
                gradeToInt = 2.3;
                break;
            case "C0" :
                gradeToInt = 2.0;
                break;
            case "C-" :
                gradeToInt = 1.7;
                break;

            case "D+" :
                gradeToInt = 1.3;
                break;
            case "D0" :
                gradeToInt = 1.0;
                break;
            case "D-" :
                gradeToInt = 0.7;
                break;

            case "F" :
                gradeToInt = 0.0;
                break;

            default:
                System.out.println("올바른 학점을 입력하세요.");
                return; // 올바르지 않은 입력이 들어오면 종료
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Double.toString(gradeToInt));
        bw.flush();
    }

    public static void main(String[] args) throws Exception {
        new s2754().s2754();
    }
}