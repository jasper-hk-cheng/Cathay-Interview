package exam.topic2;

import org.simpleframework.xml.Element;

public class Attach {

    @Element(required = false)
    private String name;
    @Element(required = false)
    private String content;

    public Attach(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
