public class practice {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class list{
        Node head = null;
        Node tail = null;

        void display(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void add(int val){
            Node value = new Node(val);

            if(head == null){
                head = value;
                tail = value;
            }
            else{
                tail.next = value;
                tail = value;
            }
        }

        void addBegain(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }

        void insert(int idx,int val){
            Node value = new Node(val);
            Node temp = head;

            if(idx == 0){
                addBegain(val);
                return;
            }

            for(int i = 1;i<=idx-1;i++){
                temp = temp.next;
            }
            value.next = temp.next;
            temp.next = value;
        }

        
    }

    public static void main(String[] args) {
        list A = new list();
        A.add(4);
        A.add(5);
        A.add(8);

        A.display();

        A.addBegain(9);
        A.display();

        A.insert(4, 15);
        A.display();
    }
}