@echo off
set JAR_FILE=

pushd lib
  for /f "delims=" %%i in ('dir /b /a-d /s "bjefdt*.jar"') do (set JAR_FILE=%%i)
popd

call java -jar %JAR_FILE%
pause