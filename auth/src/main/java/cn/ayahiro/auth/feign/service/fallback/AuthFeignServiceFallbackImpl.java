package cn.ayahiro.auth.feign.service.fallback;

import cn.ayahiro.auth.feign.service.AuthFeignService;
import org.springframework.stereotype.Component;

@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

    @Override
    public String hello(String name) {
        return "hello " + name + ", this is auth, but request error";
    }
}