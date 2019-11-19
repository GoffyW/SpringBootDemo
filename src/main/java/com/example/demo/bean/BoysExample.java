package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class BoysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoysExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andBoynameIsNull() {
            addCriterion("boyName is null");
            return (Criteria) this;
        }

        public Criteria andBoynameIsNotNull() {
            addCriterion("boyName is not null");
            return (Criteria) this;
        }

        public Criteria andBoynameEqualTo(String value) {
            addCriterion("boyName =", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameNotEqualTo(String value) {
            addCriterion("boyName <>", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameGreaterThan(String value) {
            addCriterion("boyName >", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameGreaterThanOrEqualTo(String value) {
            addCriterion("boyName >=", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameLessThan(String value) {
            addCriterion("boyName <", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameLessThanOrEqualTo(String value) {
            addCriterion("boyName <=", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameLike(String value) {
            addCriterion("boyName like", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameNotLike(String value) {
            addCriterion("boyName not like", value, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameIn(List<String> values) {
            addCriterion("boyName in", values, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameNotIn(List<String> values) {
            addCriterion("boyName not in", values, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameBetween(String value1, String value2) {
            addCriterion("boyName between", value1, value2, "boyname");
            return (Criteria) this;
        }

        public Criteria andBoynameNotBetween(String value1, String value2) {
            addCriterion("boyName not between", value1, value2, "boyname");
            return (Criteria) this;
        }

        public Criteria andUsercpIsNull() {
            addCriterion("userCP is null");
            return (Criteria) this;
        }

        public Criteria andUsercpIsNotNull() {
            addCriterion("userCP is not null");
            return (Criteria) this;
        }

        public Criteria andUsercpEqualTo(Integer value) {
            addCriterion("userCP =", value, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpNotEqualTo(Integer value) {
            addCriterion("userCP <>", value, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpGreaterThan(Integer value) {
            addCriterion("userCP >", value, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpGreaterThanOrEqualTo(Integer value) {
            addCriterion("userCP >=", value, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpLessThan(Integer value) {
            addCriterion("userCP <", value, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpLessThanOrEqualTo(Integer value) {
            addCriterion("userCP <=", value, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpIn(List<Integer> values) {
            addCriterion("userCP in", values, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpNotIn(List<Integer> values) {
            addCriterion("userCP not in", values, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpBetween(Integer value1, Integer value2) {
            addCriterion("userCP between", value1, value2, "usercp");
            return (Criteria) this;
        }

        public Criteria andUsercpNotBetween(Integer value1, Integer value2) {
            addCriterion("userCP not between", value1, value2, "usercp");
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