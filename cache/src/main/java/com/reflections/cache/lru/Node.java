package com.reflections.cache.lru;

public class Node {

    public Node() {

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

    public String value;
    public Node left;
    public Node right;
}
