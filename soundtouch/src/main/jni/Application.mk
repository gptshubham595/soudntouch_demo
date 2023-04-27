# $Id: Application.mk 212 2015-05-15 10:22:36Z oparviai $
#
# Build library bilaries for all supported architectures
#

APP_ABI := all #armeabi-v7a armeabi arm64-v8a x86_64 x86
APP_OPTIM := release
APP_STL := c++_static
APP_PLATFORM := android-19
APP_ALLOW_MISSING_DEPS=true
APP_CPPFLAGS := -fexceptions # -D SOUNDTOUCH_DISABLE_X86_OPTIMIZATIONS