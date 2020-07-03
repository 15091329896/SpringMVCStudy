package service;

import org.springframework.stereotype.Service;

import bean.UserForm;

//注解为一个服务
@Service
public class UserServiceImpl implements UserService {
    public boolean login(UserForm user) {
    	System.out.println(" UserServiceImpl---> login 被调用");
    	
        if ("root".equals(user.getUname())
                && "root".equals(user.getUpass())) {
            return true;
        }
        return false;
    }
    
    public boolean register(UserForm user) {
    	System.out.println(" UserServiceImpl---> register 被调用");
    	
        if ("root".equals(user.getUname())
                && "root".equals(user.getUpass())) {
            return true;
        }
        return false;
    }
}