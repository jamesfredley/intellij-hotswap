package com.example

class Test {

    String firstName
    String lastName
    Integer age

    static constraints = {
        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
        age nullable: false, min: 55
    }
}
