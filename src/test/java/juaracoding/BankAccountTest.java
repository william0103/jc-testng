package juaracoding;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeClass
    public void setUp() {
        account = new BankAccount();
        account.setAccount(1, "John", 1000.0);
    }

    @Test
    public void testDeposit() {
        double newBalance = account.deposit(500.0);
        assertEquals(1500.0, newBalance, 0.01); // Memeriksa apakah saldo sesuai setelah deposit
    }

    @Test
    public void testWithdrawSufficientBalance() {
        double newBalance = account.withdraw(500.0);
        assertEquals(500.0, newBalance, 0.01); // Memeriksa apakah saldo sesuai setelah penarikan
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        double newBalance = account.withdraw(1500.0);
        assertEquals(1000.0, newBalance, 0.01); // Memeriksa apakah saldo tetap sama saat penarikan lebih dari saldo
    }

    @Test
    public void testInvalidDeposit() {
        double newBalance = account.deposit(-100.0);
        assertEquals(1000.0, newBalance, 0.01); // Memeriksa apakah saldo tetap sama saat deposit tidak valid
    }

    @Test
    public void testInvalidWithdraw() {
        double newBalance = account.withdraw(-100.0);
        assertEquals(1000.0, newBalance, 0.01); // Memeriksa apakah saldo tetap sama saat penarikan tidak valid
    }
}
