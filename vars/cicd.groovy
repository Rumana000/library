def newgit(repo)
{
  git "${repo}"
}
def maven()
{
  sh 'mvn package'
}
def deploy(jobname,ip,context)
{
  scp "/var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def test(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
