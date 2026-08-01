class Tuple{
    TreeNode node;
    int vertical;
    int level;
    Tuple(TreeNode node,int vertical,int level){
        this.node=node;
        this.vertical=vertical;
        this.level=level;

    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple temp=q.poll();
            TreeNode node=temp.node;
            int vertical=temp.vertical;
            int level=temp.level;
            if(!map.containsKey(vertical)){
                map.put(vertical,new TreeMap<>());
            }
            if(!map.get(vertical).containsKey(level)){
                map.get(vertical).put(level,new PriorityQueue<>());
            }
            map.get(vertical).get(level).offer(node.val);
            if(node.left!=null){
                q.offer(new Tuple(node.left,vertical-1,level+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,vertical+1,level+1));
            }

        }
        List<List<Integer>>ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>ys:map.values()){
            List<Integer>list=new ArrayList<>();
            for(PriorityQueue<Integer>pq:ys.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            
          
            }
              ans.add(list);
        }
        return ans;
    
    }
}