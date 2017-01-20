package com.niit.secondprojectRest.controller;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.streotype.Controller;
import org.springframework.web.bind.annotation.Mapping;

import com.niit.secondprojectbackend.model.Message;
import com.niit.secondprojectbackend.model.OutputMessage;

public class ChatController {
	@Mapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message)
	{
		return new OutputMessage(message, new Date());
	}
}
