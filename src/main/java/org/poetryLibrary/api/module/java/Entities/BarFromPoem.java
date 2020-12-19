package org.poetryLibrary.api.module.java.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BarFromPoem implements Serializable {
    @Id
    @Column(name = "id")
    private Integer row_num;
    @Column(name = "startBar")
    private String startBar;
    @Column(name = "endBar")
    private String endBar;
    @Column(name = "poemName")
    private String poemName;
    @Column(name = "poetName")
    private String poetname;

    public Integer getRow_num() {
        return row_num;
    }

    public void setRow_num(Integer id) {
        this.row_num = id;
    }

    public String getStartBar() {
        return startBar;
    }

    public void setStartBar(String startBar) {
        this.startBar = startBar;
    }

    public String getEndBar() {
        return endBar;
    }

    public void setEndBar(String endBar) {
        this.endBar = endBar;
    }

    public String getPoemName() {
        return poemName;
    }

    public void setPoemName(String poemName) {
        this.poemName = poemName;
    }

    public String getPoetname() {
        return poetname;
    }

    public void setPoetname(String poetname) {
        this.poetname = poetname;
    }
}
