package com.pes.jd.model.DO;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("pes_cs_chat_session_2019_05")
public class CsChatSession {
    private Long id;

    private String sid;

    private Long shopId;

    private Date date;

    private String csNick;

    private String customer;

    private Date sessionBeginTime;

    private Date sessionEndTime;

    private Date beginDatetime;

    private Date endDatetime;

    private Date replyDatetime;

    private Boolean sessionType;

    private Boolean isTransfer;

    private Boolean isNonReply;

    private Boolean isSlowResp;

    private Boolean isLongReceive;

    private Integer sendEvalNum;

    private Integer evalNum;

    private Integer evalCode;

    private Integer satisfiedEvalNum;

    private Boolean isConsult;

    private Boolean isReceive;

    private Boolean isAssign;

    private Double sessionDurationTime;

    private Double sessionReceiveDurationTime;

    private Double avgRespTimeFirst;

    private Double avgRespTime;

    private Integer csChatNum;

    private Integer custChatNum;

    private Boolean receiveStartType;

    private Boolean forwardType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCsNick() {
        return csNick;
    }

    public void setCsNick(String csNick) {
        this.csNick = csNick == null ? null : csNick.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Date getSessionBeginTime() {
        return sessionBeginTime;
    }

    public void setSessionBeginTime(Date sessionBeginTime) {
        this.sessionBeginTime = sessionBeginTime;
    }

    public Date getSessionEndTime() {
        return sessionEndTime;
    }

    public void setSessionEndTime(Date sessionEndTime) {
        this.sessionEndTime = sessionEndTime;
    }

    public Date getBeginDatetime() {
        return beginDatetime;
    }

    public void setBeginDatetime(Date beginDatetime) {
        this.beginDatetime = beginDatetime;
    }

    public Date getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
        this.endDatetime = endDatetime;
    }

    public Date getReplyDatetime() {
        return replyDatetime;
    }

    public void setReplyDatetime(Date replyDatetime) {
        this.replyDatetime = replyDatetime;
    }

    public Boolean getSessionType() {
        return sessionType;
    }

    public void setSessionType(Boolean sessionType) {
        this.sessionType = sessionType;
    }

    public Boolean getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Boolean getIsNonReply() {
        return isNonReply;
    }

    public void setIsNonReply(Boolean isNonReply) {
        this.isNonReply = isNonReply;
    }

    public Boolean getIsSlowResp() {
        return isSlowResp;
    }

    public void setIsSlowResp(Boolean isSlowResp) {
        this.isSlowResp = isSlowResp;
    }

    public Boolean getIsLongReceive() {
        return isLongReceive;
    }

    public void setIsLongReceive(Boolean isLongReceive) {
        this.isLongReceive = isLongReceive;
    }

    public Integer getSendEvalNum() {
        return sendEvalNum;
    }

    public void setSendEvalNum(Integer sendEvalNum) {
        this.sendEvalNum = sendEvalNum;
    }

    public Integer getEvalNum() {
        return evalNum;
    }

    public void setEvalNum(Integer evalNum) {
        this.evalNum = evalNum;
    }

    public Integer getEvalCode() {
        return evalCode;
    }

    public void setEvalCode(Integer evalCode) {
        this.evalCode = evalCode;
    }

    public Integer getSatisfiedEvalNum() {
        return satisfiedEvalNum;
    }

    public void setSatisfiedEvalNum(Integer satisfiedEvalNum) {
        this.satisfiedEvalNum = satisfiedEvalNum;
    }

    public Boolean getIsConsult() {
        return isConsult;
    }

    public void setIsConsult(Boolean isConsult) {
        this.isConsult = isConsult;
    }

    public Boolean getIsReceive() {
        return isReceive;
    }

    public void setIsReceive(Boolean isReceive) {
        this.isReceive = isReceive;
    }

    public Boolean getIsAssign() {
        return isAssign;
    }

    public void setIsAssign(Boolean isAssign) {
        this.isAssign = isAssign;
    }

    public Double getSessionDurationTime() {
        return sessionDurationTime;
    }

    public void setSessionDurationTime(Double sessionDurationTime) {
        this.sessionDurationTime = sessionDurationTime;
    }

    public Double getSessionReceiveDurationTime() {
        return sessionReceiveDurationTime;
    }

    public void setSessionReceiveDurationTime(Double sessionReceiveDurationTime) {
        this.sessionReceiveDurationTime = sessionReceiveDurationTime;
    }

    public Double getAvgRespTimeFirst() {
        return avgRespTimeFirst;
    }

    public void setAvgRespTimeFirst(Double avgRespTimeFirst) {
        this.avgRespTimeFirst = avgRespTimeFirst;
    }

    public Double getAvgRespTime() {
        return avgRespTime;
    }

    public void setAvgRespTime(Double avgRespTime) {
        this.avgRespTime = avgRespTime;
    }

    public Integer getCsChatNum() {
        return csChatNum;
    }

    public void setCsChatNum(Integer csChatNum) {
        this.csChatNum = csChatNum;
    }

    public Integer getCustChatNum() {
        return custChatNum;
    }

    public void setCustChatNum(Integer custChatNum) {
        this.custChatNum = custChatNum;
    }

    public Boolean getReceiveStartType() {
        return receiveStartType;
    }

    public void setReceiveStartType(Boolean receiveStartType) {
        this.receiveStartType = receiveStartType;
    }

    public Boolean getForwardType() {
        return forwardType;
    }

    public void setForwardType(Boolean forwardType) {
        this.forwardType = forwardType;
    }
}