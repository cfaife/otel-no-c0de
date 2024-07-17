pipeline {
    agent { docker { image 'maven:3.9.8-eclipse-temurin-21-alpine' } }


    stages {
        
        
        stage('Build service a') {
            steps {
                dir('service-a') {
                    sh 'docker image rm service-a'
                    sh 'mvn clean install'
                    sh 'docker build -t service-a .'
                }
            }
        }
        
        stage('Build service b') {
            steps {
                dir('service-b') {
                    sh 'docker image rm service-b'
                    sh 'mvn clean install'
                    sh 'docker build -t service-b .'
                }
            }
        }
        
        stage('Build service c') {
            steps {
                dir('service-c') {
                    sh 'docker image rm service-c'
                    sh 'mvn clean install'
                    sh 'docker build -t service-c .'
                }
            }
        }
        
        stage('Run Docker Compose') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}


