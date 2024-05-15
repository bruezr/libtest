// Load the shared library
library identifier: 'my-shared-library@main', retriever: modernSCM([
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
                    def helloMessage = sayHello(name)
                    def goodbyeMessage = sayGoodbye(name)
                    echo helloMessage
                    echo goodbyeMessage
                }
            }
        }
    }
}
