package org.pes.jd.model.DO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class pes_cs_chat_session_service_index_2019Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pes_cs_chat_session_service_index_2019Example() {
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

        public Criteria andConsultSessionNumIsNull() {
            addCriterion("consult_session_num is null");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumIsNotNull() {
            addCriterion("consult_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumEqualTo(Integer value) {
            addCriterion("consult_session_num =", value, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumNotEqualTo(Integer value) {
            addCriterion("consult_session_num <>", value, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumGreaterThan(Integer value) {
            addCriterion("consult_session_num >", value, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("consult_session_num >=", value, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumLessThan(Integer value) {
            addCriterion("consult_session_num <", value, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("consult_session_num <=", value, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumIn(List<Integer> values) {
            addCriterion("consult_session_num in", values, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumNotIn(List<Integer> values) {
            addCriterion("consult_session_num not in", values, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("consult_session_num between", value1, value2, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andConsultSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("consult_session_num not between", value1, value2, "consultSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumIsNull() {
            addCriterion("receive_session_num is null");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumIsNotNull() {
            addCriterion("receive_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumEqualTo(Integer value) {
            addCriterion("receive_session_num =", value, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumNotEqualTo(Integer value) {
            addCriterion("receive_session_num <>", value, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumGreaterThan(Integer value) {
            addCriterion("receive_session_num >", value, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_session_num >=", value, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumLessThan(Integer value) {
            addCriterion("receive_session_num <", value, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("receive_session_num <=", value, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumIn(List<Integer> values) {
            addCriterion("receive_session_num in", values, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumNotIn(List<Integer> values) {
            addCriterion("receive_session_num not in", values, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("receive_session_num between", value1, value2, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_session_num not between", value1, value2, "receiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeIsNull() {
            addCriterion("receive_session_duration_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeIsNotNull() {
            addCriterion("receive_session_duration_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeEqualTo(Double value) {
            addCriterion("receive_session_duration_time =", value, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeNotEqualTo(Double value) {
            addCriterion("receive_session_duration_time <>", value, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeGreaterThan(Double value) {
            addCriterion("receive_session_duration_time >", value, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("receive_session_duration_time >=", value, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeLessThan(Double value) {
            addCriterion("receive_session_duration_time <", value, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeLessThanOrEqualTo(Double value) {
            addCriterion("receive_session_duration_time <=", value, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeIn(List<Double> values) {
            addCriterion("receive_session_duration_time in", values, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeNotIn(List<Double> values) {
            addCriterion("receive_session_duration_time not in", values, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeBetween(Double value1, Double value2) {
            addCriterion("receive_session_duration_time between", value1, value2, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andReceiveSessionDurationTimeNotBetween(Double value1, Double value2) {
            addCriterion("receive_session_duration_time not between", value1, value2, "receiveSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumIsNull() {
            addCriterion("direct_receive_session_num is null");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumIsNotNull() {
            addCriterion("direct_receive_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumEqualTo(Integer value) {
            addCriterion("direct_receive_session_num =", value, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumNotEqualTo(Integer value) {
            addCriterion("direct_receive_session_num <>", value, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumGreaterThan(Integer value) {
            addCriterion("direct_receive_session_num >", value, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("direct_receive_session_num >=", value, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumLessThan(Integer value) {
            addCriterion("direct_receive_session_num <", value, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("direct_receive_session_num <=", value, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumIn(List<Integer> values) {
            addCriterion("direct_receive_session_num in", values, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumNotIn(List<Integer> values) {
            addCriterion("direct_receive_session_num not in", values, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("direct_receive_session_num between", value1, value2, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andDirectReceiveSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("direct_receive_session_num not between", value1, value2, "directReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumIsNull() {
            addCriterion("forward_in_session_num is null");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumIsNotNull() {
            addCriterion("forward_in_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumEqualTo(Integer value) {
            addCriterion("forward_in_session_num =", value, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumNotEqualTo(Integer value) {
            addCriterion("forward_in_session_num <>", value, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumGreaterThan(Integer value) {
            addCriterion("forward_in_session_num >", value, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward_in_session_num >=", value, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumLessThan(Integer value) {
            addCriterion("forward_in_session_num <", value, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("forward_in_session_num <=", value, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumIn(List<Integer> values) {
            addCriterion("forward_in_session_num in", values, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumNotIn(List<Integer> values) {
            addCriterion("forward_in_session_num not in", values, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("forward_in_session_num between", value1, value2, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardInSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("forward_in_session_num not between", value1, value2, "forwardInSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumIsNull() {
            addCriterion("forward_out_session_num is null");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumIsNotNull() {
            addCriterion("forward_out_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumEqualTo(Integer value) {
            addCriterion("forward_out_session_num =", value, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumNotEqualTo(Integer value) {
            addCriterion("forward_out_session_num <>", value, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumGreaterThan(Integer value) {
            addCriterion("forward_out_session_num >", value, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward_out_session_num >=", value, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumLessThan(Integer value) {
            addCriterion("forward_out_session_num <", value, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("forward_out_session_num <=", value, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumIn(List<Integer> values) {
            addCriterion("forward_out_session_num in", values, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumNotIn(List<Integer> values) {
            addCriterion("forward_out_session_num not in", values, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("forward_out_session_num between", value1, value2, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andForwardOutSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("forward_out_session_num not between", value1, value2, "forwardOutSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumIsNull() {
            addCriterion("cust_consult_session_num is null");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumIsNotNull() {
            addCriterion("cust_consult_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumEqualTo(Integer value) {
            addCriterion("cust_consult_session_num =", value, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumNotEqualTo(Integer value) {
            addCriterion("cust_consult_session_num <>", value, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumGreaterThan(Integer value) {
            addCriterion("cust_consult_session_num >", value, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_consult_session_num >=", value, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumLessThan(Integer value) {
            addCriterion("cust_consult_session_num <", value, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("cust_consult_session_num <=", value, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumIn(List<Integer> values) {
            addCriterion("cust_consult_session_num in", values, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumNotIn(List<Integer> values) {
            addCriterion("cust_consult_session_num not in", values, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("cust_consult_session_num between", value1, value2, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCustConsultSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_consult_session_num not between", value1, value2, "custConsultSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumIsNull() {
            addCriterion("cs_to_cust_session_num is null");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumIsNotNull() {
            addCriterion("cs_to_cust_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumEqualTo(Integer value) {
            addCriterion("cs_to_cust_session_num =", value, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumNotEqualTo(Integer value) {
            addCriterion("cs_to_cust_session_num <>", value, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumGreaterThan(Integer value) {
            addCriterion("cs_to_cust_session_num >", value, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cs_to_cust_session_num >=", value, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumLessThan(Integer value) {
            addCriterion("cs_to_cust_session_num <", value, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("cs_to_cust_session_num <=", value, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumIn(List<Integer> values) {
            addCriterion("cs_to_cust_session_num in", values, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumNotIn(List<Integer> values) {
            addCriterion("cs_to_cust_session_num not in", values, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("cs_to_cust_session_num between", value1, value2, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andCsToCustSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cs_to_cust_session_num not between", value1, value2, "csToCustSessionNum");
            return (Criteria) this;
        }

        public Criteria andChatNumIsNull() {
            addCriterion("chat_num is null");
            return (Criteria) this;
        }

        public Criteria andChatNumIsNotNull() {
            addCriterion("chat_num is not null");
            return (Criteria) this;
        }

        public Criteria andChatNumEqualTo(Integer value) {
            addCriterion("chat_num =", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumNotEqualTo(Integer value) {
            addCriterion("chat_num <>", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumGreaterThan(Integer value) {
            addCriterion("chat_num >", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_num >=", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumLessThan(Integer value) {
            addCriterion("chat_num <", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumLessThanOrEqualTo(Integer value) {
            addCriterion("chat_num <=", value, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumIn(List<Integer> values) {
            addCriterion("chat_num in", values, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumNotIn(List<Integer> values) {
            addCriterion("chat_num not in", values, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumBetween(Integer value1, Integer value2) {
            addCriterion("chat_num between", value1, value2, "chatNum");
            return (Criteria) this;
        }

        public Criteria andChatNumNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_num not between", value1, value2, "chatNum");
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

        public Criteria andCsWordNumIsNull() {
            addCriterion("cs_word_num is null");
            return (Criteria) this;
        }

        public Criteria andCsWordNumIsNotNull() {
            addCriterion("cs_word_num is not null");
            return (Criteria) this;
        }

        public Criteria andCsWordNumEqualTo(Integer value) {
            addCriterion("cs_word_num =", value, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumNotEqualTo(Integer value) {
            addCriterion("cs_word_num <>", value, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumGreaterThan(Integer value) {
            addCriterion("cs_word_num >", value, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cs_word_num >=", value, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumLessThan(Integer value) {
            addCriterion("cs_word_num <", value, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumLessThanOrEqualTo(Integer value) {
            addCriterion("cs_word_num <=", value, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumIn(List<Integer> values) {
            addCriterion("cs_word_num in", values, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumNotIn(List<Integer> values) {
            addCriterion("cs_word_num not in", values, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumBetween(Integer value1, Integer value2) {
            addCriterion("cs_word_num between", value1, value2, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andCsWordNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cs_word_num not between", value1, value2, "csWordNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumIsNull() {
            addCriterion("avg_cs_msg_session_num is null");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumIsNotNull() {
            addCriterion("avg_cs_msg_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumEqualTo(Double value) {
            addCriterion("avg_cs_msg_session_num =", value, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumNotEqualTo(Double value) {
            addCriterion("avg_cs_msg_session_num <>", value, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumGreaterThan(Double value) {
            addCriterion("avg_cs_msg_session_num >", value, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_cs_msg_session_num >=", value, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumLessThan(Double value) {
            addCriterion("avg_cs_msg_session_num <", value, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumLessThanOrEqualTo(Double value) {
            addCriterion("avg_cs_msg_session_num <=", value, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumIn(List<Double> values) {
            addCriterion("avg_cs_msg_session_num in", values, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumNotIn(List<Double> values) {
            addCriterion("avg_cs_msg_session_num not in", values, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumBetween(Double value1, Double value2) {
            addCriterion("avg_cs_msg_session_num between", value1, value2, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andAvgCsMsgSessionNumNotBetween(Double value1, Double value2) {
            addCriterion("avg_cs_msg_session_num not between", value1, value2, "avgCsMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumIsNull() {
            addCriterion("max_receive_session_num is null");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumIsNotNull() {
            addCriterion("max_receive_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumEqualTo(Integer value) {
            addCriterion("max_receive_session_num =", value, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumNotEqualTo(Integer value) {
            addCriterion("max_receive_session_num <>", value, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumGreaterThan(Integer value) {
            addCriterion("max_receive_session_num >", value, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_receive_session_num >=", value, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumLessThan(Integer value) {
            addCriterion("max_receive_session_num <", value, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("max_receive_session_num <=", value, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumIn(List<Integer> values) {
            addCriterion("max_receive_session_num in", values, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumNotIn(List<Integer> values) {
            addCriterion("max_receive_session_num not in", values, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("max_receive_session_num between", value1, value2, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andMaxReceiveSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("max_receive_session_num not between", value1, value2, "maxReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumIsNull() {
            addCriterion("non_reply_session_num is null");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumIsNotNull() {
            addCriterion("non_reply_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumEqualTo(Integer value) {
            addCriterion("non_reply_session_num =", value, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumNotEqualTo(Integer value) {
            addCriterion("non_reply_session_num <>", value, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumGreaterThan(Integer value) {
            addCriterion("non_reply_session_num >", value, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("non_reply_session_num >=", value, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumLessThan(Integer value) {
            addCriterion("non_reply_session_num <", value, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("non_reply_session_num <=", value, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumIn(List<Integer> values) {
            addCriterion("non_reply_session_num in", values, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumNotIn(List<Integer> values) {
            addCriterion("non_reply_session_num not in", values, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumBetween(Integer value1, Integer value2) {
            addCriterion("non_reply_session_num between", value1, value2, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andNonReplySessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("non_reply_session_num not between", value1, value2, "nonReplySessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumIsNull() {
            addCriterion("leave_msg_session_num is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumIsNotNull() {
            addCriterion("leave_msg_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumEqualTo(Integer value) {
            addCriterion("leave_msg_session_num =", value, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumNotEqualTo(Integer value) {
            addCriterion("leave_msg_session_num <>", value, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumGreaterThan(Integer value) {
            addCriterion("leave_msg_session_num >", value, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_msg_session_num >=", value, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumLessThan(Integer value) {
            addCriterion("leave_msg_session_num <", value, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("leave_msg_session_num <=", value, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumIn(List<Integer> values) {
            addCriterion("leave_msg_session_num in", values, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumNotIn(List<Integer> values) {
            addCriterion("leave_msg_session_num not in", values, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("leave_msg_session_num between", value1, value2, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_msg_session_num not between", value1, value2, "leaveMsgSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumIsNull() {
            addCriterion("leave_msg_receive_session_num is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumIsNotNull() {
            addCriterion("leave_msg_receive_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumEqualTo(Integer value) {
            addCriterion("leave_msg_receive_session_num =", value, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumNotEqualTo(Integer value) {
            addCriterion("leave_msg_receive_session_num <>", value, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumGreaterThan(Integer value) {
            addCriterion("leave_msg_receive_session_num >", value, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_msg_receive_session_num >=", value, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumLessThan(Integer value) {
            addCriterion("leave_msg_receive_session_num <", value, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("leave_msg_receive_session_num <=", value, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumIn(List<Integer> values) {
            addCriterion("leave_msg_receive_session_num in", values, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumNotIn(List<Integer> values) {
            addCriterion("leave_msg_receive_session_num not in", values, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("leave_msg_receive_session_num between", value1, value2, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgReceiveSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_msg_receive_session_num not between", value1, value2, "leaveMsgReceiveSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumIsNull() {
            addCriterion("slow_resp_session_num is null");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumIsNotNull() {
            addCriterion("slow_resp_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumEqualTo(Integer value) {
            addCriterion("slow_resp_session_num =", value, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumNotEqualTo(Integer value) {
            addCriterion("slow_resp_session_num <>", value, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumGreaterThan(Integer value) {
            addCriterion("slow_resp_session_num >", value, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("slow_resp_session_num >=", value, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumLessThan(Integer value) {
            addCriterion("slow_resp_session_num <", value, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("slow_resp_session_num <=", value, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumIn(List<Integer> values) {
            addCriterion("slow_resp_session_num in", values, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumNotIn(List<Integer> values) {
            addCriterion("slow_resp_session_num not in", values, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("slow_resp_session_num between", value1, value2, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andSlowRespSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("slow_resp_session_num not between", value1, value2, "slowRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumIsNull() {
            addCriterion("long_resp_session_num is null");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumIsNotNull() {
            addCriterion("long_resp_session_num is not null");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumEqualTo(Integer value) {
            addCriterion("long_resp_session_num =", value, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumNotEqualTo(Integer value) {
            addCriterion("long_resp_session_num <>", value, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumGreaterThan(Integer value) {
            addCriterion("long_resp_session_num >", value, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("long_resp_session_num >=", value, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumLessThan(Integer value) {
            addCriterion("long_resp_session_num <", value, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("long_resp_session_num <=", value, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumIn(List<Integer> values) {
            addCriterion("long_resp_session_num in", values, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumNotIn(List<Integer> values) {
            addCriterion("long_resp_session_num not in", values, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("long_resp_session_num between", value1, value2, "longRespSessionNum");
            return (Criteria) this;
        }

        public Criteria andLongRespSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("long_resp_session_num not between", value1, value2, "longRespSessionNum");
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

        public Criteria andAvgSessionDurationTimeIsNull() {
            addCriterion("avg_session_duration_time is null");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeIsNotNull() {
            addCriterion("avg_session_duration_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeEqualTo(Double value) {
            addCriterion("avg_session_duration_time =", value, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeNotEqualTo(Double value) {
            addCriterion("avg_session_duration_time <>", value, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeGreaterThan(Double value) {
            addCriterion("avg_session_duration_time >", value, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_session_duration_time >=", value, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeLessThan(Double value) {
            addCriterion("avg_session_duration_time <", value, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeLessThanOrEqualTo(Double value) {
            addCriterion("avg_session_duration_time <=", value, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeIn(List<Double> values) {
            addCriterion("avg_session_duration_time in", values, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeNotIn(List<Double> values) {
            addCriterion("avg_session_duration_time not in", values, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeBetween(Double value1, Double value2) {
            addCriterion("avg_session_duration_time between", value1, value2, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgSessionDurationTimeNotBetween(Double value1, Double value2) {
            addCriterion("avg_session_duration_time not between", value1, value2, "avgSessionDurationTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeIsNull() {
            addCriterion("avg_resp_in_quick_time is null");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeIsNotNull() {
            addCriterion("avg_resp_in_quick_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeEqualTo(Integer value) {
            addCriterion("avg_resp_in_quick_time =", value, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeNotEqualTo(Integer value) {
            addCriterion("avg_resp_in_quick_time <>", value, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeGreaterThan(Integer value) {
            addCriterion("avg_resp_in_quick_time >", value, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_resp_in_quick_time >=", value, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeLessThan(Integer value) {
            addCriterion("avg_resp_in_quick_time <", value, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeLessThanOrEqualTo(Integer value) {
            addCriterion("avg_resp_in_quick_time <=", value, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeIn(List<Integer> values) {
            addCriterion("avg_resp_in_quick_time in", values, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeNotIn(List<Integer> values) {
            addCriterion("avg_resp_in_quick_time not in", values, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeBetween(Integer value1, Integer value2) {
            addCriterion("avg_resp_in_quick_time between", value1, value2, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andAvgRespInQuickTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_resp_in_quick_time not between", value1, value2, "avgRespInQuickTime");
            return (Criteria) this;
        }

        public Criteria andSessionNumIsNull() {
            addCriterion("session_num is null");
            return (Criteria) this;
        }

        public Criteria andSessionNumIsNotNull() {
            addCriterion("session_num is not null");
            return (Criteria) this;
        }

        public Criteria andSessionNumEqualTo(Integer value) {
            addCriterion("session_num =", value, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumNotEqualTo(Integer value) {
            addCriterion("session_num <>", value, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumGreaterThan(Integer value) {
            addCriterion("session_num >", value, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_num >=", value, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumLessThan(Integer value) {
            addCriterion("session_num <", value, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumLessThanOrEqualTo(Integer value) {
            addCriterion("session_num <=", value, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumIn(List<Integer> values) {
            addCriterion("session_num in", values, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumNotIn(List<Integer> values) {
            addCriterion("session_num not in", values, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumBetween(Integer value1, Integer value2) {
            addCriterion("session_num between", value1, value2, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andSessionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("session_num not between", value1, value2, "sessionNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumIsNull() {
            addCriterion("chat_round_num is null");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumIsNotNull() {
            addCriterion("chat_round_num is not null");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumEqualTo(Integer value) {
            addCriterion("chat_round_num =", value, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumNotEqualTo(Integer value) {
            addCriterion("chat_round_num <>", value, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumGreaterThan(Integer value) {
            addCriterion("chat_round_num >", value, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("chat_round_num >=", value, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumLessThan(Integer value) {
            addCriterion("chat_round_num <", value, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumLessThanOrEqualTo(Integer value) {
            addCriterion("chat_round_num <=", value, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumIn(List<Integer> values) {
            addCriterion("chat_round_num in", values, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumNotIn(List<Integer> values) {
            addCriterion("chat_round_num not in", values, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumBetween(Integer value1, Integer value2) {
            addCriterion("chat_round_num between", value1, value2, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andChatRoundNumNotBetween(Integer value1, Integer value2) {
            addCriterion("chat_round_num not between", value1, value2, "chatRoundNum");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountIsNull() {
            addCriterion("resp_time_first_count is null");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountIsNotNull() {
            addCriterion("resp_time_first_count is not null");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountEqualTo(Double value) {
            addCriterion("resp_time_first_count =", value, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountNotEqualTo(Double value) {
            addCriterion("resp_time_first_count <>", value, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountGreaterThan(Double value) {
            addCriterion("resp_time_first_count >", value, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountGreaterThanOrEqualTo(Double value) {
            addCriterion("resp_time_first_count >=", value, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountLessThan(Double value) {
            addCriterion("resp_time_first_count <", value, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountLessThanOrEqualTo(Double value) {
            addCriterion("resp_time_first_count <=", value, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountIn(List<Double> values) {
            addCriterion("resp_time_first_count in", values, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountNotIn(List<Double> values) {
            addCriterion("resp_time_first_count not in", values, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountBetween(Double value1, Double value2) {
            addCriterion("resp_time_first_count between", value1, value2, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeFirstCountNotBetween(Double value1, Double value2) {
            addCriterion("resp_time_first_count not between", value1, value2, "respTimeFirstCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountIsNull() {
            addCriterion("resp_time_count is null");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountIsNotNull() {
            addCriterion("resp_time_count is not null");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountEqualTo(Double value) {
            addCriterion("resp_time_count =", value, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountNotEqualTo(Double value) {
            addCriterion("resp_time_count <>", value, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountGreaterThan(Double value) {
            addCriterion("resp_time_count >", value, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountGreaterThanOrEqualTo(Double value) {
            addCriterion("resp_time_count >=", value, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountLessThan(Double value) {
            addCriterion("resp_time_count <", value, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountLessThanOrEqualTo(Double value) {
            addCriterion("resp_time_count <=", value, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountIn(List<Double> values) {
            addCriterion("resp_time_count in", values, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountNotIn(List<Double> values) {
            addCriterion("resp_time_count not in", values, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountBetween(Double value1, Double value2) {
            addCriterion("resp_time_count between", value1, value2, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andRespTimeCountNotBetween(Double value1, Double value2) {
            addCriterion("resp_time_count not between", value1, value2, "respTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountIsNull() {
            addCriterion("session_duration_time_count is null");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountIsNotNull() {
            addCriterion("session_duration_time_count is not null");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountEqualTo(Double value) {
            addCriterion("session_duration_time_count =", value, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountNotEqualTo(Double value) {
            addCriterion("session_duration_time_count <>", value, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountGreaterThan(Double value) {
            addCriterion("session_duration_time_count >", value, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountGreaterThanOrEqualTo(Double value) {
            addCriterion("session_duration_time_count >=", value, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountLessThan(Double value) {
            addCriterion("session_duration_time_count <", value, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountLessThanOrEqualTo(Double value) {
            addCriterion("session_duration_time_count <=", value, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountIn(List<Double> values) {
            addCriterion("session_duration_time_count in", values, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountNotIn(List<Double> values) {
            addCriterion("session_duration_time_count not in", values, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountBetween(Double value1, Double value2) {
            addCriterion("session_duration_time_count between", value1, value2, "sessionDurationTimeCount");
            return (Criteria) this;
        }

        public Criteria andSessionDurationTimeCountNotBetween(Double value1, Double value2) {
            addCriterion("session_duration_time_count not between", value1, value2, "sessionDurationTimeCount");
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