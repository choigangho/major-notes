// 문자열 쪼개기
// 화면에서 입력받은 값들은 기본적으로 전부 문자열로 취급됨
// ex) 2+3+1 -> "2+3+1" 문자열로 취급

import java.util.StringTokenizer;

public class StringTokenizerEx {
// 문자열 입력 -> 타입 변환(문자열 => 숫자) -> 연산 후 출력

    public static void main(String[] args) {
        // 문자열 입력
        String str = "2+3+1";

        // "+"를 기준으로 문자열을 분리하는 StringTokenizer 클래스 생성
        StringTokenizer t = new StringTokenizer(str, "+");

        // 타입 변환
        String temp = t.nextToken();    // 분리된 값 순서대로 가져오기
        int x = Integer.parseInt(temp);
        temp = t.nextToken();           // 다음 문자열 가져오기
        int y = Integer.parseInt(temp);

        // 연산 후 출력
        int result = x + y;
        System.out.println( result );
    }
}
