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

    //            stage('Debug') {
    //        steps {
    //            script {
    //                // Mostrar la configuración actual de kubectl
    //                sh 'kubectl config view'
    //            }
    //        }
    //    }


        stage('Deploy to Kubernetes') {
            steps {
                script {
            // Mostrar el contexto actual
            //sh 'kubectl config current-context'

            // Configurar el contexto a minikube
            sh 'kubectl config use-context minikube'

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