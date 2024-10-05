import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] current = sc.nextLine().split(":");  // next() 대신 nextLine() 사용
        String[] drop = sc.nextLine().split(":");     // next() 대신 nextLine() 사용

        int currentHour = Integer.parseInt(current[0]);
        int currentMinute = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;

        int dropHour = Integer.parseInt(drop[0]);
        int dropMinute = Integer.parseInt(drop[1]);
        int dropSecond = Integer.parseInt(drop[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if (needSecondAmount <= 0)
            needSecondAmount += 24 * 3600;
        
        // 경계값 처리를 위해 시간을 정확히 계산
        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d\n", needHour, needMinute, needSecond);  // printf 출력 형식 유지
    }
}
