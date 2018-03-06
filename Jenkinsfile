pipeline {
  agent any
  stages {
    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            sh 'echo aaa'
          }
        }
        stage('Deploy A') {
          steps {
            echo 'teste A'
          }
        }
        stage('Deploy B') {
          steps {
            sh 'echo bbb'
          }
        }
      }
    }
  }
}