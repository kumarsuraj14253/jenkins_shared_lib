def call(String project, String imagetag, String hubUser, String imagename){
    
    sh """
     docker rmi -f ${hubUser}/${project}:${imagetag}
     docker rmi -f ${hubUser}/${project} ${hubUser}/${project}:latest
     docker rmi -f ${imagename}
    """
     }