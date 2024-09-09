def is_online(node_name)
{
    def b_ret = false
    def Jenkins_inst = Jenkins.get()
    if(Jenkins_inst != null)
    {
        def node_inst = Jenkins_inst.getNode(node_name)
        if(node_inst != null && node_inst.getComputer().isOnline())
        {
            b_ret = true
        }
        else
        {
            b_ret = false
        }
    }
    {
        b_ret = false
    }

    return b_ret
}

node("JenkinsServer")
{
    def tasks = [:]
    if(is_online"Win10"())
    {
        print("Node Win10 Exist")
        tasks["Win10 Test"] = 
        {
            build job:'agent_test', parameters:[
                    string(name: 'TARGET_NODE_NAME', value:'Win10')
                ]
        }
    }
    else
    {
        print("Node Win10 not Exist")
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
