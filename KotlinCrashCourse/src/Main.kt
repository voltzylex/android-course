fun main() {
    var name = "sushil"
    val userId = 2312312
    val k = "sushil is fixed"
    println("Hello World!")
    printName()
    println(name);
    println(k);
    println(userId);
    println("String interpolatiion is :"+name);
    println("String interpolation without + is ${name}")
    println("String interpolation without + with multiple value is ${name+k}")

}
fun printName(){
    println("Print my name")
}
