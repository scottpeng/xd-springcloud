springcloud 系列组件

1. Eureka 集群 <br>
   Eureka-Server1 Eureka-Server2 Eureka-Server3 <br>
   启动后显示如下：http://server3:8003  <br>
  ![image](https://github.com/scottpeng/xd-springcloud/blob/master/images-folder/eureka-sever.png)
   
2. 服务提供方 <br>
   xd-springcloud-provider
   
3. 服务消费方 <br>
   xd-springcloud-consumer  采用Ribbon的均衡负载  RestTemplate <br>
   
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(SimpleClientHttpRequestFactory factory){
        return new RestTemplate(factory);
    }

    @Bean
    public SimpleClientHttpRequestFactory simpleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);//ms
        factory.setConnectTimeout(15000);//ms
        return factory;
    }
   
