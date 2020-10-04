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
                sh 'gradle bootRun'
            }
        }
    }
}