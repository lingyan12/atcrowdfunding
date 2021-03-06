package com.atguigu.atcrowdfunding.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HostSummaryByFileIoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HostSummaryByFileIoExample() {
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

        public Criteria andIosIsNull() {
            addCriterion("ios is null");
            return (Criteria) this;
        }

        public Criteria andIosIsNotNull() {
            addCriterion("ios is not null");
            return (Criteria) this;
        }

        public Criteria andIosEqualTo(BigDecimal value) {
            addCriterion("ios =", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotEqualTo(BigDecimal value) {
            addCriterion("ios <>", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThan(BigDecimal value) {
            addCriterion("ios >", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ios >=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThan(BigDecimal value) {
            addCriterion("ios <", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ios <=", value, "ios");
            return (Criteria) this;
        }

        public Criteria andIosIn(List<BigDecimal> values) {
            addCriterion("ios in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotIn(List<BigDecimal> values) {
            addCriterion("ios not in", values, "ios");
            return (Criteria) this;
        }

        public Criteria andIosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ios between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ios not between", value1, value2, "ios");
            return (Criteria) this;
        }

        public Criteria andIoLatencyIsNull() {
            addCriterion("io_latency is null");
            return (Criteria) this;
        }

        public Criteria andIoLatencyIsNotNull() {
            addCriterion("io_latency is not null");
            return (Criteria) this;
        }

        public Criteria andIoLatencyEqualTo(String value) {
            addCriterion("io_latency =", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyNotEqualTo(String value) {
            addCriterion("io_latency <>", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyGreaterThan(String value) {
            addCriterion("io_latency >", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("io_latency >=", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyLessThan(String value) {
            addCriterion("io_latency <", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyLessThanOrEqualTo(String value) {
            addCriterion("io_latency <=", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyLike(String value) {
            addCriterion("io_latency like", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyNotLike(String value) {
            addCriterion("io_latency not like", value, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyIn(List<String> values) {
            addCriterion("io_latency in", values, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyNotIn(List<String> values) {
            addCriterion("io_latency not in", values, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyBetween(String value1, String value2) {
            addCriterion("io_latency between", value1, value2, "ioLatency");
            return (Criteria) this;
        }

        public Criteria andIoLatencyNotBetween(String value1, String value2) {
            addCriterion("io_latency not between", value1, value2, "ioLatency");
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