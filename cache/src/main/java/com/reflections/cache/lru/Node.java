package com.reflections.cache.lru;

public class Node {

    public Node() {

    }

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Node(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(String key, String value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String key;
    public String value;
    public Node left;
    public Node right;
}
