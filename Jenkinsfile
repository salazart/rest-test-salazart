pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh 'rm /tmp/rest-test-salazart-0.0.1-SNAPSHOT.jar'
                sh 'gradle build'
                sh 'gradle copyJarToPath'
            }
        }
        stage('Docker') {
             steps {
                 sh 'docker -v'
                 sh "echo $PATH"
                 sh "echo $JENKINS_HOME"
                 sh "echo $WORKSPACE"
                 sh 'docker build -t my_openjdk2 .'
                 sh 'docker run -d --rm -p 8081:8081 --name my_container2 my_openjdk2'
             }
        }
    }
}