package cn.yb.mybatis.test;

import cn.yb.mybatis.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class test_update {

    SqlSession sqlSession;

    @Before
    public void before() throws IOException {
        //a)读取配置文件(官方文档中有说明)
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // b)通过SqlSessionFactoryBuilder创建SqlSessionFactory会话工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // c)通过SqlSessionFactory创建SqlSession
        sqlSession = sessionFactory.openSession();
    }

    @After
    public void after() {
        //关闭session
        sqlSession.close();
    }

    /**
     * 更新数据
     */
    @Test
    public void test1() {
        User user = new User();
        user.setId(10);
        user.setSex("男");
        user.setAddress("西安");
        //返回值是受影响行数
        sqlSession.update("updateUser",user);
        //除了查询之外，其他操作需要事务提交（默认不自动提交）
        sqlSession.commit();
    }
}
