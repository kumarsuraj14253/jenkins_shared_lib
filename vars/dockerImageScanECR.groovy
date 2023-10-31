def call(String aws_account_id, String awsRegion, String ecrRepoName){
    sh """
    trivy image ${aws_account_id}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepoName}:latest > scannedImageECR.txt
    cat scannedImageECR.txt
       """
}