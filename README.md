# RoslynOS Build System

RoslynOS is a free and open-source .NET runtime platform based on OpenEmbedded and optimized of IoT.

You can fully build a flashable image from source with the following commands, but be careful it will take several hours:

## Clone the Repository

If you haven't set a global git name and email yet, adapt the following git config commands to your information. (This is only required to clone some git repositories when building.)

```bash
git config --global user.email "you@example.com"
git config --global user.name "Your Name"
```

Clone the main repository using the following command:

```bash
git clone https://github.com/RoslynOS/roslyn.git
```

Before you continue to Build, make sure you're in the roslyn directory:
```bash
$ cd roslyn
$ ./repo-mgr.sh install
$ ./repo-mgr.sh init
$ ./run-build.sh
```

## Update the Sources
You can update the AsteroidOS sources with the following command:
```bash
./repo-mgr.sh update
```

# Give a Star! :star:

If you like or are using this project to start your solution, please give it a star. Thanks!

# Contributions

Contributions to this project are always welcome. Please consider forking this project on GitHub and sending a pull request to get your improvements added to the original project.

# Disclaimer

All source, documentation, instructions and products of this project are provided as-is without warranty. No liability is accepted for any damages, data loss or costs incurred by its use.