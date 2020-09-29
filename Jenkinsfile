pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Run') {
            steps {
                sh './gradlew bootRun'
            }
        }
    }
}