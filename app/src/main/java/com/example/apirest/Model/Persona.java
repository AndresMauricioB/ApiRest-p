package com.example.apirest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;



public class Persona {

    @SerializedName("message")
    @Expose
    private List<String> message = null;
    @SerializedName("status")
    @Expose
    private String status;

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}