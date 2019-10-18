Account savings = new Account(balance:100.000)
Account checking = new Account(balance:500.000)

println savings + checking

Account2 checkingAcc = new Account2(type:"Checking")
checkingAcc.deposit(100.00)
Account2 savingsAcc = new Account2(type:"Savings")
savingsAcc.deposit(50.00)

println checkingAcc
println savingsAcc


BigDecimal total = checkingAcc + savingsAcc
println total