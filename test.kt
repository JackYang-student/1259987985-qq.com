import java.lang.Exception
import java.util.*

/*
* ---------------------------------------
* Type           |  Bit Width
* ---------------------------------------
* Double            64
* Float             32
* Long              64
* Int               32
* Short             16
* Byte              8
* ---------------------------------------
*
*
*
* */
fun main(args: Array<String>)
{
    var foo: Int =20 //只是定义类型，后接的数据不工作，仅下方重新设定的值是工作的
    val g = Greeter()
    var found = false
    var emptyArray = arrayOfNulls<String>(2)//后面加的是数字
    emptyArray[0] = "Hello"
    emptyArray[1] = "World"
    for (i in emptyArray.indices) println(emptyArray[i])//循环放出内容方式1
    println("1")
    for (i in emptyArray) println(i)//循环放出内容方式2
    println("2")
    var arrayOfInts  = arrayOf(1,2,3,4,5)
    arrayOfInts.forEach {e -> println(e)}//循环放出内容方式3
    println("3")
    var arrayWords = "The quick brown fox".split(" ").toTypedArray()//split(a)，扣去内容a
    arrayWords.forEach { item -> println(item) }
    println("4")
    var name = "John Doe"
    var email = "John.doe@gmail.com"
    var phone = "(01)777-1234"

    var concat = String.format("name:%s | email: %s | phone: %s ",name,email,phone)//展示1
    println(concat)
    // or var concat = "name: $name | email: $email | phone: $phone"
    /*
    * 调用日期：
    * c=Calendar.getInstance()
    * day = c.get(Calendar.DAY_OF_WEEK)
    *
    * */
    val cc= Calendar.getInstance()
    val day = cc.get(Calendar.DAY_OF_WEEK)
    when(day)//设定日期
    {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")

    }
    for(i in 1..10) //循环数表达2
    {
        println(i)
    }
    /*
    * var a = 10L //a是一个长字形，注意L的后缀
    * //在长字型下，引用其他整型，需要调整
    * var a = b //这是不成功
    * var a = b.toLong()//这是正确的
    * foo = (a%(b)).toInt()//后续的内容也需要调整，以配合对于字型
    * toByte()
    * toShort()
    * toInt()
    * toLong()
    * toFloat()
    * toDouble()
    * toChar()
    *
    * */
    var a = 10L
    var b = 20
    val c = "hello"
    val d = "hello"
    val num = "1"
    var e : Int
    val ans = try {  //Kotlin 的try catch 语句
        e=Integer.parseInt(num) //转换，String--》int
        println("E is $e")
    }
    catch(e:Exception){
        e.printStackTrace()
    }
    val fruits = listOf("2","3","4")
    foo = 10
    g.greet("Hello Object",1)
    println(foo)
    if (c == d) {
        println("$a is equal to $b:$a")  //$用来引用数字等，类似C里面print“%d %s”
    }
    while (!found)//Kotlin 在while上与JAVA的区别，里面不能放运算公式
    {
        foo = (a%(b)).toInt()
        if (foo !=0)
        {
            a = b.toLong()
            b = foo
        }
        else{
            found = true
        }
        println(foo)
    }
    println("fruits.get(2)${fruits.get(2)}") //字符组/数组里面取数的两种模式
    println("fruits[2]${fruits[2]}")

    //println(b)
}


