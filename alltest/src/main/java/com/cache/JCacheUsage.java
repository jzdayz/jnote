package com.cache;

import javax.cache.Cache;
import javax.cache.CacheManager;
import javax.cache.Caching;
import javax.cache.configuration.MutableConfiguration;
import javax.cache.spi.CachingProvider;
import java.util.UUID;

public class JCacheUsage{
    public static void main(String[] args){
        //bootstrap the JCache Provider
        CachingProvider jcacheProvider = Caching.getCachingProvider();
        CacheManager jcacheManager = jcacheProvider.getCacheManager();
        //configure cache
        MutableConfiguration<String, Object> jcacheConfig = new MutableConfiguration<>();
        jcacheConfig.setTypes(String.class, Object.class);
        //create cache
        Cache<String, Object> cache = jcacheManager.createCache("PreciousObjectCache", jcacheConfig);
        //play around
        String key = UUID.randomUUID().toString();
        cache.put(key, new Object());
        Object inserted = cache.get(key);
        System.out.println(inserted);
        cache.remove(key);
        inserted = cache.get(key); //will throw javax.cache.CacheException since the key does not exist
        System.out.println(inserted);
    }
}