import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountNestedTest {

    @Test
    @DisplayName("Testing Withdraw method")
    public void testWithdraw(){
        BankAccount object = new BankAccount(500,100);
        object.withdraw(400);
        assertEquals(100,object.getBalance());
    }

    @Test
    @DisplayName("Testing Deposit method")
    public void testDeposit(){
        BankAccount object2 = new BankAccount(500,100);
        object2.deposit(500);
        assertEquals(1000,object2.getBalance());
    }

    @Nested
    class WhenBalanceEqualsZero{
        @Test
        @DisplayName("Withdrawing below minimum balance exception")
        public void testWithdrawMinimumBalanceIs0(){
            BankAccount bankAccount = new BankAccount(0,0);
            assertThrows(RuntimeException.class,()-> bankAccount.withdraw(500));
        }
        @Test
        @DisplayName("Withdrawing and getting a minimum balance exception")
        public void testWithDrawMinimumBalanceNegative1000(){
            BankAccount bankAccount = new BankAccount(0,-1000);
            bankAccount.withdraw(500);
            assertEquals(-500,bankAccount.getBalance());
        }
    }
}
