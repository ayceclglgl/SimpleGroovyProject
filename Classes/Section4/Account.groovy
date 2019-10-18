class Account{
    BigDecimal balance

    //Adding a plus method
    Account plus(Account account){
        new Account(balance : this.balance + account.balance) // Note: no need to add 'return' last line is always be returned
    }
    
    String toString(){
        "Account Balance: $balance"
    }

}

//Account savings = new Account(balance:100.000)
//Account checking = new Account(balance:500.000)

//prinltn savings + checking

/*
Exception thrown

groovy.lang.MissingMethodException: No signature of method: Account.plus() is applicable for argument types: (Account) values: [Account@5f67692b]
Possible solutions: split(groovy.lang.Closure), is(java.lang.Object), use([Ljava.lang.Object;), wait(), any(), dump()

at ConsoleScript0.run(ConsoleScript0:9)
*/

/*
So we can add a plus method that knows how to add 2 accounts
*/