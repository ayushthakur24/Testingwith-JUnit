import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


public class BankAccountAssertionsTest {

        @Test
        @DisplayName("Withdraw 500 successfully")
        public void testWithdraw() {
            BankAccount bankAccount = new BankAccount(500, -1000);
            bankAccount.withdraw(300);
            assertEquals(200, bankAccount.getBalance());
        }


        @Test
        @DisplayName("Deposit 400 successfully")
        public void testDeposit() {
            BankAccount bankAccount = new BankAccount(400, 0);
            bankAccount.deposit(500);
            assertEquals(900,bankAccount.getBalance());
        }
        @Test
        @DisplayName("Withdraw will become negative")
        public void testWithdrawNotStuckAtZero(){
            BankAccount bankAccount = new BankAccount(500,-1000);
            bankAccount.withdraw(800);
            assertNotEquals(0,bankAccount.getBalance());
        }

        @Test
        @DisplayName("Check Account Status")
        public void testAccountStatus(){
            BankAccount bankAccount = new BankAccount(500,-1000);
            assertTrue(bankAccount.isAccountStatus());
        }

        @Test
        @DisplayName("Test Set Holder Name")
        public void testHolderName(){
            BankAccount bankAccount = new BankAccount(500,-1000);
            bankAccount.setAccHolderName("Ayush");
            assertNotNull(bankAccount.getAccHolderName());
        }

        @Test
        @DisplayName("Test Can't withdraw below minimum")
        public void testNoWithdrawBelowMinimum(){
            BankAccount bankAccount = new BankAccount(500,-1000);
            assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
        }

        @Test
        @DisplayName("Test with no limitations on Withdraw and Deposit")
        public void testWithdrawAndDepositWithoutExceptions(){
            BankAccount bankAccount = new BankAccount(500,-1000);
            assertAll(() -> bankAccount.deposit(200), ()-> bankAccount.withdraw(300));
        }
        @Test
        @DisplayName("Test Speed of Deposit")
        public void testTimeOut(){
            BankAccount bankAccount = new BankAccount(500,-1000);
            //if you want to make it fail use -> fail();
            assertTimeout(Duration.ofMillis(1),()-> bankAccount.deposit(2000));
            //assertEquals(.33,1/3,"Oops Not the Same");
        }

    }

