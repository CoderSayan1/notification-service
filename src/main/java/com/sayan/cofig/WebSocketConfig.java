package com.sayan.cofig;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        registry.enableSimpleBroker("/topic");   // This is for broadcasting the messages
        registry.setApplicationDestinationPrefixes("/app");   // This is for client to access the endpoint
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("ws") // Define the websocket endpoint that client use to establish the connection
                .setAllowedOrigins("http://localhost:63342")
                .withSockJS(); // This is for if there is any browser not support websocket, works like a fallback
    }
}
