def call(String aws_account_id, String awsRegion){
    sh """
     aws configure
     aws ecr get-login-password --region ${awsRegion} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${awsRegion}.amazonaws.com
    """
}