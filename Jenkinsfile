pipeline {
    agent any
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
