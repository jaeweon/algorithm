public class twoPointer_prac1 {
    public static void main(String[] args) {
       // 정수의 합이 n과 같은 경우의수
        int n = 15;
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int sum = 0;
        int start = 0, end = 0, count = 0;

        while(true){
            if(sum >= n){
                sum -= arr[start++];
            }
            else if(end == n){
                break;
            }else{
                sum += arr[end++];
            }

            if(sum == n){
                count++;
            }
        }
        System.out.println(count);



    }
}
