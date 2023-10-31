def call(String aws_account_id, String awsRegion){

     withCredentials([[
        $class: "AmazonWebServicesCredentialsBinding",
        credentialsId: "818404112479",
        accessKeyVariable: "AWS_ACCESS_KEY_ID",
        secretKeyVariable: "AWS_SECRET_ACCESS_KEY"]])          
            {sh "aws ecr get-login-password --region ${awsRegion} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${awsRegion}.amazonaws.com"}

}