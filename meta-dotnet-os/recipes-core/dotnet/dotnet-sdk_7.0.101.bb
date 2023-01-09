DESCRIPTION = "Microsoft .NET Core 7.0 SDK including .NET Runtime"
HOMEPAGE = "https://dotnet.microsoft.com/en-us/download/dotnet/7.0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DOTNET_FETCH_ID = "caa0e6fb-770c-4b21-ba55-30154a7a9e11/3231af451861147352aaf43cf23b16ea"

SRC_URI[sha256sum] = "45417621eeae8344d228be4bba284e8cc6d4523699c6e27db3d7ecfe2b0c6413"
SRC_URI = "https://download.visualstudio.microsoft.com/download/pr/${DOTNET_FETCH_ID}/dotnet-sdk-${PV}-linux-arm64.tar.gz;unpack=0"

COMPATIBLE_HOST ?= "(aarch64).*-linux"

RRECOMMENDS_dotnet-dev[nodeprrecs] = "1"

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

FILES:${PN}-dev = "\
    ${datadir}/dotnet/sdk \
    ${datadir}/dotnet/sdk-manifests \
    ${datadir}/dotnet/templates \
"

FILES:${PN}-dbg = "\
    ${datadir}/dotnet/.debug \
"

INSANE_SKIP:${PN} = "file-rdeps staticdev libdir"
INSANE_SKIP:${PN}-dbg = "libdir"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    
    install -d ${D}${datadir}/dotnet
    tar --no-same-owner -xpvzf ${WORKDIR}/dotnet-sdk-${PV}-linux-arm64.tar.gz -C ${D}${datadir}/dotnet
    chmod +x ${D}${datadir}/dotnet/dotnet

    # Symlinks
    install -d ${D}${bindir}
    ln -rs ${D}${datadir}/dotnet/dotnet ${D}${bindir}/dotnet
}