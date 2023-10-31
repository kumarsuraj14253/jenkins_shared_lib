def call(String project, String imagetag, String hubUser){
    
    sh """
     docker rmi -f ${hubUser}/${project}:${imagetag}
     docker rmi -f ${hubUser}/${project} ${hubUser}/${project}:latest
    """
     }