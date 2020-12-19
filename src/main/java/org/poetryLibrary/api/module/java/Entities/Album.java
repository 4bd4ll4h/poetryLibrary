package org.poetryLibrary.api.module.java.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Album implements Serializable {
    //divan
    @Id
    private Integer id;

    @Column(name = "albumName")
    private String albumName;

    @Transient
    private List<AlbumPoem> albumPoems=new ArrayList<AlbumPoem>();

    public Album(String poem_with_no_album) {
        albumName=poem_with_no_album;
    }

    public Album() {
    }

    public List<AlbumPoem> getAlbumPoems() {
        return albumPoems;
    }

    public void setAlbumPoems(List<AlbumPoem> albumPoems) {
        this.albumPoems = albumPoems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }


}
