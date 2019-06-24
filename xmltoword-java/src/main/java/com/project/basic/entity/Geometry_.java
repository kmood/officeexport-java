package com.project.basic.entity;

import java.io.Serializable;
import java.util.List;

public class Geometry_ implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private List<List<List<double[]>>> coordinates;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<List<List<double[]>>> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<List<List<double[]>>> coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "Geometry_ [type=" + type + ", coordinates=" + coordinates + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordinates == null) ? 0 : coordinates.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Geometry_ other = (Geometry_) obj;
		if (coordinates == null) {
			if (other.coordinates != null)
				return false;
		} else if (!coordinates.equals(other.coordinates))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
