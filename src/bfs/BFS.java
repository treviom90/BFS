
package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BFS {
    //variables gobales 
     static int v,e;    //vertices, arcos 
     static int MAX= 100005; // cantidad maxima de nodos del grafo
     static ArrayList<Integer> ady[]= new ArrayList[MAX]; //lista de adyacencia
     static long distance[]= new long[MAX]; // vector que representa si ya hemos visitado un nodo o no
     
    public static void main(String[] args) {
    
   }
    // recibe el nodo inicial s
     static void bfs(int s){
         Queue<Integer> q = new LinkedList<>(); //cola , incertando lo nodos que vsitamos 
         q.add(s);//incertamos el nodo con el que empezamos 
         distance[s]=0; // lo marcamos como visitado para no pasar por el por mas de una vez 
         int actual,i,next;//variables auxiliares
         
         while(!q.isEmpty()){ // mientas que la cola no este vacia
             actual= q.poll(); //tomamos el nodo actual que vamos a anaizar 
             for(i=0;i< ady[actual].size();i++){ // rcorremos su lista de adyacencia 
                 next = ady[actual].get(i);// revisamos si ya pasamos por sus nodos adyacentes 
                 if(distance[next] == -1){ // si es -1 nunca hemos llegado a el en nuestra busqueda 
                     distance[next]=distance[actual]+1;// entonces lo actualiamos 
                     q.add(next);// lo incertamos en nuestra cola 
                 }
             }
         }// cuendo este ciclo termine ya abremos pasado por todos los nodos del grafo 
     }
}
//poll() de Queue Interface devuelve y elimina el elemento al frente del contenedor. 
//Elimina el elemento del contenedor.