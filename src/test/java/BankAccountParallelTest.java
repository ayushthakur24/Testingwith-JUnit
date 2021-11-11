import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountParallelTest {
    @Test
    @DisplayName("Testing Deposit method")
    public void testDeposit(){
        BankAccount object2 = new BankAccount(500,100);
        object2.deposit(500);
        assertEquals(1000,object2.getBalance());
    }
    @Test
    @DisplayName("Testing Deposit method1")
    public void testDeposit1(){
        BankAccount object2 = new BankAccount(500,100);
        object2.deposit(500);
        assertEquals(1000,object2.getBalance());
    }

    @Test
    @DisplayName("Testing Deposit method2")
    public void testDeposit2(){
        BankAccount object2 = new BankAccount(500,100);
        object2.deposit(500);
        assertEquals(1000,object2.getBalance());
    }
}
