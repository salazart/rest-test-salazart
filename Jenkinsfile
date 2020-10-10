pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Docker stopping') {
            steps {
                sh 'gradle dockerStop'
            }
        }
        stage('Build') {
            steps {
                sh 'gradle assemble docker dockerRun'
            }
        }
    }
}