package com.bkgc.bean.security;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class SynchronizationOutTradeNoMap {

    /**
     * 存用户名和out_trade_no
     */
    private static Map<String, String> map = new ConcurrentHashMap<String, String>();

    private static ReadWriteLock GET_OUTTRADENO_LOCK = new ReentrantReadWriteLock();

    public static void put(String key, String value) {
        GET_OUTTRADENO_LOCK.writeLock().lock();
        try {
            map.put(key, value);
        } finally {
            GET_OUTTRADENO_LOCK.writeLock().unlock();
        }
    }

    public static String get(String key) {

        GET_OUTTRADENO_LOCK.readLock().lock();
        try {
            return map.get(key);
        } finally {
            GET_OUTTRADENO_LOCK.readLock().unlock();
        }
    }

    public static void remove(String key) {
        GET_OUTTRADENO_LOCK.writeLock().lock();
        try {
            map.remove(key);
        } finally {
            GET_OUTTRADENO_LOCK.writeLock().unlock();
        }

    }

}
