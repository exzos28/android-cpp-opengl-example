cmake_minimum_required(VERSION 3.22.1)

project(nativeegl)

file(GLOB SOURCES *.cpp)

add_library(${CMAKE_PROJECT_NAME} SHARED ${SOURCES})

target_link_libraries(${CMAKE_PROJECT_NAME}
        PRIVATE
        android
        EGL
        GLESv1_CM
        log)
