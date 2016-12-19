// tag::AccountsTest[]
package eu.sig.training.ch04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class AccountsTest {

    @Test
    public void testIsValidNormalCases() {
        assertTrue("isValid(\"123456789\") should return true", Accounts.isValid("123456789"));
        assertFalse("isValid(\"123456788\") should return false", Accounts.isValid("123456788"));
    }

    // end::AccountsTest[]

    @Ignore("Deliberately fails for illustration purpose")
    // tag::testEmptyString[]
    @Test
    public void testEmptyString() {
        assertFalse(Accounts.isValid(""));
    }
    // end::testEmptyString[]

    @SuppressWarnings("unused")
    @Ignore("Deliberately fails for illustration purpose")
    // tag::showError[]
    @Test
    public void showError() {
        int dummy = 1 / 0;
        // Next line is never executed because the previous one raises an
        // exception.
        // If it were executed, you'll never see the assert message because
        // the test always succeeds.
        assertTrue("You will never see this text.", true);
    }
    // end::showError[]

    @Test
    @Ignore
    public void testIsValidLetters() {
        assertFalse("isValid(\"abcdefghi\") should return false", Accounts.isValid("ABCDEFGHK"));
    }

    @Test
    @Ignore
    public void testIsValidNonNormal() {
        assertFalse("Empty string is not a valid number", Accounts.isValid(""));
    }

    @Test
    @Ignore
    public void testIsValidNonNumeric() {
        assertFalse("Non-numerics always invalid", Accounts.isValid("12.34.56."));
    }

    @Test
    @Ignore
    public void testIsValidToolong() {
        assertFalse("More than 9 digits is always invalid", Accounts.isValid("1234567890"));
    }

    @Test
    @Ignore
    public void testIsValidTooshort() {
        assertFalse("Less than 9 digits is always invalid", Accounts.isValid("12345677"));
    }

}