package edu.uwb.docker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class DockerApplication {
	@Value("${profile.message}")
	private String message;
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
	@RequestMapping(path = "/")
	@ResponseBody
	public String index()
	{
		return message;
	}
}
