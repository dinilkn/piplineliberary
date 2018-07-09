 def call(body) {

        def config = [:]
       

        node {
            

            try {
                stage ('Clone') {
                    sh "checkout scm"
			checkout scm
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
