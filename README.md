springcloud 系列组件

1. Eureka 集群 <br>
   Eureka-Server1 Eureka-Server2 Eureka-Server3 <br>
   启动后显示如下：http://server3:8003  <br>
  ![image](https://github.com/scottpeng/xd-springcloud/blob/master/images-folder/eureka-sever.png)
   
2. 服务提供方 xd-springcloud-provider <br>
   
   
3. 服务消费方 xd-springcloud-consumer  采用Ribbon的均衡负载  RestTemplate <br>

   
    @Bean <br>
    @LoadBalanced <br>
    public RestTemplate restTemplate(SimpleClientHttpRequestFactory factory){ <br>
        return new RestTemplate(factory); <br>
    } <br>

    @Bean <br>
    public SimpleClientHttpRequestFactory simpleClientHttpRequestFactory(){ <br>
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory(); <br>
        factory.setReadTimeout(5000);//ms <br>
        factory.setConnectTimeout(15000);//ms <br>
        return factory;<br>
    } <br>
   
