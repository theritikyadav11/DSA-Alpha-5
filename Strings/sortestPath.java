public class sortestPath{
    public static int shortestPath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='N'){
                //north
                y++;
            }else if(dir=='S'){
                //south
                y--;
            }else if(dir=='E'){
                //east
                x++;
            }else{
                //west
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (int)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(shortestPath(path));
    }
}