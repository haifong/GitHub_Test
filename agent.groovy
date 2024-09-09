node("Win10")
{
    stage("run py")
    {
        bat 'python hello.py'
        bat 'echo %errorlevel%'
    }
}
