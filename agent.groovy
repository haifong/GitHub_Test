node("Win10")
{
    stage("run py")
    {
        checkout scm
        //bat 'python ./hello.py'
        bat 'echo hello'
        bat 'echo %errorlevel%'
    }
}
