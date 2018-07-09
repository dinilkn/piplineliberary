 def call(body) {

        def config = [:]
       

        node {
            

            try {
                stage ('Clone') {
                   sh "echo 'checkout'"
			 git url: 'https://github.com/dinilkn/jenkinSonarTestApp.git'
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
