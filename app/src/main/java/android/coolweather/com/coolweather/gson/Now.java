package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    public class More{
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cond")
    public More more;
}
