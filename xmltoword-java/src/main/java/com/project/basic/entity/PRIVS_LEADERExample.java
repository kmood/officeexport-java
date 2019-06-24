package com.project.basic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PRIVS_LEADERExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PRIVS_LEADERExample() {
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

        public Criteria andUSERIDIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUSERIDIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUSERIDEqualTo(String value) {
            addCriterion("USERID =", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotEqualTo(String value) {
            addCriterion("USERID <>", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDGreaterThan(String value) {
            addCriterion("USERID >", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLessThan(String value) {
            addCriterion("USERID <", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDLike(String value) {
            addCriterion("USERID like", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotLike(String value) {
            addCriterion("USERID not like", value, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDIn(List<String> values) {
            addCriterion("USERID in", values, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotIn(List<String> values) {
            addCriterion("USERID not in", values, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "USERID");
            return (Criteria) this;
        }

        public Criteria andUSERIDNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "USERID");
            return (Criteria) this;
        }

        public Criteria andROLENAMEIsNull() {
            addCriterion("ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andROLENAMEIsNotNull() {
            addCriterion("ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andROLENAMEEqualTo(String value) {
            addCriterion("ROLENAME =", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotEqualTo(String value) {
            addCriterion("ROLENAME <>", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEGreaterThan(String value) {
            addCriterion("ROLENAME >", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ROLENAME >=", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMELessThan(String value) {
            addCriterion("ROLENAME <", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMELessThanOrEqualTo(String value) {
            addCriterion("ROLENAME <=", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMELike(String value) {
            addCriterion("ROLENAME like", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotLike(String value) {
            addCriterion("ROLENAME not like", value, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEIn(List<String> values) {
            addCriterion("ROLENAME in", values, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotIn(List<String> values) {
            addCriterion("ROLENAME not in", values, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMEBetween(String value1, String value2) {
            addCriterion("ROLENAME between", value1, value2, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andROLENAMENotBetween(String value1, String value2) {
            addCriterion("ROLENAME not between", value1, value2, "ROLENAME");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPOSITIONEqualTo(String value) {
            addCriterion("POSITION =", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONGreaterThan(String value) {
            addCriterion("POSITION >", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONLessThan(String value) {
            addCriterion("POSITION <", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONLike(String value) {
            addCriterion("POSITION like", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONNotLike(String value) {
            addCriterion("POSITION not like", value, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONIn(List<String> values) {
            addCriterion("POSITION in", values, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "POSITION");
            return (Criteria) this;
        }

        public Criteria andPOSITIONNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "POSITION");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYIsNull() {
            addCriterion("RESPONSIBILITY is null");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYIsNotNull() {
            addCriterion("RESPONSIBILITY is not null");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYEqualTo(String value) {
            addCriterion("RESPONSIBILITY =", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYNotEqualTo(String value) {
            addCriterion("RESPONSIBILITY <>", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYGreaterThan(String value) {
            addCriterion("RESPONSIBILITY >", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSIBILITY >=", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYLessThan(String value) {
            addCriterion("RESPONSIBILITY <", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYLessThanOrEqualTo(String value) {
            addCriterion("RESPONSIBILITY <=", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYLike(String value) {
            addCriterion("RESPONSIBILITY like", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYNotLike(String value) {
            addCriterion("RESPONSIBILITY not like", value, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYIn(List<String> values) {
            addCriterion("RESPONSIBILITY in", values, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYNotIn(List<String> values) {
            addCriterion("RESPONSIBILITY not in", values, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYBetween(String value1, String value2) {
            addCriterion("RESPONSIBILITY between", value1, value2, "RESPONSIBILITY");
            return (Criteria) this;
        }

        public Criteria andRESPONSIBILITYNotBetween(String value1, String value2) {
            addCriterion("RESPONSIBILITY not between", value1, value2, "RESPONSIBILITY");
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

        public Criteria andLEADERLEVELIsNull() {
            addCriterion("LEADERLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELIsNotNull() {
            addCriterion("LEADERLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELEqualTo(String value) {
            addCriterion("LEADERLEVEL =", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELNotEqualTo(String value) {
            addCriterion("LEADERLEVEL <>", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELGreaterThan(String value) {
            addCriterion("LEADERLEVEL >", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELGreaterThanOrEqualTo(String value) {
            addCriterion("LEADERLEVEL >=", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELLessThan(String value) {
            addCriterion("LEADERLEVEL <", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELLessThanOrEqualTo(String value) {
            addCriterion("LEADERLEVEL <=", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELLike(String value) {
            addCriterion("LEADERLEVEL like", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELNotLike(String value) {
            addCriterion("LEADERLEVEL not like", value, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELIn(List<String> values) {
            addCriterion("LEADERLEVEL in", values, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELNotIn(List<String> values) {
            addCriterion("LEADERLEVEL not in", values, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELBetween(String value1, String value2) {
            addCriterion("LEADERLEVEL between", value1, value2, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andLEADERLEVELNotBetween(String value1, String value2) {
            addCriterion("LEADERLEVEL not between", value1, value2, "LEADERLEVEL");
            return (Criteria) this;
        }

        public Criteria andISSINGLEIsNull() {
            addCriterion("ISSINGLE is null");
            return (Criteria) this;
        }

        public Criteria andISSINGLEIsNotNull() {
            addCriterion("ISSINGLE is not null");
            return (Criteria) this;
        }

        public Criteria andISSINGLEEqualTo(String value) {
            addCriterion("ISSINGLE =", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLENotEqualTo(String value) {
            addCriterion("ISSINGLE <>", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLEGreaterThan(String value) {
            addCriterion("ISSINGLE >", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLEGreaterThanOrEqualTo(String value) {
            addCriterion("ISSINGLE >=", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLELessThan(String value) {
            addCriterion("ISSINGLE <", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLELessThanOrEqualTo(String value) {
            addCriterion("ISSINGLE <=", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLELike(String value) {
            addCriterion("ISSINGLE like", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLENotLike(String value) {
            addCriterion("ISSINGLE not like", value, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLEIn(List<String> values) {
            addCriterion("ISSINGLE in", values, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLENotIn(List<String> values) {
            addCriterion("ISSINGLE not in", values, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLEBetween(String value1, String value2) {
            addCriterion("ISSINGLE between", value1, value2, "ISSINGLE");
            return (Criteria) this;
        }

        public Criteria andISSINGLENotBetween(String value1, String value2) {
            addCriterion("ISSINGLE not between", value1, value2, "ISSINGLE");
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