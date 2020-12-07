package org.poetryLibrary.SQLServerRepository.Entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PoetInfo implements Serializable {

    private Poet poet=new Poet();
    private List<album> album;

    public PoetInfo() {

    }

    public Poet getPoet() {
        return poet;
    }

    public void setPoet(Poet poet) {
        this.poet = poet;
    }

    public List<org.poetryLibrary.SQLServerRepository.Entities.album> getAlbum() {
        return album;
    }

    public void setAlbum(List<org.poetryLibrary.SQLServerRepository.Entities.album> album) {
        this.album=album;
    }
}
