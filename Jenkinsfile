// Load the shared library from the 'lib' branch
library identifier: 'my-shared-library@lib', retriever: modernSCM([
    $class: 'GitSCMSource',
    remote: 'git@github.com:bruezr/libtest.git',
    credentialsId: 'bruezr'
])

pipeline {
    agent any

    stages {
        stage('Greeting') {
            steps {
                script {
                    def lastname = 'Jenkins'
                    greetings.firstFunction(lastname)
                }
            }
        }
    }
}
