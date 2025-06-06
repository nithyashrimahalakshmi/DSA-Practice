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
    
    public void insertAtEnd(int Data)
    {
        Node newNode = new Node(Data);
        Node Temp = Head;
        while(Temp.Next!=null)
        {
            Temp = Temp.Next;
        }
        Temp.Next = newNode;
        I++;
        // System.out.println(Temp.Next.Data+" Stored In Linked List At Ending, Successfully");

    }
   le()
    {
        int I = 0;
        Node Temp = Head;
        while(Temp!=null)
        {
            I++; Temp=Temp.Next;
        }
        Temp = Head;
        for(int m=0; m<(I/2); m++)
        {
            Temp = Temp.Next;

        }
        System.out.println("Middle Most Element Of List = "+Temp.Data);

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
       SL.insertAtEnd(11); //  11->null
        SL.insertAtEnd(22);  // 11->22->null
        SL.insertAtEnd(33); // 11->22->33->null
        SL.insertAtEnd(44); // 11->22->33->44->null
        SL.insertAtEnd(55);  //11->22->33->44->55->null
        SL.insertAtEnd(66); // 11->22->33->44->55->66->null
        SL.insertAtEnd(77;   // 11->22->33->44->55->66->77->null

      SL.printMiddle();  // 44

   

      SL.Print();
    }
}
