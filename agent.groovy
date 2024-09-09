node("Win10")
{
    stage("run py")
    {
        checkout scm
        //bat 'python ./hello.py'
        bat 'python --version'
        bat 'echo %errorlevel%'
        def output = bat(script: 'python hello.py', returnStdout: true).trim()
        echo "Python script output: ${output}"
    }
}
