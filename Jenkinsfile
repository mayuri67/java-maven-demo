pipeline {

    agent {
        label 'test-cloud'
    }

    stages {

        stage('Check Agent') {
            steps {
                sh 'echo "Running inside Java Docker Agent"'
                sh 'hostname'
                sh 'whoami'
            }
        }

        stage('Check Java and Maven') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
            }
        }

        stage('Build Application') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Unit Testing') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar',
                                 fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Java Maven Build Successful!'
        }

        failure {
            echo 'Java Maven Build Failed!'
        }
    }
}