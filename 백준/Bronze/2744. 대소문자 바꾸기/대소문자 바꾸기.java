import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        char[] ch = new char[st.length()];

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= 65 && st.charAt(i) <= 90) { // 대문자인 경우
                ch[i] = (char) (st.charAt(i) + 32);
            } else if (st.charAt(i) >= 97 && st.charAt(i) <= 122) { // 소문자인 경우
                ch[i] = (char) (st.charAt(i) - 32);
            } else { // 알파벳이 아닌 경우
                ch[i] = st.charAt(i);
            }
        }

        // 결과 출력
        System.out.println(new String(ch));
    }
}
