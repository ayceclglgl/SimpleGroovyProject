def log = { String type, Date createdOn, String msg ->
    println ("$createdOn [$type] = $msg")
} 
log("DEBUG", new Date(), "Fist debug statement..")

//We'll pass that one argument into our existing closure and now it's going to return to us a new closure that really only has two arguments needed to fill, the date and the message.
def debugLog = log.curry("DEBUG") //debugLog is our new closure which takes 2 parameters which are createdOn and msg
debugLog(new Date(), "This is another debug statement..")
debugLog(new Date(), "This is one more...")

def todayDebugging = log.curry("DEBUG", new Date())
todayDebugging("This's today debug msg..")

def todayDebugging2 = debugLog.curry(new Date())
todayDebugging2("This's today debug msg version 2")

//right curry
//rcurry replaced from the right to the left.
def rlog = log.rcurry("Why am I logging this way")
rlog("DEBUG", new Date())


//index based currying
//In case a closure accepts more than 2 parameters, it is possible to set an arbitrary parameter using ncurry:
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "This is using ncurry..")