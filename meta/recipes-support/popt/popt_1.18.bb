SUMMARY = "Library for parsing command line options"
HOMEPAGE = "https://www.rpm.org/"
SECTION = "libs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=cb0613c30af2a8249b8dcc67d3edb06d"

DEPENDS = "virtual/libiconv"

SRC_URI = "http://ftp.rpm.org/popt/releases/popt-1.x/${BP}.tar.gz"
SRC_URI[sha256sum] = "5159bc03a20b28ce363aa96765f37df99ea4d8850b1ece17d1e6ad5c24fdc5d1"

inherit autotools gettext

BBCLASSEXTEND = "native nativesdk"
