def call(String aws_account_id, String ecrRepoName, String ecrRegion){
    sh"""
     docker build -t ${ecrRepoName} .
     docker tag ${ecrRepoName}:latest ${aws_account_id}.dkr.ecr.${ecrRegion}.amazonaws.com/${ecrRepoName}:latest
    """
}