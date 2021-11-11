import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;


public class BankAccountAssumptionTest {
    @Test
    @DisplayName("Test Activation after account creation")
    public void testActivate(){
        BankAccount bankAccount = new BankAccount(500,100);
        assumingThat(bankAccount==null, ()-> assertTrue(bankAccount.isAccountStatus()));
        //assumeTrue(bankAccount!=null);
        //assertTrue(bankAccount.isAccountStatus());
    }
}
