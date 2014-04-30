#!/bin/bash

~/Downloads/android-sdk-mac_86/tools/android update project \
  --target 2 \
  --name $1 \
  --path $1


# WARNING: This will delete any existing project
exit

#~/Downloads/android-sdk-mac_86/tools/android create project \
#  --target 2 \
#  --name PCWallpaper \
#  --path PCWallpaper \
#  --activity PCWallpaper \
#  --package philcolbourn.PCWallpaper
