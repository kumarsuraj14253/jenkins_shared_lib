def call(String project,String imagetag, String hubUser){
    sh """
     docker rmi ${hubUser}/${project} ${hubUser}/${project}:${imagetag}
     docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}