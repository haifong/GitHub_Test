pipeline {
    agent any
    stages {
        stage('run_test') {
            steps {
                sh 'sshpass -p Os10086* ssh -o StrictHostKeyChecking=no Win10@192.168.0.113'
                bat 'dir'
            }
        }
    }
}
