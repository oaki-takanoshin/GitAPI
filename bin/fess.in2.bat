
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.webapp.path=%FESS_HOME%\app
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.temp.path=%FESS_HOME%\temp
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.log.name=%APP_NAME%
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.log.path=%FESS_HOME%\logs
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.log.level=warn
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dlasta.env=web
set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dtomcat.config.path=tomcat_config.properties

REM External elasticsearch cluster
REM set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.es.http_address=http://localhost:9200
REM set FESS_JAVA_OPTS=%FESS_JAVA_OPTS% -Dfess.dictionary.path=%ES_HOME%/config/

set GROOVY_TURN_OFF_JAVA_WARNINGS=true
