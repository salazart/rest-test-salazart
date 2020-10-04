pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle build'
            }
        }
        stage('Run') {
            steps {
                sh 'java -jar build/libs/rest-test-salazart-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}