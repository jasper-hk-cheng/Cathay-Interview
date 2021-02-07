package exam

import com.google.gson.Gson
import org.simpleframework.xml.Serializer
import org.simpleframework.xml.core.Persister

object Util {
    val gson = Gson()
    val serializer: Serializer = Persister()
}