pipeline 
{
    agent 
    {
        node 
        {
            label "JenkinsServer"
        }
   }
    stages 
    {
        stage('jenkins_test') 
        {
            steps 
            {
                bat 'echo hello'
            }
        }
        state('win10_Test')
        {
            steps
            {
                bat 'echo win10 hello'
            }
        }
    }
}
