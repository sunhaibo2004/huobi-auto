package io.yule.huobiauto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by chensijiang on 2018/4/15 下午5:38.
 */
@Entity
public class TradeTask implements Serializable {
    private static final long serialVersionUID = -7812957286352275581L;

    @Id
    private String id;

    private Timestamp createdDate;

    private String taskName;

    private String symbol;

    private BigDecimal tradeCount;

    private Integer tickSeconds;

    private BigDecimal priceChangeThresholdPercent;

    private String notifyEmail;

    private String currentOrderId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(BigDecimal tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Integer getTickSeconds() {
        return tickSeconds;
    }

    public void setTickSeconds(Integer tickSeconds) {
        this.tickSeconds = tickSeconds;
    }

    public BigDecimal getPriceChangeThresholdPercent() {
        return priceChangeThresholdPercent;
    }

    public void setPriceChangeThresholdPercent(BigDecimal priceChangeThresholdPercent) {
        this.priceChangeThresholdPercent = priceChangeThresholdPercent;
    }

    public String getNotifyEmail() {
        return notifyEmail;
    }

    public void setNotifyEmail(String notifyEmail) {
        this.notifyEmail = notifyEmail;
    }

    public String getCurrentOrderId() {
        return currentOrderId;
    }

    public void setCurrentOrderId(String currentOrderId) {
        this.currentOrderId = currentOrderId;
    }
}
