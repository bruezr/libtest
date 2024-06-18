def generateCloudbuildYaml(cloudbuildTemplatePath, stepsTemplatePath, stepsData, outputPath) {

    echo "Current workspace is ${env.WORKSPACE}"
    echo "Current workspace is twooo $WORKSPACE"

   /*  def cloudbuildTemplate = new File(cloudbuildTemplatePath).text
    def stepsTemplate = new File(stepsTemplatePath).text

    // Initialize a StringBuilder to hold the generated steps
    def generatedSteps = new StringBuilder()

    // Process each step data
    stepsData.each { step ->
        def stepContent = stepsTemplate
        stepContent = stepContent.replace('${STEP_NAME}', step.name)
        stepContent = stepContent.replace('${STEP_ARGS}', step.args.collect { "\"${it}\"" }.join(", "))
        stepContent = stepContent.replace('${STEP_ID}', step.id)
        generatedSteps.append(stepContent).append("\n")
    }

    // Replace the placeholder in the cloudbuild template with generated steps
    def finalContent = cloudbuildTemplate.replace('${TEMPLATE_STEP}', generatedSteps.toString().trim())

    // Write the final content to the output file
    new File(outputPath).text = finalContent

    println "Generated YAML file:"
    println finalContent */
}

/* // Example usage
def stepsData = [
    [name: "gcr.io/cloud-builders/docker", args: ["build", "--build-arg", "DJANGO_ENV=\$_DJANGO_ENV", "-t", "us-east1-docker.pkg.dev/bm-gcp-d1-ingdts/cloud-run-led-dev/app-led-dev:20240530", "."], id: "build"],
    [name: "gcr.io/cloud-builders/docker", args: ["push", "us-east1-docker.pkg.dev/bm-gcp-d1-ingdts/cloud-run-led-dev/app-led-dev:20240530"], id: "push"],
    [name: "gcr.io/google-appengine/exec-wrapper", args: ["-i", "us-east1-docker.pkg.dev/bm-gcp-d1-ingdts/cloud-run-led-dev/app_led", "-s", "bm-gcp-d1-ingdts:us-east1", "-e", "SETTINGS_NAME=secret-led", "--", "python", "manage.py", "migrate"], id: "apply migrations"]
    // Add more steps as needed
]

generateCloudbuildYaml('cloudbuild_template.yaml', 'steps_cloudbuild_template.yaml', stepsData, 'output.yaml')
 */