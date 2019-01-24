pipeline{
    agent any
    stages{
        stage('Compile Stage'){
            steps{
                bat 'mvn compile'
            }
        }
        stage('Testing Stage'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Deploy Stage'){
            steps{
                bat 'mvn deploy'
            }
        }
    }
}