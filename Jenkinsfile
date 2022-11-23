pipeline{

 agent any
 
   stages{
   
     stage('git checkout'){
     
       steps{
       git branch: 'master',url: 'https://github.com/pawankumargithub/jenkinapp.git'
       
       }
     }
     
     stage('maven build'){
     
       steps{
         def mavenHome=tool name: "maven",type:"maven"
         def mavenCMD="${mavenHome}/bin/mvn"
         sh "${mavenCMD} clean package"
            
       }
     }
   
   }

}
