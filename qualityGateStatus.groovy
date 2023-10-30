def call(credentialsID){
    waitForQualityGate abortPipeline: false, credentialsId: credentialsID
}