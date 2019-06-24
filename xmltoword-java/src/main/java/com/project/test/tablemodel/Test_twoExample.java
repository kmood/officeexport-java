package com.project.test.tablemodel;

import java.util.ArrayList;
import java.util.List;

public class Test_twoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Test_twoExample() {
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

        public Criteria andTest1IsNull() {
            addCriterion("test1 is null");
            return (Criteria) this;
        }

        public Criteria andTest1IsNotNull() {
            addCriterion("test1 is not null");
            return (Criteria) this;
        }

        public Criteria andTest1EqualTo(String value) {
            addCriterion("test1 =", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotEqualTo(String value) {
            addCriterion("test1 <>", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThan(String value) {
            addCriterion("test1 >", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1GreaterThanOrEqualTo(String value) {
            addCriterion("test1 >=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThan(String value) {
            addCriterion("test1 <", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1LessThanOrEqualTo(String value) {
            addCriterion("test1 <=", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Like(String value) {
            addCriterion("test1 like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotLike(String value) {
            addCriterion("test1 not like", value, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1In(List<String> values) {
            addCriterion("test1 in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotIn(List<String> values) {
            addCriterion("test1 not in", values, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1Between(String value1, String value2) {
            addCriterion("test1 between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest1NotBetween(String value1, String value2) {
            addCriterion("test1 not between", value1, value2, "test1");
            return (Criteria) this;
        }

        public Criteria andTest2IsNull() {
            addCriterion("test2 is null");
            return (Criteria) this;
        }

        public Criteria andTest2IsNotNull() {
            addCriterion("test2 is not null");
            return (Criteria) this;
        }

        public Criteria andTest2EqualTo(String value) {
            addCriterion("test2 =", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotEqualTo(String value) {
            addCriterion("test2 <>", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2GreaterThan(String value) {
            addCriterion("test2 >", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2GreaterThanOrEqualTo(String value) {
            addCriterion("test2 >=", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2LessThan(String value) {
            addCriterion("test2 <", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2LessThanOrEqualTo(String value) {
            addCriterion("test2 <=", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2Like(String value) {
            addCriterion("test2 like", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotLike(String value) {
            addCriterion("test2 not like", value, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2In(List<String> values) {
            addCriterion("test2 in", values, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotIn(List<String> values) {
            addCriterion("test2 not in", values, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2Between(String value1, String value2) {
            addCriterion("test2 between", value1, value2, "test2");
            return (Criteria) this;
        }

        public Criteria andTest2NotBetween(String value1, String value2) {
            addCriterion("test2 not between", value1, value2, "test2");
            return (Criteria) this;
        }

        public Criteria andTest3IsNull() {
            addCriterion("test3 is null");
            return (Criteria) this;
        }

        public Criteria andTest3IsNotNull() {
            addCriterion("test3 is not null");
            return (Criteria) this;
        }

        public Criteria andTest3EqualTo(String value) {
            addCriterion("test3 =", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotEqualTo(String value) {
            addCriterion("test3 <>", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3GreaterThan(String value) {
            addCriterion("test3 >", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3GreaterThanOrEqualTo(String value) {
            addCriterion("test3 >=", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3LessThan(String value) {
            addCriterion("test3 <", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3LessThanOrEqualTo(String value) {
            addCriterion("test3 <=", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3Like(String value) {
            addCriterion("test3 like", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotLike(String value) {
            addCriterion("test3 not like", value, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3In(List<String> values) {
            addCriterion("test3 in", values, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotIn(List<String> values) {
            addCriterion("test3 not in", values, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3Between(String value1, String value2) {
            addCriterion("test3 between", value1, value2, "test3");
            return (Criteria) this;
        }

        public Criteria andTest3NotBetween(String value1, String value2) {
            addCriterion("test3 not between", value1, value2, "test3");
            return (Criteria) this;
        }

        public Criteria andTest4IsNull() {
            addCriterion("test4 is null");
            return (Criteria) this;
        }

        public Criteria andTest4IsNotNull() {
            addCriterion("test4 is not null");
            return (Criteria) this;
        }

        public Criteria andTest4EqualTo(String value) {
            addCriterion("test4 =", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotEqualTo(String value) {
            addCriterion("test4 <>", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4GreaterThan(String value) {
            addCriterion("test4 >", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4GreaterThanOrEqualTo(String value) {
            addCriterion("test4 >=", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4LessThan(String value) {
            addCriterion("test4 <", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4LessThanOrEqualTo(String value) {
            addCriterion("test4 <=", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4Like(String value) {
            addCriterion("test4 like", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotLike(String value) {
            addCriterion("test4 not like", value, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4In(List<String> values) {
            addCriterion("test4 in", values, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotIn(List<String> values) {
            addCriterion("test4 not in", values, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4Between(String value1, String value2) {
            addCriterion("test4 between", value1, value2, "test4");
            return (Criteria) this;
        }

        public Criteria andTest4NotBetween(String value1, String value2) {
            addCriterion("test4 not between", value1, value2, "test4");
            return (Criteria) this;
        }

        public Criteria andTest5IsNull() {
            addCriterion("test5 is null");
            return (Criteria) this;
        }

        public Criteria andTest5IsNotNull() {
            addCriterion("test5 is not null");
            return (Criteria) this;
        }

        public Criteria andTest5EqualTo(String value) {
            addCriterion("test5 =", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5NotEqualTo(String value) {
            addCriterion("test5 <>", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5GreaterThan(String value) {
            addCriterion("test5 >", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5GreaterThanOrEqualTo(String value) {
            addCriterion("test5 >=", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5LessThan(String value) {
            addCriterion("test5 <", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5LessThanOrEqualTo(String value) {
            addCriterion("test5 <=", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5Like(String value) {
            addCriterion("test5 like", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5NotLike(String value) {
            addCriterion("test5 not like", value, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5In(List<String> values) {
            addCriterion("test5 in", values, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5NotIn(List<String> values) {
            addCriterion("test5 not in", values, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5Between(String value1, String value2) {
            addCriterion("test5 between", value1, value2, "test5");
            return (Criteria) this;
        }

        public Criteria andTest5NotBetween(String value1, String value2) {
            addCriterion("test5 not between", value1, value2, "test5");
            return (Criteria) this;
        }

        public Criteria andTest6IsNull() {
            addCriterion("test6 is null");
            return (Criteria) this;
        }

        public Criteria andTest6IsNotNull() {
            addCriterion("test6 is not null");
            return (Criteria) this;
        }

        public Criteria andTest6EqualTo(String value) {
            addCriterion("test6 =", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6NotEqualTo(String value) {
            addCriterion("test6 <>", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6GreaterThan(String value) {
            addCriterion("test6 >", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6GreaterThanOrEqualTo(String value) {
            addCriterion("test6 >=", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6LessThan(String value) {
            addCriterion("test6 <", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6LessThanOrEqualTo(String value) {
            addCriterion("test6 <=", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6Like(String value) {
            addCriterion("test6 like", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6NotLike(String value) {
            addCriterion("test6 not like", value, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6In(List<String> values) {
            addCriterion("test6 in", values, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6NotIn(List<String> values) {
            addCriterion("test6 not in", values, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6Between(String value1, String value2) {
            addCriterion("test6 between", value1, value2, "test6");
            return (Criteria) this;
        }

        public Criteria andTest6NotBetween(String value1, String value2) {
            addCriterion("test6 not between", value1, value2, "test6");
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