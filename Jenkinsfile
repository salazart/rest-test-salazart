pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle build'
                sh 'pwd'
                sh 'cp build/libs/rest-test-salazart2-0.0.1-SNAPSHOT.jar /tmp/rest-test-salazart2-0.0.1-SNAPSHOT.jar'
            }
        }
        stage('Docker') {
             steps {
                 sh 'docker -v'
                 sh 'docker build -t my_openjdk2 .'
                 sh 'docker run -d --rm -p 8081:8081 --name my_container2 my_openjdk2'
             }
        }
    }
}