#!/bin/bash

# Abort script if any command returns error
set -e

# Source build environment
BUILD_DIR="build"
source ./poky/oe-init-build-env $BUILD_DIR

# Build
MACHINE=raspberrypi3-64 bitbake dotnet-image-minimal
MACHINE=raspberrypi3-64 bitbake dotnet-image-full

# Create the package index
MACHINE=raspberrypi3-64 bitbake package-index

MACHINE=raspberrypi4-64 bitbake dotnet-image-minimal
MACHINE=raspberrypi4-64 bitbake dotnet-image-full

# Create the package index
MACHINE=raspberrypi4-64 bitbake package-index

MACHINE=reterminal-64 bitbake dotnet-image-minimal
MACHINE=reterminal-64 bitbake dotnet-image-full

# Create the package index
MACHINE=reterminal-64 bitbake package-index

# rsync -av ~/roslyn/build/tmp/deploy/deb root@whisk.roslynos.com:/var/www/html
