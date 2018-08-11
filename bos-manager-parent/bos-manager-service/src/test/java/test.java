import com.bonfire.dao.UserMapper;
import com.bonfire.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/8/8.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext( new String[]{"classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-trans.xml"});
        UserMapper userDao = (UserMapper) ctx.getBean("userMapper");
        List<User> userList = userDao.selectAll();
        System.out.println(userList);
    }
}
