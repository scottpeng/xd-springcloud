package xd.com.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pengqq622 on 2018/5/30.
 */
@Configuration
public class ListenerConfig implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {

    private static EmbeddedServletContainerInitializedEvent event ;

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        ListenerConfig.event = event ;
    }


    public static int getPort() {
        int port = event.getEmbeddedServletContainer().getPort();
        return port  ;
    }

}
