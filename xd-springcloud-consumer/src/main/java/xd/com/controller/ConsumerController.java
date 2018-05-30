package xd.com.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xd.com.config.ListenerConfig;

/**
 * Created by pengqq622 on 2018/5/30.
 */

@RestController
@RequestMapping("consumer")
public class ConsumerController {


    @Autowired
    private RestTemplate restTemplate ;

    @GetMapping("getUserInfo")
    public String getUserInfo(){
        JSONObject json = restTemplate.
                getForEntity("http://xd-springcloud-provider/provider/test", JSONObject.class).getBody();
        System.err.println(ListenerConfig.getPort());
        return json.toJSONString();
    }

}
