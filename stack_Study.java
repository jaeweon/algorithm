import java.util.Stack;

public class stack_Study {
    public static void main(String[] args) {
        // Stack
        Stack stack = new Stack<>();
            // push() data 넣기
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            System.out.println(stack); // 1 2 3 4

            // pop() 맨 위 값 호출 및 제거
            stack.pop(); // 4 제거 (맨위 에 값 제거)
            System.out.println(stack); // 1 2 3

            // peek() 맨 위 값 호출
            stack.peek(); // 3

            // contains() 포함 유무
            // size() 사이즈 길이
            // empty() 값이 있는 지 유무
            // clear() stack 값 전체 비우기
    }
}
