package com.example.prashant.androidrestexercise.Logic;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class DataModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("rows")
    private List<DataObject> data;

    public List<DataObject> getmData() {
        return data;
    }

    public void setmData(List<DataObject> mData) {
        this.data = data;
    }
}
