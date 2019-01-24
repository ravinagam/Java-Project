pipeline{
    agent any
    stages{
        stage('Compile Stage'){
            steps{
                withMaven(maven : 'Maven_350')
                bat 'mvn compile'
            }
        }
        stage('Testing Stage'){
            steps{
                withMaven(maven : 'Maven_350')
                bat 'mvn test'
            }
        }
        stage('Deploy Stage'){
            steps{
                withMaven(maven : 'Maven_350')
                bat 'mvn deploy'
            }
        }
    }
}