class Account{
    BigDecimal balance = 0.0
    
    def deposit(BigDecimal amount){
        if(amount <= 0){
            throw new Exception("Amount is equal or less than zero")
        }
        balance += amount;    
    }
    
     def deposit(List amountList){
//       for(amount in amountList){
//           deposit(amount)
//       }
         amountList.each{ amount ->
             deposit(amount)
         }
    }
}

Account account = new Account()
account.deposit(100)
println "balance after first deposit: ${account.balance}"

try{
    account.deposit(0)
}catch(Exception e){
    println e
}

def amounts = [100, 500,800]
account.deposit(amounts)
println "balance after many deposits: ${account.balance}"

