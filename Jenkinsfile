pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        git(url: 'https://github.com/meme20200/minehut-tracker.git', branch: 'master')
      }
    }
    stage('Build') { 
       steps {
         sh 'mvn -B -DskipTests clean package' 
       }
     }
  }
}
