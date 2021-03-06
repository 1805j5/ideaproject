package com.j5erp.entity;

public class Billtype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BILLTYPE.ID
     *
     * @mbggenerated
     */
    private Short id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BILLTYPE.SOTYPE
     *
     * @mbggenerated
     */
    private String sotype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BILLTYPE.ENNAME
     *
     * @mbggenerated
     */
    private String enname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BILLTYPE.DETAILTABLE
     *
     * @mbggenerated
     */
    private String detailtable;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BILLTYPE
     *
     * @mbggenerated
     */
    public Billtype(Short id, String sotype, String enname, String detailtable) {
        this.id = id;
        this.sotype = sotype;
        this.enname = enname;
        this.detailtable = detailtable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BILLTYPE
     *
     * @mbggenerated
     */
    public Billtype() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BILLTYPE.ID
     *
     * @return the value of BILLTYPE.ID
     *
     * @mbggenerated
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BILLTYPE.ID
     *
     * @param id the value for BILLTYPE.ID
     *
     * @mbggenerated
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BILLTYPE.SOTYPE
     *
     * @return the value of BILLTYPE.SOTYPE
     *
     * @mbggenerated
     */
    public String getSotype() {
        return sotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BILLTYPE.SOTYPE
     *
     * @param sotype the value for BILLTYPE.SOTYPE
     *
     * @mbggenerated
     */
    public void setSotype(String sotype) {
        this.sotype = sotype == null ? null : sotype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BILLTYPE.ENNAME
     *
     * @return the value of BILLTYPE.ENNAME
     *
     * @mbggenerated
     */
    public String getEnname() {
        return enname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BILLTYPE.ENNAME
     *
     * @param enname the value for BILLTYPE.ENNAME
     *
     * @mbggenerated
     */
    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BILLTYPE.DETAILTABLE
     *
     * @return the value of BILLTYPE.DETAILTABLE
     *
     * @mbggenerated
     */
    public String getDetailtable() {
        return detailtable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BILLTYPE.DETAILTABLE
     *
     * @param detailtable the value for BILLTYPE.DETAILTABLE
     *
     * @mbggenerated
     */
    public void setDetailtable(String detailtable) {
        this.detailtable = detailtable == null ? null : detailtable.trim();
    }
}