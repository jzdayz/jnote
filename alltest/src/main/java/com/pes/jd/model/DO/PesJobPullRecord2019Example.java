package com.pes.jd.model.DO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PesJobPullRecord2019Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PesJobPullRecord2019Example() {
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

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Boolean value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Boolean value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Boolean value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Boolean value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Boolean value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Boolean> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Boolean> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Boolean value1, Boolean value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagIsNull() {
            addCriterion("chat_peer_flag is null");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagIsNotNull() {
            addCriterion("chat_peer_flag is not null");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagEqualTo(Boolean value) {
            addCriterion("chat_peer_flag =", value, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagNotEqualTo(Boolean value) {
            addCriterion("chat_peer_flag <>", value, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagGreaterThan(Boolean value) {
            addCriterion("chat_peer_flag >", value, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("chat_peer_flag >=", value, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagLessThan(Boolean value) {
            addCriterion("chat_peer_flag <", value, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("chat_peer_flag <=", value, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagIn(List<Boolean> values) {
            addCriterion("chat_peer_flag in", values, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagNotIn(List<Boolean> values) {
            addCriterion("chat_peer_flag not in", values, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("chat_peer_flag between", value1, value2, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andChatPeerFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("chat_peer_flag not between", value1, value2, "chatPeerFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagIsNull() {
            addCriterion("shop_category_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagIsNotNull() {
            addCriterion("shop_category_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagEqualTo(Boolean value) {
            addCriterion("shop_category_flag =", value, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagNotEqualTo(Boolean value) {
            addCriterion("shop_category_flag <>", value, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagGreaterThan(Boolean value) {
            addCriterion("shop_category_flag >", value, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_category_flag >=", value, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagLessThan(Boolean value) {
            addCriterion("shop_category_flag <", value, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_category_flag <=", value, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagIn(List<Boolean> values) {
            addCriterion("shop_category_flag in", values, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagNotIn(List<Boolean> values) {
            addCriterion("shop_category_flag not in", values, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_category_flag between", value1, value2, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopCategoryFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_category_flag not between", value1, value2, "shopCategoryFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagIsNull() {
            addCriterion("shop_sku_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagIsNotNull() {
            addCriterion("shop_sku_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagEqualTo(Boolean value) {
            addCriterion("shop_sku_flag =", value, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagNotEqualTo(Boolean value) {
            addCriterion("shop_sku_flag <>", value, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagGreaterThan(Boolean value) {
            addCriterion("shop_sku_flag >", value, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_sku_flag >=", value, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagLessThan(Boolean value) {
            addCriterion("shop_sku_flag <", value, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_sku_flag <=", value, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagIn(List<Boolean> values) {
            addCriterion("shop_sku_flag in", values, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagNotIn(List<Boolean> values) {
            addCriterion("shop_sku_flag not in", values, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_sku_flag between", value1, value2, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopSkuFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_sku_flag not between", value1, value2, "shopSkuFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagIsNull() {
            addCriterion("shop_good_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagIsNotNull() {
            addCriterion("shop_good_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagEqualTo(Boolean value) {
            addCriterion("shop_good_flag =", value, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagNotEqualTo(Boolean value) {
            addCriterion("shop_good_flag <>", value, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagGreaterThan(Boolean value) {
            addCriterion("shop_good_flag >", value, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_good_flag >=", value, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagLessThan(Boolean value) {
            addCriterion("shop_good_flag <", value, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_good_flag <=", value, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagIn(List<Boolean> values) {
            addCriterion("shop_good_flag in", values, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagNotIn(List<Boolean> values) {
            addCriterion("shop_good_flag not in", values, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_good_flag between", value1, value2, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopGoodFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_good_flag not between", value1, value2, "shopGoodFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagIsNull() {
            addCriterion("shop_dsr_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagIsNotNull() {
            addCriterion("shop_dsr_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagEqualTo(Boolean value) {
            addCriterion("shop_dsr_flag =", value, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagNotEqualTo(Boolean value) {
            addCriterion("shop_dsr_flag <>", value, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagGreaterThan(Boolean value) {
            addCriterion("shop_dsr_flag >", value, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_dsr_flag >=", value, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagLessThan(Boolean value) {
            addCriterion("shop_dsr_flag <", value, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_dsr_flag <=", value, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagIn(List<Boolean> values) {
            addCriterion("shop_dsr_flag in", values, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagNotIn(List<Boolean> values) {
            addCriterion("shop_dsr_flag not in", values, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_dsr_flag between", value1, value2, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andShopDsrFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_dsr_flag not between", value1, value2, "shopDsrFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagIsNull() {
            addCriterion("no_pay_order_flag is null");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagIsNotNull() {
            addCriterion("no_pay_order_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagEqualTo(Boolean value) {
            addCriterion("no_pay_order_flag =", value, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagNotEqualTo(Boolean value) {
            addCriterion("no_pay_order_flag <>", value, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagGreaterThan(Boolean value) {
            addCriterion("no_pay_order_flag >", value, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("no_pay_order_flag >=", value, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagLessThan(Boolean value) {
            addCriterion("no_pay_order_flag <", value, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("no_pay_order_flag <=", value, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagIn(List<Boolean> values) {
            addCriterion("no_pay_order_flag in", values, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagNotIn(List<Boolean> values) {
            addCriterion("no_pay_order_flag not in", values, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("no_pay_order_flag between", value1, value2, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andNoPayOrderFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("no_pay_order_flag not between", value1, value2, "noPayOrderFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagIsNull() {
            addCriterion("order_created_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagIsNotNull() {
            addCriterion("order_created_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagEqualTo(Boolean value) {
            addCriterion("order_created_flag =", value, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagNotEqualTo(Boolean value) {
            addCriterion("order_created_flag <>", value, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagGreaterThan(Boolean value) {
            addCriterion("order_created_flag >", value, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_created_flag >=", value, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagLessThan(Boolean value) {
            addCriterion("order_created_flag <", value, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_created_flag <=", value, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagIn(List<Boolean> values) {
            addCriterion("order_created_flag in", values, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagNotIn(List<Boolean> values) {
            addCriterion("order_created_flag not in", values, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_created_flag between", value1, value2, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_created_flag not between", value1, value2, "orderCreatedFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagIsNull() {
            addCriterion("order_modify_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagIsNotNull() {
            addCriterion("order_modify_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagEqualTo(Boolean value) {
            addCriterion("order_modify_flag =", value, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagNotEqualTo(Boolean value) {
            addCriterion("order_modify_flag <>", value, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagGreaterThan(Boolean value) {
            addCriterion("order_modify_flag >", value, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_modify_flag >=", value, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagLessThan(Boolean value) {
            addCriterion("order_modify_flag <", value, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_modify_flag <=", value, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagIn(List<Boolean> values) {
            addCriterion("order_modify_flag in", values, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagNotIn(List<Boolean> values) {
            addCriterion("order_modify_flag not in", values, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_modify_flag between", value1, value2, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderModifyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_modify_flag not between", value1, value2, "orderModifyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagIsNull() {
            addCriterion("order_presale_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagIsNotNull() {
            addCriterion("order_presale_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagEqualTo(Boolean value) {
            addCriterion("order_presale_flag =", value, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagNotEqualTo(Boolean value) {
            addCriterion("order_presale_flag <>", value, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagGreaterThan(Boolean value) {
            addCriterion("order_presale_flag >", value, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_presale_flag >=", value, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagLessThan(Boolean value) {
            addCriterion("order_presale_flag <", value, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_presale_flag <=", value, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagIn(List<Boolean> values) {
            addCriterion("order_presale_flag in", values, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagNotIn(List<Boolean> values) {
            addCriterion("order_presale_flag not in", values, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_presale_flag between", value1, value2, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderPresaleFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_presale_flag not between", value1, value2, "orderPresaleFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagIsNull() {
            addCriterion("order_evaluation_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagIsNotNull() {
            addCriterion("order_evaluation_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagEqualTo(Boolean value) {
            addCriterion("order_evaluation_flag =", value, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagNotEqualTo(Boolean value) {
            addCriterion("order_evaluation_flag <>", value, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagGreaterThan(Boolean value) {
            addCriterion("order_evaluation_flag >", value, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_evaluation_flag >=", value, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagLessThan(Boolean value) {
            addCriterion("order_evaluation_flag <", value, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_evaluation_flag <=", value, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagIn(List<Boolean> values) {
            addCriterion("order_evaluation_flag in", values, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagNotIn(List<Boolean> values) {
            addCriterion("order_evaluation_flag not in", values, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_evaluation_flag between", value1, value2, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andOrderEvaluationFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_evaluation_flag not between", value1, value2, "orderEvaluationFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagIsNull() {
            addCriterion("shop_pv_uv_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagIsNotNull() {
            addCriterion("shop_pv_uv_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagEqualTo(Boolean value) {
            addCriterion("shop_pv_uv_flag =", value, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagNotEqualTo(Boolean value) {
            addCriterion("shop_pv_uv_flag <>", value, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagGreaterThan(Boolean value) {
            addCriterion("shop_pv_uv_flag >", value, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_pv_uv_flag >=", value, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagLessThan(Boolean value) {
            addCriterion("shop_pv_uv_flag <", value, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_pv_uv_flag <=", value, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagIn(List<Boolean> values) {
            addCriterion("shop_pv_uv_flag in", values, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagNotIn(List<Boolean> values) {
            addCriterion("shop_pv_uv_flag not in", values, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_pv_uv_flag between", value1, value2, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andShopPvUvFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_pv_uv_flag not between", value1, value2, "shopPvUvFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagIsNull() {
            addCriterion("order_refund_apply_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagIsNotNull() {
            addCriterion("order_refund_apply_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagEqualTo(Boolean value) {
            addCriterion("order_refund_apply_flag =", value, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagNotEqualTo(Boolean value) {
            addCriterion("order_refund_apply_flag <>", value, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagGreaterThan(Boolean value) {
            addCriterion("order_refund_apply_flag >", value, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_refund_apply_flag >=", value, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagLessThan(Boolean value) {
            addCriterion("order_refund_apply_flag <", value, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_refund_apply_flag <=", value, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagIn(List<Boolean> values) {
            addCriterion("order_refund_apply_flag in", values, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagNotIn(List<Boolean> values) {
            addCriterion("order_refund_apply_flag not in", values, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_refund_apply_flag between", value1, value2, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundApplyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_refund_apply_flag not between", value1, value2, "orderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagIsNull() {
            addCriterion("order_refund_check_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagIsNotNull() {
            addCriterion("order_refund_check_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagEqualTo(Boolean value) {
            addCriterion("order_refund_check_flag =", value, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagNotEqualTo(Boolean value) {
            addCriterion("order_refund_check_flag <>", value, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagGreaterThan(Boolean value) {
            addCriterion("order_refund_check_flag >", value, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_refund_check_flag >=", value, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagLessThan(Boolean value) {
            addCriterion("order_refund_check_flag <", value, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_refund_check_flag <=", value, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagIn(List<Boolean> values) {
            addCriterion("order_refund_check_flag in", values, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagNotIn(List<Boolean> values) {
            addCriterion("order_refund_check_flag not in", values, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_refund_check_flag between", value1, value2, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRefundCheckFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_refund_check_flag not between", value1, value2, "orderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagIsNull() {
            addCriterion("asc_order_refund_apply_flag is null");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagIsNotNull() {
            addCriterion("asc_order_refund_apply_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagEqualTo(Boolean value) {
            addCriterion("asc_order_refund_apply_flag =", value, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagNotEqualTo(Boolean value) {
            addCriterion("asc_order_refund_apply_flag <>", value, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagGreaterThan(Boolean value) {
            addCriterion("asc_order_refund_apply_flag >", value, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("asc_order_refund_apply_flag >=", value, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagLessThan(Boolean value) {
            addCriterion("asc_order_refund_apply_flag <", value, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("asc_order_refund_apply_flag <=", value, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagIn(List<Boolean> values) {
            addCriterion("asc_order_refund_apply_flag in", values, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagNotIn(List<Boolean> values) {
            addCriterion("asc_order_refund_apply_flag not in", values, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("asc_order_refund_apply_flag between", value1, value2, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundApplyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("asc_order_refund_apply_flag not between", value1, value2, "ascOrderRefundApplyFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagIsNull() {
            addCriterion("asc_order_refund_check_flag is null");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagIsNotNull() {
            addCriterion("asc_order_refund_check_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagEqualTo(Boolean value) {
            addCriterion("asc_order_refund_check_flag =", value, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagNotEqualTo(Boolean value) {
            addCriterion("asc_order_refund_check_flag <>", value, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagGreaterThan(Boolean value) {
            addCriterion("asc_order_refund_check_flag >", value, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("asc_order_refund_check_flag >=", value, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagLessThan(Boolean value) {
            addCriterion("asc_order_refund_check_flag <", value, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("asc_order_refund_check_flag <=", value, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagIn(List<Boolean> values) {
            addCriterion("asc_order_refund_check_flag in", values, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagNotIn(List<Boolean> values) {
            addCriterion("asc_order_refund_check_flag not in", values, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("asc_order_refund_check_flag between", value1, value2, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andAscOrderRefundCheckFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("asc_order_refund_check_flag not between", value1, value2, "ascOrderRefundCheckFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagIsNull() {
            addCriterion("leave_msg_flag is null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagIsNotNull() {
            addCriterion("leave_msg_flag is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagEqualTo(Boolean value) {
            addCriterion("leave_msg_flag =", value, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagNotEqualTo(Boolean value) {
            addCriterion("leave_msg_flag <>", value, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagGreaterThan(Boolean value) {
            addCriterion("leave_msg_flag >", value, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("leave_msg_flag >=", value, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagLessThan(Boolean value) {
            addCriterion("leave_msg_flag <", value, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("leave_msg_flag <=", value, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagIn(List<Boolean> values) {
            addCriterion("leave_msg_flag in", values, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagNotIn(List<Boolean> values) {
            addCriterion("leave_msg_flag not in", values, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("leave_msg_flag between", value1, value2, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveMsgFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("leave_msg_flag not between", value1, value2, "leaveMsgFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagIsNull() {
            addCriterion("cs_send_eval_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagIsNotNull() {
            addCriterion("cs_send_eval_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagEqualTo(Boolean value) {
            addCriterion("cs_send_eval_flag =", value, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagNotEqualTo(Boolean value) {
            addCriterion("cs_send_eval_flag <>", value, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagGreaterThan(Boolean value) {
            addCriterion("cs_send_eval_flag >", value, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_send_eval_flag >=", value, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagLessThan(Boolean value) {
            addCriterion("cs_send_eval_flag <", value, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_send_eval_flag <=", value, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagIn(List<Boolean> values) {
            addCriterion("cs_send_eval_flag in", values, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagNotIn(List<Boolean> values) {
            addCriterion("cs_send_eval_flag not in", values, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_send_eval_flag between", value1, value2, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsSendEvalFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_send_eval_flag not between", value1, value2, "csSendEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagIsNull() {
            addCriterion("update_cs_eval_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagIsNotNull() {
            addCriterion("update_cs_eval_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagEqualTo(Boolean value) {
            addCriterion("update_cs_eval_flag =", value, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagNotEqualTo(Boolean value) {
            addCriterion("update_cs_eval_flag <>", value, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagGreaterThan(Boolean value) {
            addCriterion("update_cs_eval_flag >", value, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("update_cs_eval_flag >=", value, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagLessThan(Boolean value) {
            addCriterion("update_cs_eval_flag <", value, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("update_cs_eval_flag <=", value, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagIn(List<Boolean> values) {
            addCriterion("update_cs_eval_flag in", values, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagNotIn(List<Boolean> values) {
            addCriterion("update_cs_eval_flag not in", values, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("update_cs_eval_flag between", value1, value2, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateCsEvalFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("update_cs_eval_flag not between", value1, value2, "updateCsEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagIsNull() {
            addCriterion("cs_eval_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagIsNotNull() {
            addCriterion("cs_eval_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagEqualTo(Boolean value) {
            addCriterion("cs_eval_flag =", value, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagNotEqualTo(Boolean value) {
            addCriterion("cs_eval_flag <>", value, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagGreaterThan(Boolean value) {
            addCriterion("cs_eval_flag >", value, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_eval_flag >=", value, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagLessThan(Boolean value) {
            addCriterion("cs_eval_flag <", value, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_eval_flag <=", value, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagIn(List<Boolean> values) {
            addCriterion("cs_eval_flag in", values, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagNotIn(List<Boolean> values) {
            addCriterion("cs_eval_flag not in", values, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_eval_flag between", value1, value2, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsEvalFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_eval_flag not between", value1, value2, "csEvalFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagIsNull() {
            addCriterion("order_remark_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagIsNotNull() {
            addCriterion("order_remark_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagEqualTo(Boolean value) {
            addCriterion("order_remark_flag =", value, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagNotEqualTo(Boolean value) {
            addCriterion("order_remark_flag <>", value, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagGreaterThan(Boolean value) {
            addCriterion("order_remark_flag >", value, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_remark_flag >=", value, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagLessThan(Boolean value) {
            addCriterion("order_remark_flag <", value, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_remark_flag <=", value, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagIn(List<Boolean> values) {
            addCriterion("order_remark_flag in", values, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagNotIn(List<Boolean> values) {
            addCriterion("order_remark_flag not in", values, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_remark_flag between", value1, value2, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_remark_flag not between", value1, value2, "orderRemarkFlag");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNull() {
            addCriterion("modified is null");
            return (Criteria) this;
        }

        public Criteria andModifiedIsNotNull() {
            addCriterion("modified is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedEqualTo(Date value) {
            addCriterion("modified =", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotEqualTo(Date value) {
            addCriterion("modified <>", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThan(Date value) {
            addCriterion("modified >", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("modified >=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThan(Date value) {
            addCriterion("modified <", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedLessThanOrEqualTo(Date value) {
            addCriterion("modified <=", value, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedIn(List<Date> values) {
            addCriterion("modified in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotIn(List<Date> values) {
            addCriterion("modified not in", values, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedBetween(Date value1, Date value2) {
            addCriterion("modified between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andModifiedNotBetween(Date value1, Date value2) {
            addCriterion("modified not between", value1, value2, "modified");
            return (Criteria) this;
        }

        public Criteria andMsgIsNull() {
            addCriterion("msg is null");
            return (Criteria) this;
        }

        public Criteria andMsgIsNotNull() {
            addCriterion("msg is not null");
            return (Criteria) this;
        }

        public Criteria andMsgEqualTo(String value) {
            addCriterion("msg =", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotEqualTo(String value) {
            addCriterion("msg <>", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThan(String value) {
            addCriterion("msg >", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgGreaterThanOrEqualTo(String value) {
            addCriterion("msg >=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThan(String value) {
            addCriterion("msg <", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLessThanOrEqualTo(String value) {
            addCriterion("msg <=", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgLike(String value) {
            addCriterion("msg like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotLike(String value) {
            addCriterion("msg not like", value, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgIn(List<String> values) {
            addCriterion("msg in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotIn(List<String> values) {
            addCriterion("msg not in", values, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgBetween(String value1, String value2) {
            addCriterion("msg between", value1, value2, "msg");
            return (Criteria) this;
        }

        public Criteria andMsgNotBetween(String value1, String value2) {
            addCriterion("msg not between", value1, value2, "msg");
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