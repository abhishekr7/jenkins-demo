pipelineJob('jenkins-demo-sample-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/abhishekr7/demo.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}