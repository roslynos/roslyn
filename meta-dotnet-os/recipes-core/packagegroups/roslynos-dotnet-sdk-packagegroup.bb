DESCRIPTION = "Dotnet SDK application packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = "\
    dotnet-vsdbg \
    dotnet-sdk"