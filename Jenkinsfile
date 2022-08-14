pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'clean install'
        echo 'echo "done"'
      }
    }

  }
}