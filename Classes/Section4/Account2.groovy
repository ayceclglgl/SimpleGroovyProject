@groovy.transform.ToString
class Account2{
    BigDecimal balance = 0.0
    String type //checking or saving
    
    
    void deposit(BigDecimal amount){
       balance += amount
    }
    
    void withdraw(BigDecimal amount){
       balance -= amount
    }
    
    BigDecimal plus(Account2 account){
      this.balance + account.balance
    } 
}