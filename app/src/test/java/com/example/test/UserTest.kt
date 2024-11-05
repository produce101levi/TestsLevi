package com.example.test

import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test


class UserTest {
    @Test
    fun isAdult(){
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun isTeenager(){
        val user = User("Billy Maximoff", 16)
        assertTrue(user.isTeenager())
    }

    @Test
    fun isNotAdult(){
        val user = User("John", 17)
        assertTrue(user.isNotAdult())
    }

    @Test
    fun isInfant(){
        var user = User("Baby", 3)
        assertTrue(user.isInfant())
    }
    @Test
    fun isChild(){
        val user = User("Aimee in 2013", 3)
        assertTrue(user.isChild())
    }
}