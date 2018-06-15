package com.j5erp.mapper;

import com.j5erp.entity.Tiaojiadanzhubiao;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TiaojiadanzhubiaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIAOJIADANZHUBIAO
     *
     * @mbggenerated
     */
    @Delete({
        "delete from TIAOJIADANZHUBIAO",
        "where BILLNO = #{billno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String billno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIAOJIADANZHUBIAO
     *
     * @mbggenerated
     */
    @Insert({
        "insert into TIAOJIADANZHUBIAO (BILLNO, ADJUSTDATE, ",
        "MAKER, PERMITTER, ",
        "AUDITSTATUS, WHMEMO)",
        "values (#{billno,jdbcType=VARCHAR}, #{adjustdate,jdbcType=TIMESTAMP}, ",
        "#{maker,jdbcType=VARCHAR}, #{permitter,jdbcType=VARCHAR}, ",
        "#{auditstatus,jdbcType=DECIMAL}, #{whmemo,jdbcType=VARCHAR})"
    })
    int insert(Tiaojiadanzhubiao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIAOJIADANZHUBIAO
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "BILLNO, ADJUSTDATE, MAKER, PERMITTER, AUDITSTATUS, WHMEMO",
        "from TIAOJIADANZHUBIAO",
        "where BILLNO = #{billno,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="BILLNO", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ADJUSTDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MAKER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERMITTER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AUDITSTATUS", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="WHMEMO", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Tiaojiadanzhubiao selectByPrimaryKey(String billno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIAOJIADANZHUBIAO
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "BILLNO, ADJUSTDATE, MAKER, PERMITTER, AUDITSTATUS, WHMEMO",
        "from TIAOJIADANZHUBIAO"
    })
    @ConstructorArgs({
        @Arg(column="BILLNO", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ADJUSTDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="MAKER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PERMITTER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AUDITSTATUS", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="WHMEMO", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Tiaojiadanzhubiao> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TIAOJIADANZHUBIAO
     *
     * @mbggenerated
     */
    @Update({
        "update TIAOJIADANZHUBIAO",
        "set ADJUSTDATE = #{adjustdate,jdbcType=TIMESTAMP},",
          "MAKER = #{maker,jdbcType=VARCHAR},",
          "PERMITTER = #{permitter,jdbcType=VARCHAR},",
          "AUDITSTATUS = #{auditstatus,jdbcType=DECIMAL},",
          "WHMEMO = #{whmemo,jdbcType=VARCHAR}",
        "where BILLNO = #{billno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Tiaojiadanzhubiao record);
}