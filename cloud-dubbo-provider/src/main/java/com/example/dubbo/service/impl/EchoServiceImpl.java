package com.example.dubbo.service.impl;

import com.example.dubbo.service.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service(protocol = "dubbo")
class EchoServiceImpl implements EchoService {

	@Override
	public String echo(String message) {
		return "[echo] Hello, " + message;
	}

}
