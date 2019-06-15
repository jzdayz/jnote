package com.pes.jd.model.DO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShopTeamHourIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopTeamHourIndexExample() {
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

        public Criteria andTimeDotIsNull() {
            addCriterion("time_dot is null");
            return (Criteria) this;
        }

        public Criteria andTimeDotIsNotNull() {
            addCriterion("time_dot is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDotEqualTo(Date value) {
            addCriterion("time_dot =", value, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotNotEqualTo(Date value) {
            addCriterion("time_dot <>", value, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotGreaterThan(Date value) {
            addCriterion("time_dot >", value, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotGreaterThanOrEqualTo(Date value) {
            addCriterion("time_dot >=", value, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotLessThan(Date value) {
            addCriterion("time_dot <", value, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotLessThanOrEqualTo(Date value) {
            addCriterion("time_dot <=", value, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotIn(List<Date> values) {
            addCriterion("time_dot in", values, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotNotIn(List<Date> values) {
            addCriterion("time_dot not in", values, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotBetween(Date value1, Date value2) {
            addCriterion("time_dot between", value1, value2, "timeDot");
            return (Criteria) this;
        }

        public Criteria andTimeDotNotBetween(Date value1, Date value2) {
            addCriterion("time_dot not between", value1, value2, "timeDot");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayIsNull() {
            addCriterion("order_amount_today is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayIsNotNull() {
            addCriterion("order_amount_today is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayEqualTo(Double value) {
            addCriterion("order_amount_today =", value, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayNotEqualTo(Double value) {
            addCriterion("order_amount_today <>", value, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayGreaterThan(Double value) {
            addCriterion("order_amount_today >", value, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayGreaterThanOrEqualTo(Double value) {
            addCriterion("order_amount_today >=", value, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayLessThan(Double value) {
            addCriterion("order_amount_today <", value, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayLessThanOrEqualTo(Double value) {
            addCriterion("order_amount_today <=", value, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayIn(List<Double> values) {
            addCriterion("order_amount_today in", values, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayNotIn(List<Double> values) {
            addCriterion("order_amount_today not in", values, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayBetween(Double value1, Double value2) {
            addCriterion("order_amount_today between", value1, value2, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderAmountTodayNotBetween(Double value1, Double value2) {
            addCriterion("order_amount_today not between", value1, value2, "orderAmountToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayIsNull() {
            addCriterion("ordered_num_today is null");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayIsNotNull() {
            addCriterion("ordered_num_today is not null");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayEqualTo(Integer value) {
            addCriterion("ordered_num_today =", value, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayNotEqualTo(Integer value) {
            addCriterion("ordered_num_today <>", value, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayGreaterThan(Integer value) {
            addCriterion("ordered_num_today >", value, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordered_num_today >=", value, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayLessThan(Integer value) {
            addCriterion("ordered_num_today <", value, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayLessThanOrEqualTo(Integer value) {
            addCriterion("ordered_num_today <=", value, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayIn(List<Integer> values) {
            addCriterion("ordered_num_today in", values, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayNotIn(List<Integer> values) {
            addCriterion("ordered_num_today not in", values, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayBetween(Integer value1, Integer value2) {
            addCriterion("ordered_num_today between", value1, value2, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderedNumTodayNotBetween(Integer value1, Integer value2) {
            addCriterion("ordered_num_today not between", value1, value2, "orderedNumToday");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIsNull() {
            addCriterion("order_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIsNotNull() {
            addCriterion("order_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumEqualTo(Integer value) {
            addCriterion("order_goods_num =", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotEqualTo(Integer value) {
            addCriterion("order_goods_num <>", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumGreaterThan(Integer value) {
            addCriterion("order_goods_num >", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_num >=", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumLessThan(Integer value) {
            addCriterion("order_goods_num <", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_num <=", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIn(List<Integer> values) {
            addCriterion("order_goods_num in", values, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotIn(List<Integer> values) {
            addCriterion("order_goods_num not in", values, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_num between", value1, value2, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_num not between", value1, value2, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(Integer value) {
            addCriterion("sale_num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(Integer value) {
            addCriterion("sale_num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(Integer value) {
            addCriterion("sale_num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(Integer value) {
            addCriterion("sale_num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("sale_num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<Integer> values) {
            addCriterion("sale_num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<Integer> values) {
            addCriterion("sale_num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("sale_num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_num not between", value1, value2, "saleNum");
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

        public Criteria andSatisfiedNumIsNull() {
            addCriterion("satisfied_num is null");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumIsNotNull() {
            addCriterion("satisfied_num is not null");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumEqualTo(Integer value) {
            addCriterion("satisfied_num =", value, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumNotEqualTo(Integer value) {
            addCriterion("satisfied_num <>", value, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumGreaterThan(Integer value) {
            addCriterion("satisfied_num >", value, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("satisfied_num >=", value, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumLessThan(Integer value) {
            addCriterion("satisfied_num <", value, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumLessThanOrEqualTo(Integer value) {
            addCriterion("satisfied_num <=", value, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumIn(List<Integer> values) {
            addCriterion("satisfied_num in", values, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumNotIn(List<Integer> values) {
            addCriterion("satisfied_num not in", values, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumBetween(Integer value1, Integer value2) {
            addCriterion("satisfied_num between", value1, value2, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andSatisfiedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("satisfied_num not between", value1, value2, "satisfiedNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumIsNull() {
            addCriterion("invite_num is null");
            return (Criteria) this;
        }

        public Criteria andInviteNumIsNotNull() {
            addCriterion("invite_num is not null");
            return (Criteria) this;
        }

        public Criteria andInviteNumEqualTo(Integer value) {
            addCriterion("invite_num =", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotEqualTo(Integer value) {
            addCriterion("invite_num <>", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumGreaterThan(Integer value) {
            addCriterion("invite_num >", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_num >=", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumLessThan(Integer value) {
            addCriterion("invite_num <", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumLessThanOrEqualTo(Integer value) {
            addCriterion("invite_num <=", value, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumIn(List<Integer> values) {
            addCriterion("invite_num in", values, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotIn(List<Integer> values) {
            addCriterion("invite_num not in", values, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumBetween(Integer value1, Integer value2) {
            addCriterion("invite_num between", value1, value2, "inviteNum");
            return (Criteria) this;
        }

        public Criteria andInviteNumNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_num not between", value1, value2, "inviteNum");
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

        public Criteria andEvalReplyNumIsNull() {
            addCriterion("eval_reply_num is null");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumIsNotNull() {
            addCriterion("eval_reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumEqualTo(Integer value) {
            addCriterion("eval_reply_num =", value, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumNotEqualTo(Integer value) {
            addCriterion("eval_reply_num <>", value, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumGreaterThan(Integer value) {
            addCriterion("eval_reply_num >", value, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("eval_reply_num >=", value, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumLessThan(Integer value) {
            addCriterion("eval_reply_num <", value, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("eval_reply_num <=", value, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumIn(List<Integer> values) {
            addCriterion("eval_reply_num in", values, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumNotIn(List<Integer> values) {
            addCriterion("eval_reply_num not in", values, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumBetween(Integer value1, Integer value2) {
            addCriterion("eval_reply_num between", value1, value2, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andEvalReplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("eval_reply_num not between", value1, value2, "evalReplyNum");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("sale_amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("sale_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(Double value) {
            addCriterion("sale_amount =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(Double value) {
            addCriterion("sale_amount <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(Double value) {
            addCriterion("sale_amount >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_amount >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(Double value) {
            addCriterion("sale_amount <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(Double value) {
            addCriterion("sale_amount <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<Double> values) {
            addCriterion("sale_amount in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<Double> values) {
            addCriterion("sale_amount not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(Double value1, Double value2) {
            addCriterion("sale_amount between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(Double value1, Double value2) {
            addCriterion("sale_amount not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumIsNull() {
            addCriterion("ordered_buyer_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumIsNotNull() {
            addCriterion("ordered_buyer_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumEqualTo(Integer value) {
            addCriterion("ordered_buyer_num =", value, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumNotEqualTo(Integer value) {
            addCriterion("ordered_buyer_num <>", value, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumGreaterThan(Integer value) {
            addCriterion("ordered_buyer_num >", value, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordered_buyer_num >=", value, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumLessThan(Integer value) {
            addCriterion("ordered_buyer_num <", value, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumLessThanOrEqualTo(Integer value) {
            addCriterion("ordered_buyer_num <=", value, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumIn(List<Integer> values) {
            addCriterion("ordered_buyer_num in", values, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumNotIn(List<Integer> values) {
            addCriterion("ordered_buyer_num not in", values, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumBetween(Integer value1, Integer value2) {
            addCriterion("ordered_buyer_num between", value1, value2, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedBuyerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ordered_buyer_num not between", value1, value2, "orderedBuyerNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumIsNull() {
            addCriterion("ordered_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderedNumIsNotNull() {
            addCriterion("ordered_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderedNumEqualTo(Integer value) {
            addCriterion("ordered_num =", value, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumNotEqualTo(Integer value) {
            addCriterion("ordered_num <>", value, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumGreaterThan(Integer value) {
            addCriterion("ordered_num >", value, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordered_num >=", value, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumLessThan(Integer value) {
            addCriterion("ordered_num <", value, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumLessThanOrEqualTo(Integer value) {
            addCriterion("ordered_num <=", value, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumIn(List<Integer> values) {
            addCriterion("ordered_num in", values, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumNotIn(List<Integer> values) {
            addCriterion("ordered_num not in", values, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumBetween(Integer value1, Integer value2) {
            addCriterion("ordered_num between", value1, value2, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andOrderedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ordered_num not between", value1, value2, "orderedNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumIsNull() {
            addCriterion("sale_order_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumIsNotNull() {
            addCriterion("sale_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumEqualTo(Integer value) {
            addCriterion("sale_order_num =", value, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumNotEqualTo(Integer value) {
            addCriterion("sale_order_num <>", value, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumGreaterThan(Integer value) {
            addCriterion("sale_order_num >", value, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_order_num >=", value, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumLessThan(Integer value) {
            addCriterion("sale_order_num <", value, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("sale_order_num <=", value, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumIn(List<Integer> values) {
            addCriterion("sale_order_num in", values, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumNotIn(List<Integer> values) {
            addCriterion("sale_order_num not in", values, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("sale_order_num between", value1, value2, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_order_num not between", value1, value2, "saleOrderNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumIsNull() {
            addCriterion("sale_buyer_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumIsNotNull() {
            addCriterion("sale_buyer_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumEqualTo(Integer value) {
            addCriterion("sale_buyer_num =", value, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumNotEqualTo(Integer value) {
            addCriterion("sale_buyer_num <>", value, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumGreaterThan(Integer value) {
            addCriterion("sale_buyer_num >", value, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_buyer_num >=", value, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumLessThan(Integer value) {
            addCriterion("sale_buyer_num <", value, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumLessThanOrEqualTo(Integer value) {
            addCriterion("sale_buyer_num <=", value, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumIn(List<Integer> values) {
            addCriterion("sale_buyer_num in", values, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumNotIn(List<Integer> values) {
            addCriterion("sale_buyer_num not in", values, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumBetween(Integer value1, Integer value2) {
            addCriterion("sale_buyer_num between", value1, value2, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andSaleBuyerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_buyer_num not between", value1, value2, "saleBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumIsNull() {
            addCriterion("enquiry_buyer_num is null");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumIsNotNull() {
            addCriterion("enquiry_buyer_num is not null");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumEqualTo(Integer value) {
            addCriterion("enquiry_buyer_num =", value, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumNotEqualTo(Integer value) {
            addCriterion("enquiry_buyer_num <>", value, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumGreaterThan(Integer value) {
            addCriterion("enquiry_buyer_num >", value, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("enquiry_buyer_num >=", value, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumLessThan(Integer value) {
            addCriterion("enquiry_buyer_num <", value, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumLessThanOrEqualTo(Integer value) {
            addCriterion("enquiry_buyer_num <=", value, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumIn(List<Integer> values) {
            addCriterion("enquiry_buyer_num in", values, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumNotIn(List<Integer> values) {
            addCriterion("enquiry_buyer_num not in", values, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumBetween(Integer value1, Integer value2) {
            addCriterion("enquiry_buyer_num between", value1, value2, "enquiryBuyerNum");
            return (Criteria) this;
        }

        public Criteria andEnquiryBuyerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("enquiry_buyer_num not between", value1, value2, "enquiryBuyerNum");
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