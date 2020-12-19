package org.poetryLibrary.api.module.java.Entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Poet implements Serializable {

    @Id
    @Column(name = "id")
    int row_num;

    @Column(name = "poetName")
    private String poetName;

    @Column(name = "PeriodName")
    private String eraORcountry;

    public Integer getRow_num() {
        return row_num;
    }

    public void setRow_num(Integer id) {
        this.row_num = id;
    }

    public Poet(String poetName, String eraORcountry) {
        this.poetName = poetName;
        this.eraORcountry = eraORcountry;
    }

    public Poet() {
    }

    public String getPoetName() {
        return poetName;
    }

    public void setPoetName(String poetName) {
        this.poetName = poetName;
    }

    public String getEraORcountry() {
        return eraORcountry;
    }

    public void setEraORcountry(String periodName) {
        this.eraORcountry = periodName;
    }


}
