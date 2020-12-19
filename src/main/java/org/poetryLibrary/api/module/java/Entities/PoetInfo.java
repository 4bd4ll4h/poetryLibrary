package org.poetryLibrary.api.module.java.Entities;


import java.io.Serializable;
import java.util.List;


public class PoetInfo implements Serializable {

    private Poet poet=new Poet();
    private List<Album> album;

    public PoetInfo() {

    }

    public Poet getPoet() {
        return poet;
    }

    public void setPoet(Poet poet) {
        this.poet = poet;
    }

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album=album;
    }
}
