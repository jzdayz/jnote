package com.pes.jd.model.DO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PesJobCalRecord2019Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PesJobCalRecord2019Example() {
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

        public Criteria andCommonChatFlagIsNull() {
            addCriterion("common_chat_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagIsNotNull() {
            addCriterion("common_chat_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagEqualTo(Boolean value) {
            addCriterion("common_chat_flag =", value, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagNotEqualTo(Boolean value) {
            addCriterion("common_chat_flag <>", value, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagGreaterThan(Boolean value) {
            addCriterion("common_chat_flag >", value, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("common_chat_flag >=", value, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagLessThan(Boolean value) {
            addCriterion("common_chat_flag <", value, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("common_chat_flag <=", value, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagIn(List<Boolean> values) {
            addCriterion("common_chat_flag in", values, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagNotIn(List<Boolean> values) {
            addCriterion("common_chat_flag not in", values, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("common_chat_flag between", value1, value2, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andCommonChatFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("common_chat_flag not between", value1, value2, "commonChatFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagIsNull() {
            addCriterion("receive_quality_flag is null");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagIsNotNull() {
            addCriterion("receive_quality_flag is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagEqualTo(Boolean value) {
            addCriterion("receive_quality_flag =", value, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagNotEqualTo(Boolean value) {
            addCriterion("receive_quality_flag <>", value, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagGreaterThan(Boolean value) {
            addCriterion("receive_quality_flag >", value, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("receive_quality_flag >=", value, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagLessThan(Boolean value) {
            addCriterion("receive_quality_flag <", value, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("receive_quality_flag <=", value, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagIn(List<Boolean> values) {
            addCriterion("receive_quality_flag in", values, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagNotIn(List<Boolean> values) {
            addCriterion("receive_quality_flag not in", values, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("receive_quality_flag between", value1, value2, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andReceiveQualityFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("receive_quality_flag not between", value1, value2, "receiveQualityFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagIsNull() {
            addCriterion("cs_order_index_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagIsNotNull() {
            addCriterion("cs_order_index_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagEqualTo(Boolean value) {
            addCriterion("cs_order_index_flag =", value, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagNotEqualTo(Boolean value) {
            addCriterion("cs_order_index_flag <>", value, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagGreaterThan(Boolean value) {
            addCriterion("cs_order_index_flag >", value, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_index_flag >=", value, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagLessThan(Boolean value) {
            addCriterion("cs_order_index_flag <", value, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_index_flag <=", value, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagIn(List<Boolean> values) {
            addCriterion("cs_order_index_flag in", values, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagNotIn(List<Boolean> values) {
            addCriterion("cs_order_index_flag not in", values, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_index_flag between", value1, value2, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderIndexFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_index_flag not between", value1, value2, "csOrderIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagIsNull() {
            addCriterion("cs_order_bind_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagIsNotNull() {
            addCriterion("cs_order_bind_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagEqualTo(Boolean value) {
            addCriterion("cs_order_bind_flag =", value, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagNotEqualTo(Boolean value) {
            addCriterion("cs_order_bind_flag <>", value, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagGreaterThan(Boolean value) {
            addCriterion("cs_order_bind_flag >", value, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_bind_flag >=", value, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagLessThan(Boolean value) {
            addCriterion("cs_order_bind_flag <", value, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_bind_flag <=", value, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagIn(List<Boolean> values) {
            addCriterion("cs_order_bind_flag in", values, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagNotIn(List<Boolean> values) {
            addCriterion("cs_order_bind_flag not in", values, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_bind_flag between", value1, value2, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_bind_flag not between", value1, value2, "csOrderBindFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagIsNull() {
            addCriterion("enquiry_chat_flag is null");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagIsNotNull() {
            addCriterion("enquiry_chat_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagEqualTo(Boolean value) {
            addCriterion("enquiry_chat_flag =", value, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagNotEqualTo(Boolean value) {
            addCriterion("enquiry_chat_flag <>", value, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagGreaterThan(Boolean value) {
            addCriterion("enquiry_chat_flag >", value, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enquiry_chat_flag >=", value, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagLessThan(Boolean value) {
            addCriterion("enquiry_chat_flag <", value, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("enquiry_chat_flag <=", value, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagIn(List<Boolean> values) {
            addCriterion("enquiry_chat_flag in", values, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagNotIn(List<Boolean> values) {
            addCriterion("enquiry_chat_flag not in", values, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("enquiry_chat_flag between", value1, value2, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryChatFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enquiry_chat_flag not between", value1, value2, "enquiryChatFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagIsNull() {
            addCriterion("final_chat_data_flag is null");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagIsNotNull() {
            addCriterion("final_chat_data_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagEqualTo(Boolean value) {
            addCriterion("final_chat_data_flag =", value, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagNotEqualTo(Boolean value) {
            addCriterion("final_chat_data_flag <>", value, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagGreaterThan(Boolean value) {
            addCriterion("final_chat_data_flag >", value, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("final_chat_data_flag >=", value, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagLessThan(Boolean value) {
            addCriterion("final_chat_data_flag <", value, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("final_chat_data_flag <=", value, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagIn(List<Boolean> values) {
            addCriterion("final_chat_data_flag in", values, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagNotIn(List<Boolean> values) {
            addCriterion("final_chat_data_flag not in", values, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("final_chat_data_flag between", value1, value2, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andFinalChatDataFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("final_chat_data_flag not between", value1, value2, "finalChatDataFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagIsNull() {
            addCriterion("enquiry_loss_flag is null");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagIsNotNull() {
            addCriterion("enquiry_loss_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagEqualTo(Boolean value) {
            addCriterion("enquiry_loss_flag =", value, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagNotEqualTo(Boolean value) {
            addCriterion("enquiry_loss_flag <>", value, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagGreaterThan(Boolean value) {
            addCriterion("enquiry_loss_flag >", value, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enquiry_loss_flag >=", value, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagLessThan(Boolean value) {
            addCriterion("enquiry_loss_flag <", value, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("enquiry_loss_flag <=", value, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagIn(List<Boolean> values) {
            addCriterion("enquiry_loss_flag in", values, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagNotIn(List<Boolean> values) {
            addCriterion("enquiry_loss_flag not in", values, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("enquiry_loss_flag between", value1, value2, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andEnquiryLossFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enquiry_loss_flag not between", value1, value2, "enquiryLossFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagIsNull() {
            addCriterion("cs_performance_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagIsNotNull() {
            addCriterion("cs_performance_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagEqualTo(Boolean value) {
            addCriterion("cs_performance_flag =", value, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagNotEqualTo(Boolean value) {
            addCriterion("cs_performance_flag <>", value, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagGreaterThan(Boolean value) {
            addCriterion("cs_performance_flag >", value, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_performance_flag >=", value, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagLessThan(Boolean value) {
            addCriterion("cs_performance_flag <", value, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_performance_flag <=", value, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagIn(List<Boolean> values) {
            addCriterion("cs_performance_flag in", values, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagNotIn(List<Boolean> values) {
            addCriterion("cs_performance_flag not in", values, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_performance_flag between", value1, value2, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsPerformanceFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_performance_flag not between", value1, value2, "csPerformanceFlag");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceIsNull() {
            addCriterion("cs_torder_performance is null");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceIsNotNull() {
            addCriterion("cs_torder_performance is not null");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceEqualTo(Boolean value) {
            addCriterion("cs_torder_performance =", value, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceNotEqualTo(Boolean value) {
            addCriterion("cs_torder_performance <>", value, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceGreaterThan(Boolean value) {
            addCriterion("cs_torder_performance >", value, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_torder_performance >=", value, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceLessThan(Boolean value) {
            addCriterion("cs_torder_performance <", value, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_torder_performance <=", value, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceIn(List<Boolean> values) {
            addCriterion("cs_torder_performance in", values, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceNotIn(List<Boolean> values) {
            addCriterion("cs_torder_performance not in", values, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_torder_performance between", value1, value2, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andCsTorderPerformanceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_torder_performance not between", value1, value2, "csTorderPerformance");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagIsNull() {
            addCriterion("shop_day_overview_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagIsNotNull() {
            addCriterion("shop_day_overview_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagEqualTo(Boolean value) {
            addCriterion("shop_day_overview_flag =", value, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagNotEqualTo(Boolean value) {
            addCriterion("shop_day_overview_flag <>", value, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagGreaterThan(Boolean value) {
            addCriterion("shop_day_overview_flag >", value, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_day_overview_flag >=", value, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagLessThan(Boolean value) {
            addCriterion("shop_day_overview_flag <", value, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_day_overview_flag <=", value, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagIn(List<Boolean> values) {
            addCriterion("shop_day_overview_flag in", values, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagNotIn(List<Boolean> values) {
            addCriterion("shop_day_overview_flag not in", values, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_day_overview_flag between", value1, value2, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayOverviewFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_day_overview_flag not between", value1, value2, "shopDayOverviewFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagIsNull() {
            addCriterion("assit_index_flag is null");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagIsNotNull() {
            addCriterion("assit_index_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagEqualTo(Boolean value) {
            addCriterion("assit_index_flag =", value, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagNotEqualTo(Boolean value) {
            addCriterion("assit_index_flag <>", value, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagGreaterThan(Boolean value) {
            addCriterion("assit_index_flag >", value, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("assit_index_flag >=", value, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagLessThan(Boolean value) {
            addCriterion("assit_index_flag <", value, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("assit_index_flag <=", value, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagIn(List<Boolean> values) {
            addCriterion("assit_index_flag in", values, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagNotIn(List<Boolean> values) {
            addCriterion("assit_index_flag not in", values, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("assit_index_flag between", value1, value2, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andAssitIndexFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("assit_index_flag not between", value1, value2, "assitIndexFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagIsNull() {
            addCriterion("order_filte_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagIsNotNull() {
            addCriterion("order_filte_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagEqualTo(Boolean value) {
            addCriterion("order_filte_flag =", value, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagNotEqualTo(Boolean value) {
            addCriterion("order_filte_flag <>", value, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagGreaterThan(Boolean value) {
            addCriterion("order_filte_flag >", value, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_filte_flag >=", value, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagLessThan(Boolean value) {
            addCriterion("order_filte_flag <", value, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_filte_flag <=", value, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagIn(List<Boolean> values) {
            addCriterion("order_filte_flag in", values, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagNotIn(List<Boolean> values) {
            addCriterion("order_filte_flag not in", values, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_filte_flag between", value1, value2, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderFilteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_filte_flag not between", value1, value2, "orderFilteFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagIsNull() {
            addCriterion("order_loss_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagIsNotNull() {
            addCriterion("order_loss_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagEqualTo(Boolean value) {
            addCriterion("order_loss_flag =", value, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagNotEqualTo(Boolean value) {
            addCriterion("order_loss_flag <>", value, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagGreaterThan(Boolean value) {
            addCriterion("order_loss_flag >", value, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_loss_flag >=", value, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagLessThan(Boolean value) {
            addCriterion("order_loss_flag <", value, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("order_loss_flag <=", value, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagIn(List<Boolean> values) {
            addCriterion("order_loss_flag in", values, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagNotIn(List<Boolean> values) {
            addCriterion("order_loss_flag not in", values, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("order_loss_flag between", value1, value2, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOrderLossFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_loss_flag not between", value1, value2, "orderLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagIsNull() {
            addCriterion("outstock_loss_flag is null");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagIsNotNull() {
            addCriterion("outstock_loss_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagEqualTo(Boolean value) {
            addCriterion("outstock_loss_flag =", value, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagNotEqualTo(Boolean value) {
            addCriterion("outstock_loss_flag <>", value, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagGreaterThan(Boolean value) {
            addCriterion("outstock_loss_flag >", value, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("outstock_loss_flag >=", value, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagLessThan(Boolean value) {
            addCriterion("outstock_loss_flag <", value, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("outstock_loss_flag <=", value, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagIn(List<Boolean> values) {
            addCriterion("outstock_loss_flag in", values, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagNotIn(List<Boolean> values) {
            addCriterion("outstock_loss_flag not in", values, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("outstock_loss_flag between", value1, value2, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andOutstockLossFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("outstock_loss_flag not between", value1, value2, "outstockLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagIsNull() {
            addCriterion("team_loss_flag is null");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagIsNotNull() {
            addCriterion("team_loss_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagEqualTo(Boolean value) {
            addCriterion("team_loss_flag =", value, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagNotEqualTo(Boolean value) {
            addCriterion("team_loss_flag <>", value, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagGreaterThan(Boolean value) {
            addCriterion("team_loss_flag >", value, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("team_loss_flag >=", value, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagLessThan(Boolean value) {
            addCriterion("team_loss_flag <", value, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("team_loss_flag <=", value, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagIn(List<Boolean> values) {
            addCriterion("team_loss_flag in", values, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagNotIn(List<Boolean> values) {
            addCriterion("team_loss_flag not in", values, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("team_loss_flag between", value1, value2, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andTeamLossFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("team_loss_flag not between", value1, value2, "teamLossFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagIsNull() {
            addCriterion("cs_order_eval_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagIsNotNull() {
            addCriterion("cs_order_eval_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagEqualTo(Boolean value) {
            addCriterion("cs_order_eval_flag =", value, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagNotEqualTo(Boolean value) {
            addCriterion("cs_order_eval_flag <>", value, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagGreaterThan(Boolean value) {
            addCriterion("cs_order_eval_flag >", value, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_eval_flag >=", value, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagLessThan(Boolean value) {
            addCriterion("cs_order_eval_flag <", value, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_eval_flag <=", value, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagIn(List<Boolean> values) {
            addCriterion("cs_order_eval_flag in", values, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagNotIn(List<Boolean> values) {
            addCriterion("cs_order_eval_flag not in", values, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_eval_flag between", value1, value2, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderEvalFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_eval_flag not between", value1, value2, "csOrderEvalFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagIsNull() {
            addCriterion("cs_order_bind_index_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagIsNotNull() {
            addCriterion("cs_order_bind_index_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagEqualTo(Boolean value) {
            addCriterion("cs_order_bind_index_flag =", value, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagNotEqualTo(Boolean value) {
            addCriterion("cs_order_bind_index_flag <>", value, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagGreaterThan(Boolean value) {
            addCriterion("cs_order_bind_index_flag >", value, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_bind_index_flag >=", value, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagLessThan(Boolean value) {
            addCriterion("cs_order_bind_index_flag <", value, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_order_bind_index_flag <=", value, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagIn(List<Boolean> values) {
            addCriterion("cs_order_bind_index_flag in", values, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagNotIn(List<Boolean> values) {
            addCriterion("cs_order_bind_index_flag not in", values, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_bind_index_flag between", value1, value2, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsOrderBindIndexFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_order_bind_index_flag not between", value1, value2, "csOrderBindIndexFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagIsNull() {
            addCriterion("cs_goods_handle_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagIsNotNull() {
            addCriterion("cs_goods_handle_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagEqualTo(Boolean value) {
            addCriterion("cs_goods_handle_flag =", value, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagNotEqualTo(Boolean value) {
            addCriterion("cs_goods_handle_flag <>", value, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagGreaterThan(Boolean value) {
            addCriterion("cs_goods_handle_flag >", value, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_goods_handle_flag >=", value, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagLessThan(Boolean value) {
            addCriterion("cs_goods_handle_flag <", value, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_goods_handle_flag <=", value, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagIn(List<Boolean> values) {
            addCriterion("cs_goods_handle_flag in", values, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagNotIn(List<Boolean> values) {
            addCriterion("cs_goods_handle_flag not in", values, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_goods_handle_flag between", value1, value2, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsHandleFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_goods_handle_flag not between", value1, value2, "csGoodsHandleFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagIsNull() {
            addCriterion("cs_goods_sum_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagIsNotNull() {
            addCriterion("cs_goods_sum_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagEqualTo(Boolean value) {
            addCriterion("cs_goods_sum_flag =", value, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagNotEqualTo(Boolean value) {
            addCriterion("cs_goods_sum_flag <>", value, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagGreaterThan(Boolean value) {
            addCriterion("cs_goods_sum_flag >", value, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_goods_sum_flag >=", value, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagLessThan(Boolean value) {
            addCriterion("cs_goods_sum_flag <", value, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_goods_sum_flag <=", value, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagIn(List<Boolean> values) {
            addCriterion("cs_goods_sum_flag in", values, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagNotIn(List<Boolean> values) {
            addCriterion("cs_goods_sum_flag not in", values, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_goods_sum_flag between", value1, value2, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsGoodsSumFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_goods_sum_flag not between", value1, value2, "csGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagIsNull() {
            addCriterion("cs_slient_sale_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagIsNotNull() {
            addCriterion("cs_slient_sale_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagEqualTo(Boolean value) {
            addCriterion("cs_slient_sale_flag =", value, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagNotEqualTo(Boolean value) {
            addCriterion("cs_slient_sale_flag <>", value, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagGreaterThan(Boolean value) {
            addCriterion("cs_slient_sale_flag >", value, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_slient_sale_flag >=", value, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagLessThan(Boolean value) {
            addCriterion("cs_slient_sale_flag <", value, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_slient_sale_flag <=", value, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagIn(List<Boolean> values) {
            addCriterion("cs_slient_sale_flag in", values, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagNotIn(List<Boolean> values) {
            addCriterion("cs_slient_sale_flag not in", values, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_slient_sale_flag between", value1, value2, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSlientSaleFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_slient_sale_flag not between", value1, value2, "csSlientSaleFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagIsNull() {
            addCriterion("cs_silent_goods_sum_flag is null");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagIsNotNull() {
            addCriterion("cs_silent_goods_sum_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagEqualTo(Boolean value) {
            addCriterion("cs_silent_goods_sum_flag =", value, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagNotEqualTo(Boolean value) {
            addCriterion("cs_silent_goods_sum_flag <>", value, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagGreaterThan(Boolean value) {
            addCriterion("cs_silent_goods_sum_flag >", value, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cs_silent_goods_sum_flag >=", value, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagLessThan(Boolean value) {
            addCriterion("cs_silent_goods_sum_flag <", value, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("cs_silent_goods_sum_flag <=", value, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagIn(List<Boolean> values) {
            addCriterion("cs_silent_goods_sum_flag in", values, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagNotIn(List<Boolean> values) {
            addCriterion("cs_silent_goods_sum_flag not in", values, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_silent_goods_sum_flag between", value1, value2, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andCsSilentGoodsSumFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cs_silent_goods_sum_flag not between", value1, value2, "csSilentGoodsSumFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagIsNull() {
            addCriterion("team_day_refund_flag is null");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagIsNotNull() {
            addCriterion("team_day_refund_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagEqualTo(Boolean value) {
            addCriterion("team_day_refund_flag =", value, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagNotEqualTo(Boolean value) {
            addCriterion("team_day_refund_flag <>", value, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagGreaterThan(Boolean value) {
            addCriterion("team_day_refund_flag >", value, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("team_day_refund_flag >=", value, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagLessThan(Boolean value) {
            addCriterion("team_day_refund_flag <", value, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("team_day_refund_flag <=", value, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagIn(List<Boolean> values) {
            addCriterion("team_day_refund_flag in", values, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagNotIn(List<Boolean> values) {
            addCriterion("team_day_refund_flag not in", values, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("team_day_refund_flag between", value1, value2, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andTeamDayRefundFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("team_day_refund_flag not between", value1, value2, "teamDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagIsNull() {
            addCriterion("shop_day_refund_flag is null");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagIsNotNull() {
            addCriterion("shop_day_refund_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagEqualTo(Boolean value) {
            addCriterion("shop_day_refund_flag =", value, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagNotEqualTo(Boolean value) {
            addCriterion("shop_day_refund_flag <>", value, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagGreaterThan(Boolean value) {
            addCriterion("shop_day_refund_flag >", value, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shop_day_refund_flag >=", value, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagLessThan(Boolean value) {
            addCriterion("shop_day_refund_flag <", value, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("shop_day_refund_flag <=", value, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagIn(List<Boolean> values) {
            addCriterion("shop_day_refund_flag in", values, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagNotIn(List<Boolean> values) {
            addCriterion("shop_day_refund_flag not in", values, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_day_refund_flag between", value1, value2, "shopDayRefundFlag");
            return (Criteria) this;
        }

        public Criteria andShopDayRefundFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shop_day_refund_flag not between", value1, value2, "shopDayRefundFlag");
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