#!/bin/sh

nohup java -jar -Xms512m -Xmx512m -Xmn200m -XX:PermSize=64m -XX:MaxPermSize=64m qubanzhuan-service.jar > /dev/null 2>&1 &
