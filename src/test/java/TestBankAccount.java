import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit Test for Bank Account")
public class TestBankAccount {

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
}
