def call(String aws_account_id, String ecrRegion, String ecrRepoName){
    sh """
    trivy image ${aws_account_id}.dkr.ecr.${ecrRegion}.amazonaws.com/${ecrRepoName}:latest > scannedImageECR.txt
    cat scannedImageECR.txt
       """
}