package com.pes.jd.model.DO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CsChatSessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsChatSessionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andCsNickIsNull() {
            addCriterion("cs_nick is null");
            return (Criteria) this;
        }

        public Criteria andCsNickIsNotNull() {
            addCriterion("cs_nick is not null");
            return (Criteria) this;
        }

        public Criteria andCsNickEqualTo(String value) {
            addCriterion("cs_nick =", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickNotEqualTo(String value) {
            addCriterion("cs_nick <>", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickGreaterThan(String value) {
            addCriterion("cs_nick >", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickGreaterThanOrEqualTo(String value) {
            addCriterion("cs_nick >=", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickLessThan(String value) {
            addCriterion("cs_nick <", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickLessThanOrEqualTo(String value) {
            addCriterion("cs_nick <=", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickLike(String value) {
            addCriterion("cs_nick like", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickNotLike(String value) {
            addCriterion("cs_nick not like", value, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickIn(List<String> values) {
            addCriterion("cs_nick in", values, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickNotIn(List<String> values) {
            addCriterion("cs_nick not in", values, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickBetween(String value1, String value2) {
            addCriterion("cs_nick between", value1, value2, "csNick");
            return (Criteria) this;
        }

        public Criteria andCsNickNotBetween(String value1, String value2) {
            addCriterion("cs_nick not between", value1, value2, "csNick");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeIsNull() {
            addCriterion("begin_datetime is null");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeIsNotNull() {
            addCriterion("begin_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeEqualTo(Date value) {
            addCriterion("begin_datetime =", value, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeNotEqualTo(Date value) {
            addCriterion("begin_datetime <>", value, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeGreaterThan(Date value) {
            addCriterion("begin_datetime >", value, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_datetime >=", value, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeLessThan(Date value) {
            addCriterion("begin_datetime <", value, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_datetime <=", value, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeIn(List<Date> values) {
            addCriterion("begin_datetime in", values, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeNotIn(List<Date> values) {
            addCriterion("begin_datetime not in", values, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeBetween(Date value1, Date value2) {
            addCriterion("begin_datetime between", value1, value2, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andBeginDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_datetime not between", value1, value2, "beginDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIsNull() {
            addCriterion("end_datetime is null");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIsNotNull() {
            addCriterion("end_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeEqualTo(Date value) {
            addCriterion("end_datetime =", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotEqualTo(Date value) {
            addCriterion("end_datetime <>", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeGreaterThan(Date value) {
            addCriterion("end_datetime >", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_datetime >=", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeLessThan(Date value) {
            addCriterion("end_datetime <", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("end_datetime <=", value, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeIn(List<Date> values) {
            addCriterion("end_datetime in", values, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotIn(List<Date> values) {
            addCriterion("end_datetime not in", values, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeBetween(Date value1, Date value2) {
            addCriterion("end_datetime between", value1, value2, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andEndDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("end_datetime not between", value1, value2, "endDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeIsNull() {
            addCriterion("reply_datetime is null");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeIsNotNull() {
            addCriterion("reply_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeEqualTo(Date value) {
            addCriterion("reply_datetime =", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeNotEqualTo(Date value) {
            addCriterion("reply_datetime <>", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeGreaterThan(Date value) {
            addCriterion("reply_datetime >", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_datetime >=", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeLessThan(Date value) {
            addCriterion("reply_datetime <", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_datetime <=", value, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeIn(List<Date> values) {
            addCriterion("reply_datetime in", values, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeNotIn(List<Date> values) {
            addCriterion("reply_datetime not in", values, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeBetween(Date value1, Date value2) {
            addCriterion("reply_datetime between", value1, value2, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andReplyDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_datetime not between", value1, value2, "replyDatetime");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIsNull() {
            addCriterion("session_type is null");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIsNotNull() {
            addCriterion("session_type is not null");
            return (Criteria) this;
        }

        public Criteria andSessionTypeEqualTo(Boolean value) {
            addCriterion("session_type =", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotEqualTo(Boolean value) {
            addCriterion("session_type <>", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThan(Boolean value) {
            addCriterion("session_type >", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("session_type >=", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThan(Boolean value) {
            addCriterion("session_type <", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("session_type <=", value, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeIn(List<Boolean> values) {
            addCriterion("session_type in", values, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotIn(List<Boolean> values) {
            addCriterion("session_type not in", values, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("session_type between", value1, value2, "sessionType");
            return (Criteria) this;
        }

        public Criteria andSessionTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("session_type not between", value1, value2, "sessionType");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNull() {
            addCriterion("is_transfer is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNotNull() {
            addCriterion("is_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferEqualTo(Boolean value) {
            addCriterion("is_transfer =", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotEqualTo(Boolean value) {
            addCriterion("is_transfer <>", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThan(Boolean value) {
            addCriterion("is_transfer >", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_transfer >=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThan(Boolean value) {
            addCriterion("is_transfer <", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThanOrEqualTo(Boolean value) {
            addCriterion("is_transfer <=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferIn(List<Boolean> values) {
            addCriterion("is_transfer in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotIn(List<Boolean> values) {
            addCriterion("is_transfer not in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferBetween(Boolean value1, Boolean value2) {
            addCriterion("is_transfer between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_transfer not between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyIsNull() {
            addCriterion("is_non_reply is null");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyIsNotNull() {
            addCriterion("is_non_reply is not null");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyEqualTo(Boolean value) {
            addCriterion("is_non_reply =", value, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyNotEqualTo(Boolean value) {
            addCriterion("is_non_reply <>", value, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyGreaterThan(Boolean value) {
            addCriterion("is_non_reply >", value, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_non_reply >=", value, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyLessThan(Boolean value) {
            addCriterion("is_non_reply <", value, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_non_reply <=", value, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyIn(List<Boolean> values) {
            addCriterion("is_non_reply in", values, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyNotIn(List<Boolean> values) {
            addCriterion("is_non_reply not in", values, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_non_reply between", value1, value2, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsNonReplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_non_reply not between", value1, value2, "isNonReply");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespIsNull() {
            addCriterion("is_slow_resp is null");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespIsNotNull() {
            addCriterion("is_slow_resp is not null");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespEqualTo(Boolean value) {
            addCriterion("is_slow_resp =", value, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespNotEqualTo(Boolean value) {
            addCriterion("is_slow_resp <>", value, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespGreaterThan(Boolean value) {
            addCriterion("is_slow_resp >", value, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_slow_resp >=", value, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespLessThan(Boolean value) {
            addCriterion("is_slow_resp <", value, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespLessThanOrEqualTo(Boolean value) {
            addCriterion("is_slow_resp <=", value, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespIn(List<Boolean> values) {
            addCriterion("is_slow_resp in", values, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespNotIn(List<Boolean> values) {
            addCriterion("is_slow_resp not in", values, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespBetween(Boolean value1, Boolean value2) {
            addCriterion("is_slow_resp between", value1, value2, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsSlowRespNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_slow_resp not between", value1, value2, "isSlowResp");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveIsNull() {
            addCriterion("is_long_receive is null");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveIsNotNull() {
            addCriterion("is_long_receive is not null");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveEqualTo(Boolean value) {
            addCriterion("is_long_receive =", value, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveNotEqualTo(Boolean value) {
            addCriterion("is_long_receive <>", value, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveGreaterThan(Boolean value) {
            addCriterion("is_long_receive >", value, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_long_receive >=", value, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveLessThan(Boolean value) {
            addCriterion("is_long_receive <", value, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_long_receive <=", value, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveIn(List<Boolean> values) {
            addCriterion("is_long_receive in", values, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveNotIn(List<Boolean> values) {
            addCriterion("is_long_receive not in", values, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_long_receive between", value1, value2, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andIsLongReceiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_long_receive not between", value1, value2, "isLongReceive");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumIsNull() {
            addCriterion("send_eval_num is null");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumIsNotNull() {
            addCriterion("send_eval_num is not null");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumEqualTo(Integer value) {
            addCriterion("send_eval_num =", value, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumNotEqualTo(Integer value) {
            addCriterion("send_eval_num <>", value, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumGreaterThan(Integer value) {
            addCriterion("send_eval_num >", value, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_eval_num >=", value, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumLessThan(Integer value) {
            addCriterion("send_eval_num <", value, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumLessThanOrEqualTo(Integer value) {
            addCriterion("send_eval_num <=", value, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumIn(List<Integer> values) {
            addCriterion("send_eval_num in", values, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumNotIn(List<Integer> values) {
            addCriterion("send_eval_num not in", values, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumBetween(Integer value1, Integer value2) {
            addCriterion("send_eval_num between", value1, value2, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andSendEvalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("send_eval_num not between", value1, value2, "sendEvalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumIsNull() {
            addCriterion("eval_num is null");
            return (Criteria) this;
        }

        public Criteria andEvalNumIsNotNull() {
            addCriterion("eval_num is not null");
            return (Criteria) this;
        }

        public Criteria andEvalNumEqualTo(Integer value) {
            addCriterion("eval_num =", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumNotEqualTo(Integer value) {
            addCriterion("eval_num <>", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumGreaterThan(Integer value) {
            addCriterion("eval_num >", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_num >=", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumLessThan(Integer value) {
            addCriterion("eval_num <", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumLessThanOrEqualTo(Integer value) {
            addCriterion("eval_num <=", value, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumIn(List<Integer> values) {
            addCriterion("eval_num in", values, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumNotIn(List<Integer> values) {
            addCriterion("eval_num not in", values, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumBetween(Integer value1, Integer value2) {
            addCriterion("eval_num between", value1, value2, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_num not between", value1, value2, "evalNum");
            return (Criteria) this;
        }

        public Criteria andEvalCodeIsNull() {
            addCriterion("eval_code is null");
            return (Criteria) this;
        }

        public Criteria andEvalCodeIsNotNull() {
            addCriterion("eval_code is not null");
            return (Criteria) this;
        }

        public Criteria andEvalCodeEqualTo(Integer value) {
            addCriterion("eval_code =", value, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeNotEqualTo(Integer value) {
            addCriterion("eval_code <>", value, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeGreaterThan(Integer value) {
            addCriterion("eval_code >", value, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_code >=", value, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeLessThan(Integer value) {
            addCriterion("eval_code <", value, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeLessThanOrEqualTo(Integer value) {
            addCriterion("eval_code <=", value, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeIn(List<Integer> values) {
            addCriterion("eval_code in", values, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeNotIn(List<Integer> values) {
            addCriterion("eval_code not in", values, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeBetween(Integer value1, Integer value2) {
            addCriterion("eval_code between", value1, value2, "evalCode");
            return (Criteria) this;
        }

        public Criteria andEvalCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_code not between", value1, value2, "evalCode");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumIsNull() {
            addCriterion("satisfied_eval_num is null");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumIsNotNull() {
            addCriterion("satisfied_eval_num is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumEqualTo(Integer value) {
            addCriterion("satisfied_eval_num =", value, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumNotEqualTo(Integer value) {
            addCriterion("satisfied_eval_num <>", value, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumGreaterThan(Integer value) {
            addCriterion("satisfied_eval_num >", value, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("satisfied_eval_num >=", value, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumLessThan(Integer value) {
            addCriterion("satisfied_eval_num <", value, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumLessThanOrEqualTo(Integer value) {
            addCriterion("satisfied_eval_num <=", value, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumIn(List<Integer> values) {
            addCriterion("satisfied_eval_num in", values, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumNotIn(List<Integer> values) {
            addCriterion("satisfied_eval_num not in", values, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumBetween(Integer value1, Integer value2) {
            addCriterion("satisfied_eval_num between", value1, value2, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedEvalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("satisfied_eval_num not between", value1, value2, "satisfiedEvalNum");
            return (Criteria) this;
        }

        public Criteria andIsConsultIsNull() {
            addCriterion("is_consult is null");
            return (Criteria) this;
        }

        public Criteria andIsConsultIsNotNull() {
            addCriterion("is_consult is not null");
            return (Criteria) this;
        }

        public Criteria andIsConsultEqualTo(Boolean value) {
            addCriterion("is_consult =", value, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultNotEqualTo(Boolean value) {
            addCriterion("is_consult <>", value, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultGreaterThan(Boolean value) {
            addCriterion("is_consult >", value, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_consult >=", value, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultLessThan(Boolean value) {
            addCriterion("is_consult <", value, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_consult <=", value, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultIn(List<Boolean> values) {
            addCriterion("is_consult in", values, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultNotIn(List<Boolean> values) {
            addCriterion("is_consult not in", values, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_consult between", value1, value2, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsConsultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_consult not between", value1, value2, "isConsult");
            return (Criteria) this;
        }

        public Criteria andIsReceiveIsNull() {
            addCriterion("is_receive is null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveIsNotNull() {
            addCriterion("is_receive is not null");
            return (Criteria) this;
        }

        public Criteria andIsReceiveEqualTo(Boolean value) {
            addCriterion("is_receive =", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveNotEqualTo(Boolean value) {
            addCriterion("is_receive <>", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveGreaterThan(Boolean value) {
            addCriterion("is_receive >", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_receive >=", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLessThan(Boolean value) {
            addCriterion("is_receive <", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_receive <=", value, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveIn(List<Boolean> values) {
            addCriterion("is_receive in", values, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveNotIn(List<Boolean> values) {
            addCriterion("is_receive not in", values, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_receive between", value1, value2, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsReceiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_receive not between", value1, value2, "isReceive");
            return (Criteria) this;
        }

        public Criteria andIsAssignIsNull() {
            addCriterion("is_assign is null");
            return (Criteria) this;
        }

        public Criteria andIsAssignIsNotNull() {
            addCriterion("is_assign is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssignEqualTo(Boolean value) {
            addCriterion("is_assign =", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignNotEqualTo(Boolean value) {
            addCriterion("is_assign <>", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignGreaterThan(Boolean value) {
            addCriterion("is_assign >", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_assign >=", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignLessThan(Boolean value) {
            addCriterion("is_assign <", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignLessThanOrEqualTo(Boolean value) {
            addCriterion("is_assign <=", value, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignIn(List<Boolean> values) {
            addCriterion("is_assign in", values, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignNotIn(List<Boolean> values) {
            addCriterion("is_assign not in", values, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignBetween(Boolean value1, Boolean value2) {
            addCriterion("is_assign between", value1, value2, "isAssign");
            return (Criteria) this;
        }

        public Criteria andIsAssignNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_assign not between", value1, value2, "isAssign");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeIsNull() {
            addCriterion("session_duration_time is null");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeIsNotNull() {
            addCriterion("session_duration_time is not null");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeEqualTo(Double value) {
            addCriterion("session_duration_time =", value, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeNotEqualTo(Double value) {
            addCriterion("session_duration_time <>", value, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeGreaterThan(Double value) {
            addCriterion("session_duration_time >", value, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("session_duration_time >=", value, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeLessThan(Double value) {
            addCriterion("session_duration_time <", value, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeLessThanOrEqualTo(Double value) {
            addCriterion("session_duration_time <=", value, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeIn(List<Double> values) {
            addCriterion("session_duration_time in", values, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeNotIn(List<Double> values) {
            addCriterion("session_duration_time not in", values, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeBetween(Double value1, Double value2) {
            addCriterion("session_duration_time between", value1, value2, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeNotBetween(Double value1, Double value2) {
            addCriterion("session_duration_time not between", value1, value2, "sessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstIsNull() {
            addCriterion("avg_resp_time_first is null");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstIsNotNull() {
            addCriterion("avg_resp_time_first is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstEqualTo(Double value) {
            addCriterion("avg_resp_time_first =", value, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstNotEqualTo(Double value) {
            addCriterion("avg_resp_time_first <>", value, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstGreaterThan(Double value) {
            addCriterion("avg_resp_time_first >", value, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_resp_time_first >=", value, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstLessThan(Double value) {
            addCriterion("avg_resp_time_first <", value, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstLessThanOrEqualTo(Double value) {
            addCriterion("avg_resp_time_first <=", value, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstIn(List<Double> values) {
            addCriterion("avg_resp_time_first in", values, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstNotIn(List<Double> values) {
            addCriterion("avg_resp_time_first not in", values, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstBetween(Double value1, Double value2) {
            addCriterion("avg_resp_time_first between", value1, value2, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeFirstNotBetween(Double value1, Double value2) {
            addCriterion("avg_resp_time_first not between", value1, value2, "avgRespTimeFirst");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeIsNull() {
            addCriterion("avg_resp_time is null");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeIsNotNull() {
            addCriterion("avg_resp_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeEqualTo(Double value) {
            addCriterion("avg_resp_time =", value, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeNotEqualTo(Double value) {
            addCriterion("avg_resp_time <>", value, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeGreaterThan(Double value) {
            addCriterion("avg_resp_time >", value, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_resp_time >=", value, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeLessThan(Double value) {
            addCriterion("avg_resp_time <", value, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeLessThanOrEqualTo(Double value) {
            addCriterion("avg_resp_time <=", value, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeIn(List<Double> values) {
            addCriterion("avg_resp_time in", values, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeNotIn(List<Double> values) {
            addCriterion("avg_resp_time not in", values, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeBetween(Double value1, Double value2) {
            addCriterion("avg_resp_time between", value1, value2, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespTimeNotBetween(Double value1, Double value2) {
            addCriterion("avg_resp_time not between", value1, value2, "avgRespTime");
            return (Criteria) this;
        }

        public Criteria andCsChatNumIsNull() {
            addCriterion("cs_chat_num is null");
            return (Criteria) this;
        }

        public Criteria andCsChatNumIsNotNull() {
            addCriterion("cs_chat_num is not null");
            return (Criteria) this;
        }

        public Criteria andCsChatNumEqualTo(Integer value) {
            addCriterion("cs_chat_num =", value, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumNotEqualTo(Integer value) {
            addCriterion("cs_chat_num <>", value, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumGreaterThan(Integer value) {
            addCriterion("cs_chat_num >", value, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cs_chat_num >=", value, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumLessThan(Integer value) {
            addCriterion("cs_chat_num <", value, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumLessThanOrEqualTo(Integer value) {
            addCriterion("cs_chat_num <=", value, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumIn(List<Integer> values) {
            addCriterion("cs_chat_num in", values, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumNotIn(List<Integer> values) {
            addCriterion("cs_chat_num not in", values, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumBetween(Integer value1, Integer value2) {
            addCriterion("cs_chat_num between", value1, value2, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCsChatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cs_chat_num not between", value1, value2, "csChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumIsNull() {
            addCriterion("cust_chat_num is null");
            return (Criteria) this;
        }

        public Criteria andCustChatNumIsNotNull() {
            addCriterion("cust_chat_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustChatNumEqualTo(Integer value) {
            addCriterion("cust_chat_num =", value, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumNotEqualTo(Integer value) {
            addCriterion("cust_chat_num <>", value, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumGreaterThan(Integer value) {
            addCriterion("cust_chat_num >", value, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_chat_num >=", value, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumLessThan(Integer value) {
            addCriterion("cust_chat_num <", value, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumLessThanOrEqualTo(Integer value) {
            addCriterion("cust_chat_num <=", value, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumIn(List<Integer> values) {
            addCriterion("cust_chat_num in", values, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumNotIn(List<Integer> values) {
            addCriterion("cust_chat_num not in", values, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumBetween(Integer value1, Integer value2) {
            addCriterion("cust_chat_num between", value1, value2, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andCustChatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_chat_num not between", value1, value2, "custChatNum");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeIsNull() {
            addCriterion("receive_start_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeIsNotNull() {
            addCriterion("receive_start_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeEqualTo(Boolean value) {
            addCriterion("receive_start_type =", value, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeNotEqualTo(Boolean value) {
            addCriterion("receive_start_type <>", value, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeGreaterThan(Boolean value) {
            addCriterion("receive_start_type >", value, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("receive_start_type >=", value, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeLessThan(Boolean value) {
            addCriterion("receive_start_type <", value, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("receive_start_type <=", value, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeIn(List<Boolean> values) {
            addCriterion("receive_start_type in", values, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeNotIn(List<Boolean> values) {
            addCriterion("receive_start_type not in", values, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("receive_start_type between", value1, value2, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andReceiveStartTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("receive_start_type not between", value1, value2, "receiveStartType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeIsNull() {
            addCriterion("forward_type is null");
            return (Criteria) this;
        }

        public Criteria andForwardTypeIsNotNull() {
            addCriterion("forward_type is not null");
            return (Criteria) this;
        }

        public Criteria andForwardTypeEqualTo(Boolean value) {
            addCriterion("forward_type =", value, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeNotEqualTo(Boolean value) {
            addCriterion("forward_type <>", value, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeGreaterThan(Boolean value) {
            addCriterion("forward_type >", value, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("forward_type >=", value, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeLessThan(Boolean value) {
            addCriterion("forward_type <", value, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("forward_type <=", value, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeIn(List<Boolean> values) {
            addCriterion("forward_type in", values, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeNotIn(List<Boolean> values) {
            addCriterion("forward_type not in", values, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("forward_type between", value1, value2, "forwardType");
            return (Criteria) this;
        }

        public Criteria andForwardTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("forward_type not between", value1, value2, "forwardType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}