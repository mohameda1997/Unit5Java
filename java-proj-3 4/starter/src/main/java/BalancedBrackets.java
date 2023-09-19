import java.util.Stack;

public class BalancedBrackets {
    public static boolean hasBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else if (isCloseBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[' || c == '<';
    }

    private static boolean isCloseBracket(char c) {
        return c == ')' || c == '}' || c == ']' || c == '>';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']')
                || (open == '<' && close == '>');
    }

    public static void main(String[] args) {
        String test1 = "(())";
        String test2 = "{[()]}";
        String test3 = "(]";
        String test4 = "((())";

        System.out.println(hasBalancedBrackets(test1));  // true
        System.out.println(hasBalancedBrackets(test2));  // true
        System.out.println(hasBalancedBrackets(test3));  // false
        System.out.println(hasBalancedBrackets(test4));  // false
    }
}