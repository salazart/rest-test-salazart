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
        stage('Docker') {
             steps {
                 sh 'docker -v'
             }
        }
    }
}