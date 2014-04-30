#!/bin/bash


SDK="/Users/phil/Downloads/android-sdk-mac_86/tools"

#$SDK/android delete avd -n pcAVD
#$SDK/android create avd -n pcAVD -t 2
$SDK/emulator -avd pcAVD &


