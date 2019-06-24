package com.project.basic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class System_log_exceptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public System_log_exceptionExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNull() {
            addCriterion("yhmc is null");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNotNull() {
            addCriterion("yhmc is not null");
            return (Criteria) this;
        }

        public Criteria andYhmcEqualTo(String value) {
            addCriterion("yhmc =", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotEqualTo(String value) {
            addCriterion("yhmc <>", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThan(String value) {
            addCriterion("yhmc >", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThanOrEqualTo(String value) {
            addCriterion("yhmc >=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThan(String value) {
            addCriterion("yhmc <", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThanOrEqualTo(String value) {
            addCriterion("yhmc <=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLike(String value) {
            addCriterion("yhmc like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotLike(String value) {
            addCriterion("yhmc not like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcIn(List<String> values) {
            addCriterion("yhmc in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotIn(List<String> values) {
            addCriterion("yhmc not in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcBetween(String value1, String value2) {
            addCriterion("yhmc between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotBetween(String value1, String value2) {
            addCriterion("yhmc not between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhidIsNull() {
            addCriterion("yhid is null");
            return (Criteria) this;
        }

        public Criteria andYhidIsNotNull() {
            addCriterion("yhid is not null");
            return (Criteria) this;
        }

        public Criteria andYhidEqualTo(String value) {
            addCriterion("yhid =", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotEqualTo(String value) {
            addCriterion("yhid <>", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThan(String value) {
            addCriterion("yhid >", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidGreaterThanOrEqualTo(String value) {
            addCriterion("yhid >=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThan(String value) {
            addCriterion("yhid <", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLessThanOrEqualTo(String value) {
            addCriterion("yhid <=", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidLike(String value) {
            addCriterion("yhid like", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotLike(String value) {
            addCriterion("yhid not like", value, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidIn(List<String> values) {
            addCriterion("yhid in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotIn(List<String> values) {
            addCriterion("yhid not in", values, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidBetween(String value1, String value2) {
            addCriterion("yhid between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andYhidNotBetween(String value1, String value2) {
            addCriterion("yhid not between", value1, value2, "yhid");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("dz is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("dz is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("dz =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("dz <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("dz >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("dz >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("dz <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("dz <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLike(String value) {
            addCriterion("dz like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotLike(String value) {
            addCriterion("dz not like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("dz in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("dz not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("dz between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("dz not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andMkIsNull() {
            addCriterion("mk is null");
            return (Criteria) this;
        }

        public Criteria andMkIsNotNull() {
            addCriterion("mk is not null");
            return (Criteria) this;
        }

        public Criteria andMkEqualTo(String value) {
            addCriterion("mk =", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkNotEqualTo(String value) {
            addCriterion("mk <>", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkGreaterThan(String value) {
            addCriterion("mk >", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkGreaterThanOrEqualTo(String value) {
            addCriterion("mk >=", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkLessThan(String value) {
            addCriterion("mk <", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkLessThanOrEqualTo(String value) {
            addCriterion("mk <=", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkLike(String value) {
            addCriterion("mk like", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkNotLike(String value) {
            addCriterion("mk not like", value, "mk");
            return (Criteria) this;
        }

        public Criteria andMkIn(List<String> values) {
            addCriterion("mk in", values, "mk");
            return (Criteria) this;
        }

        public Criteria andMkNotIn(List<String> values) {
            addCriterion("mk not in", values, "mk");
            return (Criteria) this;
        }

        public Criteria andMkBetween(String value1, String value2) {
            addCriterion("mk between", value1, value2, "mk");
            return (Criteria) this;
        }

        public Criteria andMkNotBetween(String value1, String value2) {
            addCriterion("mk not between", value1, value2, "mk");
            return (Criteria) this;
        }

        public Criteria andCzsjIsNull() {
            addCriterion("czsj is null");
            return (Criteria) this;
        }

        public Criteria andCzsjIsNotNull() {
            addCriterion("czsj is not null");
            return (Criteria) this;
        }

        public Criteria andCzsjEqualTo(Date value) {
            addCriterion("czsj =", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjNotEqualTo(Date value) {
            addCriterion("czsj <>", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjGreaterThan(Date value) {
            addCriterion("czsj >", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("czsj >=", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjLessThan(Date value) {
            addCriterion("czsj <", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjLessThanOrEqualTo(Date value) {
            addCriterion("czsj <=", value, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjIn(List<Date> values) {
            addCriterion("czsj in", values, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjNotIn(List<Date> values) {
            addCriterion("czsj not in", values, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjBetween(Date value1, Date value2) {
            addCriterion("czsj between", value1, value2, "czsj");
            return (Criteria) this;
        }

        public Criteria andCzsjNotBetween(Date value1, Date value2) {
            addCriterion("czsj not between", value1, value2, "czsj");
            return (Criteria) this;
        }

        public Criteria andFfmIsNull() {
            addCriterion("ffm is null");
            return (Criteria) this;
        }

        public Criteria andFfmIsNotNull() {
            addCriterion("ffm is not null");
            return (Criteria) this;
        }

        public Criteria andFfmEqualTo(String value) {
            addCriterion("ffm =", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmNotEqualTo(String value) {
            addCriterion("ffm <>", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmGreaterThan(String value) {
            addCriterion("ffm >", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmGreaterThanOrEqualTo(String value) {
            addCriterion("ffm >=", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmLessThan(String value) {
            addCriterion("ffm <", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmLessThanOrEqualTo(String value) {
            addCriterion("ffm <=", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmLike(String value) {
            addCriterion("ffm like", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmNotLike(String value) {
            addCriterion("ffm not like", value, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmIn(List<String> values) {
            addCriterion("ffm in", values, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmNotIn(List<String> values) {
            addCriterion("ffm not in", values, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmBetween(String value1, String value2) {
            addCriterion("ffm between", value1, value2, "ffm");
            return (Criteria) this;
        }

        public Criteria andFfmNotBetween(String value1, String value2) {
            addCriterion("ffm not between", value1, value2, "ffm");
            return (Criteria) this;
        }

        public Criteria andLmIsNull() {
            addCriterion("lm is null");
            return (Criteria) this;
        }

        public Criteria andLmIsNotNull() {
            addCriterion("lm is not null");
            return (Criteria) this;
        }

        public Criteria andLmEqualTo(String value) {
            addCriterion("lm =", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotEqualTo(String value) {
            addCriterion("lm <>", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmGreaterThan(String value) {
            addCriterion("lm >", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmGreaterThanOrEqualTo(String value) {
            addCriterion("lm >=", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmLessThan(String value) {
            addCriterion("lm <", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmLessThanOrEqualTo(String value) {
            addCriterion("lm <=", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmLike(String value) {
            addCriterion("lm like", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotLike(String value) {
            addCriterion("lm not like", value, "lm");
            return (Criteria) this;
        }

        public Criteria andLmIn(List<String> values) {
            addCriterion("lm in", values, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotIn(List<String> values) {
            addCriterion("lm not in", values, "lm");
            return (Criteria) this;
        }

        public Criteria andLmBetween(String value1, String value2) {
            addCriterion("lm between", value1, value2, "lm");
            return (Criteria) this;
        }

        public Criteria andLmNotBetween(String value1, String value2) {
            addCriterion("lm not between", value1, value2, "lm");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andYcIsNull() {
            addCriterion("yc is null");
            return (Criteria) this;
        }

        public Criteria andYcIsNotNull() {
            addCriterion("yc is not null");
            return (Criteria) this;
        }

        public Criteria andYcEqualTo(String value) {
            addCriterion("yc =", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcNotEqualTo(String value) {
            addCriterion("yc <>", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcGreaterThan(String value) {
            addCriterion("yc >", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcGreaterThanOrEqualTo(String value) {
            addCriterion("yc >=", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcLessThan(String value) {
            addCriterion("yc <", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcLessThanOrEqualTo(String value) {
            addCriterion("yc <=", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcLike(String value) {
            addCriterion("yc like", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcNotLike(String value) {
            addCriterion("yc not like", value, "yc");
            return (Criteria) this;
        }

        public Criteria andYcIn(List<String> values) {
            addCriterion("yc in", values, "yc");
            return (Criteria) this;
        }

        public Criteria andYcNotIn(List<String> values) {
            addCriterion("yc not in", values, "yc");
            return (Criteria) this;
        }

        public Criteria andYcBetween(String value1, String value2) {
            addCriterion("yc between", value1, value2, "yc");
            return (Criteria) this;
        }

        public Criteria andYcNotBetween(String value1, String value2) {
            addCriterion("yc not between", value1, value2, "yc");
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