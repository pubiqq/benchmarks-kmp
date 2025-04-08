package org.example

import kotlinx.benchmark.*

@State(Scope.Benchmark)
abstract class ListGetBasicBenchmarks {

    @Param("100", "10000")
    var size: Int = 0
}

@State(Scope.Benchmark)
open class ByteListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: ByteArray
    private lateinit var typedArray: Array<Byte>
    private lateinit var list: List<Byte>
    private lateinit var typedList: List<Byte>

    @Setup
    fun setUp() {
        array = ByteArray(size) { it.toByte() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}

@State(Scope.Benchmark)
open class CharListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: CharArray
    private lateinit var typedArray: Array<Char>
    private lateinit var list: List<Char>
    private lateinit var typedList: List<Char>

    @Setup
    fun setUp() {
        array = CharArray(size) { it.toChar() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}

@State(Scope.Benchmark)
open class ShortListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: ShortArray
    private lateinit var typedArray: Array<Short>
    private lateinit var list: List<Short>
    private lateinit var typedList: List<Short>

    @Setup
    fun setUp() {
        array = ShortArray(size) { it.toShort() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}

@State(Scope.Benchmark)
open class IntListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: IntArray
    private lateinit var typedArray: Array<Int>
    private lateinit var list: List<Int>
    private lateinit var typedList: List<Int>

    @Setup
    fun setUp() {
        array = IntArray(size) { it.toInt() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}

@State(Scope.Benchmark)
open class LongListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: LongArray
    private lateinit var typedArray: Array<Long>
    private lateinit var list: List<Long>
    private lateinit var typedList: List<Long>

    @Setup
    fun setUp() {
        array = LongArray(size) { it.toLong() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}

@State(Scope.Benchmark)
open class FloatListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: FloatArray
    private lateinit var typedArray: Array<Float>
    private lateinit var list: List<Float>
    private lateinit var typedList: List<Float>

    @Setup
    fun setUp() {
        array = FloatArray(size) { it.toFloat() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}

@State(Scope.Benchmark)
open class DoubleListGetBasicBenchmarks : ListGetBasicBenchmarks() {

    private lateinit var array: DoubleArray
    private lateinit var typedArray: Array<Double>
    private lateinit var list: List<Double>
    private lateinit var typedList: List<Double>

    @Setup
    fun setUp() {
        array = DoubleArray(size) { it.toDouble() }
        typedArray = array.toTypedArray()
        list = array.asList()
        typedList = array.toTypedArray().asList()
    }

    @Benchmark
    fun arrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(array[i])
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(array[i] as Any?)
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i])
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedArray[i] as Any?)
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        val i = 1
        bh.consume(list[i])
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(list[i] as Any?)
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i])
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        val i = 1
        bh.consume(typedList[i] as Any?)
    }
}