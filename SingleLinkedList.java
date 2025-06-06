import java.util.Scanner;
class SingleLinkedList{
    int I = 0;


    //Class - Node

    static class Node{
        int Data; // 4 Bytes
        Node Next; //2 12 Bytes

        Node(int Data){
            this.Data = Data;

        }

    }
// Head

    private Node Head = null;
    public void insertAtBeg(int Data)
    {
        Node newNode = new Node(Data);
        newNode.Next = Head;
        Head = newNode;
        I++;
        // System.out.println(Head.Data+" Stored In Linked List At Beginning, Successfully");
    }
    public void insertAtEnd(int Data)
    {
        
        Node newNode = new Node(Data);
        Node Temp = Head;
        if(Temp==null)
        {
            Head = newNode;
        }
        else{
        while(Temp.Next!=null)
        {
            Temp = Temp.Next;
        }
        Temp.Next = newNode;
        }
        // System.out.println(Temp.Next.Data+" Stored In Linked List At Ending, Successfully");

    }
    public void delFromBeg(){
        if(Head!=null)
        {
            Head = Head.Next;
        }
        I--;
        
    }
    public void delFromEnd(){
        
        Node Temp = Head;
        while(Temp.Next.Next!=null)
       {
            Temp=Temp.Next;
        }
        Temp.Next = null;
        I--;
    }
    public void insertPosition(int i,int Data)
    {
        int C = 1;
        Node newNode = new Node(Data);
        Node Temp = Head;
        while(C<i && Temp.Next!=null)
        {
            Temp = Temp.Next;
            C++;
        }
        newNode.Next = Temp.Next;
        Temp.Next = newNode;
    }
     public void deletePosition(int i)
    {
        int C = 1;
    
        Node Temp = Head;
        while(C<i && Temp.Next!=null)
        {
            Temp = Temp.Next;
            C++;
        }
        Temp.Next = Temp.Next.Next;
    }
     public void deleteKPosition(int i)
    {
        int C = 0;
    
        Node Temp = Head;
        while(Temp.Next!=null)
        {
            if(C%i==0)
            {
                Temp.Next = Temp.Next.Next;
            }
            Temp = Temp.Next;
            C++;
        }
    }
     public void printPosition(int i)
    {
        int C = 0;
    
        Node Temp = Head;
        while(C<i && Temp.Next!=null)
        {
            Temp = Temp.Next;
            C++;
        }
        System.out.println("\nElement At Position "+i+" = "+Temp.Data);
    }
    public void printMiddle()
    {

    }
    public void Print()
    {
        if(Head==null){
            System.out.print("No Elements In List !");
        }
        else{
            Node St = Head;
            while(St!=null)
            {
                System.out.print(St.Data+"->");
                St = St.Next;
            }System.out.print("null");
        }
    }


}





public class DSA{


    
    public static void main(String[] Arg)
    {
        Scanner S = new Scanner(System.in);

       
       SingleLinkedList SL = new SingleLinkedList();
       SL.insertAtBeg(11); //  11
        SL.insertAtBeg(3);  // 3->11
        SL.insertAtBeg(21); // 21->3->11
        SL.insertAtEnd(10); // 21->3->11->10
        SL.insertAtBeg(8);  // 8->21->3->11->10
        SL.insertAtEnd(14); // 8->21->3->11->10->14

        SL.deleteKPosition(2);

    //     SL.printPosition(2); //3
    //     SL.delFromBeg(); // 21->3->11->10->14
    //     SL.delFromEnd(); // 21->3->11->10
    //     SL.insertPosition(2, 111); // 21->3->111->11->10
    //     SL.deletePosition(2); // 21->3->111->11

      SL.Print();
    }
}
