#!/usr/bin/env groovy

def call(String name = 'human') {
  sh "mvn build ${SVN_URL}."
}
