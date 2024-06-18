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
                    def lastname = 'Jenkins'
                    greetings.firstFunction(lastname)


                    // Example usage
                    def stepsData = [
                        [name: "gcr.io/cloud-builders/docker", args: ["build", "--build-arg", "DJANGO_ENV=\$_DJANGO_ENV", "-t", "us-east1-docker.pkg.dev/bm-gcp-d1-ingdts/cloud-run-led-dev/app-led-dev:20240530", "."], id: "build"],
                        [name: "gcr.io/cloud-builders/docker", args: ["push", "us-east1-docker.pkg.dev/bm-gcp-d1-ingdts/cloud-run-led-dev/app-led-dev:20240530"], id: "push"],
                        [name: "gcr.io/google-appengine/exec-wrapper", args: ["-i", "us-east1-docker.pkg.dev/bm-gcp-d1-ingdts/cloud-run-led-dev/app_led", "-s", "bm-gcp-d1-ingdts:us-east1", "-e", "SETTINGS_NAME=secret-led", "--", "python", "manage.py", "migrate"], id: "apply migrations"]
                        // Add more steps as needed
                    ]

                    filesTemplate.generateCloudbuildYaml('cloudbuild_template.yaml', 'steps_cloudbuild_template.yaml', stepsData, 'output.yaml')
                }
            }
        }
    }
}
