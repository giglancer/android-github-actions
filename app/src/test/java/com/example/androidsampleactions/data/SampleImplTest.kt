package com.example.androidsampleactions.data

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SampleImplTest {
    private lateinit var sample: SampleImpl
    @Before
    fun setUp() {
        sample = SampleImpl()
    }

    @Test
    fun calculate() {
        Assert.assertEquals(2, sample.calculate())
    }
}