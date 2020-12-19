package org.poetryLibrary.api.module.java.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class PoemList implements Serializable {
    @Id
    @Column(name = "id")
    private Integer row_num;

    @Column(name = "poemName")
    private String poemName;

    @Column(name = "albumName")
    private String albumName;

    @Column(name = "poetName")
    private String poetName;

    public Integer getRow_num() {
        return row_num;
    }

    public void setRow_num(Integer id) {
        this.row_num = id;
    }

    public String getPoemName() {
        return poemName;
    }

    public void setPoemName(String poemName) {
        this.poemName = poemName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getPoetName() {
        return poetName;
    }

    public void setPoetName(String poetName) {
        this.poetName = poetName;
    }
}
