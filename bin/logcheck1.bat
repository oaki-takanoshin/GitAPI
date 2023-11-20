

SET CP=%CP%;../lib/logcheck.jar


"%JAVA_HOME%/bin/java" -Dfile.encoding=UTF-8 -cp %CP%  com.fujitsu.logcheck.main.mainfess > null

