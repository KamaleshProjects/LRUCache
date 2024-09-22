package com.reflections.cache.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache {

    private final int capacity;
    private final Map<String, Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node();
        this.tail = new Node();
        this.head.right = tail;
        this.tail.left = head;
    }

    public Optional<String> get(String key) {
        return Optional.empty();
    }

    public void set(String key, String value) {

    }
}
