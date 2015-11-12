package com.joc.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "period")
public class Period extends BaseDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    protected int perId;

    @Column(name = "periodid")
    protected int periodId;

    @Column(name = "starttime")
    protected Date startTime;       //报课开始时间

    @Column(name = "deadline")
    protected Date deadLine;        //报课截止时间

    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public int getPeriodId() {
        return periodId;
    }

    public void setPeriodId(int periodId) {
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
