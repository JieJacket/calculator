package com.jie.calculator.calculator.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created on 2019/1/13.
 *
 * @author Jie.Wu
 */
public class TaxStandard {

    @SerializedName("city")
    private String city;
    @SerializedName("base")
    private BaseCity base;
    @SerializedName("name")
    private String name;

    public String getCity() {
        return city;
    }

    public BaseCity getBase() {
        return base;
    }


    public String getName() {
        return name;
    }

    public static class BaseCity {
        @SerializedName("max_base_3j")
        private String maxBase3j;
        @SerializedName("max_base_gjj")
        private String maxBaseGjj;
        @SerializedName("min_base_gjj")
        private String minBaseGjj;
        @SerializedName("min_base_3j")
        private String minBase3j;

        public String getMaxBase3j() {
            return maxBase3j;
        }

        public String getMaxBaseGjj() {
            return maxBaseGjj;
        }

        public String getMinBaseGjj() {
            return minBaseGjj;
        }

        public String getMinBase3j() {
            return minBase3j;
        }
    }
}