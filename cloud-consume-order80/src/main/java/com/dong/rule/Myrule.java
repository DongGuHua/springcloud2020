package com.dong.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 董古华
 * @Create 2020/4/14 14:03
 * @see ribbon核心组件rule  修改负载均衡算法方式 默认轮训 可以替换为随机加权等 该类不能被@ComponentScan注解扫描到
 */
@Configuration
public class Myrule {
    @Bean
    public IRule myRule() {
        return new RandomRule(); // 定义为随机
    }
}
