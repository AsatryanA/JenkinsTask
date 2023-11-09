pipeline {
  agent any
  stages {

    stage("Building Using Maven"){

        steps{
            script {
                bat 'mvn --version'
                println "Maven building"
                bat 'mvn clean package'
                println "build Succesfully"
                  }
              }
          }
    stage('SonarQube analysis') {
        steps {
                  withSonarQubeEnv('SonarQube') {
                      bat "mvn sonar:sonar"
                  }
              }
          }

    stage('Build before deploy') {
       steps {
         bat 'mvn package'
          }
        }
   stage('Test coverage by JaCoCo') {
                steps {
                  jacoco()
                }
              }
    stage('Deploy to .war') {
steps{
         deploy adapters: [tomcat9(credentialsId: 'Jenkins', path: '', url: 'http://localhost:8080/')], contextPath: 'JenkinsTask', war: '**/*.war'
          }
  }
  }
}
