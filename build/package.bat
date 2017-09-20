@echo off
title Packaging BiJie Electronic Fence Data Transfer
call msg info "[INFO] Packaging BiJie Electronic Fence Data Transfer" & echo.

set BASEDIR=%~dp0

pushd %BASEDIR%\..\src\BJEFDT
  call mvn clean package
popd

call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 
call beep.bat
timeout /t 1 >NUL 

timeout /t 10 >NUL 