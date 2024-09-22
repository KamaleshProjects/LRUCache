package com.reflections.cache.lru;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LRUCache {

    private final int capacity;
    private final Map<String, Node> map;
    private final Node head = new Node();
    private final Node tail = new Node();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head.right = tail;
        this.tail.left = head;
    }

    public Optional<String> get(String key) {
        if (!this.map.containsKey(key)) {
            return Optional.empty();
        }
        Node valNode = this.map.get(key);
        this.removeNode(valNode);
        this.addNode(valNode);
        return Optional.of(valNode.value);
    }

    public void set(String key, String value) {
        Node node = this.map.get(key);
        if (node != null) {
            this.removeNode(node);
            node.value = value;
            this.addNode(node);
        } else {
            if (this.map.size() == this.capacity) {
                map.remove(this.tail.left.key);
                this.removeNode(this.tail.left);
            }
            Node newNode = new Node(key, value);
            this.map.put(key, newNode);
            this.addNode(newNode);
        }
    }

    private void removeNode(Node node) {
        Node leftNode = node.left;
        Node rightNode = node.right;
        leftNode.right = rightNode;
        rightNode.left = leftNode;
    }

    private void addNode(Node node) {
        Node tempNode = this.head.right;
        node.right = tempNode;
        tempNode.left = node;
        this.head.right = node;
        node.left = this.head;
    }
}
