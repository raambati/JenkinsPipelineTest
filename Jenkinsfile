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
            echo "Get the Driver Path ${ChromeDriverPath}"
          }
        }

        stage('Test Log') {
          steps {
            writeFile(file: 'LogTextFile.txt', text: 'This is an Automation File')
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        input(message: 'Do you Want to Deploy?', id: 'OK')
        echo 'Deploying the App in the IIS Server'
      }
    }

  }
  environment {
    ChromeDriverPath = '/Users/rajeshambati/repo/fcc-tools/tools_reports/chromedriver/2.42/windows'
  }
}