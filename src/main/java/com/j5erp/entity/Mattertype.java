package com.j5erp.entity;

public class Mattertype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.MATTERTYPEID
     *
     * @mbggenerated
     */
    private String mattertypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.ENAME
     *
     * @mbggenerated
     */
    private String ename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.SAVECOURSE
     *
     * @mbggenerated
     */
    private String savecourse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.SALESPROCEED
     *
     * @mbggenerated
     */
    private String salesproceed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.SALESCOST
     *
     * @mbggenerated
     */
    private String salescost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.STATUS
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.PREPARE1
     *
     * @mbggenerated
     */
    private String prepare1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MATTERTYPE.PREPARE2
     *
     * @mbggenerated
     */
    private String prepare2;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MATTERTYPE
     *
     * @mbggenerated
     */
    public Mattertype(String mattertypeid, String type, String ename, String savecourse, String salesproceed, String salescost, String remark, Short status, String prepare1, String prepare2) {
        this.mattertypeid = mattertypeid;
        this.type = type;
        this.ename = ename;
        this.savecourse = savecourse;
        this.salesproceed = salesproceed;
        this.salescost = salescost;
        this.remark = remark;
        this.status = status;
        this.prepare1 = prepare1;
        this.prepare2 = prepare2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MATTERTYPE
     *
     * @mbggenerated
     */
    public Mattertype() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.MATTERTYPEID
     *
     * @return the value of MATTERTYPE.MATTERTYPEID
     *
     * @mbggenerated
     */
    public String getMattertypeid() {
        return mattertypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.MATTERTYPEID
     *
     * @param mattertypeid the value for MATTERTYPE.MATTERTYPEID
     *
     * @mbggenerated
     */
    public void setMattertypeid(String mattertypeid) {
        this.mattertypeid = mattertypeid == null ? null : mattertypeid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.TYPE
     *
     * @return the value of MATTERTYPE.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.TYPE
     *
     * @param type the value for MATTERTYPE.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.ENAME
     *
     * @return the value of MATTERTYPE.ENAME
     *
     * @mbggenerated
     */
    public String getEname() {
        return ename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.ENAME
     *
     * @param ename the value for MATTERTYPE.ENAME
     *
     * @mbggenerated
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.SAVECOURSE
     *
     * @return the value of MATTERTYPE.SAVECOURSE
     *
     * @mbggenerated
     */
    public String getSavecourse() {
        return savecourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.SAVECOURSE
     *
     * @param savecourse the value for MATTERTYPE.SAVECOURSE
     *
     * @mbggenerated
     */
    public void setSavecourse(String savecourse) {
        this.savecourse = savecourse == null ? null : savecourse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.SALESPROCEED
     *
     * @return the value of MATTERTYPE.SALESPROCEED
     *
     * @mbggenerated
     */
    public String getSalesproceed() {
        return salesproceed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.SALESPROCEED
     *
     * @param salesproceed the value for MATTERTYPE.SALESPROCEED
     *
     * @mbggenerated
     */
    public void setSalesproceed(String salesproceed) {
        this.salesproceed = salesproceed == null ? null : salesproceed.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.SALESCOST
     *
     * @return the value of MATTERTYPE.SALESCOST
     *
     * @mbggenerated
     */
    public String getSalescost() {
        return salescost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.SALESCOST
     *
     * @param salescost the value for MATTERTYPE.SALESCOST
     *
     * @mbggenerated
     */
    public void setSalescost(String salescost) {
        this.salescost = salescost == null ? null : salescost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.REMARK
     *
     * @return the value of MATTERTYPE.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.REMARK
     *
     * @param remark the value for MATTERTYPE.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.STATUS
     *
     * @return the value of MATTERTYPE.STATUS
     *
     * @mbggenerated
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.STATUS
     *
     * @param status the value for MATTERTYPE.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.PREPARE1
     *
     * @return the value of MATTERTYPE.PREPARE1
     *
     * @mbggenerated
     */
    public String getPrepare1() {
        return prepare1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.PREPARE1
     *
     * @param prepare1 the value for MATTERTYPE.PREPARE1
     *
     * @mbggenerated
     */
    public void setPrepare1(String prepare1) {
        this.prepare1 = prepare1 == null ? null : prepare1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MATTERTYPE.PREPARE2
     *
     * @return the value of MATTERTYPE.PREPARE2
     *
     * @mbggenerated
     */
    public String getPrepare2() {
        return prepare2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MATTERTYPE.PREPARE2
     *
     * @param prepare2 the value for MATTERTYPE.PREPARE2
     *
     * @mbggenerated
     */
    public void setPrepare2(String prepare2) {
        this.prepare2 = prepare2 == null ? null : prepare2.trim();
    }
}