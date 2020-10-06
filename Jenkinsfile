node {
    checkout scm
    docker.image('arm32v7/openjdk').withRun('-p 8081:8081') { c ->
        sh 'sleep 5000'
        sh 'java -version'
    }
}