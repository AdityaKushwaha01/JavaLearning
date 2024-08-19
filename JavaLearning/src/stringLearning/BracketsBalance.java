package stringLearning;

import java.util.Stack;

public class BracketsBalance {

    public static void main(String[] args) {
        String brackets = "[{([{}])]";
        
        System.out.println(isBalanced(brackets) ? "Balanced" : "Not Balanced");
    }

    public static boolean isBalanced(String brackets) {
        Stack<Character> stc = new Stack<>();
        
        for (int i = 0; i < brackets.length(); i++) {
            char c = brackets.charAt(i);
            
            // Push opening brackets onto the stack
            if (c == '[' || c == '(' || c == '{') {
                stc.push(c);
            }
            // For closing brackets, check for matching opening bracket
            else if (c == ']' || c == ')' || c == '}') {
                if (stc.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stc.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        // If the stack is empty, all brackets were matched correctly
        return stc.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '[' && close == ']') ||
               (open == '(' && close == ')') ||
               (open == '{' && close == '}');
    }
}
