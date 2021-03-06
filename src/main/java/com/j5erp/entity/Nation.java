package com.j5erp.entity;

public class Nation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NATION.NATIONID
     *
     * @mbggenerated
     */
    private String nationid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column NATION.NATIONCN_NAME
     *
     * @mbggenerated
     */
    private String nationcnName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NATION
     *
     * @mbggenerated
     */
    public Nation(String nationid, String nationcnName) {
        this.nationid = nationid;
        this.nationcnName = nationcnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NATION
     *
     * @mbggenerated
     */
    public Nation() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NATION.NATIONID
     *
     * @return the value of NATION.NATIONID
     *
     * @mbggenerated
     */
    public String getNationid() {
        return nationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NATION.NATIONID
     *
     * @param nationid the value for NATION.NATIONID
     *
     * @mbggenerated
     */
    public void setNationid(String nationid) {
        this.nationid = nationid == null ? null : nationid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column NATION.NATIONCN_NAME
     *
     * @return the value of NATION.NATIONCN_NAME
     *
     * @mbggenerated
     */
    public String getNationcnName() {
        return nationcnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column NATION.NATIONCN_NAME
     *
     * @param nationcnName the value for NATION.NATIONCN_NAME
     *
     * @mbggenerated
     */
    public void setNationcnName(String nationcnName) {
        this.nationcnName = nationcnName == null ? null : nationcnName.trim();
    }
}