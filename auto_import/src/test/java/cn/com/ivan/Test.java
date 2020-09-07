package cn.com.ivan;

import cn.com.ivan.bean.EnableUserBean;
import cn.com.ivan.bean.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableUserBean
public class Test {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test.class);
        User user = (User) ac.getBean(User.class);
        System.out.println("ss");
        System.out.println("ss");
    }

}
