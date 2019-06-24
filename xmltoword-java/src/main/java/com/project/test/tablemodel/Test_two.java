package com.project.test.tablemodel;

import java.io.Serializable;

public class Test_two implements Serializable {
    private String id;

    private String test1;

    private String test2;

    private String test3;

    private String test4;

    private String test5;

    private String test6;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1 == null ? null : test1.trim();
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2 == null ? null : test2.trim();
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3 == null ? null : test3.trim();
    }

    public String getTest4() {
        return test4;
    }

    public void setTest4(String test4) {
        this.test4 = test4 == null ? null : test4.trim();
    }

    public String getTest5() {
        return test5;
    }

    public void setTest5(String test5) {
        this.test5 = test5 == null ? null : test5.trim();
    }

    public String getTest6() {
        return test6;
    }

    public void setTest6(String test6) {
        this.test6 = test6 == null ? null : test6.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Test_two other = (Test_two) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTest1() == null ? other.getTest1() == null : this.getTest1().equals(other.getTest1()))
            && (this.getTest2() == null ? other.getTest2() == null : this.getTest2().equals(other.getTest2()))
            && (this.getTest3() == null ? other.getTest3() == null : this.getTest3().equals(other.getTest3()))
            && (this.getTest4() == null ? other.getTest4() == null : this.getTest4().equals(other.getTest4()))
            && (this.getTest5() == null ? other.getTest5() == null : this.getTest5().equals(other.getTest5()))
            && (this.getTest6() == null ? other.getTest6() == null : this.getTest6().equals(other.getTest6()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTest1() == null) ? 0 : getTest1().hashCode());
        result = prime * result + ((getTest2() == null) ? 0 : getTest2().hashCode());
        result = prime * result + ((getTest3() == null) ? 0 : getTest3().hashCode());
        result = prime * result + ((getTest4() == null) ? 0 : getTest4().hashCode());
        result = prime * result + ((getTest5() == null) ? 0 : getTest5().hashCode());
        result = prime * result + ((getTest6() == null) ? 0 : getTest6().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", test1=").append(test1);
        sb.append(", test2=").append(test2);
        sb.append(", test3=").append(test3);
        sb.append(", test4=").append(test4);
        sb.append(", test5=").append(test5);
        sb.append(", test6=").append(test6);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}