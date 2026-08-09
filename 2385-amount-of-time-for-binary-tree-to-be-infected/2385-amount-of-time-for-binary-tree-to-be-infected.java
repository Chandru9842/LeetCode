class Solution {
    public int amountOfTime(TreeNode root, int start){
        int min=0;
        if(root==null){
            return min;
        }
        HashMap<TreeNode,TreeNode>parent=new HashMap<>();
        Deque<TreeNode>q=new ArrayDeque<>();
        q.offer(root);
        TreeNode newnode=null;
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.val==start){
                newnode=node;

            }
            if(node.left!=null){
                parent.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null){
                parent.put(node.right,node);
                q.offer(node.right);
            }
        }
        HashSet<TreeNode>vis=new HashSet<>();
        q.offer(newnode);
        vis.add(newnode);
        while(!q.isEmpty()){
            min++;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode root1=q.poll();
                if(root1.left!=null&&!vis.contains(root1.left)){
                    vis.add(root1.left);
                    q.offer(root1.left);
                }
                if(root1.right!=null&&!vis.contains(root1.right)){
                    vis.add(root1.right);
                    q.offer(root1.right);
                }
                if(parent.containsKey(root1)&&!vis.contains(parent.get(root1))){
                    vis.add(parent.get(root1));
                    q.offer(parent.get(root1));
                }
            }
        }
        return min-1;

        
    }
}