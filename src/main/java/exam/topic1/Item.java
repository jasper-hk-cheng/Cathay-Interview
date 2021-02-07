package exam.topic1;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;

    public Item(String value) {
        this.id = value;
        this.name = value;
    }
}
