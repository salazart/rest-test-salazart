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
    }
    def customImage = docker.build("my-image:${env.BUILD_ID}")
        customImage.inside {
            sh 'java -version'
        }
}