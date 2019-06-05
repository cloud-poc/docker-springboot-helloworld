package org.akj.docker.helloworld.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String sayhi(HttpServletRequest request) throws UnknownHostException {

		InetAddress ip = InetAddress.getLocalHost();

		return "[Succ]Hello Docker World, request rec'd from [Hostname]:" + ip.getCanonicalHostName()
				+ ",\r\n[RemoteAddr]:" + request.getRemoteAddr() + ",\r\n[x-forwarded-for]:"
				+ request.getHeader("x-forwarded-for") + ",\r\n[x-real-ip]:" + request.getHeader("x-real-ip");
	}

}
