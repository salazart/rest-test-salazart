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
        stage('Front-end') {
             agent {
                  docker { image 'node:14-alpine' }
             }
             steps {
                  sh 'node --version'
             }
        }
    }
}