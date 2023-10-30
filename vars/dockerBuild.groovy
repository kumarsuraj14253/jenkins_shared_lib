def call(String project,String imagetag, String hubUser){
    sh """
     docker build -t ${hubUser}:${project} .
     docker tag ${hubUser}/${project} ${hubUser}/${project}:${imagetag}
     docker tag ${hubUser}/${project} ${hubUser}/${project}:${imagetag}:latest
    """
}