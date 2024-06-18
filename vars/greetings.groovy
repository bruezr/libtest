
def firstFunction(String lastname) {
     script.sh("ls -l")
    testClosure(lastname) {
        echo "Hello ${lastname}"
    }
}

def testClosure(String name, Closure body) {
    body()
    return "Hello ${name}"
}
