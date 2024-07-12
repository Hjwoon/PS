import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class s10699 {
    public void s10699() throws IOException {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");  // 'yyyy'로 변경
        df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(df.format(date));
        bw.flush();  // 버퍼 플러시
        bw.close();  // 버퍼 닫기
    }

    public static void main(String[] args) throws Exception {
        new s10699().s10699();
    }
}
