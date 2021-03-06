package com.j5erp.mapper;

import com.j5erp.entity.TSuppliertype;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TSuppliertypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SUPPLIERTYPE
     *
     * @mbggenerated
     */
    @Delete({
        "delete from T_SUPPLIERTYPE",
        "where SUPTYPEID = #{suptypeid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String suptypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SUPPLIERTYPE
     *
     * @mbggenerated
     */
    @Insert({
        "insert into T_SUPPLIERTYPE (SUPTYPEID, SUPTYPENAME)",
        "values (#{suptypeid,jdbcType=VARCHAR}, #{suptypename,jdbcType=VARCHAR})"
    })
    int insert(TSuppliertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SUPPLIERTYPE
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "SUPTYPEID, SUPTYPENAME",
        "from T_SUPPLIERTYPE",
        "where SUPTYPEID = #{suptypeid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="SUPTYPEID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="SUPTYPENAME", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    TSuppliertype selectByPrimaryKey(String suptypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SUPPLIERTYPE
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "SUPTYPEID, SUPTYPENAME",
        "from T_SUPPLIERTYPE"
    })
    @ConstructorArgs({
        @Arg(column="SUPTYPEID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="SUPTYPENAME", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<TSuppliertype> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SUPPLIERTYPE
     *
     * @mbggenerated
     */
    @Update({
        "update T_SUPPLIERTYPE",
        "set SUPTYPENAME = #{suptypename,jdbcType=VARCHAR}",
        "where SUPTYPEID = #{suptypeid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TSuppliertype record);
}