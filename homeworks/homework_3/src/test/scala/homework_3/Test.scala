package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_bool_format - {
            val trueStr = "правда"

            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
            assert(Exercises.prettyBooleanFormatter1(5) == 5.toString)
            assert(Exercises.prettyBooleanFormatter2(5) == 5.toString)
            assert(Exercises.prettyBooleanFormatter3(5) == 5.toString)
        }
        'test_max - {
            val seq = Seq(1, 3, 4, 2, 5, 6, 9)
            val seqempty = Seq()
            assert(Exercises.max1(seq) == 9)
            assert(Exercises.max2(seq) == Seq(9))
            assert(Exercises.max3(seq) == Some(9))
            assert(Exercises.max1(seqempty) == Int.MinValue)
            assert(Exercises.max2(seqempty) == Seq())
            assert(Exercises.max3(seqempty) == None)
        }


        'test_sum - {
            val x = 4
            val y = 5
            assert(Exercises.sum1(x, y) == x + y)
            assert(Exercises.sum2(x, y) == x + y)
            assert(Exercises.sum3(x, y) == x + y)
        }
    }
}
