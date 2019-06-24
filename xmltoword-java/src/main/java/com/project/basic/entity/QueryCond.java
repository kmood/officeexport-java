package com.project.basic.entity;

public class QueryCond {
	private String fieldname;
	private String relation;
	private String fieldvalue;
	
	public QueryCond() {
		super();
	}
	public QueryCond(String fieldname, String relation, String fieldvalue) {
		super();
		this.fieldname = fieldname;
		this.relation = relation;
		this.fieldvalue = fieldvalue;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(String fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	@Override
	public String toString() {
		return "QueryCond [fieldname=" + fieldname + ", relation=" + relation + ", fieldvalue=" + fieldvalue + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fieldname == null) ? 0 : fieldname.hashCode());
		result = prime * result + ((fieldvalue == null) ? 0 : fieldvalue.hashCode());
		result = prime * result + ((relation == null) ? 0 : relation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryCond other = (QueryCond) obj;
		if (fieldname == null) {
			if (other.fieldname != null)
				return false;
		} else if (!fieldname.equals(other.fieldname))
			return false;
		if (fieldvalue == null) {
			if (other.fieldvalue != null)
				return false;
		} else if (!fieldvalue.equals(other.fieldvalue))
			return false;
		if (relation == null) {
			if (other.relation != null)
				return false;
		} else if (!relation.equals(other.relation))
			return false;
		return true;
	}
	

}
