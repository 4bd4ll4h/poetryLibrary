package org.poetryLibrary.SQLServerRepository.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class BarsOnly implements Serializable {
    @Id
    @Column(name = "id")
    private Integer row_num;
    @Column(name = "startBar")
    private String startBar;
    @Column(name = "endBar")
    private String endBar;

    public Integer getRow_num() {
        return row_num;
    }

    public void setRow_num(Integer row_num) {
        this.row_num = row_num;
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
}
