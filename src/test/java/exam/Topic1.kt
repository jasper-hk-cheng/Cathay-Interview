package exam

import com.google.gson.Gson
import exam.Util.gson
import exam.topic1.Item
import exam.topic1.Jsonobj
import exam.topic1.Menu
import org.junit.Test

internal class Topic1 {
    @Test
    fun testTopic1() {
        // make the target
        val menuA = Menu("A")

        menuA.addItem(Item("1"))
        menuA.addItem(Item("2"))
        menuA.addItem(Item("3"))

        val jsonObj = Jsonobj(menuA)
        // print out
        println(gson.toJson(jsonObj))
    }
}
