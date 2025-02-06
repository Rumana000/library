def newgit(repo)
{
  git "${repo}"
}
def maven()
{
  sh 'mvn package'
}
def newdeploy(workspace,ip,context)
{
  sh "scp ${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def selenium(workspace)
{
  sh "java -jar ${workspace}/testing.jar"
}
