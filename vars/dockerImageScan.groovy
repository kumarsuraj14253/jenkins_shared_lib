def call(String project, String imagetag, String hubUser){
    sh """
    trivy image ${hubUser}/${project}:latest > scannedImage.txt
    cat scannedImage.txt
       """
}