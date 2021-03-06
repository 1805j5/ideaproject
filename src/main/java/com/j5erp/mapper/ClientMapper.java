package com.j5erp.mapper;

import com.j5erp.entity.Client;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT
     *
     * @mbggenerated
     */
    @Delete({
        "delete from CLIENT",
        "where CUSTOMERID = #{customerid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT
     *
     * @mbggenerated
     */
    @Insert({
        "insert into CLIENT (CUSTOMERID, CUSTOMERRECEIVABLEBELONGING, ",
        "CUSTOMERNAME, CUSTOMERCLASSID, ",
        "CUSTOMERSIMPLENAME, CUSTOMERADDRESSID, ",
        "CUSTOMERCURRENCY, CUSTOMERFUNCTIONARY, ",
        "PERSONNELID, CUSTOMERCONTACT, ",
        "CUSTOMERPHONE, CUSTOMERAMOUNT, ",
        "CUSTOMERTRADE, CUSTOMERSMAIL, ",
        "CUSTOMERBANKACCOUNT, CUSTOMERBANKNAME, ",
        "CUSTOMERPORTRAITURE, CUSTOMERSELLLEVEL, ",
        "CUSTOMERTAX, CUSTOMERCREATEDATE, ",
        "CUSTOMERRECEIVABLELIMIT, CUSTOMERSURPLUSLIMIT, ",
        "CUSTOMERADVANCESRECEIVED, CUSTOMERACCOUNTDUE, ",
        "CUSTOMERREMARK)",
        "values (#{customerid,jdbcType=VARCHAR}, #{customerreceivablebelonging,jdbcType=VARCHAR}, ",
        "#{customername,jdbcType=VARCHAR}, #{customerclassid,jdbcType=VARCHAR}, ",
        "#{customersimplename,jdbcType=VARCHAR}, #{customeraddressid,jdbcType=VARCHAR}, ",
        "#{customercurrency,jdbcType=VARCHAR}, #{customerfunctionary,jdbcType=VARCHAR}, ",
        "#{personnelid,jdbcType=VARCHAR}, #{customercontact,jdbcType=VARCHAR}, ",
        "#{customerphone,jdbcType=VARCHAR}, #{customeramount,jdbcType=DECIMAL}, ",
        "#{customertrade,jdbcType=VARCHAR}, #{customersmail,jdbcType=VARCHAR}, ",
        "#{customerbankaccount,jdbcType=VARCHAR}, #{customerbankname,jdbcType=VARCHAR}, ",
        "#{customerportraiture,jdbcType=VARCHAR}, #{customerselllevel,jdbcType=DECIMAL}, ",
        "#{customertax,jdbcType=DECIMAL}, #{customercreatedate,jdbcType=TIMESTAMP}, ",
        "#{customerreceivablelimit,jdbcType=DECIMAL}, #{customersurpluslimit,jdbcType=DECIMAL}, ",
        "#{customeradvancesreceived,jdbcType=DECIMAL}, #{customeraccountdue,jdbcType=DECIMAL}, ",
        "#{customerremark,jdbcType=VARCHAR})"
    })
    int insert(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "CUSTOMERID, CUSTOMERRECEIVABLEBELONGING, CUSTOMERNAME, CUSTOMERCLASSID, CUSTOMERSIMPLENAME, ",
        "CUSTOMERADDRESSID, CUSTOMERCURRENCY, CUSTOMERFUNCTIONARY, PERSONNELID, CUSTOMERCONTACT, ",
        "CUSTOMERPHONE, CUSTOMERAMOUNT, CUSTOMERTRADE, CUSTOMERSMAIL, CUSTOMERBANKACCOUNT, ",
        "CUSTOMERBANKNAME, CUSTOMERPORTRAITURE, CUSTOMERSELLLEVEL, CUSTOMERTAX, CUSTOMERCREATEDATE, ",
        "CUSTOMERRECEIVABLELIMIT, CUSTOMERSURPLUSLIMIT, CUSTOMERADVANCESRECEIVED, CUSTOMERACCOUNTDUE, ",
        "CUSTOMERREMARK",
        "from CLIENT",
        "where CUSTOMERID = #{customerid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="CUSTOMERID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="CUSTOMERRECEIVABLEBELONGING", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERCLASSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERSIMPLENAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERADDRESSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERCURRENCY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERFUNCTIONARY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERSONNELID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERCONTACT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERPHONE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERAMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERTRADE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERSMAIL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERBANKACCOUNT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERBANKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERPORTRAITURE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERSELLLEVEL", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERTAX", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERCREATEDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSTOMERRECEIVABLELIMIT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERSURPLUSLIMIT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERADVANCESRECEIVED", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERACCOUNTDUE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Client selectByPrimaryKey(String customerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "CUSTOMERID, CUSTOMERRECEIVABLEBELONGING, CUSTOMERNAME, CUSTOMERCLASSID, CUSTOMERSIMPLENAME, ",
        "CUSTOMERADDRESSID, CUSTOMERCURRENCY, CUSTOMERFUNCTIONARY, PERSONNELID, CUSTOMERCONTACT, ",
        "CUSTOMERPHONE, CUSTOMERAMOUNT, CUSTOMERTRADE, CUSTOMERSMAIL, CUSTOMERBANKACCOUNT, ",
        "CUSTOMERBANKNAME, CUSTOMERPORTRAITURE, CUSTOMERSELLLEVEL, CUSTOMERTAX, CUSTOMERCREATEDATE, ",
        "CUSTOMERRECEIVABLELIMIT, CUSTOMERSURPLUSLIMIT, CUSTOMERADVANCESRECEIVED, CUSTOMERACCOUNTDUE, ",
        "CUSTOMERREMARK",
        "from CLIENT"
    })
    @ConstructorArgs({
        @Arg(column="CUSTOMERID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="CUSTOMERRECEIVABLEBELONGING", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERCLASSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERSIMPLENAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERADDRESSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERCURRENCY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERFUNCTIONARY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERSONNELID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERCONTACT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERPHONE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERAMOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERTRADE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERSMAIL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERBANKACCOUNT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERBANKNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERPORTRAITURE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CUSTOMERSELLLEVEL", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERTAX", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERCREATEDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSTOMERRECEIVABLELIMIT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERSURPLUSLIMIT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERADVANCESRECEIVED", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERACCOUNTDUE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="CUSTOMERREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Client> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT
     *
     * @mbggenerated
     */
    @Update({
        "update CLIENT",
        "set CUSTOMERRECEIVABLEBELONGING = #{customerreceivablebelonging,jdbcType=VARCHAR},",
          "CUSTOMERNAME = #{customername,jdbcType=VARCHAR},",
          "CUSTOMERCLASSID = #{customerclassid,jdbcType=VARCHAR},",
          "CUSTOMERSIMPLENAME = #{customersimplename,jdbcType=VARCHAR},",
          "CUSTOMERADDRESSID = #{customeraddressid,jdbcType=VARCHAR},",
          "CUSTOMERCURRENCY = #{customercurrency,jdbcType=VARCHAR},",
          "CUSTOMERFUNCTIONARY = #{customerfunctionary,jdbcType=VARCHAR},",
          "PERSONNELID = #{personnelid,jdbcType=VARCHAR},",
          "CUSTOMERCONTACT = #{customercontact,jdbcType=VARCHAR},",
          "CUSTOMERPHONE = #{customerphone,jdbcType=VARCHAR},",
          "CUSTOMERAMOUNT = #{customeramount,jdbcType=DECIMAL},",
          "CUSTOMERTRADE = #{customertrade,jdbcType=VARCHAR},",
          "CUSTOMERSMAIL = #{customersmail,jdbcType=VARCHAR},",
          "CUSTOMERBANKACCOUNT = #{customerbankaccount,jdbcType=VARCHAR},",
          "CUSTOMERBANKNAME = #{customerbankname,jdbcType=VARCHAR},",
          "CUSTOMERPORTRAITURE = #{customerportraiture,jdbcType=VARCHAR},",
          "CUSTOMERSELLLEVEL = #{customerselllevel,jdbcType=DECIMAL},",
          "CUSTOMERTAX = #{customertax,jdbcType=DECIMAL},",
          "CUSTOMERCREATEDATE = #{customercreatedate,jdbcType=TIMESTAMP},",
          "CUSTOMERRECEIVABLELIMIT = #{customerreceivablelimit,jdbcType=DECIMAL},",
          "CUSTOMERSURPLUSLIMIT = #{customersurpluslimit,jdbcType=DECIMAL},",
          "CUSTOMERADVANCESRECEIVED = #{customeradvancesreceived,jdbcType=DECIMAL},",
          "CUSTOMERACCOUNTDUE = #{customeraccountdue,jdbcType=DECIMAL},",
          "CUSTOMERREMARK = #{customerremark,jdbcType=VARCHAR}",
        "where CUSTOMERID = #{customerid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Client record);
}