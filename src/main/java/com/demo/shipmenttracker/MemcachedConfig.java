///*
//package com.demo.shipmenttracker;
//
//import net.rubyeye.xmemcached.MemcachedClient;
//import net.rubyeye.xmemcached.XMemcachedClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.concurrent.ConcurrentMapCache;
//import org.springframework.cache.support.SimpleCacheManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//import java.util.Collections;
//
//@Configuration
//public class MemcachedConfig {
//
//    @Value("${memcached.host}")
//    private String memcachedHost;
//
//    @Value("${memcached.port}")
//    private int memcachedPort;
//
//    @Bean
//    public MemcachedClient memcachedClient() throws IOException {
//        System.out.println("=== Connecting to Memcached ===");
//        System.out.println("Host: " + memcachedHost);
//        System.out.println("Port: " + memcachedPort);
//        return new XMemcachedClient(memcachedHost, memcachedPort);
//    }
//
//
//    @Bean
//    public CacheManager cacheManager() {
//        SimpleCacheManager cacheManager = new SimpleCacheManager();
//        cacheManager.setCaches(Collections.singletonList(new ConcurrentMapCache("shipments")));
//        return cacheManager;
//    }
//}
//*/
