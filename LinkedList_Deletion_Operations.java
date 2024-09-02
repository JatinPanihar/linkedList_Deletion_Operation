public class LinkedList_Deletion_Operations {
    public static listnode head;
    public static class listnode{
        int data;
        int node;

        public listnode next;

        public  listnode(int data){
           this.data=data;
           this.next=null;
        }
    }
    public static void display(){
        listnode current = head;
        while(current!=null){
            System.out.println("Traversing list :-"+current.data);
            current = current.next;
        }
    }
    public static void deletion_from_beginning(){
        listnode current = head;
        head = head.next;
        current.next=null;
    }
    public static void deletion_from_end(){
        listnode current = head;
        listnode previous = null;
        while(current.next!=null) {
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }
    public static void deletion_from_AnyPosition(){
        int position = 3;
        int count =1;
        listnode current = head;
        while(count<position-1){
            current=current.next;
            count++;
        }
        listnode temp  = current.next;
        current.next=temp.next;
    }


    public static void main(String[] args) {
        LinkedList_Deletion_Operations lldb = new LinkedList_Deletion_Operations();
        lldb.head = new listnode(12);
        listnode second = new listnode(23);
        listnode third = new listnode(34);
        listnode fourth = new listnode(45);

        lldb.head.next = second;
        second.next = third;
        third.next = fourth;

        deletion_from_AnyPosition();
        display();

    }
}
