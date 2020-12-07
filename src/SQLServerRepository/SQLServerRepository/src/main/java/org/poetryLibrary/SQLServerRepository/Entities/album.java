package org.poetryLibrary.SQLServerRepository.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class album implements Serializable {
    @Id
    private Integer id;

    @Column(name = "albumName")
    private String albumName;

    @Transient
    private List<AlbumPoem> albumPoems=new ArrayList<AlbumPoem>();

    public album(String poem_with_no_album) {
        albumName=poem_with_no_album;
    }

    public album() {
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
