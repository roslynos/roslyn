DESCRIPTION = "Dotnet runtime application packagegroup"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = "\
    dotnet-vsdbg \
    aspnet-runtime"