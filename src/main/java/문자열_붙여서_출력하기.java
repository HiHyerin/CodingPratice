import java.util.Scanner;

public class 문자열_붙여서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        String c = a + b;
        System.out.println(c.replaceAll(" ", ""));
        System.out.println(a+b);
        /*
        *   Scanner 메소드
        *     - next() : 공백 전까지 입력받은 문자열 반환
        *     - nextLine() : Enter 치기 전까지 쓴 문자열 모두 반환
        * */
    }
}
