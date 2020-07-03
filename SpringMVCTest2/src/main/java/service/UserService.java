package service;
import bean.UserForm;
public interface UserService {
    boolean login(UserForm user);
    boolean register(UserForm user);
}