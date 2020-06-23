package com.alibaba.nacos.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiaojing
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosProviderApplication.class, args);
	}

	@RestController
	class EchoController {
		@RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
		public String echo(@PathVariable String string) {
			System.out.println("Provider rece:" + string);
			return "Hello Nacos Discovery " + string;
		}

		@GetMapping("/hi")
		public String hi(@RequestParam(value = "name",defaultValue = "forezp",required = false)String name){
			System.out.println("Provider hi rece:" + name);
			return "hi "+name;
		}
	}
}
