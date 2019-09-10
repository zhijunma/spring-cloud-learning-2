package com.cl.servercustomerfeignhyxtrix.fallbackService;


import com.cl.servercustomerfeignhyxtrix.service.FeignService;
import org.springframework.stereotype.Service;

@Service
public class FallbackService implements FeignService {
    @Override
    public String hello() {
        return "检测到服务失败，再次请求以跳转其他服务器";
    }
}
