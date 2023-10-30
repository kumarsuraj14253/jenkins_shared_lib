def call(credentialsID){
    withSonarQubeEnv(credentialsID: credentialsID) {
       sh 'mvn clean package sonar:sonar'
    }
}