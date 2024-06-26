package org.example.gt1300;

import org.example.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedElements = new ArrayList<>();
        collectInOrder(root, sortedElements);
        return constructBalancedBST(sortedElements, 0, sortedElements.size() - 1);
    }

    private void collectInOrder(TreeNode node, List<Integer> sortedElements) {
        if (node == null) {
            return;
        }
        collectInOrder(node.left, sortedElements);
        sortedElements.add(node.val);
        collectInOrder(node.right, sortedElements);
    }

    private TreeNode constructBalancedBST(List<Integer> elements, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(elements.get(mid));
        node.left = constructBalancedBST(elements, start, mid - 1);
        node.right = constructBalancedBST(elements, mid + 1, end);
        return node;
    }
}
