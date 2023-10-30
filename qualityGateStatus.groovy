def call(credentialsID){
    waitForQualityGate abortPipeline: false, credentialsID: credentialsID
}