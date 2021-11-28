import arrow.core.Either
import arrow.core.Option
import arrow.core.computations.either
import arrow.core.computations.option
import arrow.core.none
import kotlinx.coroutines.runBlocking

suspend fun main(args: Array<String>) {


    val left: Either<String, Int> =
        Either.Right(1)

    val right: Either<String, Int> =
        Either.Right(3)
    val some2 = Option(2)
    val some3 = Option(3)
    val none = none<Int>()

    runBlocking {
        val opt = option {
            some2.bind() + some3.bind()
            some2.bind() + some3.bind()
            some2.bind() + some3.bind()
            val temp = none.bind()
            some2.bind() + some3.bind()
        }

        val rfold = opt.fold({ "None" }, { s -> s.toString() })
        println(rfold)

    }



    runBlocking {
        val er = either<String, Int> {
            val lb = left.bind()
            val rb = right.bind()
            lb + rb
        }

        val fromd = er.fold({ it }, { it.toString() })
        println(fromd)
    }
}

/*val values  = listOf(2, 4, 6)
val rv = values // List<Int> | M<Int>
       .map {x-> x +3}
       .reduce{c, n -> c + n}
}
   val rv = values // List<Int> | M<Int>
       .map {it + 1 + 2 + 3}
       .reduce{c, n -> c + n}
   */


// 05.10.21


/*val pipeLet = "Hello"
    .let{it.length}
    .let { x -> x + 1}
    .run { println(this) }

infix fun <T, R> T.pipeTo(map: (T) -> R) : R = map(this)

val add1 = { x: Int -> x + 1 }
val add2 = { x: Int -> x + 2 }
val toString = {x: Int -> x.toString()}
println((add1 andThen add2 andThen add2 andThen minus andThen toString)(2))


val plus  = {x: Int, y: Int -> x + y}
val plusC = plus.curried()


}

val minus = {x: Int -> x - 2}


class Visa(){}
class MasterCart(){}


fun doSomething(){
doMore (::finishWork)
}

fun doMore(callback :() -> Unit){
callback()
}

fun finishWork(){

}
*/
