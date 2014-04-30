#!/bin/bash

#JAVA_HOME=""

export CLASSPATH=/sw/lib/ant/lib/xercesImpl.jar:$CLASSPATH

# if run from within the directory
#APP=`pwd | grep -oE "/[^/]*$" | cut -d/ -f2`
APP=$1
cd $APP
ant clean

#ant debug

SDK="/Users/phil/Downloads/android-sdk-mac_86/tools"

# do once
#keytool -genkey -v -keystore ../pc-release-key.keystore -alias pcrelkey -keyalg RSA -keysize 2048 -validity 10000

ant release

jarsigner -verbose -keystore ../pc-release-key.keystore bin/${APP}-unsigned.apk pcrelkey

#exit

jarsigner -verify -verbose bin/${APP}-unsigned.apk

$SDK/zipalign -v 4 bin/${APP}-unsigned.apk bin/${APP}.apk

#$SDK/adb -e install bin/${APP}-debug.apk

$SDK/adb -e install -r bin/${APP}.apk


