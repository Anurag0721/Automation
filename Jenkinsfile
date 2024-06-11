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
        stage(" Testing Stage"){
            steps{
            bat "mvn test"
            }
        }
    }
}