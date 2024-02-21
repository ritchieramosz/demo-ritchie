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

        stage('Deploy to Kubernetes') {
            steps {
                script {
                    // Aplicar el archivo de Kubernetes
                    sh 'kubectl apply -f Deployment.yaml'
                }
            }
        }

               // stage('Run Docker Container') {
               //     steps {
               //         script {
               //             // Ejecutar el contenedor Docker
               //             sh 'docker run -d -p 8083:8080 test-demo-ritchie:$(git rev-parse --short HEAD)'
               //         }
               //     }
               // }
    }
}