package com.example.tdd

import org.junit.Assert.*
import org.junit.Test

class SetOperationTest {
    private val setOperation = SetOperation()
    @Test
    fun getSize_test() {
        setOperation.addItem(1)
        setOperation.addItem(2)
        assertEquals(2, setOperation.getSize())
    }
    @Test
    fun getCount_test() {
        setOperation.addItem(1)
        setOperation.addItem(1)
        setOperation.addItem(1)
        assertEquals(1, setOperation.getCount())
    }
    @Test
    fun remove_test() {
        setOperation.addItem(1)
        setOperation.addItem(2)
        setOperation.addItem(3)
        assertEquals(3, setOperation.getSize())
        setOperation.removeItem(1)
        assertEquals(2, setOperation.getSize())
    }
}