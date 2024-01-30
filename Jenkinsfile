pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Build Docker Image') {
                    steps {
                        script {
                            // Construir la imagen de Docker
                            sh 'docker build -t test-demo-ritchie:$(git rev-parse --short HEAD) .'
                        }
                    }
        }

                stage('Run Docker Container') {
                    steps {
                        script {
                            // Ejecutar el contenedor Docker
                            sh 'docker run -p 8081:8080 test-demo-ritchie:$(git rev-parse --short HEAD)'
                        }
                    }
                }
    }
}