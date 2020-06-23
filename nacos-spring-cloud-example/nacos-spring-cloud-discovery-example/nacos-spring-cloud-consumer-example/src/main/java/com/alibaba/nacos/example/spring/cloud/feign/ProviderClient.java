package com.alibaba.nacos.example.spring.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign Client fro provider
 *
 * @author tianqi
 * @date 2020-06-19
 */
@FeignClient("service-provider")
public interface ProviderClient {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name") String name);

}
