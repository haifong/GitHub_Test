pipeline {
    agent any
    stages {
        stage('run_test') {
            steps {
                sh '''
                        sshpass -p "Os10086*" ssh -o StrictHostKeyChecking=no administrator@192.168.0.122"
                    ''''
                bat 'dir'
            }
        }
    }
}
