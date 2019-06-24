package com.project.basic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PRIVS_DEPARTMENTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PRIVS_DEPARTMENTExample() {
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

        public Criteria andPARENTIDIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andPARENTIDIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPARENTIDEqualTo(String value) {
            addCriterion("PARENTID =", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDGreaterThan(String value) {
            addCriterion("PARENTID >", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDLessThan(String value) {
            addCriterion("PARENTID <", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDLike(String value) {
            addCriterion("PARENTID like", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotLike(String value) {
            addCriterion("PARENTID not like", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDIn(List<String> values) {
            addCriterion("PARENTID in", values, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andDUTYIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDUTYIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDUTYEqualTo(String value) {
            addCriterion("DUTY =", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYGreaterThan(String value) {
            addCriterion("DUTY >", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYLessThan(String value) {
            addCriterion("DUTY <", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYLike(String value) {
            addCriterion("DUTY like", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYNotLike(String value) {
            addCriterion("DUTY not like", value, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYIn(List<String> values) {
            addCriterion("DUTY in", values, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "DUTY");
            return (Criteria) this;
        }

        public Criteria andDUTYNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "DUTY");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThan(Date value) {
            addCriterion("CREATEDATE <", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andADDRESSEqualTo(String value) {
            addCriterion("ADDRESS =", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThan(String value) {
            addCriterion("ADDRESS <", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLike(String value) {
            addCriterion("ADDRESS like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotLike(String value) {
            addCriterion("ADDRESS not like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSIn(List<String> values) {
            addCriterion("ADDRESS in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andURLIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andURLIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andURLEqualTo(String value) {
            addCriterion("URL =", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotEqualTo(String value) {
            addCriterion("URL <>", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThan(String value) {
            addCriterion("URL >", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThan(String value) {
            addCriterion("URL <", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLLike(String value) {
            addCriterion("URL like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotLike(String value) {
            addCriterion("URL not like", value, "URL");
            return (Criteria) this;
        }

        public Criteria andURLIn(List<String> values) {
            addCriterion("URL in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotIn(List<String> values) {
            addCriterion("URL not in", values, "URL");
            return (Criteria) this;
        }

        public Criteria andURLBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andURLNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "URL");
            return (Criteria) this;
        }

        public Criteria andCONTACTSIsNull() {
            addCriterion("CONTACTS is null");
            return (Criteria) this;
        }

        public Criteria andCONTACTSIsNotNull() {
            addCriterion("CONTACTS is not null");
            return (Criteria) this;
        }

        public Criteria andCONTACTSEqualTo(String value) {
            addCriterion("CONTACTS =", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSNotEqualTo(String value) {
            addCriterion("CONTACTS <>", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSGreaterThan(String value) {
            addCriterion("CONTACTS >", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTS >=", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSLessThan(String value) {
            addCriterion("CONTACTS <", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSLessThanOrEqualTo(String value) {
            addCriterion("CONTACTS <=", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSLike(String value) {
            addCriterion("CONTACTS like", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSNotLike(String value) {
            addCriterion("CONTACTS not like", value, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSIn(List<String> values) {
            addCriterion("CONTACTS in", values, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSNotIn(List<String> values) {
            addCriterion("CONTACTS not in", values, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSBetween(String value1, String value2) {
            addCriterion("CONTACTS between", value1, value2, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andCONTACTSNotBetween(String value1, String value2) {
            addCriterion("CONTACTS not between", value1, value2, "CONTACTS");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONENotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONELessThan(String value) {
            addCriterion("TELEPHONE <", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONELessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONELike(String value) {
            addCriterion("TELEPHONE like", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONENotLike(String value) {
            addCriterion("TELEPHONE not like", value, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONENotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONEBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andTELEPHONENotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "TELEPHONE");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEIsNull() {
            addCriterion("DEPARTMENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEIsNotNull() {
            addCriterion("DEPARTMENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEEqualTo(String value) {
            addCriterion("DEPARTMENTCODE =", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODENotEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <>", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEGreaterThan(String value) {
            addCriterion("DEPARTMENTCODE >", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE >=", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODELessThan(String value) {
            addCriterion("DEPARTMENTCODE <", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODELessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTCODE <=", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODELike(String value) {
            addCriterion("DEPARTMENTCODE like", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODENotLike(String value) {
            addCriterion("DEPARTMENTCODE not like", value, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEIn(List<String> values) {
            addCriterion("DEPARTMENTCODE in", values, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODENotIn(List<String> values) {
            addCriterion("DEPARTMENTCODE not in", values, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODEBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE between", value1, value2, "DEPARTMENTCODE");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTCODENotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTCODE not between", value1, value2, "DEPARTMENTCODE");
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

        public Criteria andXIsNull() {
            addCriterion("X is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("X is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(BigDecimal value) {
            addCriterion("X =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(BigDecimal value) {
            addCriterion("X <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(BigDecimal value) {
            addCriterion("X >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("X >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(BigDecimal value) {
            addCriterion("X <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(BigDecimal value) {
            addCriterion("X <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<BigDecimal> values) {
            addCriterion("X in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<BigDecimal> values) {
            addCriterion("X not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("X between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("X not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("Y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("Y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(BigDecimal value) {
            addCriterion("Y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(BigDecimal value) {
            addCriterion("Y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(BigDecimal value) {
            addCriterion("Y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(BigDecimal value) {
            addCriterion("Y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<BigDecimal> values) {
            addCriterion("Y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<BigDecimal> values) {
            addCriterion("Y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Y not between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andCXRQIsNull() {
            addCriterion("CXRQ is null");
            return (Criteria) this;
        }

        public Criteria andCXRQIsNotNull() {
            addCriterion("CXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCXRQEqualTo(Date value) {
            addCriterion("CXRQ =", value, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQNotEqualTo(Date value) {
            addCriterion("CXRQ <>", value, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQGreaterThan(Date value) {
            addCriterion("CXRQ >", value, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQGreaterThanOrEqualTo(Date value) {
            addCriterion("CXRQ >=", value, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQLessThan(Date value) {
            addCriterion("CXRQ <", value, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQLessThanOrEqualTo(Date value) {
            addCriterion("CXRQ <=", value, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQIn(List<Date> values) {
            addCriterion("CXRQ in", values, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQNotIn(List<Date> values) {
            addCriterion("CXRQ not in", values, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQBetween(Date value1, Date value2) {
            addCriterion("CXRQ between", value1, value2, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andCXRQNotBetween(Date value1, Date value2) {
            addCriterion("CXRQ not between", value1, value2, "CXRQ");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTIsNull() {
            addCriterion("ISDEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTIsNotNull() {
            addCriterion("ISDEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTEqualTo(String value) {
            addCriterion("ISDEPARTMENT =", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTNotEqualTo(String value) {
            addCriterion("ISDEPARTMENT <>", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTGreaterThan(String value) {
            addCriterion("ISDEPARTMENT >", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEPARTMENT >=", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTLessThan(String value) {
            addCriterion("ISDEPARTMENT <", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTLessThanOrEqualTo(String value) {
            addCriterion("ISDEPARTMENT <=", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTLike(String value) {
            addCriterion("ISDEPARTMENT like", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTNotLike(String value) {
            addCriterion("ISDEPARTMENT not like", value, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTIn(List<String> values) {
            addCriterion("ISDEPARTMENT in", values, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTNotIn(List<String> values) {
            addCriterion("ISDEPARTMENT not in", values, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTBetween(String value1, String value2) {
            addCriterion("ISDEPARTMENT between", value1, value2, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andISDEPARTMENTNotBetween(String value1, String value2) {
            addCriterion("ISDEPARTMENT not between", value1, value2, "ISDEPARTMENT");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andREMARKEqualTo(String value) {
            addCriterion("REMARK =", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThan(String value) {
            addCriterion("REMARK >", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThan(String value) {
            addCriterion("REMARK <", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLike(String value) {
            addCriterion("REMARK like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotLike(String value) {
            addCriterion("REMARK not like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKIn(List<String> values) {
            addCriterion("REMARK in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "REMARK");
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

        public Criteria andXZQBMIsNull() {
            addCriterion("XZQBM is null");
            return (Criteria) this;
        }

        public Criteria andXZQBMIsNotNull() {
            addCriterion("XZQBM is not null");
            return (Criteria) this;
        }

        public Criteria andXZQBMEqualTo(String value) {
            addCriterion("XZQBM =", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMNotEqualTo(String value) {
            addCriterion("XZQBM <>", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMGreaterThan(String value) {
            addCriterion("XZQBM >", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMGreaterThanOrEqualTo(String value) {
            addCriterion("XZQBM >=", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMLessThan(String value) {
            addCriterion("XZQBM <", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMLessThanOrEqualTo(String value) {
            addCriterion("XZQBM <=", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMLike(String value) {
            addCriterion("XZQBM like", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMNotLike(String value) {
            addCriterion("XZQBM not like", value, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMIn(List<String> values) {
            addCriterion("XZQBM in", values, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMNotIn(List<String> values) {
            addCriterion("XZQBM not in", values, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMBetween(String value1, String value2) {
            addCriterion("XZQBM between", value1, value2, "XZQBM");
            return (Criteria) this;
        }

        public Criteria andXZQBMNotBetween(String value1, String value2) {
            addCriterion("XZQBM not between", value1, value2, "XZQBM");
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