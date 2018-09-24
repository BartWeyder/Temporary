#-------------------------------------------------
#
# Project created by QtCreator 2018-09-12T11:46:50
#
#-------------------------------------------------

QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = SoLE_LUDecomposition
TEMPLATE = app

# The following define makes your compiler emit warnings if you use
# any feature of Qt which as been marked as deprecated (the exact warnings
# depend on your compiler). Please consult the documentation of the
# deprecated API in order to know how to port your code away from it.
DEFINES += QT_DEPRECATED_WARNINGS

# You can also make your code fail to compile if you use deprecated APIs.
# In order to do so, uncomment the following line.
# You can also select to disable deprecated APIs only up to a certain version of Qt.
#DEFINES += QT_DISABLE_DEPRECATED_BEFORE=0x060000    # disables all the APIs deprecated before Qt 6.0.0


SOURCES += main.cpp\
        mainwindow.cpp \
    ludecomposition.cpp \
    inputmatrix.cpp \
    tasksolutionmodel.cpp \
    bvectormodel.cpp

HEADERS  += mainwindow.h \
    ludecomposition.h \
    inputmatrix.h \
    tasksolutionmodel.h \
    bvectormodel.h

FORMS    += mainwindow.ui

INCLUDEPATH += include

LIBS += \
    #-LD:\git\armadillo-9.100.5\examples\lib_win64 \
    #-lblas_win64_MT \
    #-llapack_win64_MT
    -LD:\git\Qt\TestArmadillo\lib \
    -llibblas \
    -lliblapack

# in case of debug
CONFIG += console
