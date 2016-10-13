package com.zgq.algorithm;

import java.util.Stack;

public class PostOrderTree {
	public static void  noRecPostOrder(TreeNode p) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = p;
		while (p != null) {
			// 左子树入栈
			for (; p.left != null; p = p.left) {
				stack.push(p);
			}
			// 当前结点无右子树或右子树已经输出
			while (p != null && (p.right == null || p.right == node)) {
				visted(p);
				// 纪录上一个已输出结点
				node = p;
				if (stack.empty())
					return;
				p = stack.pop();
			}
			// 处理右子树
			stack.push(p);
			p = p.right;
		}
	}

	public static void visted(TreeNode subTree) {
		System.out.println("key:" + subTree.val + "--name:" + subTree.val);
		;
	}
	public static void main(String[] args) {
		TreeNode newNodeB = new TreeNode(2);  
        TreeNode newNodeC = new TreeNode(3);  
        TreeNode newNodeD = new TreeNode(4);  
        TreeNode newNodeE = new TreeNode(5);  
        TreeNode newNodeF = new TreeNode(6);  
        TreeNode root = new TreeNode(1);
        root.left=newNodeB;  
        root.right=newNodeC;  
        root.left.left=newNodeD;  
        root.left.right=newNodeE;  
        root.right.right=newNodeF;  

	PostOrderTree.noRecPostOrder(root);
	}
}
