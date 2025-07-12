package com.demo.shipmenttracker;


import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClient;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.Collections;

@Configuration
public class MemcachedConfig {

    @Bean
    public MemcachedClient memcachedClient() throws IOException {
        return new XMemcachedClient("localhost", 11211);
    }

    // Basic in-memory fallback cache manager (optional)
    @Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Collections.singletonList(new ConcurrentMapCache("shipments")));
        return cacheManager;
    }
}
