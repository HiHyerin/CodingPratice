import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String output = "";
        char tmp;
        for(int i=0; i<a.length(); i++){
            tmp = a.charAt(i);
            if((65 <= tmp) && (tmp <=90)){ // 대문자인 경우
                output += a.valueOf(tmp).toLowerCase();
            } else if ((97 <= tmp) && (tmp <= 122)) { // 소문자인 경우
                output += a.valueOf(tmp).toUpperCase();
            }else { // 그 외 문자열일  경우
                output += (char)tmp;
            }
        }
        System.out.println(output);
    }
}
