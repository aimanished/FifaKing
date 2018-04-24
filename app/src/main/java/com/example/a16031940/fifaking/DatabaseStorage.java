package com.example.a16031940.fifaking;

public class DatabaseStorage  {
    private String id;
    private String texter;

    public DatabaseStorage(String id, String texter) {
        this.id = id;
        this.texter = texter;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexter() {
        return texter;
    }

    public void setTexter(String texter) {
        this.texter = texter;
    }



}
