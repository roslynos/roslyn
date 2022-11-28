## Install RoslynOS Boot Image
NOTE: THESE IMAGES ARE BETA AND AT THIS POINT DO NOT INCLUDED ANY SECURITY HARDENING. USE AT YOUR OWN RISK.

### Write the image to your boot media
1. Attach the boot media (SD card) to your computer

2. Download and start [Balena Etcher](https://www.balena.io/etcher/). (You may need to run it with administrator privileges on Windows).

3. Select “Flash from URL”

4. Get the [URL](https://github.com/roslynos/meta-roslynos/releases) for your device:

Raspberry Pi 3 
```
    https://github.com/roslynos/meta-roslynos/releases/download/v1.3.3/dotnet-image-full-raspberrypi3-64-20221127075700.rootfs.wic.gz
```
```
    https://github.com/roslynos/meta-roslynos/releases/download/v1.3.3/dotnet-image-minimal-raspberrypi3-64-20221127002702.rootfs.wic.gz
```

Raspberry Pi 4
```
    https://github.com/roslynos/meta-roslynos/releases/download/v1.3.3/dotnet-image-full-raspberrypi4-64-20221127143810.rootfs.wic.gz
```
```
    https://github.com/roslynos/meta-roslynos/releases/download/v1.3.3/dotnet-image-minimal-raspberrypi4-64-20221127090658.rootfs.wic.gz
```

5. Select and copy the URL or use the “copy” button that appear when you hover it.

6. Select the SD card you want to use for your RoslynOS device.
7. Click on “Flash!” to start writing the image.

## Start up your RoslynOS device

1. Insert the boot media (SD card) you just created.

2. Attach an Ethernet cable for network.

3. Attach the power cable.

4. Connect to device using 'ssh vs@rainier' with 'dotnet' when prompted for a password. 