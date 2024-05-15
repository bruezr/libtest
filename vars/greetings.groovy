
def firstFunction(String lastname) {
    testClosure(lastname) {
        echo "Hello ${lastname}"
    }
}

def testClosure(String name, Closure body) {
    body()
    return "Hello ${name}"
}
