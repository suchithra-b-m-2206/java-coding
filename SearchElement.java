// Search an element in the list

class SearchElement{
    private ListNode head;
    public static class ListNode{
     private  int data;
     private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    static boolean searchElement(ListNode header,int ele){
       ListNode current=header;
       while(current!=null){
           if(current.data==ele){
               return true;
           }
           current=current.next;
       }
       return false;
    }
    static void display(ListNode header){
        ListNode current=header;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        SearchElement sll=new SearchElement();
        sll.head=new ListNode(10);
        ListNode first=new ListNode(20);
        ListNode second=new ListNode(30);
        ListNode third=new ListNode(40);
        ListNode fourth=new ListNode(50);
        ListNode fifth=new ListNode(60);
        sll.head.next=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        display(sll.head);
        int pos=40;
        boolean values=searchElement(sll.head,pos);
        if(values){
        System.out.println("data is present");
        }else{
            System.out.println("data is not present");
        }
       
    }
}
