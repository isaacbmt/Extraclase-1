package Lista;

class Node<AnyType> {
    public AnyType data;
    public Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next){
        this.data = data;
        this.next = next;
    }

    public String toString(){
        return data + "";
    }
}

