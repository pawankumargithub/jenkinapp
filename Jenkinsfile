pipeline{

 agent any
 
   stages{
   
     stage('git checkout'){
     
       steps{
       git branch: 'master',url: 'https://github.com/pawankumargithub/jenkinapp.git'
       
       }
     }
     
     stage('unit test'){
     
       steps{
       
          sh 'mvn test'

     stage('unit test'){
     
       steps{
         sh 'mvn test'
       
       }
     }
   
   }

}
