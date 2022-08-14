pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '''export MAVEN_HOME=/Library/apache-maven-3.8.6
export PATH=$PATH:$MAVEN_HOME/bin
mvn --version
mvn clean install'''
        echo 'echo "done"'
      }
    }

  }
}