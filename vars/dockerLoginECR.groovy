def call(String aws_account_id, String awsRegion){
    sh """
     withCredentials([<object of type com.cloudbees.jenkins.plugins.awscredentials.AmazonWebServicesCredentialsBinding>])
     aws ecr get-login-password --region ${awsRegion} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${awsRegion}.amazonaws.com
    """
}