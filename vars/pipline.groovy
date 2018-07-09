 def call(body) {

        def config = [:]
       

        node {
            

            try {
                stage ('Clone') {
                   sh "echo 'checkout'"
			 git url: 'https://github.com/dinilkn/jenkinSonarTestApp.git'
                }
                stage ('rename text') {
                     sh "mv newfile modified"			
		     git add . && git commit -am "comment"			
   		     git push
		     
                }
			    
			   
			   
			   
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }
