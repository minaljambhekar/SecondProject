
package com.niit.secondprojectRest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSocketMessageMessageBroker
@ComponentScan(basePackages="com.niit")
public class WebSocketConfig<StompEndpointRegistry> extends AbstractWebSocketMessageBrokerConfigurer {
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config){
		config.enableSimpleBroker("/topic","/queue");
		config.setApplicationDestinationPrefixes("/app");
	}
	public void registerStompEndpoints(StompEndpointRegistry args0){
	
	arg0.addEndpoint("/chat").withSockJS();
}
	}





