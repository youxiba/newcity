package controller;

import com.city.dao.model.User;
import com.city.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Mr.MKB
 * @Version: V1.0
 * @Description: user
 * @DATE: 2018-05-25 15:45
 * @throws
 */
@Controller
public class UserController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap map){
       User user;
        user = userService.queryUserById(17);
        map.addAttribute("user",user);

        return "user";
    }

    @RequestMapping(value = "/addUser")
    public String addUser(HttpServletRequest request,HttpServletResponse response,ModelMap map){
        User user = new User();
        user.setName("王二小");
        user.setAge(27);
        int result = userService.userAdd(user);
        if(result == 1){
            return "success";
        }else {
            return "login";
        }
    }

}
