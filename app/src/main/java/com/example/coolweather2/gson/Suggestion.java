package com.example.coolweather2.gson;

import android.media.SoundPool;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/8/28 0028.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carwash;

    public Sport sport;


    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class Carwash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
