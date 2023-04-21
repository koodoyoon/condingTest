/*
    x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
    x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
    x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
    x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
    x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
    좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
 */
package programmers.basic;

public class PointPlace {
    public int solution(int[] dot) {
        // 입력된 배열 dot에서 x 좌표와 y 좌표를 변수에 저장
        int x = dot[0];
        int y = dot[1];
        // x와 y의 부호에 따라 해당하는 사분면의 값을 반환
        if (x > 0 && y > 0) {  // x가 양수이고, y가 양수인 경우
            return 1;
        } else if (x < 0 && y > 0) {  // x가 음수이고, y가 양수인 경우
            return 2;
        } else if (x < 0 && y < 0) {  // x가 음수이고, y가 음수인 경우
            return 3;
        } else {  // x가 양수이고, y가 음수인 경우
            return 4;
        }
        // 삼항연산자로 더 간단하게 작성하기
        // return dot[0] > 0 ? (dot[1] > 0 ? 1 : 4) : (dot[1] > 0 ? 2 : 3);
    }
    public static void main(String[] args) {
        PointPlace pointPlace = new PointPlace();
        int[] array = {3,-5};
        System.out.println(pointPlace.solution(array));
    }
}
