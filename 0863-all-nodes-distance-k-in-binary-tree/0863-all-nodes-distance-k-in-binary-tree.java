class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode>q=new ArrayDeque<>();
        HashMap<TreeNode,TreeNode>parent=new HashMap<>();
        HashSet<TreeNode>vis=new HashSet<>();
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
       q.offer(root);
       while(!q.isEmpty()){
        TreeNode node=q.poll();
        if(node.left!=null){
            parent.put(node.left,node);
            q.offer(node.left);
        }
        if(node.right!=null){
            parent.put(node.right,node);
            q.offer(node.right);
        }

       }
       int dis=0;
       q.offer(target);
       vis.add(target);
       while(!q.isEmpty()){
        if(k==dis){
            break;
        }
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            // Left Child
                if(node.left != null && !vis.contains(node.left)){
                    vis.add(node.left);
                    q.offer(node.left);
                }

                // Right Child
                if(node.right != null && !vis.contains(node.right)){
                    vis.add(node.right);
                    q.offer(node.right);
                }
                // parent
                if(parent.containsKey(node)&&!vis.contains(parent.get(node))){
                    vis.add(parent.get(node));
                    q.offer(parent.get(node));
                }
        }
        dis++;
       }
       while(!q.isEmpty()){
        TreeNode a=q.poll();
        ans.add(a.val);
       }
       return ans;

        
    }
}
