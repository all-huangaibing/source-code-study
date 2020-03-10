package com.huang.ai.bing.mapper;

import com.huang.ai.bing.pojo.BatchResult;
import org.apache.ibatis.annotations.Select;

/**
 * 功能：
 *
 * @author huangaibing
 * @date 2019/10/16 14:58
 */
public interface BatchResultMapper {
    /**
     * @param id
     * @return com.huang.ai.bing.pojo.BatchResult
     */
//    @Select("select * from batch_result where id = #{id}")
    public BatchResult selectBatchResult(long id);
}
