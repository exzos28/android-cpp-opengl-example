# JNI and OpenGL ES Example

## Overview

This project serves as an example of using the Java Native Interface (JNI) along with OpenGL ES to develop mobile applications with native code integration.

Java Native Interface (JNI) is a mechanism that enables Java/Kotlin applications to call and use code written in lower-level languages such as C or C++. This project demonstrates an example of using JNI to integrate native code with Java code to implement graphics using OpenGL ES on mobile platforms.

OpenGL ES (Embedded Systems) is a set of APIs for creating graphics applications on mobile and embedded devices. In this project, OpenGL ES is used for rendering graphics on mobile devices.

## Project Structure

- __Kotlin Code__: Includes the main Kotlin code, which utilizes JNI to call native functions.
- __Native Code (C/C++)__: Contains the implementation of native functions that are called from Java code via JNI. In this project, the native code is used for initializing and managing OpenGL ES for graphics rendering.
- __OpenGL ES Resources__: Includes resources such as shaders, textures, and other assets required for OpenGL ES rendering.
How to Use
