pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Building .Net Core Application'
          }
        }

        stage('Test') {
          steps {
            echo 'Testing The Application'
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying the App in the IIS Server'
      }
    }

  }
}