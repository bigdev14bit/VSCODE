import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void iHaveAnAccountAndBalanceIsZero() {
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void iHaveAnAndIcanDeposit() {
        Account myAccount = new Account();
        myAccount.deposit(1000);
        assertEquals(1000, myAccount.getBalance());
    }

    @Test
    public void iHaveAnAccountAndIcanDepositNegativeAmount() {
        Account myAccount = new Account();
        myAccount.deposit(-1000);
        assertEquals(0, myAccount.getBalance());
    }

    @Test
    public void iHaveAnAccountAndIcanWithdraw() {
        Account myAccount = new Account();
        myAccount.deposit(1000);
        myAccount.withdraw(500);
        assertEquals(500, myAccount.getBalance());
    }
}