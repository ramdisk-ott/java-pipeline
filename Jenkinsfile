pipeline {
    agent any
  stages {
    stage('Build war') {
      agent {
        docker { image 'gradle:latest' }
      }
      steps {
        sh 'gradle clean'
        sh 'gradle build'
      }
    }
    stage('Build docker image') {
      steps {
        script {
          sh 'cp ${WORKSPACE}@2/build/libs/demo-0.0.1-SNAPSHOT-plain.war .'
          sh 'docker build -t rameshandroid99/sample:$BUILD_NUMBER .'
        }
      }
    }
    stage('Push docker image') {
      steps {
        withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'password', usernameVariable: 'username')]) {
          sh 'docker push rameshandroid99/sample:$BUILD_NUMBER'
        }
      }
    }
  }
}
