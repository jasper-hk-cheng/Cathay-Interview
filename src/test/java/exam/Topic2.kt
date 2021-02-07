package exam

import exam.Util.serializer
import exam.topic2.Attach
import exam.topic2.Note
import org.junit.Test
import java.io.File

class Topic2 {

    companion object {
        val file = File("src/main/java/exam/topic2/xmlOutput.txt")
    }

    @Test
    fun testTopic2() {
        // make target object
        val note = Note("YOU", "ME", "Hello", "Hello World")
        note.addAttach(Attach("", ""))
        note.addAttach(Attach(null, null))
        note.addAttach(Attach(null, null))
        // print out
        serializer.write(note, file)
    }
}
