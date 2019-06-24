package com.test.project.basic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XMGL_XMXXExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XMGL_XMXXExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andXMBHIsNull() {
            addCriterion("XMBH is null");
            return (Criteria) this;
        }

        public Criteria andXMBHIsNotNull() {
            addCriterion("XMBH is not null");
            return (Criteria) this;
        }

        public Criteria andXMBHEqualTo(String value) {
            addCriterion("XMBH =", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHNotEqualTo(String value) {
            addCriterion("XMBH <>", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHGreaterThan(String value) {
            addCriterion("XMBH >", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHGreaterThanOrEqualTo(String value) {
            addCriterion("XMBH >=", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHLessThan(String value) {
            addCriterion("XMBH <", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHLessThanOrEqualTo(String value) {
            addCriterion("XMBH <=", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHLike(String value) {
            addCriterion("XMBH like", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHNotLike(String value) {
            addCriterion("XMBH not like", value, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHIn(List<String> values) {
            addCriterion("XMBH in", values, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHNotIn(List<String> values) {
            addCriterion("XMBH not in", values, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHBetween(String value1, String value2) {
            addCriterion("XMBH between", value1, value2, "XMBH");
            return (Criteria) this;
        }

        public Criteria andXMBHNotBetween(String value1, String value2) {
            addCriterion("XMBH not between", value1, value2, "XMBH");
            return (Criteria) this;
        }

        public Criteria andYLXMCIsNull() {
            addCriterion("YLXMC is null");
            return (Criteria) this;
        }

        public Criteria andYLXMCIsNotNull() {
            addCriterion("YLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andYLXMCEqualTo(String value) {
            addCriterion("YLXMC =", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCNotEqualTo(String value) {
            addCriterion("YLXMC <>", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCGreaterThan(String value) {
            addCriterion("YLXMC >", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCGreaterThanOrEqualTo(String value) {
            addCriterion("YLXMC >=", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCLessThan(String value) {
            addCriterion("YLXMC <", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCLessThanOrEqualTo(String value) {
            addCriterion("YLXMC <=", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCLike(String value) {
            addCriterion("YLXMC like", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCNotLike(String value) {
            addCriterion("YLXMC not like", value, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCIn(List<String> values) {
            addCriterion("YLXMC in", values, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCNotIn(List<String> values) {
            addCriterion("YLXMC not in", values, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCBetween(String value1, String value2) {
            addCriterion("YLXMC between", value1, value2, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andYLXMCNotBetween(String value1, String value2) {
            addCriterion("YLXMC not between", value1, value2, "YLXMC");
            return (Criteria) this;
        }

        public Criteria andXMJCIsNull() {
            addCriterion("XMJC is null");
            return (Criteria) this;
        }

        public Criteria andXMJCIsNotNull() {
            addCriterion("XMJC is not null");
            return (Criteria) this;
        }

        public Criteria andXMJCEqualTo(String value) {
            addCriterion("XMJC =", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCNotEqualTo(String value) {
            addCriterion("XMJC <>", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCGreaterThan(String value) {
            addCriterion("XMJC >", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCGreaterThanOrEqualTo(String value) {
            addCriterion("XMJC >=", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCLessThan(String value) {
            addCriterion("XMJC <", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCLessThanOrEqualTo(String value) {
            addCriterion("XMJC <=", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCLike(String value) {
            addCriterion("XMJC like", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCNotLike(String value) {
            addCriterion("XMJC not like", value, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCIn(List<String> values) {
            addCriterion("XMJC in", values, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCNotIn(List<String> values) {
            addCriterion("XMJC not in", values, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCBetween(String value1, String value2) {
            addCriterion("XMJC between", value1, value2, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMJCNotBetween(String value1, String value2) {
            addCriterion("XMJC not between", value1, value2, "XMJC");
            return (Criteria) this;
        }

        public Criteria andXMMCIsNull() {
            addCriterion("XMMC is null");
            return (Criteria) this;
        }

        public Criteria andXMMCIsNotNull() {
            addCriterion("XMMC is not null");
            return (Criteria) this;
        }

        public Criteria andXMMCEqualTo(String value) {
            addCriterion("XMMC =", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotEqualTo(String value) {
            addCriterion("XMMC <>", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCGreaterThan(String value) {
            addCriterion("XMMC >", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCGreaterThanOrEqualTo(String value) {
            addCriterion("XMMC >=", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCLessThan(String value) {
            addCriterion("XMMC <", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCLessThanOrEqualTo(String value) {
            addCriterion("XMMC <=", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCLike(String value) {
            addCriterion("XMMC like", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotLike(String value) {
            addCriterion("XMMC not like", value, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCIn(List<String> values) {
            addCriterion("XMMC in", values, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotIn(List<String> values) {
            addCriterion("XMMC not in", values, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCBetween(String value1, String value2) {
            addCriterion("XMMC between", value1, value2, "XMMC");
            return (Criteria) this;
        }

        public Criteria andXMMCNotBetween(String value1, String value2) {
            addCriterion("XMMC not between", value1, value2, "XMMC");
            return (Criteria) this;
        }

        public Criteria andYZDWIsNull() {
            addCriterion("YZDW is null");
            return (Criteria) this;
        }

        public Criteria andYZDWIsNotNull() {
            addCriterion("YZDW is not null");
            return (Criteria) this;
        }

        public Criteria andYZDWEqualTo(String value) {
            addCriterion("YZDW =", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWNotEqualTo(String value) {
            addCriterion("YZDW <>", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWGreaterThan(String value) {
            addCriterion("YZDW >", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWGreaterThanOrEqualTo(String value) {
            addCriterion("YZDW >=", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWLessThan(String value) {
            addCriterion("YZDW <", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWLessThanOrEqualTo(String value) {
            addCriterion("YZDW <=", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWLike(String value) {
            addCriterion("YZDW like", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWNotLike(String value) {
            addCriterion("YZDW not like", value, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWIn(List<String> values) {
            addCriterion("YZDW in", values, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWNotIn(List<String> values) {
            addCriterion("YZDW not in", values, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWBetween(String value1, String value2) {
            addCriterion("YZDW between", value1, value2, "YZDW");
            return (Criteria) this;
        }

        public Criteria andYZDWNotBetween(String value1, String value2) {
            addCriterion("YZDW not between", value1, value2, "YZDW");
            return (Criteria) this;
        }

        public Criteria andSQBMIDIsNull() {
            addCriterion("SQBMID is null");
            return (Criteria) this;
        }

        public Criteria andSQBMIDIsNotNull() {
            addCriterion("SQBMID is not null");
            return (Criteria) this;
        }

        public Criteria andSQBMIDEqualTo(String value) {
            addCriterion("SQBMID =", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDNotEqualTo(String value) {
            addCriterion("SQBMID <>", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDGreaterThan(String value) {
            addCriterion("SQBMID >", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDGreaterThanOrEqualTo(String value) {
            addCriterion("SQBMID >=", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDLessThan(String value) {
            addCriterion("SQBMID <", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDLessThanOrEqualTo(String value) {
            addCriterion("SQBMID <=", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDLike(String value) {
            addCriterion("SQBMID like", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDNotLike(String value) {
            addCriterion("SQBMID not like", value, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDIn(List<String> values) {
            addCriterion("SQBMID in", values, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDNotIn(List<String> values) {
            addCriterion("SQBMID not in", values, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDBetween(String value1, String value2) {
            addCriterion("SQBMID between", value1, value2, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andSQBMIDNotBetween(String value1, String value2) {
            addCriterion("SQBMID not between", value1, value2, "SQBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDIsNull() {
            addCriterion("CDBMID is null");
            return (Criteria) this;
        }

        public Criteria andCDBMIDIsNotNull() {
            addCriterion("CDBMID is not null");
            return (Criteria) this;
        }

        public Criteria andCDBMIDEqualTo(String value) {
            addCriterion("CDBMID =", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDNotEqualTo(String value) {
            addCriterion("CDBMID <>", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDGreaterThan(String value) {
            addCriterion("CDBMID >", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDGreaterThanOrEqualTo(String value) {
            addCriterion("CDBMID >=", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDLessThan(String value) {
            addCriterion("CDBMID <", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDLessThanOrEqualTo(String value) {
            addCriterion("CDBMID <=", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDLike(String value) {
            addCriterion("CDBMID like", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDNotLike(String value) {
            addCriterion("CDBMID not like", value, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDIn(List<String> values) {
            addCriterion("CDBMID in", values, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDNotIn(List<String> values) {
            addCriterion("CDBMID not in", values, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDBetween(String value1, String value2) {
            addCriterion("CDBMID between", value1, value2, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andCDBMIDNotBetween(String value1, String value2) {
            addCriterion("CDBMID not between", value1, value2, "CDBMID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDIsNull() {
            addCriterion("XMJLID is null");
            return (Criteria) this;
        }

        public Criteria andXMJLIDIsNotNull() {
            addCriterion("XMJLID is not null");
            return (Criteria) this;
        }

        public Criteria andXMJLIDEqualTo(String value) {
            addCriterion("XMJLID =", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDNotEqualTo(String value) {
            addCriterion("XMJLID <>", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDGreaterThan(String value) {
            addCriterion("XMJLID >", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDGreaterThanOrEqualTo(String value) {
            addCriterion("XMJLID >=", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDLessThan(String value) {
            addCriterion("XMJLID <", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDLessThanOrEqualTo(String value) {
            addCriterion("XMJLID <=", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDLike(String value) {
            addCriterion("XMJLID like", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDNotLike(String value) {
            addCriterion("XMJLID not like", value, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDIn(List<String> values) {
            addCriterion("XMJLID in", values, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDNotIn(List<String> values) {
            addCriterion("XMJLID not in", values, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDBetween(String value1, String value2) {
            addCriterion("XMJLID between", value1, value2, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMJLIDNotBetween(String value1, String value2) {
            addCriterion("XMJLID not between", value1, value2, "XMJLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDIsNull() {
            addCriterion("XMZLID is null");
            return (Criteria) this;
        }

        public Criteria andXMZLIDIsNotNull() {
            addCriterion("XMZLID is not null");
            return (Criteria) this;
        }

        public Criteria andXMZLIDEqualTo(String value) {
            addCriterion("XMZLID =", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDNotEqualTo(String value) {
            addCriterion("XMZLID <>", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDGreaterThan(String value) {
            addCriterion("XMZLID >", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDGreaterThanOrEqualTo(String value) {
            addCriterion("XMZLID >=", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDLessThan(String value) {
            addCriterion("XMZLID <", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDLessThanOrEqualTo(String value) {
            addCriterion("XMZLID <=", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDLike(String value) {
            addCriterion("XMZLID like", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDNotLike(String value) {
            addCriterion("XMZLID not like", value, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDIn(List<String> values) {
            addCriterion("XMZLID in", values, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDNotIn(List<String> values) {
            addCriterion("XMZLID not in", values, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDBetween(String value1, String value2) {
            addCriterion("XMZLID between", value1, value2, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andXMZLIDNotBetween(String value1, String value2) {
            addCriterion("XMZLID not between", value1, value2, "XMZLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDIsNull() {
            addCriterion("JSJLID is null");
            return (Criteria) this;
        }

        public Criteria andJSJLIDIsNotNull() {
            addCriterion("JSJLID is not null");
            return (Criteria) this;
        }

        public Criteria andJSJLIDEqualTo(String value) {
            addCriterion("JSJLID =", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDNotEqualTo(String value) {
            addCriterion("JSJLID <>", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDGreaterThan(String value) {
            addCriterion("JSJLID >", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDGreaterThanOrEqualTo(String value) {
            addCriterion("JSJLID >=", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDLessThan(String value) {
            addCriterion("JSJLID <", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDLessThanOrEqualTo(String value) {
            addCriterion("JSJLID <=", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDLike(String value) {
            addCriterion("JSJLID like", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDNotLike(String value) {
            addCriterion("JSJLID not like", value, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDIn(List<String> values) {
            addCriterion("JSJLID in", values, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDNotIn(List<String> values) {
            addCriterion("JSJLID not in", values, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDBetween(String value1, String value2) {
            addCriterion("JSJLID between", value1, value2, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSJLIDNotBetween(String value1, String value2) {
            addCriterion("JSJLID not between", value1, value2, "JSJLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDIsNull() {
            addCriterion("JSZLID is null");
            return (Criteria) this;
        }

        public Criteria andJSZLIDIsNotNull() {
            addCriterion("JSZLID is not null");
            return (Criteria) this;
        }

        public Criteria andJSZLIDEqualTo(String value) {
            addCriterion("JSZLID =", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDNotEqualTo(String value) {
            addCriterion("JSZLID <>", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDGreaterThan(String value) {
            addCriterion("JSZLID >", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDGreaterThanOrEqualTo(String value) {
            addCriterion("JSZLID >=", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDLessThan(String value) {
            addCriterion("JSZLID <", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDLessThanOrEqualTo(String value) {
            addCriterion("JSZLID <=", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDLike(String value) {
            addCriterion("JSZLID like", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDNotLike(String value) {
            addCriterion("JSZLID not like", value, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDIn(List<String> values) {
            addCriterion("JSZLID in", values, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDNotIn(List<String> values) {
            addCriterion("JSZLID not in", values, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDBetween(String value1, String value2) {
            addCriterion("JSZLID between", value1, value2, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andJSZLIDNotBetween(String value1, String value2) {
            addCriterion("JSZLID not between", value1, value2, "JSZLID");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQIsNull() {
            addCriterion("CSJMGDFWRWYQ is null");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQIsNotNull() {
            addCriterion("CSJMGDFWRWYQ is not null");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQEqualTo(String value) {
            addCriterion("CSJMGDFWRWYQ =", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQNotEqualTo(String value) {
            addCriterion("CSJMGDFWRWYQ <>", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQGreaterThan(String value) {
            addCriterion("CSJMGDFWRWYQ >", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQGreaterThanOrEqualTo(String value) {
            addCriterion("CSJMGDFWRWYQ >=", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQLessThan(String value) {
            addCriterion("CSJMGDFWRWYQ <", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQLessThanOrEqualTo(String value) {
            addCriterion("CSJMGDFWRWYQ <=", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQLike(String value) {
            addCriterion("CSJMGDFWRWYQ like", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQNotLike(String value) {
            addCriterion("CSJMGDFWRWYQ not like", value, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQIn(List<String> values) {
            addCriterion("CSJMGDFWRWYQ in", values, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQNotIn(List<String> values) {
            addCriterion("CSJMGDFWRWYQ not in", values, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQBetween(String value1, String value2) {
            addCriterion("CSJMGDFWRWYQ between", value1, value2, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andCSJMGDFWRWYQNotBetween(String value1, String value2) {
            addCriterion("CSJMGDFWRWYQ not between", value1, value2, "CSJMGDFWRWYQ");
            return (Criteria) this;
        }

        public Criteria andXMLXIsNull() {
            addCriterion("XMLX is null");
            return (Criteria) this;
        }

        public Criteria andXMLXIsNotNull() {
            addCriterion("XMLX is not null");
            return (Criteria) this;
        }

        public Criteria andXMLXEqualTo(Integer value) {
            addCriterion("XMLX =", value, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXNotEqualTo(Integer value) {
            addCriterion("XMLX <>", value, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXGreaterThan(Integer value) {
            addCriterion("XMLX >", value, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXGreaterThanOrEqualTo(Integer value) {
            addCriterion("XMLX >=", value, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXLessThan(Integer value) {
            addCriterion("XMLX <", value, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXLessThanOrEqualTo(Integer value) {
            addCriterion("XMLX <=", value, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXIn(List<Integer> values) {
            addCriterion("XMLX in", values, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXNotIn(List<Integer> values) {
            addCriterion("XMLX not in", values, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXBetween(Integer value1, Integer value2) {
            addCriterion("XMLX between", value1, value2, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMLXNotBetween(Integer value1, Integer value2) {
            addCriterion("XMLX not between", value1, value2, "XMLX");
            return (Criteria) this;
        }

        public Criteria andXMNDIsNull() {
            addCriterion("XMND is null");
            return (Criteria) this;
        }

        public Criteria andXMNDIsNotNull() {
            addCriterion("XMND is not null");
            return (Criteria) this;
        }

        public Criteria andXMNDEqualTo(String value) {
            addCriterion("XMND =", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDNotEqualTo(String value) {
            addCriterion("XMND <>", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDGreaterThan(String value) {
            addCriterion("XMND >", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDGreaterThanOrEqualTo(String value) {
            addCriterion("XMND >=", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDLessThan(String value) {
            addCriterion("XMND <", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDLessThanOrEqualTo(String value) {
            addCriterion("XMND <=", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDLike(String value) {
            addCriterion("XMND like", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDNotLike(String value) {
            addCriterion("XMND not like", value, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDIn(List<String> values) {
            addCriterion("XMND in", values, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDNotIn(List<String> values) {
            addCriterion("XMND not in", values, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDBetween(String value1, String value2) {
            addCriterion("XMND between", value1, value2, "XMND");
            return (Criteria) this;
        }

        public Criteria andXMNDNotBetween(String value1, String value2) {
            addCriterion("XMND not between", value1, value2, "XMND");
            return (Criteria) this;
        }

        public Criteria andHTBHIsNull() {
            addCriterion("HTBH is null");
            return (Criteria) this;
        }

        public Criteria andHTBHIsNotNull() {
            addCriterion("HTBH is not null");
            return (Criteria) this;
        }

        public Criteria andHTBHEqualTo(String value) {
            addCriterion("HTBH =", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotEqualTo(String value) {
            addCriterion("HTBH <>", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHGreaterThan(String value) {
            addCriterion("HTBH >", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHGreaterThanOrEqualTo(String value) {
            addCriterion("HTBH >=", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHLessThan(String value) {
            addCriterion("HTBH <", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHLessThanOrEqualTo(String value) {
            addCriterion("HTBH <=", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHLike(String value) {
            addCriterion("HTBH like", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotLike(String value) {
            addCriterion("HTBH not like", value, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHIn(List<String> values) {
            addCriterion("HTBH in", values, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotIn(List<String> values) {
            addCriterion("HTBH not in", values, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHBetween(String value1, String value2) {
            addCriterion("HTBH between", value1, value2, "HTBH");
            return (Criteria) this;
        }

        public Criteria andHTBHNotBetween(String value1, String value2) {
            addCriterion("HTBH not between", value1, value2, "HTBH");
            return (Criteria) this;
        }

        public Criteria andSSHYIsNull() {
            addCriterion("SSHY is null");
            return (Criteria) this;
        }

        public Criteria andSSHYIsNotNull() {
            addCriterion("SSHY is not null");
            return (Criteria) this;
        }

        public Criteria andSSHYEqualTo(Integer value) {
            addCriterion("SSHY =", value, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYNotEqualTo(Integer value) {
            addCriterion("SSHY <>", value, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYGreaterThan(Integer value) {
            addCriterion("SSHY >", value, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSHY >=", value, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYLessThan(Integer value) {
            addCriterion("SSHY <", value, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYLessThanOrEqualTo(Integer value) {
            addCriterion("SSHY <=", value, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYIn(List<Integer> values) {
            addCriterion("SSHY in", values, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYNotIn(List<Integer> values) {
            addCriterion("SSHY not in", values, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYBetween(Integer value1, Integer value2) {
            addCriterion("SSHY between", value1, value2, "SSHY");
            return (Criteria) this;
        }

        public Criteria andSSHYNotBetween(Integer value1, Integer value2) {
            addCriterion("SSHY not between", value1, value2, "SSHY");
            return (Criteria) this;
        }

        public Criteria andXMZTIsNull() {
            addCriterion("XMZT is null");
            return (Criteria) this;
        }

        public Criteria andXMZTIsNotNull() {
            addCriterion("XMZT is not null");
            return (Criteria) this;
        }

        public Criteria andXMZTEqualTo(Integer value) {
            addCriterion("XMZT =", value, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTNotEqualTo(Integer value) {
            addCriterion("XMZT <>", value, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTGreaterThan(Integer value) {
            addCriterion("XMZT >", value, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTGreaterThanOrEqualTo(Integer value) {
            addCriterion("XMZT >=", value, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTLessThan(Integer value) {
            addCriterion("XMZT <", value, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTLessThanOrEqualTo(Integer value) {
            addCriterion("XMZT <=", value, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTIn(List<Integer> values) {
            addCriterion("XMZT in", values, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTNotIn(List<Integer> values) {
            addCriterion("XMZT not in", values, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTBetween(Integer value1, Integer value2) {
            addCriterion("XMZT between", value1, value2, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXMZTNotBetween(Integer value1, Integer value2) {
            addCriterion("XMZT not between", value1, value2, "XMZT");
            return (Criteria) this;
        }

        public Criteria andXDRQIsNull() {
            addCriterion("XDRQ is null");
            return (Criteria) this;
        }

        public Criteria andXDRQIsNotNull() {
            addCriterion("XDRQ is not null");
            return (Criteria) this;
        }

        public Criteria andXDRQEqualTo(Date value) {
            addCriterionForJDBCDate("XDRQ =", value, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQNotEqualTo(Date value) {
            addCriterionForJDBCDate("XDRQ <>", value, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQGreaterThan(Date value) {
            addCriterionForJDBCDate("XDRQ >", value, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XDRQ >=", value, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQLessThan(Date value) {
            addCriterionForJDBCDate("XDRQ <", value, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("XDRQ <=", value, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQIn(List<Date> values) {
            addCriterionForJDBCDate("XDRQ in", values, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQNotIn(List<Date> values) {
            addCriterionForJDBCDate("XDRQ not in", values, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XDRQ between", value1, value2, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXDRQNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("XDRQ not between", value1, value2, "XDRQ");
            return (Criteria) this;
        }

        public Criteria andXMFZIsNull() {
            addCriterion("XMFZ is null");
            return (Criteria) this;
        }

        public Criteria andXMFZIsNotNull() {
            addCriterion("XMFZ is not null");
            return (Criteria) this;
        }

        public Criteria andXMFZEqualTo(Integer value) {
            addCriterion("XMFZ =", value, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZNotEqualTo(Integer value) {
            addCriterion("XMFZ <>", value, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZGreaterThan(Integer value) {
            addCriterion("XMFZ >", value, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZGreaterThanOrEqualTo(Integer value) {
            addCriterion("XMFZ >=", value, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZLessThan(Integer value) {
            addCriterion("XMFZ <", value, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZLessThanOrEqualTo(Integer value) {
            addCriterion("XMFZ <=", value, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZIn(List<Integer> values) {
            addCriterion("XMFZ in", values, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZNotIn(List<Integer> values) {
            addCriterion("XMFZ not in", values, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZBetween(Integer value1, Integer value2) {
            addCriterion("XMFZ between", value1, value2, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andXMFZNotBetween(Integer value1, Integer value2) {
            addCriterion("XMFZ not between", value1, value2, "XMFZ");
            return (Criteria) this;
        }

        public Criteria andGSXMIsNull() {
            addCriterion("GSXM is null");
            return (Criteria) this;
        }

        public Criteria andGSXMIsNotNull() {
            addCriterion("GSXM is not null");
            return (Criteria) this;
        }

        public Criteria andGSXMEqualTo(Integer value) {
            addCriterion("GSXM =", value, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMNotEqualTo(Integer value) {
            addCriterion("GSXM <>", value, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMGreaterThan(Integer value) {
            addCriterion("GSXM >", value, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMGreaterThanOrEqualTo(Integer value) {
            addCriterion("GSXM >=", value, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMLessThan(Integer value) {
            addCriterion("GSXM <", value, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMLessThanOrEqualTo(Integer value) {
            addCriterion("GSXM <=", value, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMIn(List<Integer> values) {
            addCriterion("GSXM in", values, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMNotIn(List<Integer> values) {
            addCriterion("GSXM not in", values, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMBetween(Integer value1, Integer value2) {
            addCriterion("GSXM between", value1, value2, "GSXM");
            return (Criteria) this;
        }

        public Criteria andGSXMNotBetween(Integer value1, Integer value2) {
            addCriterion("GSXM not between", value1, value2, "GSXM");
            return (Criteria) this;
        }

        public Criteria andKSRQIsNull() {
            addCriterion("KSRQ is null");
            return (Criteria) this;
        }

        public Criteria andKSRQIsNotNull() {
            addCriterion("KSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andKSRQEqualTo(Date value) {
            addCriterionForJDBCDate("KSRQ =", value, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQNotEqualTo(Date value) {
            addCriterionForJDBCDate("KSRQ <>", value, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQGreaterThan(Date value) {
            addCriterionForJDBCDate("KSRQ >", value, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KSRQ >=", value, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQLessThan(Date value) {
            addCriterionForJDBCDate("KSRQ <", value, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KSRQ <=", value, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQIn(List<Date> values) {
            addCriterionForJDBCDate("KSRQ in", values, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQNotIn(List<Date> values) {
            addCriterionForJDBCDate("KSRQ not in", values, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KSRQ between", value1, value2, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andKSRQNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KSRQ not between", value1, value2, "KSRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQIsNull() {
            addCriterion("JZRQ is null");
            return (Criteria) this;
        }

        public Criteria andJZRQIsNotNull() {
            addCriterion("JZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJZRQEqualTo(Date value) {
            addCriterionForJDBCDate("JZRQ =", value, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQNotEqualTo(Date value) {
            addCriterionForJDBCDate("JZRQ <>", value, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQGreaterThan(Date value) {
            addCriterionForJDBCDate("JZRQ >", value, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZRQ >=", value, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQLessThan(Date value) {
            addCriterionForJDBCDate("JZRQ <", value, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JZRQ <=", value, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQIn(List<Date> values) {
            addCriterionForJDBCDate("JZRQ in", values, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQNotIn(List<Date> values) {
            addCriterionForJDBCDate("JZRQ not in", values, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZRQ between", value1, value2, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andJZRQNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JZRQ not between", value1, value2, "JZRQ");
            return (Criteria) this;
        }

        public Criteria andXMZLIsNull() {
            addCriterion("XMZL is null");
            return (Criteria) this;
        }

        public Criteria andXMZLIsNotNull() {
            addCriterion("XMZL is not null");
            return (Criteria) this;
        }

        public Criteria andXMZLEqualTo(String value) {
            addCriterion("XMZL =", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotEqualTo(String value) {
            addCriterion("XMZL <>", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLGreaterThan(String value) {
            addCriterion("XMZL >", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLGreaterThanOrEqualTo(String value) {
            addCriterion("XMZL >=", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLLessThan(String value) {
            addCriterion("XMZL <", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLLessThanOrEqualTo(String value) {
            addCriterion("XMZL <=", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLLike(String value) {
            addCriterion("XMZL like", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotLike(String value) {
            addCriterion("XMZL not like", value, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLIn(List<String> values) {
            addCriterion("XMZL in", values, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotIn(List<String> values) {
            addCriterion("XMZL not in", values, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLBetween(String value1, String value2) {
            addCriterion("XMZL between", value1, value2, "XMZL");
            return (Criteria) this;
        }

        public Criteria andXMZLNotBetween(String value1, String value2) {
            addCriterion("XMZL not between", value1, value2, "XMZL");
            return (Criteria) this;
        }

        public Criteria andBZIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBZIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBZEqualTo(String value) {
            addCriterion("BZ =", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZNotEqualTo(String value) {
            addCriterion("BZ <>", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZGreaterThan(String value) {
            addCriterion("BZ >", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZLessThan(String value) {
            addCriterion("BZ <", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZLike(String value) {
            addCriterion("BZ like", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZNotLike(String value) {
            addCriterion("BZ not like", value, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZIn(List<String> values) {
            addCriterion("BZ in", values, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZNotIn(List<String> values) {
            addCriterion("BZ not in", values, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "BZ");
            return (Criteria) this;
        }

        public Criteria andBZNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "BZ");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDIsNull() {
            addCriterion("YLXSJID is null");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDIsNotNull() {
            addCriterion("YLXSJID is not null");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDEqualTo(String value) {
            addCriterion("YLXSJID =", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDNotEqualTo(String value) {
            addCriterion("YLXSJID <>", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDGreaterThan(String value) {
            addCriterion("YLXSJID >", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDGreaterThanOrEqualTo(String value) {
            addCriterion("YLXSJID >=", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDLessThan(String value) {
            addCriterion("YLXSJID <", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDLessThanOrEqualTo(String value) {
            addCriterion("YLXSJID <=", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDLike(String value) {
            addCriterion("YLXSJID like", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDNotLike(String value) {
            addCriterion("YLXSJID not like", value, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDIn(List<String> values) {
            addCriterion("YLXSJID in", values, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDNotIn(List<String> values) {
            addCriterion("YLXSJID not in", values, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDBetween(String value1, String value2) {
            addCriterion("YLXSJID between", value1, value2, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andYLXSJIDNotBetween(String value1, String value2) {
            addCriterion("YLXSJID not between", value1, value2, "YLXSJID");
            return (Criteria) this;
        }

        public Criteria andSHZTIsNull() {
            addCriterion("SHZT is null");
            return (Criteria) this;
        }

        public Criteria andSHZTIsNotNull() {
            addCriterion("SHZT is not null");
            return (Criteria) this;
        }

        public Criteria andSHZTEqualTo(String value) {
            addCriterion("SHZT =", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTNotEqualTo(String value) {
            addCriterion("SHZT <>", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTGreaterThan(String value) {
            addCriterion("SHZT >", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTGreaterThanOrEqualTo(String value) {
            addCriterion("SHZT >=", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTLessThan(String value) {
            addCriterion("SHZT <", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTLessThanOrEqualTo(String value) {
            addCriterion("SHZT <=", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTLike(String value) {
            addCriterion("SHZT like", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTNotLike(String value) {
            addCriterion("SHZT not like", value, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTIn(List<String> values) {
            addCriterion("SHZT in", values, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTNotIn(List<String> values) {
            addCriterion("SHZT not in", values, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTBetween(String value1, String value2) {
            addCriterion("SHZT between", value1, value2, "SHZT");
            return (Criteria) this;
        }

        public Criteria andSHZTNotBetween(String value1, String value2) {
            addCriterion("SHZT not between", value1, value2, "SHZT");
            return (Criteria) this;
        }

        public Criteria andZGLDIDIsNull() {
            addCriterion("ZGLDID is null");
            return (Criteria) this;
        }

        public Criteria andZGLDIDIsNotNull() {
            addCriterion("ZGLDID is not null");
            return (Criteria) this;
        }

        public Criteria andZGLDIDEqualTo(String value) {
            addCriterion("ZGLDID =", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDNotEqualTo(String value) {
            addCriterion("ZGLDID <>", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDGreaterThan(String value) {
            addCriterion("ZGLDID >", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDGreaterThanOrEqualTo(String value) {
            addCriterion("ZGLDID >=", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDLessThan(String value) {
            addCriterion("ZGLDID <", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDLessThanOrEqualTo(String value) {
            addCriterion("ZGLDID <=", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDLike(String value) {
            addCriterion("ZGLDID like", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDNotLike(String value) {
            addCriterion("ZGLDID not like", value, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDIn(List<String> values) {
            addCriterion("ZGLDID in", values, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDNotIn(List<String> values) {
            addCriterion("ZGLDID not in", values, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDBetween(String value1, String value2) {
            addCriterion("ZGLDID between", value1, value2, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andZGLDIDNotBetween(String value1, String value2) {
            addCriterion("ZGLDID not between", value1, value2, "ZGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDIsNull() {
            addCriterion("XGLDID is null");
            return (Criteria) this;
        }

        public Criteria andXGLDIDIsNotNull() {
            addCriterion("XGLDID is not null");
            return (Criteria) this;
        }

        public Criteria andXGLDIDEqualTo(String value) {
            addCriterion("XGLDID =", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDNotEqualTo(String value) {
            addCriterion("XGLDID <>", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDGreaterThan(String value) {
            addCriterion("XGLDID >", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDGreaterThanOrEqualTo(String value) {
            addCriterion("XGLDID >=", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDLessThan(String value) {
            addCriterion("XGLDID <", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDLessThanOrEqualTo(String value) {
            addCriterion("XGLDID <=", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDLike(String value) {
            addCriterion("XGLDID like", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDNotLike(String value) {
            addCriterion("XGLDID not like", value, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDIn(List<String> values) {
            addCriterion("XGLDID in", values, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDNotIn(List<String> values) {
            addCriterion("XGLDID not in", values, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDBetween(String value1, String value2) {
            addCriterion("XGLDID between", value1, value2, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andXGLDIDNotBetween(String value1, String value2) {
            addCriterion("XGLDID not between", value1, value2, "XGLDID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXIsNull() {
            addCriterion("CDYWZX is null");
            return (Criteria) this;
        }

        public Criteria andCDYWZXIsNotNull() {
            addCriterion("CDYWZX is not null");
            return (Criteria) this;
        }

        public Criteria andCDYWZXEqualTo(String value) {
            addCriterion("CDYWZX =", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXNotEqualTo(String value) {
            addCriterion("CDYWZX <>", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXGreaterThan(String value) {
            addCriterion("CDYWZX >", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXGreaterThanOrEqualTo(String value) {
            addCriterion("CDYWZX >=", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXLessThan(String value) {
            addCriterion("CDYWZX <", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXLessThanOrEqualTo(String value) {
            addCriterion("CDYWZX <=", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXLike(String value) {
            addCriterion("CDYWZX like", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXNotLike(String value) {
            addCriterion("CDYWZX not like", value, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXIn(List<String> values) {
            addCriterion("CDYWZX in", values, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXNotIn(List<String> values) {
            addCriterion("CDYWZX not in", values, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXBetween(String value1, String value2) {
            addCriterion("CDYWZX between", value1, value2, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXNotBetween(String value1, String value2) {
            addCriterion("CDYWZX not between", value1, value2, "CDYWZX");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDIsNull() {
            addCriterion("CDYWZXFZRID is null");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDIsNotNull() {
            addCriterion("CDYWZXFZRID is not null");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDEqualTo(String value) {
            addCriterion("CDYWZXFZRID =", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDNotEqualTo(String value) {
            addCriterion("CDYWZXFZRID <>", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDGreaterThan(String value) {
            addCriterion("CDYWZXFZRID >", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDGreaterThanOrEqualTo(String value) {
            addCriterion("CDYWZXFZRID >=", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDLessThan(String value) {
            addCriterion("CDYWZXFZRID <", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDLessThanOrEqualTo(String value) {
            addCriterion("CDYWZXFZRID <=", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDLike(String value) {
            addCriterion("CDYWZXFZRID like", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDNotLike(String value) {
            addCriterion("CDYWZXFZRID not like", value, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDIn(List<String> values) {
            addCriterion("CDYWZXFZRID in", values, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDNotIn(List<String> values) {
            addCriterion("CDYWZXFZRID not in", values, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDBetween(String value1, String value2) {
            addCriterion("CDYWZXFZRID between", value1, value2, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDYWZXFZRIDNotBetween(String value1, String value2) {
            addCriterion("CDYWZXFZRID not between", value1, value2, "CDYWZXFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDIsNull() {
            addCriterion("CDBMFZRID is null");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDIsNotNull() {
            addCriterion("CDBMFZRID is not null");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDEqualTo(String value) {
            addCriterion("CDBMFZRID =", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDNotEqualTo(String value) {
            addCriterion("CDBMFZRID <>", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDGreaterThan(String value) {
            addCriterion("CDBMFZRID >", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDGreaterThanOrEqualTo(String value) {
            addCriterion("CDBMFZRID >=", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDLessThan(String value) {
            addCriterion("CDBMFZRID <", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDLessThanOrEqualTo(String value) {
            addCriterion("CDBMFZRID <=", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDLike(String value) {
            addCriterion("CDBMFZRID like", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDNotLike(String value) {
            addCriterion("CDBMFZRID not like", value, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDIn(List<String> values) {
            addCriterion("CDBMFZRID in", values, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDNotIn(List<String> values) {
            addCriterion("CDBMFZRID not in", values, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDBetween(String value1, String value2) {
            addCriterion("CDBMFZRID between", value1, value2, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andCDBMFZRIDNotBetween(String value1, String value2) {
            addCriterion("CDBMFZRID not between", value1, value2, "CDBMFZRID");
            return (Criteria) this;
        }

        public Criteria andWCZTIsNull() {
            addCriterion("WCZT is null");
            return (Criteria) this;
        }

        public Criteria andWCZTIsNotNull() {
            addCriterion("WCZT is not null");
            return (Criteria) this;
        }

        public Criteria andWCZTEqualTo(String value) {
            addCriterion("WCZT =", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTNotEqualTo(String value) {
            addCriterion("WCZT <>", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTGreaterThan(String value) {
            addCriterion("WCZT >", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTGreaterThanOrEqualTo(String value) {
            addCriterion("WCZT >=", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTLessThan(String value) {
            addCriterion("WCZT <", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTLessThanOrEqualTo(String value) {
            addCriterion("WCZT <=", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTLike(String value) {
            addCriterion("WCZT like", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTNotLike(String value) {
            addCriterion("WCZT not like", value, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTIn(List<String> values) {
            addCriterion("WCZT in", values, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTNotIn(List<String> values) {
            addCriterion("WCZT not in", values, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTBetween(String value1, String value2) {
            addCriterion("WCZT between", value1, value2, "WCZT");
            return (Criteria) this;
        }

        public Criteria andWCZTNotBetween(String value1, String value2) {
            addCriterion("WCZT not between", value1, value2, "WCZT");
            return (Criteria) this;
        }

        public Criteria andBXZTIsNull() {
            addCriterion("BXZT is null");
            return (Criteria) this;
        }

        public Criteria andBXZTIsNotNull() {
            addCriterion("BXZT is not null");
            return (Criteria) this;
        }

        public Criteria andBXZTEqualTo(String value) {
            addCriterion("BXZT =", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTNotEqualTo(String value) {
            addCriterion("BXZT <>", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTGreaterThan(String value) {
            addCriterion("BXZT >", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTGreaterThanOrEqualTo(String value) {
            addCriterion("BXZT >=", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTLessThan(String value) {
            addCriterion("BXZT <", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTLessThanOrEqualTo(String value) {
            addCriterion("BXZT <=", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTLike(String value) {
            addCriterion("BXZT like", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTNotLike(String value) {
            addCriterion("BXZT not like", value, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTIn(List<String> values) {
            addCriterion("BXZT in", values, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTNotIn(List<String> values) {
            addCriterion("BXZT not in", values, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTBetween(String value1, String value2) {
            addCriterion("BXZT between", value1, value2, "BXZT");
            return (Criteria) this;
        }

        public Criteria andBXZTNotBetween(String value1, String value2) {
            addCriterion("BXZT not between", value1, value2, "BXZT");
            return (Criteria) this;
        }

        public Criteria andSFQCIsNull() {
            addCriterion("SFQC is null");
            return (Criteria) this;
        }

        public Criteria andSFQCIsNotNull() {
            addCriterion("SFQC is not null");
            return (Criteria) this;
        }

        public Criteria andSFQCEqualTo(String value) {
            addCriterion("SFQC =", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCNotEqualTo(String value) {
            addCriterion("SFQC <>", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCGreaterThan(String value) {
            addCriterion("SFQC >", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCGreaterThanOrEqualTo(String value) {
            addCriterion("SFQC >=", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCLessThan(String value) {
            addCriterion("SFQC <", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCLessThanOrEqualTo(String value) {
            addCriterion("SFQC <=", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCLike(String value) {
            addCriterion("SFQC like", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCNotLike(String value) {
            addCriterion("SFQC not like", value, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCIn(List<String> values) {
            addCriterion("SFQC in", values, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCNotIn(List<String> values) {
            addCriterion("SFQC not in", values, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCBetween(String value1, String value2) {
            addCriterion("SFQC between", value1, value2, "SFQC");
            return (Criteria) this;
        }

        public Criteria andSFQCNotBetween(String value1, String value2) {
            addCriterion("SFQC not between", value1, value2, "SFQC");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDIsNull() {
            addCriterion("CDSYBID is null");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDIsNotNull() {
            addCriterion("CDSYBID is not null");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDEqualTo(String value) {
            addCriterion("CDSYBID =", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDNotEqualTo(String value) {
            addCriterion("CDSYBID <>", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDGreaterThan(String value) {
            addCriterion("CDSYBID >", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDGreaterThanOrEqualTo(String value) {
            addCriterion("CDSYBID >=", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDLessThan(String value) {
            addCriterion("CDSYBID <", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDLessThanOrEqualTo(String value) {
            addCriterion("CDSYBID <=", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDLike(String value) {
            addCriterion("CDSYBID like", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDNotLike(String value) {
            addCriterion("CDSYBID not like", value, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDIn(List<String> values) {
            addCriterion("CDSYBID in", values, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDNotIn(List<String> values) {
            addCriterion("CDSYBID not in", values, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDBetween(String value1, String value2) {
            addCriterion("CDSYBID between", value1, value2, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andCDSYBIDNotBetween(String value1, String value2) {
            addCriterion("CDSYBID not between", value1, value2, "CDSYBID");
            return (Criteria) this;
        }

        public Criteria andXMJDIsNull() {
            addCriterion("XMJD is null");
            return (Criteria) this;
        }

        public Criteria andXMJDIsNotNull() {
            addCriterion("XMJD is not null");
            return (Criteria) this;
        }

        public Criteria andXMJDEqualTo(String value) {
            addCriterion("XMJD =", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDNotEqualTo(String value) {
            addCriterion("XMJD <>", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDGreaterThan(String value) {
            addCriterion("XMJD >", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDGreaterThanOrEqualTo(String value) {
            addCriterion("XMJD >=", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDLessThan(String value) {
            addCriterion("XMJD <", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDLessThanOrEqualTo(String value) {
            addCriterion("XMJD <=", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDLike(String value) {
            addCriterion("XMJD like", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDNotLike(String value) {
            addCriterion("XMJD not like", value, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDIn(List<String> values) {
            addCriterion("XMJD in", values, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDNotIn(List<String> values) {
            addCriterion("XMJD not in", values, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDBetween(String value1, String value2) {
            addCriterion("XMJD between", value1, value2, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMJDNotBetween(String value1, String value2) {
            addCriterion("XMJD not between", value1, value2, "XMJD");
            return (Criteria) this;
        }

        public Criteria andXMZJFIsNull() {
            addCriterion("XMZJF is null");
            return (Criteria) this;
        }

        public Criteria andXMZJFIsNotNull() {
            addCriterion("XMZJF is not null");
            return (Criteria) this;
        }

        public Criteria andXMZJFEqualTo(BigDecimal value) {
            addCriterion("XMZJF =", value, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFNotEqualTo(BigDecimal value) {
            addCriterion("XMZJF <>", value, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFGreaterThan(BigDecimal value) {
            addCriterion("XMZJF >", value, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMZJF >=", value, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFLessThan(BigDecimal value) {
            addCriterion("XMZJF <", value, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMZJF <=", value, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFIn(List<BigDecimal> values) {
            addCriterion("XMZJF in", values, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFNotIn(List<BigDecimal> values) {
            addCriterion("XMZJF not in", values, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMZJF between", value1, value2, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andXMZJFNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMZJF not between", value1, value2, "XMZJF");
            return (Criteria) this;
        }

        public Criteria andHBJFIsNull() {
            addCriterion("HBJF is null");
            return (Criteria) this;
        }

        public Criteria andHBJFIsNotNull() {
            addCriterion("HBJF is not null");
            return (Criteria) this;
        }

        public Criteria andHBJFEqualTo(BigDecimal value) {
            addCriterion("HBJF =", value, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFNotEqualTo(BigDecimal value) {
            addCriterion("HBJF <>", value, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFGreaterThan(BigDecimal value) {
            addCriterion("HBJF >", value, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HBJF >=", value, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFLessThan(BigDecimal value) {
            addCriterion("HBJF <", value, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HBJF <=", value, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFIn(List<BigDecimal> values) {
            addCriterion("HBJF in", values, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFNotIn(List<BigDecimal> values) {
            addCriterion("HBJF not in", values, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HBJF between", value1, value2, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HBJF not between", value1, value2, "HBJF");
            return (Criteria) this;
        }

        public Criteria andHBJFBLIsNull() {
            addCriterion("HBJFBL is null");
            return (Criteria) this;
        }

        public Criteria andHBJFBLIsNotNull() {
            addCriterion("HBJFBL is not null");
            return (Criteria) this;
        }

        public Criteria andHBJFBLEqualTo(String value) {
            addCriterion("HBJFBL =", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLNotEqualTo(String value) {
            addCriterion("HBJFBL <>", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLGreaterThan(String value) {
            addCriterion("HBJFBL >", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLGreaterThanOrEqualTo(String value) {
            addCriterion("HBJFBL >=", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLLessThan(String value) {
            addCriterion("HBJFBL <", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLLessThanOrEqualTo(String value) {
            addCriterion("HBJFBL <=", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLLike(String value) {
            addCriterion("HBJFBL like", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLNotLike(String value) {
            addCriterion("HBJFBL not like", value, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLIn(List<String> values) {
            addCriterion("HBJFBL in", values, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLNotIn(List<String> values) {
            addCriterion("HBJFBL not in", values, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLBetween(String value1, String value2) {
            addCriterion("HBJFBL between", value1, value2, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andHBJFBLNotBetween(String value1, String value2) {
            addCriterion("HBJFBL not between", value1, value2, "HBJFBL");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDIsNull() {
            addCriterion("SYBFZRID is null");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDIsNotNull() {
            addCriterion("SYBFZRID is not null");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDEqualTo(String value) {
            addCriterion("SYBFZRID =", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDNotEqualTo(String value) {
            addCriterion("SYBFZRID <>", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDGreaterThan(String value) {
            addCriterion("SYBFZRID >", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDGreaterThanOrEqualTo(String value) {
            addCriterion("SYBFZRID >=", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDLessThan(String value) {
            addCriterion("SYBFZRID <", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDLessThanOrEqualTo(String value) {
            addCriterion("SYBFZRID <=", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDLike(String value) {
            addCriterion("SYBFZRID like", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDNotLike(String value) {
            addCriterion("SYBFZRID not like", value, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDIn(List<String> values) {
            addCriterion("SYBFZRID in", values, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDNotIn(List<String> values) {
            addCriterion("SYBFZRID not in", values, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDBetween(String value1, String value2) {
            addCriterion("SYBFZRID between", value1, value2, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andSYBFZRIDNotBetween(String value1, String value2) {
            addCriterion("SYBFZRID not between", value1, value2, "SYBFZRID");
            return (Criteria) this;
        }

        public Criteria andYSTJIsNull() {
            addCriterion("YSTJ is null");
            return (Criteria) this;
        }

        public Criteria andYSTJIsNotNull() {
            addCriterion("YSTJ is not null");
            return (Criteria) this;
        }

        public Criteria andYSTJEqualTo(String value) {
            addCriterion("YSTJ =", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJNotEqualTo(String value) {
            addCriterion("YSTJ <>", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJGreaterThan(String value) {
            addCriterion("YSTJ >", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJGreaterThanOrEqualTo(String value) {
            addCriterion("YSTJ >=", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJLessThan(String value) {
            addCriterion("YSTJ <", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJLessThanOrEqualTo(String value) {
            addCriterion("YSTJ <=", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJLike(String value) {
            addCriterion("YSTJ like", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJNotLike(String value) {
            addCriterion("YSTJ not like", value, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJIn(List<String> values) {
            addCriterion("YSTJ in", values, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJNotIn(List<String> values) {
            addCriterion("YSTJ not in", values, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJBetween(String value1, String value2) {
            addCriterion("YSTJ between", value1, value2, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andYSTJNotBetween(String value1, String value2) {
            addCriterion("YSTJ not between", value1, value2, "YSTJ");
            return (Criteria) this;
        }

        public Criteria andSFSDIsNull() {
            addCriterion("SFSD is null");
            return (Criteria) this;
        }

        public Criteria andSFSDIsNotNull() {
            addCriterion("SFSD is not null");
            return (Criteria) this;
        }

        public Criteria andSFSDEqualTo(String value) {
            addCriterion("SFSD =", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDNotEqualTo(String value) {
            addCriterion("SFSD <>", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDGreaterThan(String value) {
            addCriterion("SFSD >", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDGreaterThanOrEqualTo(String value) {
            addCriterion("SFSD >=", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDLessThan(String value) {
            addCriterion("SFSD <", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDLessThanOrEqualTo(String value) {
            addCriterion("SFSD <=", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDLike(String value) {
            addCriterion("SFSD like", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDNotLike(String value) {
            addCriterion("SFSD not like", value, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDIn(List<String> values) {
            addCriterion("SFSD in", values, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDNotIn(List<String> values) {
            addCriterion("SFSD not in", values, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDBetween(String value1, String value2) {
            addCriterion("SFSD between", value1, value2, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFSDNotBetween(String value1, String value2) {
            addCriterion("SFSD not between", value1, value2, "SFSD");
            return (Criteria) this;
        }

        public Criteria andSFYXIsNull() {
            addCriterion("SFYX is null");
            return (Criteria) this;
        }

        public Criteria andSFYXIsNotNull() {
            addCriterion("SFYX is not null");
            return (Criteria) this;
        }

        public Criteria andSFYXEqualTo(String value) {
            addCriterion("SFYX =", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXNotEqualTo(String value) {
            addCriterion("SFYX <>", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXGreaterThan(String value) {
            addCriterion("SFYX >", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXGreaterThanOrEqualTo(String value) {
            addCriterion("SFYX >=", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXLessThan(String value) {
            addCriterion("SFYX <", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXLessThanOrEqualTo(String value) {
            addCriterion("SFYX <=", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXLike(String value) {
            addCriterion("SFYX like", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXNotLike(String value) {
            addCriterion("SFYX not like", value, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXIn(List<String> values) {
            addCriterion("SFYX in", values, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXNotIn(List<String> values) {
            addCriterion("SFYX not in", values, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXBetween(String value1, String value2) {
            addCriterion("SFYX between", value1, value2, "SFYX");
            return (Criteria) this;
        }

        public Criteria andSFYXNotBetween(String value1, String value2) {
            addCriterion("SFYX not between", value1, value2, "SFYX");
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

        public Criteria andSFXZXMIsNull() {
            addCriterion("SFXZXM is null");
            return (Criteria) this;
        }

        public Criteria andSFXZXMIsNotNull() {
            addCriterion("SFXZXM is not null");
            return (Criteria) this;
        }

        public Criteria andSFXZXMEqualTo(String value) {
            addCriterion("SFXZXM =", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMNotEqualTo(String value) {
            addCriterion("SFXZXM <>", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMGreaterThan(String value) {
            addCriterion("SFXZXM >", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMGreaterThanOrEqualTo(String value) {
            addCriterion("SFXZXM >=", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMLessThan(String value) {
            addCriterion("SFXZXM <", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMLessThanOrEqualTo(String value) {
            addCriterion("SFXZXM <=", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMLike(String value) {
            addCriterion("SFXZXM like", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMNotLike(String value) {
            addCriterion("SFXZXM not like", value, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMIn(List<String> values) {
            addCriterion("SFXZXM in", values, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMNotIn(List<String> values) {
            addCriterion("SFXZXM not in", values, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMBetween(String value1, String value2) {
            addCriterion("SFXZXM between", value1, value2, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andSFXZXMNotBetween(String value1, String value2) {
            addCriterion("SFXZXM not between", value1, value2, "SFXZXM");
            return (Criteria) this;
        }

        public Criteria andPIDIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPIDIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPIDEqualTo(String value) {
            addCriterion("PID =", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotEqualTo(String value) {
            addCriterion("PID <>", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDGreaterThan(String value) {
            addCriterion("PID >", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDGreaterThanOrEqualTo(String value) {
            addCriterion("PID >=", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLessThan(String value) {
            addCriterion("PID <", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLessThanOrEqualTo(String value) {
            addCriterion("PID <=", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDLike(String value) {
            addCriterion("PID like", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotLike(String value) {
            addCriterion("PID not like", value, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDIn(List<String> values) {
            addCriterion("PID in", values, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotIn(List<String> values) {
            addCriterion("PID not in", values, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDBetween(String value1, String value2) {
            addCriterion("PID between", value1, value2, "PID");
            return (Criteria) this;
        }

        public Criteria andPIDNotBetween(String value1, String value2) {
            addCriterion("PID not between", value1, value2, "PID");
            return (Criteria) this;
        }

        public Criteria andHTMCIsNull() {
            addCriterion("HTMC is null");
            return (Criteria) this;
        }

        public Criteria andHTMCIsNotNull() {
            addCriterion("HTMC is not null");
            return (Criteria) this;
        }

        public Criteria andHTMCEqualTo(String value) {
            addCriterion("HTMC =", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCNotEqualTo(String value) {
            addCriterion("HTMC <>", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCGreaterThan(String value) {
            addCriterion("HTMC >", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCGreaterThanOrEqualTo(String value) {
            addCriterion("HTMC >=", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCLessThan(String value) {
            addCriterion("HTMC <", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCLessThanOrEqualTo(String value) {
            addCriterion("HTMC <=", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCLike(String value) {
            addCriterion("HTMC like", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCNotLike(String value) {
            addCriterion("HTMC not like", value, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCIn(List<String> values) {
            addCriterion("HTMC in", values, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCNotIn(List<String> values) {
            addCriterion("HTMC not in", values, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCBetween(String value1, String value2) {
            addCriterion("HTMC between", value1, value2, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTMCNotBetween(String value1, String value2) {
            addCriterion("HTMC not between", value1, value2, "HTMC");
            return (Criteria) this;
        }

        public Criteria andHTIDIsNull() {
            addCriterion("HTID is null");
            return (Criteria) this;
        }

        public Criteria andHTIDIsNotNull() {
            addCriterion("HTID is not null");
            return (Criteria) this;
        }

        public Criteria andHTIDEqualTo(String value) {
            addCriterion("HTID =", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotEqualTo(String value) {
            addCriterion("HTID <>", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDGreaterThan(String value) {
            addCriterion("HTID >", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDGreaterThanOrEqualTo(String value) {
            addCriterion("HTID >=", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDLessThan(String value) {
            addCriterion("HTID <", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDLessThanOrEqualTo(String value) {
            addCriterion("HTID <=", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDLike(String value) {
            addCriterion("HTID like", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotLike(String value) {
            addCriterion("HTID not like", value, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDIn(List<String> values) {
            addCriterion("HTID in", values, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotIn(List<String> values) {
            addCriterion("HTID not in", values, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDBetween(String value1, String value2) {
            addCriterion("HTID between", value1, value2, "HTID");
            return (Criteria) this;
        }

        public Criteria andHTIDNotBetween(String value1, String value2) {
            addCriterion("HTID not between", value1, value2, "HTID");
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