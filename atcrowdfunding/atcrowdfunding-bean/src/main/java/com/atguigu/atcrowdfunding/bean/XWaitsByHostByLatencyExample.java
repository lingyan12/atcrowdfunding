package com.atguigu.atcrowdfunding.bean;

import java.util.ArrayList;
import java.util.List;

public class XWaitsByHostByLatencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XWaitsByHostByLatencyExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNull() {
            addCriterion("total_latency is null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNotNull() {
            addCriterion("total_latency is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyEqualTo(Long value) {
            addCriterion("total_latency =", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotEqualTo(Long value) {
            addCriterion("total_latency <>", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThan(Long value) {
            addCriterion("total_latency >", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_latency >=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThan(Long value) {
            addCriterion("total_latency <", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThanOrEqualTo(Long value) {
            addCriterion("total_latency <=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIn(List<Long> values) {
            addCriterion("total_latency in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotIn(List<Long> values) {
            addCriterion("total_latency not in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyBetween(Long value1, Long value2) {
            addCriterion("total_latency between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotBetween(Long value1, Long value2) {
            addCriterion("total_latency not between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIsNull() {
            addCriterion("avg_latency is null");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIsNotNull() {
            addCriterion("avg_latency is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyEqualTo(Long value) {
            addCriterion("avg_latency =", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotEqualTo(Long value) {
            addCriterion("avg_latency <>", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThan(Long value) {
            addCriterion("avg_latency >", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("avg_latency >=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThan(Long value) {
            addCriterion("avg_latency <", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThanOrEqualTo(Long value) {
            addCriterion("avg_latency <=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIn(List<Long> values) {
            addCriterion("avg_latency in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotIn(List<Long> values) {
            addCriterion("avg_latency not in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyBetween(Long value1, Long value2) {
            addCriterion("avg_latency between", value1, value2, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotBetween(Long value1, Long value2) {
            addCriterion("avg_latency not between", value1, value2, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIsNull() {
            addCriterion("max_latency is null");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIsNotNull() {
            addCriterion("max_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyEqualTo(Long value) {
            addCriterion("max_latency =", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotEqualTo(Long value) {
            addCriterion("max_latency <>", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThan(Long value) {
            addCriterion("max_latency >", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("max_latency >=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThan(Long value) {
            addCriterion("max_latency <", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThanOrEqualTo(Long value) {
            addCriterion("max_latency <=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIn(List<Long> values) {
            addCriterion("max_latency in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotIn(List<Long> values) {
            addCriterion("max_latency not in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyBetween(Long value1, Long value2) {
            addCriterion("max_latency between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotBetween(Long value1, Long value2) {
            addCriterion("max_latency not between", value1, value2, "maxLatency");
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