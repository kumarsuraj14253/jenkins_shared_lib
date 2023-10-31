def call(String aws_account_id, String awsRegion, String ecrRepoName){
    sh "docker push ${aws_account_id}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepoName}:latest"
}