pipeline {
    agent any
    stages{
        stage('Inicialization'){
            steps{
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
    }
    stages {
        stage('Build') {
            steps {
                echo "Comienza el build"
                sh 'mvn -Dmaven.test.failure.ignore=true install'
            }
        }
    }
    stages {
        stage('Test') {
            steps {
                echo "Running pipeline"
            }
        }
    }
}
