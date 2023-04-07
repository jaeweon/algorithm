public class DP_prac1 {
    public static void main(String[] args) {
        // 문제 설명 : 배열의 연속 구간 속에서 가장 큰 구간의 합을 구하시오. 합이 음수 일 경우 return 0
        int [] A = {2, -8, 3, -2, 4, -10};
        int [] dp = new int[A.length];
        dp[0] = A[0];

        int ans = dp[0];
        for (int i = 1; i < A.length; i++) {
            // (이전까지의 합 + 현재 합)과 현재 합 중에 더 큰 값을 dp에 할당한다.
            dp[i] = Math.max(dp[i - 1] + A[i], A[i]);
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
        }
