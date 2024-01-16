fun main() {
    var name = "sushil"
    val userId = 2312312
    val k = "sushil is fixed"
    var number:Int = 60
    println("Hello World!")
    printName()
    println(name);
    println(k);
    println(userId);
    println("String interpolatiion is :"+name);
    println("String interpolation without + is ${name}")
    println("String interpolation without + with multiple value is ${name+k}")
    println("This is a number $number")
    val arr:Array<String> = arrayOf("first","second","third")
    println("This is a array it can be declared using arrayof ${arr[1]}")


}
fun printName(){
    println("Print my name")
}
