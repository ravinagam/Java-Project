properties([parameters([string(defaultValue: 'https://github.com/ravinagam/Java-Project.git', description: 'provide gitrepo value', name: 'git_repo', trim: false)])])

pipeline{
    agent any
    stages{
        stage ('check out Stage'){
            steps{
                git url: "${params.git_repo}"
            }
        }
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
        stage('Package Stage'){
            steps{
                bat 'mvn clean package'
            }
        }
        stage ('Deploy Stage'){
            steps{
                bat 'copy target/demo-0.0.1-SNAPSHOT.jar builds/demo-0.0.1-SNAPSHOT.jar'
            }
        }
        stage ('Run Stage'){
            steps{
                bat 'java -jar "C:/Program Files (x86)/Jenkins/workspace/JavaProject_CI_Pipeline/builds/demo-0.0.1-SNAPSHOT.jar"'
            }
        }

    }
}