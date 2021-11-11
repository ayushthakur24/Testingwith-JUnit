import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatedTest {
    @RepeatedTest(5)
    @DisplayName("Testing Deposit method")
    public void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }

    //To get the object of each test we can use - repetition info object
    @RepeatedTest(5)
    @DisplayName("Testing Deposit method")
    public void testDepositRepetitionInfo(BankAccount bankAccount, RepetitionInfo repetitionInfo){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
        System.out.println("Nr: " + repetitionInfo.getCurrentRepetition());
    }
}
