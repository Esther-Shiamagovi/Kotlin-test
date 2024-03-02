fun main(args: Array<String>) {
    val name="Esther"
    greetings(name)
   var x= Remainder(10,2)
    println(x)
   var y= add(15,16,10,12)
    println(y)
    var m=intrestingFact("I love playing badminton")
    println(m)

}
fun greetings(name:String) {
    println("Hello $name")

}
fun Remainder(num1:Int,num2:Int):Int{
    return num1%num2

}
fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
     val sum=num1+num2+num3+num4
    return sum
}
fun intrestingFact(fact:String):String{
    return fact
}
