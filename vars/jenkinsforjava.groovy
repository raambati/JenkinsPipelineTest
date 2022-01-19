def call(String repoUrl) {
  pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   echo "mvn --version"
                   echo "java -version"
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                       url: "${repoUrl}"
               }
           }
           stage("Cleaning workspace") {
               steps {
                   echo "mvn clean"
               }
           }
           stage("Running Testcase") {
              steps {
                   echo "mvn test"
               }
           }
           stage("Packing Application") {
               steps {
                   echo "mvn package -DskipTests"
               }
           }
       }
   }
}