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
             agent {
                  docker { image 'arm32v7/openjdk' }
             }
             steps {
                  sh 'java -version'
             }
        }
    }
}