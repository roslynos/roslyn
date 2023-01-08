DESCRIPTION = "ASP.NET Core 7.0 Runtime (v7.0.0) which includes .NET Runtime"
HOMEPAGE = "https://dotnet.microsoft.com/en-us/download/dotnet/7.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

ASPNET_FETCH_ID = "e3d97ec5-f36c-45e5-bd0f-c58b0c468ec2/0b97b0983d826f854d9328165393bf1e"

SRC_URI[sha256sum] = "b9fb623b50050e50a802fe744a71c9f99ddc5906ce209343a56800e8f3b21cef"
SRC_URI = "https://download.visualstudio.microsoft.com/download/pr/${ASPNET_FETCH_ID}/aspnetcore-runtime-${PV}-linux-arm64.tar.gz;unpack=0"

COMPATIBLE_HOST ?= "(aarch64).*-linux"

DEPENDS += "\
    zlib \
"

RDEPENDS:${PN} = "\
    glibc \
    icu \
    krb5 \
    libgcc \
    libstdc++ \
    openssl \
"

FILES:${PN} += "\
    ${datadir}/dotnet \
"

FILES_${PN}-dbg = "\
    ${datadir}/dotnet/.debug \
"

INSANE_SKIP:${PN} = "file-rdeps libdir"
INSANE_SKIP:${PN}-dbg = "libdir"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    
    install -d ${D}${datadir}/dotnet
    tar --no-same-owner -xpvzf ${WORKDIR}/aspnetcore-runtime-${PV}-linux-arm64.tar.gz -C ${D}${datadir}/dotnet
    chmod +x ${D}${datadir}/dotnet/dotnet

    # Symlinks
    install -d ${D}${bindir}
    ln -rs ${D}${datadir}/dotnet/dotnet ${D}${bindir}/dotnet

}