package com.huang.ai.bing;

import com.huang.ai.bing.mapper.BatchResultMapper;
import com.huang.ai.bing.pojo.BatchResult;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        testMethod(sqlSession);
    }

    private static void testMapper(SqlSession sqlSession) {
        BatchResultMapper mapper = sqlSession.getMapper(BatchResultMapper.class);
        BatchResult batchResult = mapper.selectBatchResult(105L);
        System.out.println("batchResult = " + batchResult);
    }

    private static void testMethod(SqlSession sqlSession) {
        Object batchResult = sqlSession.selectOne("com.huang.ai.bing.mapper.BatchResultMapper.selectBatchResult", 105L);
        System.out.println("batchResult = " + batchResult);

    }
}
