// 알고리즘 - 정렬_1

import java.util.Arrays;

public class sort_Study_Part1 {
    // 오름차순 기준 정렬 알고리즘

    // 버블 정렬
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    // 삽입 정렬
    public static void insertionSort(int[] arr) { // arr = {3, 5, 2, 7, 1, 4};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j - 1]){ // 자신 보다 앞의 idx 값이 더 크다면 # 5가 2 보다 크다면
                    int tmp = arr[j]; // tmp = 2
                    arr[j] = arr[j - 1]; // 원래 2의 자리에 5를 넣어 줌
                    arr[j - 1] = tmp; // 원래 5의 자리에 2를 넣어 줌
                }else {
                    break;
                }
            }
        }
    }

    // 선택 정렬
    private static void selectionSort(int[] arr) { // arr = {3, 5, 2, 7, 1, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // min = 0
            for (int j = i + 1; j < arr.length; j++) { // j = 1
                if(arr[j] < arr[min]){ // 첫 번째 idx와 나머지 수를 비교해 최소 값을 0번 째 idx에 넣어주려는 작업
                    min = j; // 자신이 더 작으니 min에 넣어 줌 이렇게 돌리면 min에 최소값이 들어감
                }
            }
            int tmp = arr[i]; // tmp에 맨 앞 idx를 넣어줌 #3
            arr[i] = arr[min]; // 맨 앞의 idx에 최소 값을 넣어 줌
            arr[min] = tmp; // 최소 값 1이 있던 자리에 3을 넣어 줌 swap
        }
    }
    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 5, 2, 7, 1, 4};
        bubbleSort(arr);
        System.out.println("버블 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        insertionSort(arr);
        System.out.println("삽입 정렬: " + Arrays.toString(arr));

        arr = new int[]{3, 5, 2, 7, 1, 4};
        selectionSort(arr);
        System.out.println("선택 정렬: " + Arrays.toString(arr));
    }
}
