class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //addFirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //addLast
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
         head=tail=newNode;
            return;
        }
        size++;
        tail.next=newNode;
        tail=newNode;

    }

    //addMiddle
    public void addMiddle(int idx,int data){
        Node newNode=new Node(data);
        if(idx==0){
            addFirst(data);
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;

        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;

    }

    //removeFirst
    public int removeFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            
        }
        int val=head.data;
        head=head.next;
        return val;
        size--;

    }
    //removeLast
    public int removeLast(){
        if(head==null){
            System.out.println("LL is empty");
            return  Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            
        }
        int val=tail.data;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        return val;
        


    }

    //Recursivesearch
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int Recursivesearch(int key){
        return helper(head, key);
    }

    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+head.data+"->");
            temp=temp.next;

        }
        System.out.print("null");

    }
    

}