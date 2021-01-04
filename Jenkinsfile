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
            echo '"Get the Driver Path ${ChromeDriverPath}"'
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
  environment {
    ChromeDriverPath = '/Users/rajeshambati/repo/fcc-tools/tools_reports/chromedriver/2.42/windows'
  }
}