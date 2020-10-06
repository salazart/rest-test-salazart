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
    }
    stages {
        stage('Docker') {
            steps {
                sh 'docker -v'
            }
        }
    }
}