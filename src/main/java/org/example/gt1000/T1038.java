package org.example.gt1000;

import org.example.common.TreeNode;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class T1038 {
    public TreeNode bstToGst(TreeNode root) {
        int[] vals = new int[101];

        ArrayList<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {

            ArrayList<TreeNode> newNodes = new ArrayList<>();
            for (TreeNode node : nodes) {
                vals[node.val] = 1;
                newNodes.add(node.left);
                newNodes.add(node.right);
            }
            nodes = newNodes.stream().filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
        }

        //count
        int currentSum = 0;
        for (int i = vals.length-1; i >= 0; i--) {
            if (vals[i] == 0) {
                continue;
            }
            if (vals[i] == 1) {
                currentSum += i;
                vals[i] = currentSum;
            }
        }

        nodes.add(root);
        while (!nodes.isEmpty()) {

            ArrayList<TreeNode> newNodes = new ArrayList<>();
            for (TreeNode node : nodes) {
                node.val = vals[node.val];
                newNodes.add(node.left);
                newNodes.add(node.right);
            }
            nodes = newNodes.stream().filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
        }

        return root;


    }


}
