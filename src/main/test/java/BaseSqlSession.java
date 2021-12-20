import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import utils.MyBatisUtils;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-20_周一 15:13
 **/
public class BaseSqlSession {
    protected SqlSession sqlSession;
    @Before
    public void initSqlSession(){
        sqlSession= MyBatisUtils.openSession();
    }
    @After
    public  void destroySqlSession(){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }

}
