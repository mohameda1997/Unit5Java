import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {
    String balancedParens = "()";
    String tooManyOpenParens = "((";
    String tooManyOpenParens1 = "()(";
    String tooManyClosedParens = "())";
    String startClosedParens = ")(";
    String emptyString = "";
    String balancedAngleBrackets = "<<>>";
    String balancedComboBrackets = "<({})>";
    String mismatchedBrackets = "<({)}>";

    BalancedBrackets test = new BalancedBrackets();

    @Test
    public void testBalancedBrackets_balancedParens() {
        assertTrue(test.hasBalancedBrackets("()"));
    }

    @Test
    public void testBalancedBrackets_tooManyOpenParens() {
        assertFalse(test.hasBalancedBrackets("({)"));
    }

    @Test
    public void testBalancedBrackets_tooManyClosedParens() {
        assertFalse(test.hasBalancedBrackets("({})>"));
    }

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
        assertFalse(test.hasBalancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(test.hasBalancedBrackets(""));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(test.hasBalancedBrackets("<({})>"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertFalse(test.hasBalancedBrackets("<({)}>"));
    }

}
