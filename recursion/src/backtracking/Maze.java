package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    static class Point{
        int x;
        int y;

        Point(int x, int y){
            this.x=x;
            this.y=y;
        }

        @Override
        public String toString() {
            return "("+this.x+","+this.y+")";
        }
    }

    public static void main(String[] args) {
        int[][] maze=new int[3][3];
        maze[2][2]=-1;
        List<List<Point>> paths=new ArrayList<>();
        findPath(maze,0,0,new ArrayList<>(),paths);
        for(List<Point> path:paths){
            System.out.println("The paths are:"+path.toString());
        }
    }

    static void findPath(int[][] maze, int row, int col, List<Point> path, List<List<Point>> paths){
        if(row<0||row>=maze.length||col<0||col>= maze[0].length){
            return;
        }

        if(maze[row][col]==-1){
            path.add(new Point(row,col));
            paths.add(new ArrayList<>(path));
            return;
        }

        path.add(new Point(row,col));
        findPath(maze,row,col+1,path,paths);
        findPath(maze,row+1,col,path,paths);
        path.removeLast();
    }
}
