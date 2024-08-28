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
        stage('run_test') 
        {
            steps 
            {
                bat 'echo hello'
            }
        }
    }
    stages
    {
        state('win10_Test')
        steps
        {
            bat 'echo win10 hello'
        }
    }
}
