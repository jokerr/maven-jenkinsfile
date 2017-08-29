node {
    properties([
        buildDiscarder(logRotator(numTokeepStr: '5')),
        disableConcurrentBuilds()
    ])

    // clean the workspace before using it
    deleteDir()

    stage("Pre Build") {
        // check out code, repo and branch are set by the actual job
        checkout scm

        //put maven on the local path
        env.PATH = "${tool 'Maven_3.5.0'}/bin:${env.PATH}"
    }

    stage("Build") {
        sh "mvn -B -V -U -e clean package"
    }

    stage("Archive") {
        junit allowEmptyResults: true, testResults: '**/target/**/TEST*.xml'
    }

    stage("Clean Up") {
        // clean up after ourselves
        deleteDir()
    }
}