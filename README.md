# RoslynOS Build System

RoslynOS is a open-source [.NET runtime](https://dotnet.microsoft.com/) platform based on OpenEmbedded and optimized for IoT devices. 

RoslynOS Linux is built around busybox and systemd. This makes it small and very resource efficient. A bare metal deployment requires no more than 8 MB memory and a minimal installation to disk requires around 200 MB of storage. Devices typically take about 12 seconds to boot.

## Supported Single Board Computers
- [Raspberry Pi 3 Model B](https://www.raspberrypi.com/products/raspberry-pi-3-model-b/)

- [Raspberry Pi 3 Model B+](https://www.raspberrypi.com/products/raspberry-pi-3-model-b-plus//)

- [Raspberry Pi 4 Model B](https://www.raspberrypi.com/products/raspberry-pi-3-model-b/)

- [Seed ReTerminal](https://www.seeedstudio.com/ReTerminal-with-CM4-p-4904.html)

You can [download](https://github.com/roslynos/roslyn/releases) prebuilt images or  fully build a flashable image from source with the following commands, but be careful it will take several hours:

NOTE: THESE IMAGES ARE BETA AND AT THIS POINT DO NOT INCLUDED ANY SECURITY HARDENING. USE AT YOUR OWN RISK.

## Clone the Repository

If you haven't set a global git name and email yet, adapt the following git config commands to your information. (This is required to clone some git repositories when building.)

```bash
git config --global user.email "you@example.com"
git config --global user.name "Your Name"
```

Clone the main repository using the following command:

```bash
git clone https://github.com/roslynos/roslyn.git
```

Before you continue to Build, make sure you're in the roslyn directory:
```bash
$ cd roslyn
$ ./repo-mgr.sh install
$ ./repo-mgr.sh init
$ ./run-build.sh
```

## Update the Sources

You can update the RoslynOS sources with the following command:
```bash
./repo-mgr.sh update
```

# Give a Star! :star:

If you like or are using this project to start your solution, please give it a star. Thanks!

# Contributions

Contributions to this project are always welcome. Please consider forking this project on GitHub and sending a pull request to get your improvements added to the original project.

# Licenses

A RoslynOS image is made of many components and it’s hard to describe the full details of all the licenses that are in use in the system. However, when building the system from sources with OpenEmbedded, one can find the exhaustive set of licenses used by each package in the `build/tmp-glibc/deploy/licenses` directory.

# Disclaimer

All source, documentation, instructions and products of this project are provided as-is without warranty. No liability is accepted for any damages, data loss or costs incurred by its use.