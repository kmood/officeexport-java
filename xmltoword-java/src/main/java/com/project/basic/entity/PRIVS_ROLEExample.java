package com.project.basic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PRIVS_ROLEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PRIVS_ROLEExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEIsNull() {
            addCriterion("ALIASNAME is null");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEIsNotNull() {
            addCriterion("ALIASNAME is not null");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEEqualTo(String value) {
            addCriterion("ALIASNAME =", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMENotEqualTo(String value) {
            addCriterion("ALIASNAME <>", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEGreaterThan(String value) {
            addCriterion("ALIASNAME >", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ALIASNAME >=", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMELessThan(String value) {
            addCriterion("ALIASNAME <", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMELessThanOrEqualTo(String value) {
            addCriterion("ALIASNAME <=", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMELike(String value) {
            addCriterion("ALIASNAME like", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMENotLike(String value) {
            addCriterion("ALIASNAME not like", value, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEIn(List<String> values) {
            addCriterion("ALIASNAME in", values, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMENotIn(List<String> values) {
            addCriterion("ALIASNAME not in", values, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMEBetween(String value1, String value2) {
            addCriterion("ALIASNAME between", value1, value2, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andALIASNAMENotBetween(String value1, String value2) {
            addCriterion("ALIASNAME not between", value1, value2, "ALIASNAME");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEIsNull() {
            addCriterion("NAMESPACE is null");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEIsNotNull() {
            addCriterion("NAMESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEEqualTo(String value) {
            addCriterion("NAMESPACE =", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACENotEqualTo(String value) {
            addCriterion("NAMESPACE <>", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEGreaterThan(String value) {
            addCriterion("NAMESPACE >", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEGreaterThanOrEqualTo(String value) {
            addCriterion("NAMESPACE >=", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACELessThan(String value) {
            addCriterion("NAMESPACE <", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACELessThanOrEqualTo(String value) {
            addCriterion("NAMESPACE <=", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACELike(String value) {
            addCriterion("NAMESPACE like", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACENotLike(String value) {
            addCriterion("NAMESPACE not like", value, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEIn(List<String> values) {
            addCriterion("NAMESPACE in", values, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACENotIn(List<String> values) {
            addCriterion("NAMESPACE not in", values, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACEBetween(String value1, String value2) {
            addCriterion("NAMESPACE between", value1, value2, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andNAMESPACENotBetween(String value1, String value2) {
            addCriterion("NAMESPACE not between", value1, value2, "NAMESPACE");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERIsNull() {
            addCriterion("INDEXOFORDER is null");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERIsNotNull() {
            addCriterion("INDEXOFORDER is not null");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDEREqualTo(Integer value) {
            addCriterion("INDEXOFORDER =", value, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERNotEqualTo(Integer value) {
            addCriterion("INDEXOFORDER <>", value, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERGreaterThan(Integer value) {
            addCriterion("INDEXOFORDER >", value, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERGreaterThanOrEqualTo(Integer value) {
            addCriterion("INDEXOFORDER >=", value, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERLessThan(Integer value) {
            addCriterion("INDEXOFORDER <", value, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERLessThanOrEqualTo(Integer value) {
            addCriterion("INDEXOFORDER <=", value, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERIn(List<Integer> values) {
            addCriterion("INDEXOFORDER in", values, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERNotIn(List<Integer> values) {
            addCriterion("INDEXOFORDER not in", values, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERBetween(Integer value1, Integer value2) {
            addCriterion("INDEXOFORDER between", value1, value2, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andINDEXOFORDERNotBetween(Integer value1, Integer value2) {
            addCriterion("INDEXOFORDER not between", value1, value2, "INDEXOFORDER");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMIsNull() {
            addCriterion("ISSYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMIsNotNull() {
            addCriterion("ISSYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMEqualTo(String value) {
            addCriterion("ISSYSTEM =", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMNotEqualTo(String value) {
            addCriterion("ISSYSTEM <>", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMGreaterThan(String value) {
            addCriterion("ISSYSTEM >", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMGreaterThanOrEqualTo(String value) {
            addCriterion("ISSYSTEM >=", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMLessThan(String value) {
            addCriterion("ISSYSTEM <", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMLessThanOrEqualTo(String value) {
            addCriterion("ISSYSTEM <=", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMLike(String value) {
            addCriterion("ISSYSTEM like", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMNotLike(String value) {
            addCriterion("ISSYSTEM not like", value, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMIn(List<String> values) {
            addCriterion("ISSYSTEM in", values, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMNotIn(List<String> values) {
            addCriterion("ISSYSTEM not in", values, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMBetween(String value1, String value2) {
            addCriterion("ISSYSTEM between", value1, value2, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andISSYSTEMNotBetween(String value1, String value2) {
            addCriterion("ISSYSTEM not between", value1, value2, "ISSYSTEM");
            return (Criteria) this;
        }

        public Criteria andCJRIDIsNull() {
            addCriterion("CJRID is null");
            return (Criteria) this;
        }

        public Criteria andCJRIDIsNotNull() {
            addCriterion("CJRID is not null");
            return (Criteria) this;
        }

        public Criteria andCJRIDEqualTo(String value) {
            addCriterion("CJRID =", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDNotEqualTo(String value) {
            addCriterion("CJRID <>", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDGreaterThan(String value) {
            addCriterion("CJRID >", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDGreaterThanOrEqualTo(String value) {
            addCriterion("CJRID >=", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDLessThan(String value) {
            addCriterion("CJRID <", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDLessThanOrEqualTo(String value) {
            addCriterion("CJRID <=", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDLike(String value) {
            addCriterion("CJRID like", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDNotLike(String value) {
            addCriterion("CJRID not like", value, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDIn(List<String> values) {
            addCriterion("CJRID in", values, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDNotIn(List<String> values) {
            addCriterion("CJRID not in", values, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDBetween(String value1, String value2) {
            addCriterion("CJRID between", value1, value2, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJRIDNotBetween(String value1, String value2) {
            addCriterion("CJRID not between", value1, value2, "CJRID");
            return (Criteria) this;
        }

        public Criteria andCJSJIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCJSJIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCJSJEqualTo(Date value) {
            addCriterion("CJSJ =", value, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJNotEqualTo(Date value) {
            addCriterion("CJSJ <>", value, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJGreaterThan(Date value) {
            addCriterion("CJSJ >", value, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJGreaterThanOrEqualTo(Date value) {
            addCriterion("CJSJ >=", value, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJLessThan(Date value) {
            addCriterion("CJSJ <", value, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJLessThanOrEqualTo(Date value) {
            addCriterion("CJSJ <=", value, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJIn(List<Date> values) {
            addCriterion("CJSJ in", values, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJNotIn(List<Date> values) {
            addCriterion("CJSJ not in", values, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJBetween(Date value1, Date value2) {
            addCriterion("CJSJ between", value1, value2, "CJSJ");
            return (Criteria) this;
        }

        public Criteria andCJSJNotBetween(Date value1, Date value2) {
            addCriterion("CJSJ not between", value1, value2, "CJSJ");
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