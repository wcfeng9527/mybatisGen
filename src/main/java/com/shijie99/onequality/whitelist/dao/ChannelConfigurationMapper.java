package com.shijie99.onequality.whitelist.dao;

import com.shijie99.onequality.whitelist.pojo.ChannelConfiguration;
import com.shijie99.onequality.whitelist.pojo.ChannelConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelConfigurationMapper {
    int countByExample(ChannelConfigurationExample example);

    int deleteByExample(ChannelConfigurationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelConfiguration record);

    int insertSelective(ChannelConfiguration record);

    List<ChannelConfiguration> selectByExample(ChannelConfigurationExample example);

    ChannelConfiguration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelConfiguration record, @Param("example") ChannelConfigurationExample example);

    int updateByExample(@Param("record") ChannelConfiguration record, @Param("example") ChannelConfigurationExample example);

    int updateByPrimaryKeySelective(ChannelConfiguration record);

    int updateByPrimaryKey(ChannelConfiguration record);
}