// configuration for plugin testing - will not be included in the plugin zip
 
// dummy values to get package to run
grails.plugin.springsecurity.cas.loginUri = '/login'
grails.plugin.springsecurity.cas.serviceUrl = 'http://localhost:8080/castest/j_spring_cas_security_check'
grails.plugin.springsecurity.cas.serverUrlPrefix = 'http://localhost:9090/cas-server-webapp-3.4.2'

grails.plugin.springsecurity.cas.userAttribsFromCas = true
grails.plugin.springsecurity.cas.authorityAttribNamesFromCas = ['authorities']


