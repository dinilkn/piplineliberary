 def call(body) {

        def config = [:]
       

        node {
            

            try {
         
		   stage ('Clone') {
                   sh "echo 'checkout'"
			 git url: 'https://github.com/dinilkn/jenkinSonarTestApp.git'
                }
		
                stage ('rename text') {
                     sh "mv  newfile modified1"			
		    
			
			withCredentials([usernamePassword(credentialsId: 'de97785c-b80c-4e7d-8f05-60377dc48cde',
							  passwordVariable: 'dinilkumar12', usernameVariable: 'dinilkn')]) {
			 
			 sh "git config --global user.email 'dinilkumar@gmail.com'"
  			 sh "git config --global user.name 'dinilkn'"
    			 sh "git add ."
		   	 sh "git commit -am 'comment'"			
   		    	 sh "git push origin master"
			//  sh('git push https://${GIT_USERNAME}:${GIT_PASSWORD}@https://github.com/dinilkn/jenkinSonarTestApp.git')
			}
		
		     
                }
			    
			   
			   
			   
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }
