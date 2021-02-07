package exam

import org.junit.Test
import java.nio.charset.StandardCharsets

class Topic4 {

    companion object {
        // target words
        private const val WORD_01 = "威"
        private const val WORD_02 = "燰"

        // used encoder
        private val ISO_8859_1_ENCODER = StandardCharsets.ISO_8859_1.newEncoder()
        private val UTF_8_ENCODER = StandardCharsets.UTF_8.newEncoder()
    }

    @Test
    fun testTopic4() {
        try {
            // 此題暫時無解
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }
}
