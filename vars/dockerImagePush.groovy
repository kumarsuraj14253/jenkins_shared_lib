def call(String project, String imagetag, String hubUser){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'PASS', usernameVariable: 'USER')])
     sh "docker login -u '$USER' -p '$PASS'"
     sh "docker push ${hubUser}/${project}:${imagetag}"
     sh "docker push ${hubUser}/${project}:latest"
  
}



