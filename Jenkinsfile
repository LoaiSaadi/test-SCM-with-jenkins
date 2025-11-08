pipeline {
    agent any

    parameters {
        string(name: 'BRANCH_VERSION', defaultValue: '3.3.3', description: 'Specify the branch version to build')
    }

    stages {
        stage('Build') {
            steps {
                echo "Building branch version: ${params.BRANCH_VERSION}..."
            }
        }
        stage('Test') {
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