def call(String aws_account_id, String ecrRegion, String ecrRepoName){
    sh "docker push ${aws_account_id}.dkr.ecr.${ecrRegion}.amazonaws.com/${ecrRepoName}:latest"
}