pipeline{
    agent any
    stages{
        stage("Cleaning clean"){
            steps{
            bat "mvn clean"
            }
        }
        stage(" Testing Stage"){
            steps{
            bat "mvn test"
            }
        }
        stage("Package Stage"){
            steps{
            bat "mvn package"
            }
        }
    }
}