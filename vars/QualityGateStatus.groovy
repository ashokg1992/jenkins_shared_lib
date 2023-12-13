

def call(credentialsId){          #   to authenticate with sonar , we mention this credentil 

waitForQualityGate abortPipeline: false, credentialsId: credentialsId

}


