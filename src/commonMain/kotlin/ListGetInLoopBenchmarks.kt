package org.example

import kotlinx.benchmark.*

@State(Scope.Benchmark)
abstract class ListGetInLoopBenchmarks {

    @Param("100", "10000")
    var size: Int = 0

    @Param("1", "10")
    var times: Int = 0
}

@State(Scope.Benchmark)
open class ByteListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}

@State(Scope.Benchmark)
open class CharListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}

@State(Scope.Benchmark)
open class ShortListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}

@State(Scope.Benchmark)
open class IntListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}

@State(Scope.Benchmark)
open class LongListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}

@State(Scope.Benchmark)
open class FloatListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}

@State(Scope.Benchmark)
open class DoubleListGetInLoopBenchmarks : ListGetInLoopBenchmarks() {

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
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i])
            }
        }
    }

    @Benchmark
    fun arrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(array[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedArrayGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i])
            }
        }
    }

    @Benchmark
    fun typedArrayGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedArray[i] as Any?)
            }
        }
    }

    @Benchmark
    fun listGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i])
            }
        }
    }

    @Benchmark
    fun listGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(list[i] as Any?)
            }
        }
    }

    @Benchmark
    fun typedListGet(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i])
            }
        }
    }

    @Benchmark
    fun typedListGetAsAny(bh: Blackhole) {
        for (k in 1..times) {
            for (i in 0 until size) {
                bh.consume(typedList[i] as Any?)
            }
        }
    }
}
