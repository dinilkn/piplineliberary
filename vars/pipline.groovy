 def call(body) {

        def config = [:]
       

        node {
            

            try {
                stage ('Clone') {
                    sh "echo 'cloone'"
                }
                stage ('maven build') {
                     sh "echo 'maven build'"
                }
			    
			   
			   
			   
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }