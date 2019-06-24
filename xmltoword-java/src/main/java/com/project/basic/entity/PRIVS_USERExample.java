package com.project.basic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PRIVS_USERExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PRIVS_USERExample() {
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

        public Criteria andDEPARTMENTIDIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDEqualTo(String value) {
            addCriterion("DEPARTMENTID =", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotEqualTo(String value) {
            addCriterion("DEPARTMENTID <>", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDGreaterThan(String value) {
            addCriterion("DEPARTMENTID >", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID >=", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDLessThan(String value) {
            addCriterion("DEPARTMENTID <", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID <=", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDLike(String value) {
            addCriterion("DEPARTMENTID like", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotLike(String value) {
            addCriterion("DEPARTMENTID not like", value, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDIn(List<String> values) {
            addCriterion("DEPARTMENTID in", values, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotIn(List<String> values) {
            addCriterion("DEPARTMENTID not in", values, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "DEPARTMENTID");
            return (Criteria) this;
        }

        public Criteria andDEPARTMENTIDNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "DEPARTMENTID");
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

        public Criteria andREALNAMEIsNull() {
            addCriterion("REALNAME is null");
            return (Criteria) this;
        }

        public Criteria andREALNAMEIsNotNull() {
            addCriterion("REALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andREALNAMEEqualTo(String value) {
            addCriterion("REALNAME =", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotEqualTo(String value) {
            addCriterion("REALNAME <>", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEGreaterThan(String value) {
            addCriterion("REALNAME >", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("REALNAME >=", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMELessThan(String value) {
            addCriterion("REALNAME <", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMELessThanOrEqualTo(String value) {
            addCriterion("REALNAME <=", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMELike(String value) {
            addCriterion("REALNAME like", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotLike(String value) {
            addCriterion("REALNAME not like", value, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEIn(List<String> values) {
            addCriterion("REALNAME in", values, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotIn(List<String> values) {
            addCriterion("REALNAME not in", values, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMEBetween(String value1, String value2) {
            addCriterion("REALNAME between", value1, value2, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andREALNAMENotBetween(String value1, String value2) {
            addCriterion("REALNAME not between", value1, value2, "REALNAME");
            return (Criteria) this;
        }

        public Criteria andIDCARDIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIDCARDIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARDEqualTo(String value) {
            addCriterion("IDCARD =", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDGreaterThan(String value) {
            addCriterion("IDCARD >", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDLessThan(String value) {
            addCriterion("IDCARD <", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDLike(String value) {
            addCriterion("IDCARD like", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotLike(String value) {
            addCriterion("IDCARD not like", value, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDIn(List<String> values) {
            addCriterion("IDCARD in", values, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andIDCARDNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "IDCARD");
            return (Criteria) this;
        }

        public Criteria andSEXIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSEXIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSEXEqualTo(String value) {
            addCriterion("SEX =", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotEqualTo(String value) {
            addCriterion("SEX <>", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXGreaterThan(String value) {
            addCriterion("SEX >", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLessThan(String value) {
            addCriterion("SEX <", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLike(String value) {
            addCriterion("SEX like", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotLike(String value) {
            addCriterion("SEX not like", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXIn(List<String> values) {
            addCriterion("SEX in", values, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotIn(List<String> values) {
            addCriterion("SEX not in", values, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "SEX");
            return (Criteria) this;
        }

        public Criteria andUSERCODEIsNull() {
            addCriterion("USERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUSERCODEIsNotNull() {
            addCriterion("USERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUSERCODEEqualTo(String value) {
            addCriterion("USERCODE =", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODENotEqualTo(String value) {
            addCriterion("USERCODE <>", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODEGreaterThan(String value) {
            addCriterion("USERCODE >", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODEGreaterThanOrEqualTo(String value) {
            addCriterion("USERCODE >=", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODELessThan(String value) {
            addCriterion("USERCODE <", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODELessThanOrEqualTo(String value) {
            addCriterion("USERCODE <=", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODELike(String value) {
            addCriterion("USERCODE like", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODENotLike(String value) {
            addCriterion("USERCODE not like", value, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODEIn(List<String> values) {
            addCriterion("USERCODE in", values, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODENotIn(List<String> values) {
            addCriterion("USERCODE not in", values, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODEBetween(String value1, String value2) {
            addCriterion("USERCODE between", value1, value2, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andUSERCODENotBetween(String value1, String value2) {
            addCriterion("USERCODE not between", value1, value2, "USERCODE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMOBILEEqualTo(String value) {
            addCriterion("MOBILE =", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThan(String value) {
            addCriterion("MOBILE >", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThan(String value) {
            addCriterion("MOBILE <", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELike(String value) {
            addCriterion("MOBILE like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotLike(String value) {
            addCriterion("MOBILE not like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIn(List<String> values) {
            addCriterion("MOBILE in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andQQIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQQIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQQEqualTo(String value) {
            addCriterion("QQ =", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotEqualTo(String value) {
            addCriterion("QQ <>", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThan(String value) {
            addCriterion("QQ >", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThan(String value) {
            addCriterion("QQ <", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQLike(String value) {
            addCriterion("QQ like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotLike(String value) {
            addCriterion("QQ not like", value, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQIn(List<String> values) {
            addCriterion("QQ in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotIn(List<String> values) {
            addCriterion("QQ not in", values, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "QQ");
            return (Criteria) this;
        }

        public Criteria andQQNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "QQ");
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

        public Criteria andCAREERENTRYIsNull() {
            addCriterion("CAREERENTRY is null");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYIsNotNull() {
            addCriterion("CAREERENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYEqualTo(Date value) {
            addCriterion("CAREERENTRY =", value, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYNotEqualTo(Date value) {
            addCriterion("CAREERENTRY <>", value, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYGreaterThan(Date value) {
            addCriterion("CAREERENTRY >", value, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYGreaterThanOrEqualTo(Date value) {
            addCriterion("CAREERENTRY >=", value, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYLessThan(Date value) {
            addCriterion("CAREERENTRY <", value, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYLessThanOrEqualTo(Date value) {
            addCriterion("CAREERENTRY <=", value, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYIn(List<Date> values) {
            addCriterion("CAREERENTRY in", values, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYNotIn(List<Date> values) {
            addCriterion("CAREERENTRY not in", values, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYBetween(Date value1, Date value2) {
            addCriterion("CAREERENTRY between", value1, value2, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andCAREERENTRYNotBetween(Date value1, Date value2) {
            addCriterion("CAREERENTRY not between", value1, value2, "CAREERENTRY");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEIsNull() {
            addCriterion("LEAVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEIsNotNull() {
            addCriterion("LEAVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEEqualTo(Date value) {
            addCriterion("LEAVEDATE =", value, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATENotEqualTo(Date value) {
            addCriterion("LEAVEDATE <>", value, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEGreaterThan(Date value) {
            addCriterion("LEAVEDATE >", value, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("LEAVEDATE >=", value, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATELessThan(Date value) {
            addCriterion("LEAVEDATE <", value, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATELessThanOrEqualTo(Date value) {
            addCriterion("LEAVEDATE <=", value, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEIn(List<Date> values) {
            addCriterion("LEAVEDATE in", values, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATENotIn(List<Date> values) {
            addCriterion("LEAVEDATE not in", values, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATEBetween(Date value1, Date value2) {
            addCriterion("LEAVEDATE between", value1, value2, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVEDATENotBetween(Date value1, Date value2) {
            addCriterion("LEAVEDATE not between", value1, value2, "LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEADERIDIsNull() {
            addCriterion("LEADERID is null");
            return (Criteria) this;
        }

        public Criteria andLEADERIDIsNotNull() {
            addCriterion("LEADERID is not null");
            return (Criteria) this;
        }

        public Criteria andLEADERIDEqualTo(String value) {
            addCriterion("LEADERID =", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDNotEqualTo(String value) {
            addCriterion("LEADERID <>", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDGreaterThan(String value) {
            addCriterion("LEADERID >", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDGreaterThanOrEqualTo(String value) {
            addCriterion("LEADERID >=", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDLessThan(String value) {
            addCriterion("LEADERID <", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDLessThanOrEqualTo(String value) {
            addCriterion("LEADERID <=", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDLike(String value) {
            addCriterion("LEADERID like", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDNotLike(String value) {
            addCriterion("LEADERID not like", value, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDIn(List<String> values) {
            addCriterion("LEADERID in", values, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDNotIn(List<String> values) {
            addCriterion("LEADERID not in", values, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDBetween(String value1, String value2) {
            addCriterion("LEADERID between", value1, value2, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andLEADERIDNotBetween(String value1, String value2) {
            addCriterion("LEADERID not between", value1, value2, "LEADERID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDIsNull() {
            addCriterion("POSITIONID is null");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDIsNotNull() {
            addCriterion("POSITIONID is not null");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDEqualTo(String value) {
            addCriterion("POSITIONID =", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDNotEqualTo(String value) {
            addCriterion("POSITIONID <>", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDGreaterThan(String value) {
            addCriterion("POSITIONID >", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDGreaterThanOrEqualTo(String value) {
            addCriterion("POSITIONID >=", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDLessThan(String value) {
            addCriterion("POSITIONID <", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDLessThanOrEqualTo(String value) {
            addCriterion("POSITIONID <=", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDLike(String value) {
            addCriterion("POSITIONID like", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDNotLike(String value) {
            addCriterion("POSITIONID not like", value, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDIn(List<String> values) {
            addCriterion("POSITIONID in", values, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDNotIn(List<String> values) {
            addCriterion("POSITIONID not in", values, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDBetween(String value1, String value2) {
            addCriterion("POSITIONID between", value1, value2, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIDNotBetween(String value1, String value2) {
            addCriterion("POSITIONID not between", value1, value2, "POSITIONID");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andTOKENIsNull() {
            addCriterion("TOKEN is null");
            return (Criteria) this;
        }

        public Criteria andTOKENIsNotNull() {
            addCriterion("TOKEN is not null");
            return (Criteria) this;
        }

        public Criteria andTOKENEqualTo(String value) {
            addCriterion("TOKEN =", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotEqualTo(String value) {
            addCriterion("TOKEN <>", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENGreaterThan(String value) {
            addCriterion("TOKEN >", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN >=", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENLessThan(String value) {
            addCriterion("TOKEN <", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENLessThanOrEqualTo(String value) {
            addCriterion("TOKEN <=", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENLike(String value) {
            addCriterion("TOKEN like", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotLike(String value) {
            addCriterion("TOKEN not like", value, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENIn(List<String> values) {
            addCriterion("TOKEN in", values, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotIn(List<String> values) {
            addCriterion("TOKEN not in", values, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENBetween(String value1, String value2) {
            addCriterion("TOKEN between", value1, value2, "TOKEN");
            return (Criteria) this;
        }

        public Criteria andTOKENNotBetween(String value1, String value2) {
            addCriterion("TOKEN not between", value1, value2, "TOKEN");
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

        public Criteria andISLOCKEDIsNull() {
            addCriterion("ISLOCKED is null");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDIsNotNull() {
            addCriterion("ISLOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDEqualTo(String value) {
            addCriterion("ISLOCKED =", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDNotEqualTo(String value) {
            addCriterion("ISLOCKED <>", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDGreaterThan(String value) {
            addCriterion("ISLOCKED >", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDGreaterThanOrEqualTo(String value) {
            addCriterion("ISLOCKED >=", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDLessThan(String value) {
            addCriterion("ISLOCKED <", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDLessThanOrEqualTo(String value) {
            addCriterion("ISLOCKED <=", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDLike(String value) {
            addCriterion("ISLOCKED like", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDNotLike(String value) {
            addCriterion("ISLOCKED not like", value, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDIn(List<String> values) {
            addCriterion("ISLOCKED in", values, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDNotIn(List<String> values) {
            addCriterion("ISLOCKED not in", values, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDBetween(String value1, String value2) {
            addCriterion("ISLOCKED between", value1, value2, "ISLOCKED");
            return (Criteria) this;
        }

        public Criteria andISLOCKEDNotBetween(String value1, String value2) {
            addCriterion("ISLOCKED not between", value1, value2, "ISLOCKED");
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

        public Criteria andBGWZIsNull() {
            addCriterion("BGWZ is null");
            return (Criteria) this;
        }

        public Criteria andBGWZIsNotNull() {
            addCriterion("BGWZ is not null");
            return (Criteria) this;
        }

        public Criteria andBGWZEqualTo(String value) {
            addCriterion("BGWZ =", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZNotEqualTo(String value) {
            addCriterion("BGWZ <>", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZGreaterThan(String value) {
            addCriterion("BGWZ >", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZGreaterThanOrEqualTo(String value) {
            addCriterion("BGWZ >=", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZLessThan(String value) {
            addCriterion("BGWZ <", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZLessThanOrEqualTo(String value) {
            addCriterion("BGWZ <=", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZLike(String value) {
            addCriterion("BGWZ like", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZNotLike(String value) {
            addCriterion("BGWZ not like", value, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZIn(List<String> values) {
            addCriterion("BGWZ in", values, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZNotIn(List<String> values) {
            addCriterion("BGWZ not in", values, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZBetween(String value1, String value2) {
            addCriterion("BGWZ between", value1, value2, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGWZNotBetween(String value1, String value2) {
            addCriterion("BGWZ not between", value1, value2, "BGWZ");
            return (Criteria) this;
        }

        public Criteria andBGDHIsNull() {
            addCriterion("BGDH is null");
            return (Criteria) this;
        }

        public Criteria andBGDHIsNotNull() {
            addCriterion("BGDH is not null");
            return (Criteria) this;
        }

        public Criteria andBGDHEqualTo(String value) {
            addCriterion("BGDH =", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHNotEqualTo(String value) {
            addCriterion("BGDH <>", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHGreaterThan(String value) {
            addCriterion("BGDH >", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHGreaterThanOrEqualTo(String value) {
            addCriterion("BGDH >=", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHLessThan(String value) {
            addCriterion("BGDH <", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHLessThanOrEqualTo(String value) {
            addCriterion("BGDH <=", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHLike(String value) {
            addCriterion("BGDH like", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHNotLike(String value) {
            addCriterion("BGDH not like", value, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHIn(List<String> values) {
            addCriterion("BGDH in", values, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHNotIn(List<String> values) {
            addCriterion("BGDH not in", values, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHBetween(String value1, String value2) {
            addCriterion("BGDH between", value1, value2, "BGDH");
            return (Criteria) this;
        }

        public Criteria andBGDHNotBetween(String value1, String value2) {
            addCriterion("BGDH not between", value1, value2, "BGDH");
            return (Criteria) this;
        }

        public Criteria andGNIsNull() {
            addCriterion("GN is null");
            return (Criteria) this;
        }

        public Criteria andGNIsNotNull() {
            addCriterion("GN is not null");
            return (Criteria) this;
        }

        public Criteria andGNEqualTo(String value) {
            addCriterion("GN =", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNNotEqualTo(String value) {
            addCriterion("GN <>", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNGreaterThan(String value) {
            addCriterion("GN >", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNGreaterThanOrEqualTo(String value) {
            addCriterion("GN >=", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNLessThan(String value) {
            addCriterion("GN <", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNLessThanOrEqualTo(String value) {
            addCriterion("GN <=", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNLike(String value) {
            addCriterion("GN like", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNNotLike(String value) {
            addCriterion("GN not like", value, "GN");
            return (Criteria) this;
        }

        public Criteria andGNIn(List<String> values) {
            addCriterion("GN in", values, "GN");
            return (Criteria) this;
        }

        public Criteria andGNNotIn(List<String> values) {
            addCriterion("GN not in", values, "GN");
            return (Criteria) this;
        }

        public Criteria andGNBetween(String value1, String value2) {
            addCriterion("GN between", value1, value2, "GN");
            return (Criteria) this;
        }

        public Criteria andGNNotBetween(String value1, String value2) {
            addCriterion("GN not between", value1, value2, "GN");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDIsNull() {
            addCriterion("CLIENTID is null");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDIsNotNull() {
            addCriterion("CLIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDEqualTo(String value) {
            addCriterion("CLIENTID =", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDNotEqualTo(String value) {
            addCriterion("CLIENTID <>", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDGreaterThan(String value) {
            addCriterion("CLIENTID >", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTID >=", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDLessThan(String value) {
            addCriterion("CLIENTID <", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDLessThanOrEqualTo(String value) {
            addCriterion("CLIENTID <=", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDLike(String value) {
            addCriterion("CLIENTID like", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDNotLike(String value) {
            addCriterion("CLIENTID not like", value, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDIn(List<String> values) {
            addCriterion("CLIENTID in", values, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDNotIn(List<String> values) {
            addCriterion("CLIENTID not in", values, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDBetween(String value1, String value2) {
            addCriterion("CLIENTID between", value1, value2, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andCLIENTIDNotBetween(String value1, String value2) {
            addCriterion("CLIENTID not between", value1, value2, "CLIENTID");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMIsNull() {
            addCriterion("SFYXGMM is null");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMIsNotNull() {
            addCriterion("SFYXGMM is not null");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMEqualTo(String value) {
            addCriterion("SFYXGMM =", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMNotEqualTo(String value) {
            addCriterion("SFYXGMM <>", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMGreaterThan(String value) {
            addCriterion("SFYXGMM >", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMGreaterThanOrEqualTo(String value) {
            addCriterion("SFYXGMM >=", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMLessThan(String value) {
            addCriterion("SFYXGMM <", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMLessThanOrEqualTo(String value) {
            addCriterion("SFYXGMM <=", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMLike(String value) {
            addCriterion("SFYXGMM like", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMNotLike(String value) {
            addCriterion("SFYXGMM not like", value, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMIn(List<String> values) {
            addCriterion("SFYXGMM in", values, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMNotIn(List<String> values) {
            addCriterion("SFYXGMM not in", values, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMBetween(String value1, String value2) {
            addCriterion("SFYXGMM between", value1, value2, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andSFYXGMMNotBetween(String value1, String value2) {
            addCriterion("SFYXGMM not between", value1, value2, "SFYXGMM");
            return (Criteria) this;
        }

        public Criteria andZSBMIDIsNull() {
            addCriterion("ZSBMID is null");
            return (Criteria) this;
        }

        public Criteria andZSBMIDIsNotNull() {
            addCriterion("ZSBMID is not null");
            return (Criteria) this;
        }

        public Criteria andZSBMIDEqualTo(String value) {
            addCriterion("ZSBMID =", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDNotEqualTo(String value) {
            addCriterion("ZSBMID <>", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDGreaterThan(String value) {
            addCriterion("ZSBMID >", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZSBMID >=", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDLessThan(String value) {
            addCriterion("ZSBMID <", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDLessThanOrEqualTo(String value) {
            addCriterion("ZSBMID <=", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDLike(String value) {
            addCriterion("ZSBMID like", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDNotLike(String value) {
            addCriterion("ZSBMID not like", value, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDIn(List<String> values) {
            addCriterion("ZSBMID in", values, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDNotIn(List<String> values) {
            addCriterion("ZSBMID not in", values, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDBetween(String value1, String value2) {
            addCriterion("ZSBMID between", value1, value2, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andZSBMIDNotBetween(String value1, String value2) {
            addCriterion("ZSBMID not between", value1, value2, "ZSBMID");
            return (Criteria) this;
        }

        public Criteria andWXBSMIsNull() {
            addCriterion("WXBSM is null");
            return (Criteria) this;
        }

        public Criteria andWXBSMIsNotNull() {
            addCriterion("WXBSM is not null");
            return (Criteria) this;
        }

        public Criteria andWXBSMEqualTo(String value) {
            addCriterion("WXBSM =", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMNotEqualTo(String value) {
            addCriterion("WXBSM <>", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMGreaterThan(String value) {
            addCriterion("WXBSM >", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMGreaterThanOrEqualTo(String value) {
            addCriterion("WXBSM >=", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMLessThan(String value) {
            addCriterion("WXBSM <", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMLessThanOrEqualTo(String value) {
            addCriterion("WXBSM <=", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMLike(String value) {
            addCriterion("WXBSM like", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMNotLike(String value) {
            addCriterion("WXBSM not like", value, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMIn(List<String> values) {
            addCriterion("WXBSM in", values, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMNotIn(List<String> values) {
            addCriterion("WXBSM not in", values, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMBetween(String value1, String value2) {
            addCriterion("WXBSM between", value1, value2, "WXBSM");
            return (Criteria) this;
        }

        public Criteria andWXBSMNotBetween(String value1, String value2) {
            addCriterion("WXBSM not between", value1, value2, "WXBSM");
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

        public Criteria andNAMEPasswordIsNull() {
            addCriterion("NAMEPassword is null");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordIsNotNull() {
            addCriterion("NAMEPassword is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordEqualTo(String value) {
            addCriterion("NAMEPassword =", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordNotEqualTo(String value) {
            addCriterion("NAMEPassword <>", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordGreaterThan(String value) {
            addCriterion("NAMEPassword >", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("NAMEPassword >=", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordLessThan(String value) {
            addCriterion("NAMEPassword <", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordLessThanOrEqualTo(String value) {
            addCriterion("NAMEPassword <=", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordLike(String value) {
            addCriterion("NAMEPassword like", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordNotLike(String value) {
            addCriterion("NAMEPassword not like", value, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordIn(List<String> values) {
            addCriterion("NAMEPassword in", values, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordNotIn(List<String> values) {
            addCriterion("NAMEPassword not in", values, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordBetween(String value1, String value2) {
            addCriterion("NAMEPassword between", value1, value2, "NAMEPassword");
            return (Criteria) this;
        }

        public Criteria andNAMEPasswordNotBetween(String value1, String value2) {
            addCriterion("NAMEPassword not between", value1, value2, "NAMEPassword");
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