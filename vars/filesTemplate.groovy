// vars/copyCloudbuildFile.groovy
def generateCloudbuildYaml() {
    // The path to the cloudbuild.yml file in the library
    def sourceFilePath = libraryResource('cloudbuild_template.yaml')


    def destinationFilePath = "${env.WORKSPACE}/cloudbuild.yml"
    // Write the content to the destination file
    writeFile file: destinationFilePath, text: sourceFilePath

    echo "File copied to ${destinationFilePath}"
}