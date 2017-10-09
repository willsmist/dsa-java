package stack;

import com.csygl.dsa.stack.SingleLinkedListStack;
import com.csygl.dsa.stack.Stack;

/**
 * 括号匹配算法
 */
public class ParenMatcher {

    public static final String leftParens = "({[";
    public static final String rightParens = ")}]";

    public static void main(String[] args) {
        String s = "(I){dwe+__&^()}jeuf[efef(j8)]";
        ParenMatcher matcher = new ParenMatcher();
        System.out.println(matcher.match(s.split("")));
    }

    public boolean match(String[] expr) {
//        Stack<String> stack = new ArrayStack<>(expr.length);
        Stack<String> stack = new SingleLinkedListStack<>();
        for (String x : expr) {
            if (isLeftParen(x)) {
                stack.push(x);
            }
            if (isRightParen(x)) {
                if (stack.isEmpty()) {
                    return false;
                } else if (!match(stack.pop(), x)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean match(String lp, String rp) {
        return isLeftParen(lp) && isRightParen(rp) &&
                leftParens.indexOf(lp) == rightParens.indexOf(rp);
    }

    private boolean isLeftParen(String p) {
        return leftParens.contains(p);
    }

    private boolean isRightParen(String p) {
        return rightParens.contains(p);
    }

}
