

node(){
  stage('Prepare')   {
      deleteDir()
      checkout scm
      setupCommonPipelineEnvironment script:this
  }

  stage('Build')   {
      mtaBuild script:this
  }

  stage('Deploy')   {
      def id = new Date().getTime()
      consumerTestsSpace = "consr-test-${id}"

      cloudFoundryCreateSpace script: this, cfSpace: consumerTestsSpace
      cloudFoundryDeploy script:this, deployTool: 'mtaDeployPlugin', space: consumerTestsSpace
      cloudFoundryDeleteSpace script: this, cfSpace: consumerTestsSpace
  }
}

