package exam.topic1;

import com.google.gson.annotations.SerializedName;

public class Jsonobj {

    @SerializedName("menu")
    private Menu menu;

    public Jsonobj(Menu menu) {
        this.menu = menu;
    }
}




