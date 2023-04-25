public class 배열의_평균값 {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i< numbers.length;i++){
            answer += numbers[i];
        }
        return answer/numbers.length;
    }

    //forEach
    public double solution2(int[] numbers) {
        double answer = 0;
        for(int number : numbers){
            answer += number;
        }
        return answer/numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(new 배열의_평균값().solution(numbers));
    }
}
