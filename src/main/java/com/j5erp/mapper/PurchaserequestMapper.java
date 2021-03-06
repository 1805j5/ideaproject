package com.j5erp.mapper;

import com.j5erp.entity.Purchaserequest;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface PurchaserequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PURCHASEREQUEST
     *
     * @mbggenerated
     */
    @Delete({
        "delete from PURCHASEREQUEST",
        "where QGBILLNUMBER = #{qgbillnumber,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String qgbillnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PURCHASEREQUEST
     *
     * @mbggenerated
     */
    @Insert({
        "insert into PURCHASEREQUEST (QGBILLNUMBER, QGTYPE, ",
        "QGDATE, QGBILLSTATE, ",
        "QGPERSONNEL, QGZDPERSONNEL, ",
        "QGDEPARTMENT, QGFHDEPARTMENT, ",
        "QGHEAD, QGCOLUMN1, ",
        "QGEND, QGCOLUMN2, ",
        "QGREMARK, QGEXAMINESTATUS)",
        "values (#{qgbillnumber,jdbcType=VARCHAR}, #{qgtype,jdbcType=VARCHAR}, ",
        "#{qgdate,jdbcType=TIMESTAMP}, #{qgbillstate,jdbcType=DECIMAL}, ",
        "#{qgpersonnel,jdbcType=VARCHAR}, #{qgzdpersonnel,jdbcType=VARCHAR}, ",
        "#{qgdepartment,jdbcType=VARCHAR}, #{qgfhdepartment,jdbcType=VARCHAR}, ",
        "#{qghead,jdbcType=VARCHAR}, #{qgcolumn1,jdbcType=VARCHAR}, ",
        "#{qgend,jdbcType=VARCHAR}, #{qgcolumn2,jdbcType=VARCHAR}, ",
        "#{qgremark,jdbcType=VARCHAR}, #{qgexaminestatus,jdbcType=DECIMAL})"
    })
    int insert(Purchaserequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PURCHASEREQUEST
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "QGBILLNUMBER, QGTYPE, QGDATE, QGBILLSTATE, QGPERSONNEL, QGZDPERSONNEL, QGDEPARTMENT, ",
        "QGFHDEPARTMENT, QGHEAD, QGCOLUMN1, QGEND, QGCOLUMN2, QGREMARK, QGEXAMINESTATUS",
        "from PURCHASEREQUEST",
        "where QGBILLNUMBER = #{qgbillnumber,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="QGBILLNUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="QGTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="QGBILLSTATE", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="QGPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGZDPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGDEPARTMENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGFHDEPARTMENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGHEAD", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGCOLUMN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGEND", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGCOLUMN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGEXAMINESTATUS", javaType=Short.class, jdbcType=JdbcType.DECIMAL)
    })
    Purchaserequest selectByPrimaryKey(String qgbillnumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PURCHASEREQUEST
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "QGBILLNUMBER, QGTYPE, QGDATE, QGBILLSTATE, QGPERSONNEL, QGZDPERSONNEL, QGDEPARTMENT, ",
        "QGFHDEPARTMENT, QGHEAD, QGCOLUMN1, QGEND, QGCOLUMN2, QGREMARK, QGEXAMINESTATUS",
        "from PURCHASEREQUEST"
    })
    @ConstructorArgs({
        @Arg(column="QGBILLNUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="QGTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="QGBILLSTATE", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="QGPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGZDPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGDEPARTMENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGFHDEPARTMENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGHEAD", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGCOLUMN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGEND", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGCOLUMN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="QGEXAMINESTATUS", javaType=Short.class, jdbcType=JdbcType.DECIMAL)
    })
    List<Purchaserequest> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PURCHASEREQUEST
     *
     * @mbggenerated
     */
    @Update({
        "update PURCHASEREQUEST",
        "set QGTYPE = #{qgtype,jdbcType=VARCHAR},",
          "QGDATE = #{qgdate,jdbcType=TIMESTAMP},",
          "QGBILLSTATE = #{qgbillstate,jdbcType=DECIMAL},",
          "QGPERSONNEL = #{qgpersonnel,jdbcType=VARCHAR},",
          "QGZDPERSONNEL = #{qgzdpersonnel,jdbcType=VARCHAR},",
          "QGDEPARTMENT = #{qgdepartment,jdbcType=VARCHAR},",
          "QGFHDEPARTMENT = #{qgfhdepartment,jdbcType=VARCHAR},",
          "QGHEAD = #{qghead,jdbcType=VARCHAR},",
          "QGCOLUMN1 = #{qgcolumn1,jdbcType=VARCHAR},",
          "QGEND = #{qgend,jdbcType=VARCHAR},",
          "QGCOLUMN2 = #{qgcolumn2,jdbcType=VARCHAR},",
          "QGREMARK = #{qgremark,jdbcType=VARCHAR},",
          "QGEXAMINESTATUS = #{qgexaminestatus,jdbcType=DECIMAL}",
        "where QGBILLNUMBER = #{qgbillnumber,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Purchaserequest record);
}