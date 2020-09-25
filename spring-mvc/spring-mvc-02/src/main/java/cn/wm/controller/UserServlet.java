package cn.wm.controller;

import cn.wm.bean.User;
import cn.wm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserServlet {

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    public Map<String,Object> findAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page,limit);
        List<User> users = userService.findAll();
        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        map.put("code",0);
        map.put("count",userPageInfo.getTotal());
        map.put("data",userPageInfo.getList());
        return map;
    }

    @GetMapping("/index")
    public ModelAndView main(){
        return new ModelAndView("user/index");
    }

    @PostMapping("/login")
    public String login(){
        //userService.login();
        return "index";
    }
}
