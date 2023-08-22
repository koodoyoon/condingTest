package programmers.basic;

public class Factorial2 {
    public long solution(int balls, int share) {
        return combination(balls, share);
    }

    // 최적화된 조합 계산 함수
    public long combination(int n, int k) {
        k = Math.min(k, n - k);  // nCk와 nC(n-k)는 같기 때문에 k가 크면 n-k를 사용
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;  // 연산을 줄이기 위한 방법
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial2 f = new Factorial2();
        System.out.println(f.solution(3, 2));
        System.out.println(f.solution(5, 2));
    }
}
