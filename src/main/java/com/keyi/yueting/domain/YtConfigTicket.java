package com.keyi.yueting.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by 廖师兄
 * 2016-11-03 23:07
 */
@Entity
public class YtConfigTicket {

    @Id
    @GeneratedValue
//    @Min(value = 18, message = "")
//    @NotNull
//    @Max()
//    @Length()
    private Integer id;

    @NotBlank(message = "这个字段必传")
    @Column(length = 5)
    private Integer amount;

    @Column(length = 32)
    private String ticket;

    @NotNull(message = "")
    @Column(length = 32)
    private String ticketGive;

    @NotNull(message = "")
    @Column(length = 32)
    private String status;

    @NotNull(message = "")
    @Column(length = 32)
    private String ctime;

    public YtConfigTicket() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTicketGive() {
        return ticketGive;
    }

    public void setTicketGive(String ticketGive) {
        this.ticketGive = ticketGive;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" +
                "id=" + id +
                ", ticketGive='" + ticketGive + '\'' +
                ", status=" + status + '\'' +
                ", ctime=" + ctime + '\'' +
                '}';
    }
}
