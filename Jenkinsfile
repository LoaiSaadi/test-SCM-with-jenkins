def gv

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
        stage('Initialize') {
            steps {
                script {
                    gv = load 'scripts.groovy'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    gv.buildapp()
                }
            }
        }
        stage('Test') {
            when {
                expression { return params.RUN_TESTS }
            }
            steps {
                script {
                    gv.testapp()
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    gv.deployapp()
                }
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