data class Player(val name: String, val age: Int, val height: Int)
fun main (){

    // Lambda
    val studentName = { println("Miha") }
    studentName()
    // Function
    fun studentNameFun(){
        println("Miha")
    }
    studentNameFun()

    // Lambda
    val userInfo = { name:String -> println("User$name") }
    userInfo("Sam")
    // Function
    fun userInfoFun(name: String){
        println("Hello $name")
    }
    userInfoFun("Sam")

    val catType = { type :String -> println("cat is $type") }
    catType("Himalaya")
    // Function
    fun catTypeFun(type: String){
        println("cat is  $type")
    }
    catTypeFun("Himalaya")

    // Lambda
    val returnSum = { a: Int, b: Int -> a + b }
    println(returnSum(4, 5))

    // Function
    fun returnSumFun(a: Int, b: Int): Int{
        return a + b
    }
    returnSumFun(4,5)
    // Lambda
    val returnDiv = { a: Int, b: Int -> a / b }
    println(returnDiv(4, 5))

    // Function
    fun returnDivFun(a: Int, b: Int): Int{
        return a / b
    }
    returnDivFun(1,2)

    val players = listOf(
        Player("Bob", 20,170),
        Player("Sara", 30,180),
        Player("jack", 18,190),
        Player("hala", 21,180),
        Player("Sara", 23,182),
        Player("rob", 24,185),
        Player("Salma", 23,160),
        Player("Selena", 21,181),
        Player("Maya", 33,155),
        Player("jack", 31,166),
        Player("Sam", 35,162),
        Player("Bob", 28,149),
        Player("Rock", 29,186),
        Player("Ran", 21,169),
        Player("Nina", 21,150),
        Player("Robena", 22,174),
        Player("Kalvin", 22,180),
        Player("Gabor", 25,182),
        Player("Sara", 30,170),
        Player("Smasher", 31,185)

    )

    val play = players.maxByOrNull { it.height }
    println("${play!!.name} Tallers one")


        fun playerFun() : Player{

            var tallest = players[0]
            for( i in players){
                if (i.height> 170){
                tallest =i
                }
            }
            return tallest
        }
    println("${playerFun().name} ${playerFun().age}${playerFun().height}")

}
