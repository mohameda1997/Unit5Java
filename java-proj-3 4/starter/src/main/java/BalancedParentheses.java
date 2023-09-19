import java.util.Stack;

public class BalancedParentheses {
    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "(())";
        String test2 = "(()())";
        String test3 = "(()";
        String test4 = ")(";

        System.out.println(hasBalancedParentheses(test1));  // true
        System.out.println(hasBalancedParentheses(test2));  // true
        System.out.println(hasBalancedParentheses(test3));  // false
        System.out.println(hasBalancedParentheses(test4));  // false
    }
}
