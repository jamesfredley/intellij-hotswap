package com.example

class BootStrap {

    def init = {
        System.out.println(System.getProperty("java.vendor") + " " + System.getProperty("java.version"));
    }

    def destroy = {
    }

}