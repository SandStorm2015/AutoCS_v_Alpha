package com.joc.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "period")
public class Period extends BaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int perId;

    @Column(name = "periodid")
    private String periodId;

    @Column(name = "starttime")
    private Date startTime;       //报课开始时间

    @Column(name = "deadline")
    private Date deadLine;        //报课截止时间

    @Column(updatable = false)
    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Date deadLine) {
        this.deadLine = deadLine;
    }

}
