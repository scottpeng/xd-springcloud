package xd.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xd.com.config.ListenerConfig;
import xd.com.entitiy.User;


@RestController
@RequestMapping("provider")
public class Provider1Controller {

         @GetMapping("test")
         public User testProvider(){
             User user = User.builder().id(1).userName("scott").build();
             System.err.println(ListenerConfig.getPort());
             return user ;
         }


}
