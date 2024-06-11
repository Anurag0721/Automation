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
        stage("Status Mail Stage"){
            steps{
            mail bcc: '', body: 'Job is successfully executed.', cc: '', from: '', replyTo: '', subject: '"Job \'${JOB_NAME}\' (${BUILD_NUMBER})', to: 'anurag.vijay.chaudhari@gmail.com'
            }
        }
    }
}