package com.j5erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AdvanceHost {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHID
     *
     * @mbggenerated
     */
    private String ahid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHDATE
     *
     * @mbggenerated
     */
    private Date ahdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.SUPPLIERSID
     *
     * @mbggenerated
     */
    private String suppliersid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.CURRENCYID
     *
     * @mbggenerated
     */
    private String currencyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHCLEARINGONE
     *
     * @mbggenerated
     */
    private BigDecimal ahclearingone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHCLEARINGTOW
     *
     * @mbggenerated
     */
    private BigDecimal ahclearingtow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHCLEARINGTHREE
     *
     * @mbggenerated
     */
    private BigDecimal ahclearingthree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHEXCHANGERATE
     *
     * @mbggenerated
     */
    private BigDecimal ahexchangerate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHDISCOUNTRATE
     *
     * @mbggenerated
     */
    private BigDecimal ahdiscountrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHDEPT
     *
     * @mbggenerated
     */
    private String ahdept;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHMAKINGNAME
     *
     * @mbggenerated
     */
    private String ahmakingname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHVERIFIER
     *
     * @mbggenerated
     */
    private String ahverifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHREVIEWSTATE
     *
     * @mbggenerated
     */
    private String ahreviewstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHREVIEWDATE
     *
     * @mbggenerated
     */
    private Date ahreviewdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.AHREMARK
     *
     * @mbggenerated
     */
    private String ahremark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.TESTA
     *
     * @mbggenerated
     */
    private String testa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ADVANCE_HOST.TESTB
     *
     * @mbggenerated
     */
    private String testb;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    public AdvanceHost(String ahid, Date ahdate, String suppliersid, String currencyid, BigDecimal ahclearingone, BigDecimal ahclearingtow, BigDecimal ahclearingthree, BigDecimal ahexchangerate, BigDecimal ahdiscountrate, String ahdept, String ahmakingname, String ahverifier, String ahreviewstate, Date ahreviewdate, String ahremark, String testa, String testb) {
        this.ahid = ahid;
        this.ahdate = ahdate;
        this.suppliersid = suppliersid;
        this.currencyid = currencyid;
        this.ahclearingone = ahclearingone;
        this.ahclearingtow = ahclearingtow;
        this.ahclearingthree = ahclearingthree;
        this.ahexchangerate = ahexchangerate;
        this.ahdiscountrate = ahdiscountrate;
        this.ahdept = ahdept;
        this.ahmakingname = ahmakingname;
        this.ahverifier = ahverifier;
        this.ahreviewstate = ahreviewstate;
        this.ahreviewdate = ahreviewdate;
        this.ahremark = ahremark;
        this.testa = testa;
        this.testb = testb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    public AdvanceHost() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHID
     *
     * @return the value of ADVANCE_HOST.AHID
     *
     * @mbggenerated
     */
    public String getAhid() {
        return ahid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHID
     *
     * @param ahid the value for ADVANCE_HOST.AHID
     *
     * @mbggenerated
     */
    public void setAhid(String ahid) {
        this.ahid = ahid == null ? null : ahid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHDATE
     *
     * @return the value of ADVANCE_HOST.AHDATE
     *
     * @mbggenerated
     */
    public Date getAhdate() {
        return ahdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHDATE
     *
     * @param ahdate the value for ADVANCE_HOST.AHDATE
     *
     * @mbggenerated
     */
    public void setAhdate(Date ahdate) {
        this.ahdate = ahdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.SUPPLIERSID
     *
     * @return the value of ADVANCE_HOST.SUPPLIERSID
     *
     * @mbggenerated
     */
    public String getSuppliersid() {
        return suppliersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.SUPPLIERSID
     *
     * @param suppliersid the value for ADVANCE_HOST.SUPPLIERSID
     *
     * @mbggenerated
     */
    public void setSuppliersid(String suppliersid) {
        this.suppliersid = suppliersid == null ? null : suppliersid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.CURRENCYID
     *
     * @return the value of ADVANCE_HOST.CURRENCYID
     *
     * @mbggenerated
     */
    public String getCurrencyid() {
        return currencyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.CURRENCYID
     *
     * @param currencyid the value for ADVANCE_HOST.CURRENCYID
     *
     * @mbggenerated
     */
    public void setCurrencyid(String currencyid) {
        this.currencyid = currencyid == null ? null : currencyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHCLEARINGONE
     *
     * @return the value of ADVANCE_HOST.AHCLEARINGONE
     *
     * @mbggenerated
     */
    public BigDecimal getAhclearingone() {
        return ahclearingone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHCLEARINGONE
     *
     * @param ahclearingone the value for ADVANCE_HOST.AHCLEARINGONE
     *
     * @mbggenerated
     */
    public void setAhclearingone(BigDecimal ahclearingone) {
        this.ahclearingone = ahclearingone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHCLEARINGTOW
     *
     * @return the value of ADVANCE_HOST.AHCLEARINGTOW
     *
     * @mbggenerated
     */
    public BigDecimal getAhclearingtow() {
        return ahclearingtow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHCLEARINGTOW
     *
     * @param ahclearingtow the value for ADVANCE_HOST.AHCLEARINGTOW
     *
     * @mbggenerated
     */
    public void setAhclearingtow(BigDecimal ahclearingtow) {
        this.ahclearingtow = ahclearingtow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHCLEARINGTHREE
     *
     * @return the value of ADVANCE_HOST.AHCLEARINGTHREE
     *
     * @mbggenerated
     */
    public BigDecimal getAhclearingthree() {
        return ahclearingthree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHCLEARINGTHREE
     *
     * @param ahclearingthree the value for ADVANCE_HOST.AHCLEARINGTHREE
     *
     * @mbggenerated
     */
    public void setAhclearingthree(BigDecimal ahclearingthree) {
        this.ahclearingthree = ahclearingthree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHEXCHANGERATE
     *
     * @return the value of ADVANCE_HOST.AHEXCHANGERATE
     *
     * @mbggenerated
     */
    public BigDecimal getAhexchangerate() {
        return ahexchangerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHEXCHANGERATE
     *
     * @param ahexchangerate the value for ADVANCE_HOST.AHEXCHANGERATE
     *
     * @mbggenerated
     */
    public void setAhexchangerate(BigDecimal ahexchangerate) {
        this.ahexchangerate = ahexchangerate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHDISCOUNTRATE
     *
     * @return the value of ADVANCE_HOST.AHDISCOUNTRATE
     *
     * @mbggenerated
     */
    public BigDecimal getAhdiscountrate() {
        return ahdiscountrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHDISCOUNTRATE
     *
     * @param ahdiscountrate the value for ADVANCE_HOST.AHDISCOUNTRATE
     *
     * @mbggenerated
     */
    public void setAhdiscountrate(BigDecimal ahdiscountrate) {
        this.ahdiscountrate = ahdiscountrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHDEPT
     *
     * @return the value of ADVANCE_HOST.AHDEPT
     *
     * @mbggenerated
     */
    public String getAhdept() {
        return ahdept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHDEPT
     *
     * @param ahdept the value for ADVANCE_HOST.AHDEPT
     *
     * @mbggenerated
     */
    public void setAhdept(String ahdept) {
        this.ahdept = ahdept == null ? null : ahdept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHMAKINGNAME
     *
     * @return the value of ADVANCE_HOST.AHMAKINGNAME
     *
     * @mbggenerated
     */
    public String getAhmakingname() {
        return ahmakingname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHMAKINGNAME
     *
     * @param ahmakingname the value for ADVANCE_HOST.AHMAKINGNAME
     *
     * @mbggenerated
     */
    public void setAhmakingname(String ahmakingname) {
        this.ahmakingname = ahmakingname == null ? null : ahmakingname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHVERIFIER
     *
     * @return the value of ADVANCE_HOST.AHVERIFIER
     *
     * @mbggenerated
     */
    public String getAhverifier() {
        return ahverifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHVERIFIER
     *
     * @param ahverifier the value for ADVANCE_HOST.AHVERIFIER
     *
     * @mbggenerated
     */
    public void setAhverifier(String ahverifier) {
        this.ahverifier = ahverifier == null ? null : ahverifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHREVIEWSTATE
     *
     * @return the value of ADVANCE_HOST.AHREVIEWSTATE
     *
     * @mbggenerated
     */
    public String getAhreviewstate() {
        return ahreviewstate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHREVIEWSTATE
     *
     * @param ahreviewstate the value for ADVANCE_HOST.AHREVIEWSTATE
     *
     * @mbggenerated
     */
    public void setAhreviewstate(String ahreviewstate) {
        this.ahreviewstate = ahreviewstate == null ? null : ahreviewstate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHREVIEWDATE
     *
     * @return the value of ADVANCE_HOST.AHREVIEWDATE
     *
     * @mbggenerated
     */
    public Date getAhreviewdate() {
        return ahreviewdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHREVIEWDATE
     *
     * @param ahreviewdate the value for ADVANCE_HOST.AHREVIEWDATE
     *
     * @mbggenerated
     */
    public void setAhreviewdate(Date ahreviewdate) {
        this.ahreviewdate = ahreviewdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.AHREMARK
     *
     * @return the value of ADVANCE_HOST.AHREMARK
     *
     * @mbggenerated
     */
    public String getAhremark() {
        return ahremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.AHREMARK
     *
     * @param ahremark the value for ADVANCE_HOST.AHREMARK
     *
     * @mbggenerated
     */
    public void setAhremark(String ahremark) {
        this.ahremark = ahremark == null ? null : ahremark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.TESTA
     *
     * @return the value of ADVANCE_HOST.TESTA
     *
     * @mbggenerated
     */
    public String getTesta() {
        return testa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.TESTA
     *
     * @param testa the value for ADVANCE_HOST.TESTA
     *
     * @mbggenerated
     */
    public void setTesta(String testa) {
        this.testa = testa == null ? null : testa.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ADVANCE_HOST.TESTB
     *
     * @return the value of ADVANCE_HOST.TESTB
     *
     * @mbggenerated
     */
    public String getTestb() {
        return testb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ADVANCE_HOST.TESTB
     *
     * @param testb the value for ADVANCE_HOST.TESTB
     *
     * @mbggenerated
     */
    public void setTestb(String testb) {
        this.testb = testb == null ? null : testb.trim();
    }
}