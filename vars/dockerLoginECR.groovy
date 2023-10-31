def call(String aws_account_id, String ecrRegion, String ecrRepoName){
    sh "aws ecr get-login-password --region ${ecrRegion} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${ecrRegion}.amazonaws.com"
}