 def call(body) {

        def config = [:]
       

        node {
            

            try {
         
		   stage ('Clone') {
                   sh "echo checkout"
			 git url: 'https://github.com/dinilkn/jenkinSonarTestApp.git'
                }
		
                stage ('rename text') {
                        sh "mv  newfile modified1"			
			 
			 sh "git config --global user.email 'dinilkumar@gmail.com'"
  			 sh "git config --global user.name 'dinilkn'"
    			 sh "git add ."
		   	 sh "git commit -am 'comment'"		
   		    	
			 sh "git push origin master"
			}
			   
			   
            } catch (err) {
                currentBuild.result = 'FAILED'
                throw err
            }
        }
    }
