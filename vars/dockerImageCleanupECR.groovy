def call(String aws_account_id, String awsRegion, String ecrRepoName){
    sh "docker rmi -f ${aws_account_id}.dkr.ecr.${awsRegion}.amazonaws.com/${ecrRepoName}:latest"
}