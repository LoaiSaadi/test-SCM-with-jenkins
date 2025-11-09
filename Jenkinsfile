pipeline {
    agent any

    parameters {
        choice(
            name: 'BRANCH_VERSION',
            choices: ['1.1', '1.2', '1.3', '2.0', '2.1'],
            description: 'Select the branch version to build.'
        )
        booleanParam(
            name: 'RUN_TESTS',
            defaultValue: true,
            description: 'Whether to run tests after build.'
        )
    }

    stages {
        stage('Build') {
            steps {
                echo "Building branch version: ${params.BRANCH_VERSION}..."
            }
        }
        stage('Test') {
            when {
                expression { return params.RUN_TESTS }
            }
            steps {
                echo "Testing branch version: ${params.BRANCH_VERSION}..."
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying branch version: ${params.BRANCH_VERSION}..."
            }
        }
    }
    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}