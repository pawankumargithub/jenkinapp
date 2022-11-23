pipeline{

 agent any
 
   stages{
   
     stage('git checkout'){
     
       steps{
       git branch: 'master',url: 'https://github.com/pawankumargithub/jenkinapp.git'
       
       }
     }
     
     stage('maven build'){
     
         def mavenHome=tool name: "maven-3.8.2",type:"maven"
         def mavenCMD="${mavenHome}/bin/mvn"
         sh "${mavenCMD} clean package"
           
     }
   
   }

}
