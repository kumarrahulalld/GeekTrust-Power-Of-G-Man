@echo off

mvn clean install -DskipTests assembly:single -q
java -jar target\geektrust.jar sample_input\input5.txt