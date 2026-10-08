package Lec23;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> list;
    public Heap(){
        list=new ArrayList<>();
    }
    public void add(int x){
        list.add(x);
        upheapify(list.size()-1);
    }
    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public int remove(){
        swap(0,list.size()-1);
        int x=list.remove(list.size()-1);
        downheapify(0);
        return x;
    }
    private void downheapify(int pi){
        int lci=2*pi+1;
        int rci=2*pi+2;
        int mini=pi;
        if(lci<list.size() && list.get(mini)>list.get(lci)){
            mini=lci;
        }
        if(rci<list.size() && list.get(mini)>list.get(rci)){
            mini=rci;
        }
        if(mini!=pi){
            swap(pi,mini);
            downheapify(mini);
        }
    }

    public int get(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public void display(){
        System.out.println(list);
    }
    private void swap(int i,int j){
        int ith=list.get(i);
        int jth=list.get(j);
        list.set(i,jth);
        list.set(j,ith);
    }
}
