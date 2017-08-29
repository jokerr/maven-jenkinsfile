node {
    properties ([
        buildDiscarder(logRotator(numTokeepStr: '5')),
        disableConcurrentBuilds()
    ])

    // clean the workspace before using it
    deleteDir()

    stage ("Pre Build"){
        // check out code, repo and branch are set by the actual job
        checkout scm
    }

    stage("Clean Up") {
        // clean up after ourselves
        deleteDir()
    }
}