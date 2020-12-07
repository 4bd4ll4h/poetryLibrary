package org.poetryLibrary.SQLServerRepository.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class AlbumPoem implements Serializable {
    @Id
    @Column(name = "poemName")
    private String poemName="null";

    @Column(name = "type")
    private String poemType;



    public String getPoemName() {
        return poemName;
    }

    public void setPoemName(String poemName) {
        this.poemName = poemName;
    }

    public String getPoemType() {
        return poemType;
    }

    public void setPoemType(String poemType) {
        this.poemType = poemType;
    }


}
