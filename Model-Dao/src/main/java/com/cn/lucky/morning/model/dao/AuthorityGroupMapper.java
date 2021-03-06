package com.cn.lucky.morning.model.dao;

import com.cn.lucky.morning.model.domain.AuthorityGroup;
import com.cn.lucky.morning.model.domain.AuthorityGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthorityGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    long countByExample(AuthorityGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int deleteByExample(AuthorityGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int insert(AuthorityGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int insertSelective(AuthorityGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    List<AuthorityGroup> selectByExample(AuthorityGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    AuthorityGroup selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") AuthorityGroup record, @Param("example") AuthorityGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") AuthorityGroup record, @Param("example") AuthorityGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AuthorityGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_authority_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AuthorityGroup record);
}