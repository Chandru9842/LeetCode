public class Codec {
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        StringBuilder str=new StringBuilder();
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node==null){
                str.append("# ");
                continue;
            }
            str.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);

        }
        return str.toString();


        
}
    public TreeNode deserialize(String data){
        if(data.equals("")){
            return null;
        }
        String[]values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        Deque<TreeNode>q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty()&&i<values.length){
            TreeNode parent=q.poll();
            if(!values[i].equals("#")){
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                q.add(left);
                // i++;
                }
                i++;
            if(!values[i].equals("#")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                // i++;
                q.add(right);
                
            }
            i++;
        }
        return root;

        
    }
}
