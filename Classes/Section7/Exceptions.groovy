List log = []

def foo(){
    throw new Exception("Foo Exception")
}

try{
    foo()
} catch( Exception e){
    log << e.message
} finally {
    log << 'finally'
}

println log