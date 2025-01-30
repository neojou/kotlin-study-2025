package com.neojou

fun getUserName():String? {
    // 假設這函數可能返回 null
    return null
}

class Item (val name: String, val description: String){
}

fun findUserItem(key: String?): Item? {
    // 假設這個函數可能找不到對應項目
    return null
}

fun getItemDescription(item: Item?): String {
    return item?.description ?: "No available description"
}

fun Day3() {
    val userName: String? = getUserName()
    val len = userName?.length?:0
    println("User name $userName, len=$len")

    val item: Item? = findUserItem(userName)
    val itemName = item?.name ?: "Item not found"
    println("Item name = $itemName")
    println("Item description : " + getItemDescription(item))

}

