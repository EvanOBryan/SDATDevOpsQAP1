import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() {
        account = new Account(1000);
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        account.withdraw(1200);
        assertEquals(1000, account.getBalance(), 0); // Balance should remain unchanged
    }
}