/*fun displayMessage(msg: String,count: Int){
    var counter = 1
    while (counter++ <= count)
    {
        println("msg is :$msg")
    }
}

fun getSum(value: List<Int>) : Int ///return type is Int
{
    var total  = 0
    for (i in value) total +=i
    return total
}
fun bigSmall(a: Int,b: Int) : Pair<Int,Int>{  ///交换次序
    if (a > b)return Pair(a,b)
    else{
        return Pair(b,a)
    }
}
fun connectToDb(hostname:String = "localhost",
                username:String = "mysql",
                password:String = "secret")
{

}
fun<T>manyParams(vararg va:T){
    for (i in va)
    {
        println("i is $i \n")
    }
}*/
/*
fun homerify(msg: String) = "$msg -- woohoo!"
fun chanthofy(msg: String) = "Chan, $msg , tho"
fun terminatorify(msg: String) = "$msg -- I'll be back"*/
/*class StringUtil {
    fun homerify(msg: String) = "$msg -- woohoo!"//or fun String.homerify() = "$this -- woohoo!"  $this即为后续带入的msg
    fun chanthofy(msg:String) = "Chan, $msg , tho"
    fun terminatorify(msg: String) = "$msg -- I'll be back"
}*/
fun main(args: Array<String>)
{
   /* val a=StringUtil()
    val msg = "My name is Maximus Decimus Meridius"
    println(a.chanthofy(msg))//调用class内置的
    a.homerify(msg)
    a.terminatorify(msg)*/
    /*println(homerify(msg))
    println(chanthofy(msg))
    println(terminatorify(msg))*/
    //val (x,y) = bigSmall(3,5)
    //println("x= $x")
    //println("y= $y")
   //println(getSum(listOf(1,2,3,4,5,6)))
   // displayMessage("2333",2)
   /* manyParams(1,2,3,4,5)
    manyParams("From","Gallifrey","to","Trenzalore")
    println("------------")
    manyParams(*args)
    println("------------")
    manyParams(*"Hello there".split(" ").toTypedArray())*/
}