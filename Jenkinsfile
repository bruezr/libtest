// Load the shared library from the 'lib' branch
library identifier: 'my-shared-library@lib', retriever: modernSCM([
    $class: 'GitSCMSource',
    remote: 'https://github.com/bruezr/libtest.git',
    credentialsId: 'your-credentials-id'
])

pipeline {
    agent any

    stages {
        stage('Greeting') {
            steps {
                script {
                    def name = 'Jenkins'
                    def helloMessage = greetings.sayHello(name)
                    def goodbyeMessage = greetings.sayGoodbye(name)
                    echo helloMessage
                    echo goodbyeMessage
                }
            }
        }
    }
}
