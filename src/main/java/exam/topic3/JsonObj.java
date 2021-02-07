package exam.topic3;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class JsonObj implements Comparable<JsonObj> {

    @SerializedName("userId")
    private int userId;
    @SerializedName("name")
    private String name;
    @SerializedName("loginTime")
    private Date loginTime;

    @Override
    public int compareTo(JsonObj other) {
        long loginTimeDiff = this.loginTime.getTime() - other.loginTime.getTime();
        if (loginTimeDiff > 0)
            return 1;
        if (loginTimeDiff < 0)
            return -1;
        return other.userId - this.userId;
    }

    @Override
    public String toString() {
        return "userId:" + userId + " name:" + name + " loginTime:" + loginTime;
    }
}
