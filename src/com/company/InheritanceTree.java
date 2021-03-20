package com.company;

public class InheritanceTree {
    private InheritanceTree extend;
    private String name;
    private String extendName;
    int visited;

    public InheritanceTree(ClassNode classNode){
        name = classNode.getName();
        extendName = classNode.getExtend();
        visited = 0;
    }

    public InheritanceTree setExtend(InheritanceTree extend) {
        this.extend = extend;
        return extend;
    }

    public InheritanceTree getExtend() {
        return extend;
    }

    public String getExtendName() {
        return extendName;
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited != 0;
    }

    public int getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }
}
