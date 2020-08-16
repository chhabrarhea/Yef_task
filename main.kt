import kotlin.random.Random
fun main()
{
	val begin=1
	val end=500
	rand(begin,end)
	
}
fun rand(begin:Int,end:Int)
{
	 require(begin<end){"Illegal Arguments"}
	 val randomValues = List(10) { Random.nextInt(begin, end) }
   println(randomValues.sorted())
}

