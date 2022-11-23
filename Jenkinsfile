pipeline{

 agent any
 tools {
    maven 'maven-3.8.2' 
  }
   stages{
   
     stage('git checkout'){
     
       steps{
       git branch: 'master',url: 'https://github.com/pawankumargithub/jenkinapp.git'
       
       }
     }
     
     stage('maven build'){
      steps {
        sh 'mvn clean package'
      }
           
     }
   
   }

}
