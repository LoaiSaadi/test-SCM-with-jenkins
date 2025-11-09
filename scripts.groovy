def buildapp() {
    echo "Building the application..."
}

def testapp() {
    echo "Testing the application..."
}

def deployapp() {
    echo "Deploying branch version: ${params.BRANCH_VERSION}..."
}

return this