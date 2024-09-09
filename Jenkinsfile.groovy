node("JenkinsServer")
{
    def tasks = [:]
    def Jenkins_inst = Jenkins.get()
    if(Jenkins_inst != null)
    {
        tasks["Win10 Test"] = 
        {
            def node_inst = Jenkins_inst.getNode("Win10")
            if(node_inst != null && node_inst.getComputer().isOnline())
            {
                print("Node Win10 Exist")
                build job:'agent_test', parameters:[
                    string(name: 'TARGET_NODE_NAME', value:'Win10')
                ]
            }
            else
            {
                print("Node Win10 not Exist")
            }
        }
        //try 
        {
            parallel tasks
        }
        //catch(exception)
        {
            //print("run tasks fail")
        }
    }
}
