
package bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    
    private String name;
    private boolean visited;
    private List<Vertex> adjacenciesList;
    private Vertex predecessor;
    
    //constructores 
    public Vertex (String name){
        this.name=name;
        this.adjacenciesList = new ArrayList<Vertex>();
    }
    
    public void addNeighbour(Vertex vertex){
        this.adjacenciesList.add(vertex);
    }
    
    //getteres and setters 

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
