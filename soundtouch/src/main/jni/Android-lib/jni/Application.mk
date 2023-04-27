# $Id: Application.mk 165 2012-12-28 19:55:23Z oparviai $
#
# Build both ARMv5TE and ARMv7-A machine code.
#

APP_ABI := arm64-v8a armeabi-v7a
APP_OPTIM := release
APP_ALLOW_MISSING_DEPS=true
APP_STL := c++_static
APP_CPPFLAGS := -fexceptions