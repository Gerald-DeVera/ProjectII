pipeline { 

  agent any
  
  tools{
    maven "Maven3"
    jdk "JDK 9.0.4"
    
  }
  
  stages {
  
    stage("cloning"){
      steps{
        echo 'cloning main branch'
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'gitToken', url: 'https://github.com/Gerald-DeVera/ProjectII.git']]])
      }
    }
    stage("build"){
      steps{
        echo 'building the application'
        sh "mvn --version"
        sh "mvn clean compile"
      }
      stage("testing"){
      steps{
        echo 'running junit tests'
        sh './mvnw test'
      }
        post{
          always{
            junit 'TEST FILE'
          }
        }
     
    }
    
  }
  
}