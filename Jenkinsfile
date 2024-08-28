pipeline {
    agent none  // 顶层不锁定在任何节点上
    stages 
	{
        stage('Build on Built-In Node') 
		{
            agent 
			{
                label 'JenkinsServer'  // 或者 'built-in'，表示在内置节点上执行
            }
            stages 
			{
                stage('SCM Checkout') 
				{
                    steps 
					{
                        checkout scm  // 从 SCM 拉取代码
                    }
                }
                stage('Build') 
				{
                    steps 
					{
                        echo 'Building on built-in node...'
                        // 这里执行在 built-in node 上的构建任务
                    }
                }
            }
        }
        stage('Deploy on Windows Node') 
		{
            agent 
			{
                label 'Win'  // 在 Windows 节点上执行
            }
            stages {
                stage('SCM Checkout') 
				{
                    steps 
					{
                        checkout scm  // 从 SCM 拉取代码
                    }
                }
                stage('Deploy') 
				{
                    steps 
					{
                        bat 'Deploying on Windows node...'
                        // 这里执行在 Windows 节点上的部署或其他任务
                    }
                }
            }
        }
    }
}
