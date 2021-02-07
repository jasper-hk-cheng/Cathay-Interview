package exam.topic2;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root
public class Note {

    @Element
    private String to;
    @Element
    private String from;
    @Element
    private String heading;
    @Element
    private String body;
    @ElementList
    private List<Attach> attachs = new ArrayList();

    public Note(String to, String from, String heading, String body) {
        this.to = to;
        this.from = from;
        this.heading = heading;
        this.body = body;
    }

    public void addAttach(Attach attach) {
        this.attachs.add(attach);
    }
}
