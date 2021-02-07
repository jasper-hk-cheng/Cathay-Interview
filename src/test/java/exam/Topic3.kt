package exam

import com.google.gson.reflect.TypeToken
import exam.Util.gson
import exam.topic3.JsonObj
import org.junit.Test
import java.io.File
import java.util.*
import java.util.function.Consumer

class Topic3 {
    companion object {
        val file = File("src/main/java/exam/topic3/JsonArrayContent.json")
    }

    @Test
    fun testTopic3() {
        try {
            // prepare type object
            val typeToken = object : TypeToken<List<JsonObj>>() {}
            val type = typeToken.type
            // parse json
            val list: List<JsonObj> = gson.fromJson(file.reader(), type)
            // print out (before sort)
            list.forEach(Consumer { json: JsonObj? -> println(json) })
            Collections.sort(list)
            // print out (after sort)
            list.forEach(Consumer { json: JsonObj? -> println(json) })
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}