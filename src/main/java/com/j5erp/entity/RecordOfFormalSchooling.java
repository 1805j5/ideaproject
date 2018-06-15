package com.j5erp.entity;

public class RecordOfFormalSchooling {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECORD_OF_FORMAL_SCHOOLING.ROFSID
     *
     * @mbggenerated
     */
    private String rofsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RECORD_OF_FORMAL_SCHOOLING.ROFSCN_NAME
     *
     * @mbggenerated
     */
    private String rofscnName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    public RecordOfFormalSchooling(String rofsid, String rofscnName) {
        this.rofsid = rofsid;
        this.rofscnName = rofscnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    public RecordOfFormalSchooling() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECORD_OF_FORMAL_SCHOOLING.ROFSID
     *
     * @return the value of RECORD_OF_FORMAL_SCHOOLING.ROFSID
     *
     * @mbggenerated
     */
    public String getRofsid() {
        return rofsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECORD_OF_FORMAL_SCHOOLING.ROFSID
     *
     * @param rofsid the value for RECORD_OF_FORMAL_SCHOOLING.ROFSID
     *
     * @mbggenerated
     */
    public void setRofsid(String rofsid) {
        this.rofsid = rofsid == null ? null : rofsid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RECORD_OF_FORMAL_SCHOOLING.ROFSCN_NAME
     *
     * @return the value of RECORD_OF_FORMAL_SCHOOLING.ROFSCN_NAME
     *
     * @mbggenerated
     */
    public String getRofscnName() {
        return rofscnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RECORD_OF_FORMAL_SCHOOLING.ROFSCN_NAME
     *
     * @param rofscnName the value for RECORD_OF_FORMAL_SCHOOLING.ROFSCN_NAME
     *
     * @mbggenerated
     */
    public void setRofscnName(String rofscnName) {
        this.rofscnName = rofscnName == null ? null : rofscnName.trim();
    }
}