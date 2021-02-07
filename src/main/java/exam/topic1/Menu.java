package exam.topic1;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("menuitem")
    private List<Item> menuitem = new ArrayList();

    public Menu(String value) {
        this.id = value;
        this.name = value;
    }

    public void addItem(Item item) {
        this.menuitem.add(item);
    }
}
