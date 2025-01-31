package com.neojou


fun Day4() {
    val memberList = mutableListOf("小雪", "小龍")
    println("At first: " + memberList)

    memberList.add("莓雪")
    println("Add one more: " + memberList)

    memberList.remove("小龍")
    println("Remove one: " + memberList)

    memberList[0] = "桃雪"
    println("Replace one: " + memberList)

    val parentsList = listOf("Neo", "Yoko")
    memberList.addAll(0, parentsList)
    println("Add another list: " + memberList)

}
