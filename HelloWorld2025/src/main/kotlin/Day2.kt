package com.neojou

fun MyAvg1(fa : FloatArray) : Float {
    var sum = 0.0f
    for (e in fa)
        sum += e
    return sum/fa.size
}

fun MyAvg2(fa : FloatArray) : Float {
    var sum = 0.0f
    var i = 0
    while (i < fa.size) {
        sum += fa[i++]
    }
    return sum/fa.size
}

fun MyAvg3(fa : FloatArray) : Float {
    var sum = 0.0f
    var i = 0
    do {
        sum += fa[i++]
    } while (i < fa.size)

    return sum/fa.size
}

fun MyAvg4(fa : FloatArray) : Float {
    var sum = 0.0f
    for (i in fa.indices)
        sum += fa[i]
    return sum/fa.size
}

fun MyAvg5(fa : FloatArray) : Float {
    var sum = 0.0f
    for (i in 0..fa.size-1)
        sum += fa[i]
    return sum/fa.size
}

fun MyAvg6(fa : FloatArray) : Float {
    var sum = 0.0f
    for (i in fa.size-1 downTo 0)
        sum += fa[i]
    return sum/fa.size
}

fun MyAvg7(fa : FloatArray) : Float {
    var sum = 0.0f
    for (i in 0 until fa.size )
        sum += fa[i]
    return sum/fa.size
}

fun Day2() {
    val netPriceArray = FloatArray(10)

    netPriceArray[0] = 924.49f
    netPriceArray[1] = 911.46f
    netPriceArray[2] = 913.44f
    netPriceArray[3] = 915.06f
    netPriceArray[4] = 921.87f
    netPriceArray[5] = 924.21f
    netPriceArray[6] = 926.84f
    netPriceArray[7] = 931.11f
    netPriceArray[8] = 927.57f
    netPriceArray[9] = 929.17f

    println("Avg: " + "%.2f".format(netPriceArray.average()))

    val netPriceArray1 = floatArrayOf(924.49f, 911.46f, 913.44f, 915.06f, 921.87f,
                                      924.21f, 926.84f, 931.11f, 927.57f, 929.17f)

    println("Avg1: " + "%.2f".format(netPriceArray1.average()))


    val netPriceArray2 : Array<Float> = arrayOf(924.49f, 911.46f, 913.44f, 915.06f, 921.87f,
        924.21f, 926.84f, 931.11f, 927.57f, 929.17f)
    println("Avg2: " + "%.2f".format(netPriceArray2.average()))

    println("MyAvg1: " + "%.2f".format(MyAvg1(netPriceArray)))

    val netPriceArrayZ = FloatArray(0)
    println("MyAvg1: zero array" + "%.2f".format(MyAvg1(netPriceArrayZ)))

    println("MyAvg2: " + "%.2f".format(MyAvg2(netPriceArray)))
    println("MyAvg2: zero array " + "%.2f".format(MyAvg2(netPriceArrayZ)))

    println("MyAvg3: " + "%.2f".format(MyAvg3(netPriceArray)))
    //println("MyAvg3: zero array " + "%.2f".format(MyAvg3(netPriceArrayZ)))

    println("MyAvg4: " + "%.2f".format(MyAvg4(netPriceArray)))
    println("MyAvg5: " + "%.2f".format(MyAvg5(netPriceArray)))
    println("MyAvg6: " + "%.2f".format(MyAvg6(netPriceArray)))
    println("MyAvg7: " + "%.2f".format(MyAvg7(netPriceArray)))

    val arrayZ = Array(5){0}
    for ( (i,v) in arrayZ.withIndex()) {
        println("arrayZ[$i] = $v")
    }

}