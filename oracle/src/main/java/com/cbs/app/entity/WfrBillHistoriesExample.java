package com.cbs.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WfrBillHistoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfrBillHistoriesExample() {
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

        public Criteria andWfHistoriesIdIsNull() {
            addCriterion("WF_HISTORIES_ID is null");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdIsNotNull() {
            addCriterion("WF_HISTORIES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdEqualTo(Long value) {
            addCriterion("WF_HISTORIES_ID =", value, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdNotEqualTo(Long value) {
            addCriterion("WF_HISTORIES_ID <>", value, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdGreaterThan(Long value) {
            addCriterion("WF_HISTORIES_ID >", value, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WF_HISTORIES_ID >=", value, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdLessThan(Long value) {
            addCriterion("WF_HISTORIES_ID <", value, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdLessThanOrEqualTo(Long value) {
            addCriterion("WF_HISTORIES_ID <=", value, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdIn(List<Long> values) {
            addCriterion("WF_HISTORIES_ID in", values, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdNotIn(List<Long> values) {
            addCriterion("WF_HISTORIES_ID not in", values, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdBetween(Long value1, Long value2) {
            addCriterion("WF_HISTORIES_ID between", value1, value2, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andWfHistoriesIdNotBetween(Long value1, Long value2) {
            addCriterion("WF_HISTORIES_ID not between", value1, value2, "wfHistoriesId");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNull() {
            addCriterion("LAST_UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIsNotNull() {
            addCriterion("LAST_UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY =", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY <>", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThan(Long value) {
            addCriterion("LAST_UPDATED_BY >", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY >=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThan(Long value) {
            addCriterion("LAST_UPDATED_BY <", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("LAST_UPDATED_BY <=", value, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByIn(List<Long> values) {
            addCriterion("LAST_UPDATED_BY in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotIn(List<Long> values) {
            addCriterion("LAST_UPDATED_BY not in", values, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByBetween(Long value1, Long value2) {
            addCriterion("LAST_UPDATED_BY between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("LAST_UPDATED_BY not between", value1, value2, "lastUpdatedBy");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("CREATION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("CREATION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("CREATION_DATE =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("CREATION_DATE <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("CREATION_DATE >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("CREATION_DATE <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_DATE <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("CREATION_DATE in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("CREATION_DATE not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_DATE not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginIsNull() {
            addCriterion("LAST_UPDATE_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginIsNotNull() {
            addCriterion("LAST_UPDATE_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginEqualTo(Long value) {
            addCriterion("LAST_UPDATE_LOGIN =", value, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginNotEqualTo(Long value) {
            addCriterion("LAST_UPDATE_LOGIN <>", value, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginGreaterThan(Long value) {
            addCriterion("LAST_UPDATE_LOGIN >", value, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_UPDATE_LOGIN >=", value, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginLessThan(Long value) {
            addCriterion("LAST_UPDATE_LOGIN <", value, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginLessThanOrEqualTo(Long value) {
            addCriterion("LAST_UPDATE_LOGIN <=", value, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginIn(List<Long> values) {
            addCriterion("LAST_UPDATE_LOGIN in", values, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginNotIn(List<Long> values) {
            addCriterion("LAST_UPDATE_LOGIN not in", values, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginBetween(Long value1, Long value2) {
            addCriterion("LAST_UPDATE_LOGIN between", value1, value2, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLoginNotBetween(Long value1, Long value2) {
            addCriterion("LAST_UPDATE_LOGIN not between", value1, value2, "lastUpdateLogin");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIsNull() {
            addCriterion("ENABLED_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIsNotNull() {
            addCriterion("ENABLED_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagEqualTo(String value) {
            addCriterion("ENABLED_FLAG =", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotEqualTo(String value) {
            addCriterion("ENABLED_FLAG <>", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagGreaterThan(String value) {
            addCriterion("ENABLED_FLAG >", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED_FLAG >=", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLessThan(String value) {
            addCriterion("ENABLED_FLAG <", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLessThanOrEqualTo(String value) {
            addCriterion("ENABLED_FLAG <=", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagLike(String value) {
            addCriterion("ENABLED_FLAG like", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotLike(String value) {
            addCriterion("ENABLED_FLAG not like", value, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagIn(List<String> values) {
            addCriterion("ENABLED_FLAG in", values, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotIn(List<String> values) {
            addCriterion("ENABLED_FLAG not in", values, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagBetween(String value1, String value2) {
            addCriterion("ENABLED_FLAG between", value1, value2, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andEnabledFlagNotBetween(String value1, String value2) {
            addCriterion("ENABLED_FLAG not between", value1, value2, "enabledFlag");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdIsNull() {
            addCriterion("BOE_HEADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdIsNotNull() {
            addCriterion("BOE_HEADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdEqualTo(Long value) {
            addCriterion("BOE_HEADER_ID =", value, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdNotEqualTo(Long value) {
            addCriterion("BOE_HEADER_ID <>", value, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdGreaterThan(Long value) {
            addCriterion("BOE_HEADER_ID >", value, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BOE_HEADER_ID >=", value, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdLessThan(Long value) {
            addCriterion("BOE_HEADER_ID <", value, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("BOE_HEADER_ID <=", value, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdIn(List<Long> values) {
            addCriterion("BOE_HEADER_ID in", values, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdNotIn(List<Long> values) {
            addCriterion("BOE_HEADER_ID not in", values, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdBetween(Long value1, Long value2) {
            addCriterion("BOE_HEADER_ID between", value1, value2, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andBoeHeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("BOE_HEADER_ID not between", value1, value2, "boeHeaderId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdIsNull() {
            addCriterion("WF_DEFINIENS_ID is null");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdIsNotNull() {
            addCriterion("WF_DEFINIENS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdEqualTo(Long value) {
            addCriterion("WF_DEFINIENS_ID =", value, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdNotEqualTo(Long value) {
            addCriterion("WF_DEFINIENS_ID <>", value, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdGreaterThan(Long value) {
            addCriterion("WF_DEFINIENS_ID >", value, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WF_DEFINIENS_ID >=", value, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdLessThan(Long value) {
            addCriterion("WF_DEFINIENS_ID <", value, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdLessThanOrEqualTo(Long value) {
            addCriterion("WF_DEFINIENS_ID <=", value, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdIn(List<Long> values) {
            addCriterion("WF_DEFINIENS_ID in", values, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdNotIn(List<Long> values) {
            addCriterion("WF_DEFINIENS_ID not in", values, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdBetween(Long value1, Long value2) {
            addCriterion("WF_DEFINIENS_ID between", value1, value2, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andWfDefiniensIdNotBetween(Long value1, Long value2) {
            addCriterion("WF_DEFINIENS_ID not between", value1, value2, "wfDefiniensId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdIsNull() {
            addCriterion("PRE_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdIsNotNull() {
            addCriterion("PRE_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdEqualTo(Long value) {
            addCriterion("PRE_NODE_ID =", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotEqualTo(Long value) {
            addCriterion("PRE_NODE_ID <>", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdGreaterThan(Long value) {
            addCriterion("PRE_NODE_ID >", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRE_NODE_ID >=", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdLessThan(Long value) {
            addCriterion("PRE_NODE_ID <", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("PRE_NODE_ID <=", value, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdIn(List<Long> values) {
            addCriterion("PRE_NODE_ID in", values, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotIn(List<Long> values) {
            addCriterion("PRE_NODE_ID not in", values, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdBetween(Long value1, Long value2) {
            addCriterion("PRE_NODE_ID between", value1, value2, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("PRE_NODE_ID not between", value1, value2, "preNodeId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdIsNull() {
            addCriterion("PRE_HIERARCHY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdIsNotNull() {
            addCriterion("PRE_HIERARCHY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdEqualTo(Long value) {
            addCriterion("PRE_HIERARCHY_ID =", value, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdNotEqualTo(Long value) {
            addCriterion("PRE_HIERARCHY_ID <>", value, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdGreaterThan(Long value) {
            addCriterion("PRE_HIERARCHY_ID >", value, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRE_HIERARCHY_ID >=", value, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdLessThan(Long value) {
            addCriterion("PRE_HIERARCHY_ID <", value, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdLessThanOrEqualTo(Long value) {
            addCriterion("PRE_HIERARCHY_ID <=", value, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdIn(List<Long> values) {
            addCriterion("PRE_HIERARCHY_ID in", values, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdNotIn(List<Long> values) {
            addCriterion("PRE_HIERARCHY_ID not in", values, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdBetween(Long value1, Long value2) {
            addCriterion("PRE_HIERARCHY_ID between", value1, value2, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreHierarchyIdNotBetween(Long value1, Long value2) {
            addCriterion("PRE_HIERARCHY_ID not between", value1, value2, "preHierarchyId");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusIsNull() {
            addCriterion("PRE_WORKFLOW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusIsNotNull() {
            addCriterion("PRE_WORKFLOW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusEqualTo(String value) {
            addCriterion("PRE_WORKFLOW_STATUS =", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusNotEqualTo(String value) {
            addCriterion("PRE_WORKFLOW_STATUS <>", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusGreaterThan(String value) {
            addCriterion("PRE_WORKFLOW_STATUS >", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_WORKFLOW_STATUS >=", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusLessThan(String value) {
            addCriterion("PRE_WORKFLOW_STATUS <", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusLessThanOrEqualTo(String value) {
            addCriterion("PRE_WORKFLOW_STATUS <=", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusLike(String value) {
            addCriterion("PRE_WORKFLOW_STATUS like", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusNotLike(String value) {
            addCriterion("PRE_WORKFLOW_STATUS not like", value, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusIn(List<String> values) {
            addCriterion("PRE_WORKFLOW_STATUS in", values, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusNotIn(List<String> values) {
            addCriterion("PRE_WORKFLOW_STATUS not in", values, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusBetween(String value1, String value2) {
            addCriterion("PRE_WORKFLOW_STATUS between", value1, value2, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andPreWorkflowStatusNotBetween(String value1, String value2) {
            addCriterion("PRE_WORKFLOW_STATUS not between", value1, value2, "preWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNull() {
            addCriterion("NEXT_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIsNotNull() {
            addCriterion("NEXT_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdEqualTo(Long value) {
            addCriterion("NEXT_NODE_ID =", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotEqualTo(Long value) {
            addCriterion("NEXT_NODE_ID <>", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThan(Long value) {
            addCriterion("NEXT_NODE_ID >", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NEXT_NODE_ID >=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThan(Long value) {
            addCriterion("NEXT_NODE_ID <", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdLessThanOrEqualTo(Long value) {
            addCriterion("NEXT_NODE_ID <=", value, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdIn(List<Long> values) {
            addCriterion("NEXT_NODE_ID in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotIn(List<Long> values) {
            addCriterion("NEXT_NODE_ID not in", values, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdBetween(Long value1, Long value2) {
            addCriterion("NEXT_NODE_ID between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextNodeIdNotBetween(Long value1, Long value2) {
            addCriterion("NEXT_NODE_ID not between", value1, value2, "nextNodeId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdIsNull() {
            addCriterion("NEXT_HIERARCHY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdIsNotNull() {
            addCriterion("NEXT_HIERARCHY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdEqualTo(Long value) {
            addCriterion("NEXT_HIERARCHY_ID =", value, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdNotEqualTo(Long value) {
            addCriterion("NEXT_HIERARCHY_ID <>", value, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdGreaterThan(Long value) {
            addCriterion("NEXT_HIERARCHY_ID >", value, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NEXT_HIERARCHY_ID >=", value, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdLessThan(Long value) {
            addCriterion("NEXT_HIERARCHY_ID <", value, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdLessThanOrEqualTo(Long value) {
            addCriterion("NEXT_HIERARCHY_ID <=", value, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdIn(List<Long> values) {
            addCriterion("NEXT_HIERARCHY_ID in", values, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdNotIn(List<Long> values) {
            addCriterion("NEXT_HIERARCHY_ID not in", values, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdBetween(Long value1, Long value2) {
            addCriterion("NEXT_HIERARCHY_ID between", value1, value2, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextHierarchyIdNotBetween(Long value1, Long value2) {
            addCriterion("NEXT_HIERARCHY_ID not between", value1, value2, "nextHierarchyId");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusIsNull() {
            addCriterion("NEXT_WORKFLOW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusIsNotNull() {
            addCriterion("NEXT_WORKFLOW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusEqualTo(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS =", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusNotEqualTo(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS <>", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusGreaterThan(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS >", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS >=", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusLessThan(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS <", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusLessThanOrEqualTo(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS <=", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusLike(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS like", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusNotLike(String value) {
            addCriterion("NEXT_WORKFLOW_STATUS not like", value, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusIn(List<String> values) {
            addCriterion("NEXT_WORKFLOW_STATUS in", values, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusNotIn(List<String> values) {
            addCriterion("NEXT_WORKFLOW_STATUS not in", values, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusBetween(String value1, String value2) {
            addCriterion("NEXT_WORKFLOW_STATUS between", value1, value2, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andNextWorkflowStatusNotBetween(String value1, String value2) {
            addCriterion("NEXT_WORKFLOW_STATUS not between", value1, value2, "nextWorkflowStatus");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("ATTRIBUTE1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("ATTRIBUTE1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("ATTRIBUTE1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("ATTRIBUTE1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("ATTRIBUTE1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("ATTRIBUTE1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("ATTRIBUTE1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("ATTRIBUTE1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("ATTRIBUTE1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("ATTRIBUTE1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("ATTRIBUTE2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("ATTRIBUTE2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("ATTRIBUTE2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("ATTRIBUTE2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("ATTRIBUTE2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("ATTRIBUTE2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("ATTRIBUTE2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("ATTRIBUTE2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("ATTRIBUTE2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("ATTRIBUTE2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("ATTRIBUTE4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("ATTRIBUTE4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("ATTRIBUTE4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("ATTRIBUTE4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("ATTRIBUTE4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("ATTRIBUTE4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("ATTRIBUTE4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("ATTRIBUTE4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("ATTRIBUTE4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("ATTRIBUTE4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("ATTRIBUTE5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("ATTRIBUTE5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("ATTRIBUTE5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("ATTRIBUTE5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("ATTRIBUTE5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("ATTRIBUTE5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("ATTRIBUTE5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("ATTRIBUTE5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("ATTRIBUTE5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("ATTRIBUTE5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNull() {
            addCriterion("ATTRIBUTE6 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNotNull() {
            addCriterion("ATTRIBUTE6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute6EqualTo(String value) {
            addCriterion("ATTRIBUTE6 =", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <>", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThan(String value) {
            addCriterion("ATTRIBUTE6 >", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 >=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThan(String value) {
            addCriterion("ATTRIBUTE6 <", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE6 <=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Like(String value) {
            addCriterion("ATTRIBUTE6 like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotLike(String value) {
            addCriterion("ATTRIBUTE6 not like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6In(List<String> values) {
            addCriterion("ATTRIBUTE6 in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotIn(List<String> values) {
            addCriterion("ATTRIBUTE6 not in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Between(String value1, String value2) {
            addCriterion("ATTRIBUTE6 between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE6 not between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNull() {
            addCriterion("ATTRIBUTE7 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNotNull() {
            addCriterion("ATTRIBUTE7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute7EqualTo(String value) {
            addCriterion("ATTRIBUTE7 =", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <>", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThan(String value) {
            addCriterion("ATTRIBUTE7 >", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 >=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThan(String value) {
            addCriterion("ATTRIBUTE7 <", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE7 <=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Like(String value) {
            addCriterion("ATTRIBUTE7 like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotLike(String value) {
            addCriterion("ATTRIBUTE7 not like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7In(List<String> values) {
            addCriterion("ATTRIBUTE7 in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotIn(List<String> values) {
            addCriterion("ATTRIBUTE7 not in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Between(String value1, String value2) {
            addCriterion("ATTRIBUTE7 between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE7 not between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNull() {
            addCriterion("ATTRIBUTE8 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNotNull() {
            addCriterion("ATTRIBUTE8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute8EqualTo(String value) {
            addCriterion("ATTRIBUTE8 =", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <>", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThan(String value) {
            addCriterion("ATTRIBUTE8 >", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 >=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThan(String value) {
            addCriterion("ATTRIBUTE8 <", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE8 <=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Like(String value) {
            addCriterion("ATTRIBUTE8 like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotLike(String value) {
            addCriterion("ATTRIBUTE8 not like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8In(List<String> values) {
            addCriterion("ATTRIBUTE8 in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotIn(List<String> values) {
            addCriterion("ATTRIBUTE8 not in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Between(String value1, String value2) {
            addCriterion("ATTRIBUTE8 between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE8 not between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNull() {
            addCriterion("ATTRIBUTE9 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNotNull() {
            addCriterion("ATTRIBUTE9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute9EqualTo(String value) {
            addCriterion("ATTRIBUTE9 =", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <>", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThan(String value) {
            addCriterion("ATTRIBUTE9 >", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 >=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThan(String value) {
            addCriterion("ATTRIBUTE9 <", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE9 <=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Like(String value) {
            addCriterion("ATTRIBUTE9 like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotLike(String value) {
            addCriterion("ATTRIBUTE9 not like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9In(List<String> values) {
            addCriterion("ATTRIBUTE9 in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotIn(List<String> values) {
            addCriterion("ATTRIBUTE9 not in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Between(String value1, String value2) {
            addCriterion("ATTRIBUTE9 between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE9 not between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNull() {
            addCriterion("ATTRIBUTE10 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNotNull() {
            addCriterion("ATTRIBUTE10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute10EqualTo(String value) {
            addCriterion("ATTRIBUTE10 =", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <>", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThan(String value) {
            addCriterion("ATTRIBUTE10 >", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 >=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThan(String value) {
            addCriterion("ATTRIBUTE10 <", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE10 <=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Like(String value) {
            addCriterion("ATTRIBUTE10 like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotLike(String value) {
            addCriterion("ATTRIBUTE10 not like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10In(List<String> values) {
            addCriterion("ATTRIBUTE10 in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotIn(List<String> values) {
            addCriterion("ATTRIBUTE10 not in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Between(String value1, String value2) {
            addCriterion("ATTRIBUTE10 between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE10 not between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIsNull() {
            addCriterion("ATTRIBUTE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIsNotNull() {
            addCriterion("ATTRIBUTE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY =", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY <>", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryGreaterThan(String value) {
            addCriterion("ATTRIBUTE_CATEGORY >", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY >=", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryLessThan(String value) {
            addCriterion("ATTRIBUTE_CATEGORY <", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryLessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_CATEGORY <=", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryLike(String value) {
            addCriterion("ATTRIBUTE_CATEGORY like", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotLike(String value) {
            addCriterion("ATTRIBUTE_CATEGORY not like", value, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryIn(List<String> values) {
            addCriterion("ATTRIBUTE_CATEGORY in", values, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotIn(List<String> values) {
            addCriterion("ATTRIBUTE_CATEGORY not in", values, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_CATEGORY between", value1, value2, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andAttributeCategoryNotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_CATEGORY not between", value1, value2, "attributeCategory");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
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