package com.pes.jd.model.DO;

import java.util.ArrayList;
import java.util.List;

public class PesMenuResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PesMenuResourceExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Boolean value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Boolean value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Boolean value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Boolean value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Boolean> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Boolean> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataIsNull() {
            addCriterion("is_personal_data is null");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataIsNotNull() {
            addCriterion("is_personal_data is not null");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataEqualTo(Boolean value) {
            addCriterion("is_personal_data =", value, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataNotEqualTo(Boolean value) {
            addCriterion("is_personal_data <>", value, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataGreaterThan(Boolean value) {
            addCriterion("is_personal_data >", value, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_personal_data >=", value, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataLessThan(Boolean value) {
            addCriterion("is_personal_data <", value, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataLessThanOrEqualTo(Boolean value) {
            addCriterion("is_personal_data <=", value, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataIn(List<Boolean> values) {
            addCriterion("is_personal_data in", values, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataNotIn(List<Boolean> values) {
            addCriterion("is_personal_data not in", values, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataBetween(Boolean value1, Boolean value2) {
            addCriterion("is_personal_data between", value1, value2, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsPersonalDataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_personal_data not between", value1, value2, "isPersonalData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataIsNull() {
            addCriterion("is_cs_team_data is null");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataIsNotNull() {
            addCriterion("is_cs_team_data is not null");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataEqualTo(Boolean value) {
            addCriterion("is_cs_team_data =", value, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataNotEqualTo(Boolean value) {
            addCriterion("is_cs_team_data <>", value, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataGreaterThan(Boolean value) {
            addCriterion("is_cs_team_data >", value, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cs_team_data >=", value, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataLessThan(Boolean value) {
            addCriterion("is_cs_team_data <", value, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cs_team_data <=", value, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataIn(List<Boolean> values) {
            addCriterion("is_cs_team_data in", values, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataNotIn(List<Boolean> values) {
            addCriterion("is_cs_team_data not in", values, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cs_team_data between", value1, value2, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsCsTeamDataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cs_team_data not between", value1, value2, "isCsTeamData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataIsNull() {
            addCriterion("is_shop_data is null");
            return (Criteria) this;
        }

        public Criteria andIsShopDataIsNotNull() {
            addCriterion("is_shop_data is not null");
            return (Criteria) this;
        }

        public Criteria andIsShopDataEqualTo(Boolean value) {
            addCriterion("is_shop_data =", value, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataNotEqualTo(Boolean value) {
            addCriterion("is_shop_data <>", value, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataGreaterThan(Boolean value) {
            addCriterion("is_shop_data >", value, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_shop_data >=", value, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataLessThan(Boolean value) {
            addCriterion("is_shop_data <", value, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataLessThanOrEqualTo(Boolean value) {
            addCriterion("is_shop_data <=", value, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataIn(List<Boolean> values) {
            addCriterion("is_shop_data in", values, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataNotIn(List<Boolean> values) {
            addCriterion("is_shop_data not in", values, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shop_data between", value1, value2, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopDataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shop_data not between", value1, value2, "isShopData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataIsNull() {
            addCriterion("is_shop_multiple_data is null");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataIsNotNull() {
            addCriterion("is_shop_multiple_data is not null");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataEqualTo(Boolean value) {
            addCriterion("is_shop_multiple_data =", value, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataNotEqualTo(Boolean value) {
            addCriterion("is_shop_multiple_data <>", value, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataGreaterThan(Boolean value) {
            addCriterion("is_shop_multiple_data >", value, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_shop_multiple_data >=", value, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataLessThan(Boolean value) {
            addCriterion("is_shop_multiple_data <", value, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataLessThanOrEqualTo(Boolean value) {
            addCriterion("is_shop_multiple_data <=", value, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataIn(List<Boolean> values) {
            addCriterion("is_shop_multiple_data in", values, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataNotIn(List<Boolean> values) {
            addCriterion("is_shop_multiple_data not in", values, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shop_multiple_data between", value1, value2, "isShopMultipleData");
            return (Criteria) this;
        }

        public Criteria andIsShopMultipleDataNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_shop_multiple_data not between", value1, value2, "isShopMultipleData");
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

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
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