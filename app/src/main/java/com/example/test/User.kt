package com.example.test

data class User(var name: String, var age: Int){

    fun isAdult():  Boolean{
        return age >= 18
    }

    fun isTeenager(): Boolean {
        return age in 13..17

    }

    fun isNotAdult(): Boolean {
        return age < 18
    }

    fun isInfant(): Boolean {
        return age < 4
    }

    fun isChild(): Boolean {
        return age < 13
    }
}
