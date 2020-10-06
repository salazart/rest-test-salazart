pipeline {
    agent { dockerfile true }

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