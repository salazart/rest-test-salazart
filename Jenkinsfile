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
                 sh 'docker run -d --rm -p 8081:8081 --name my_container my_openjdk'
             }
        }
    }
}