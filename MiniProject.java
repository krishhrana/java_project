
import java.util.Scanner;
class demo
{
    void EXTC()
    {
        System.out.println("\t ELECTRONICS AND TELECOMMUNICATION(EXTC)\n");
        System.out.println("Name \t\t Roll No. \t\t ID No. \t\t DOB \t\t Year");
        System.out.println(" Rohan Asnani \t\t 10 \t\t SE456 \t\t 06-08-2000 \t\t First");
        System.out.println("Chaahat Amesar \t\t 20 \t\t SE568 \t\t 10-08-1998 \t\t First");
    }
    
    void IT()
    {
        System.out.println("\t     INFORMATION TECHNOLOGY(IT)\n");
        System.out.println("Name \t\t Roll No. \t\t ID No. \t\t DOB \t\t Year");
        System.out.println(" Rohan Asnani \t\t 10 \t\t SE456 \t\t 06-08-2000 \t\t First");
        System.out.println("Chaahat Amesar \t\t 20 \t\t SE568 \t\t 10-08-1998 \t\t First");
        
    }
    
    void COMPS()
    {
        System.out.println("\t     COMPUTERS(COMPS)\n");
        System.out.println("Name \t\t Roll No. \t\t ID No. \t\t DOB \t\t Year");
        System.out.println("Jay Jhanghiani \t\t 10 \t\t SE456 \t\t 06-08-2000 \t\t First");
        System.out.println("Darsh Puri \t\t 20 \t\t SE568 \t\t 10-08-1998 \t\t First");
        
    }
    void CHEM()
    {
        System.out.println("Name \t\t Roll No. \t\t ID No. \t\t DOB \t\t Year");
        System.out.println(" Anuj Shah \t\t 10 \t\t SE456 \t\t 06-08-2000 \t\t First");
        System.out.println("Sumit Pethe \t\t 20 \t\t SE568 \t\t 10-08-1998 \t\t First");
    }
    
    void BM()
    {
        System.out.println("\t     BIOMEDICAL ENGINEERING(BIO-MED)\n");
        System.out.println("Name \t\t Roll No. \t\t ID No. \t\t DOB \t\t Year");
        System.out.println(" Akash Das \t\t 10 \t\t SE456 \t\t 06-08-2000 \t\t First");
        System.out.println("Rahul Shaw \t\t 20 \t\t SE568 \t\t 10-08-1998 \t\t First");
    }
    
    void BT()
    {
        System.out.println("Name  \t\t Roll No.  \t\t ID No.  \t\t DOB  \t\t Year");
        System.out.println("Parth Mehta \t\t 10 \t\t SE456 \t\t 06-08-2000 \t\t First");
        System.out.println("Anirudh Maheshwari \t 20 \t\t SE568 \t 10-08-1998 \t\t First");
    }
}
class student
{
    Scanner scan=new Scanner(System.in);
    String name[]=new String[50];
    int roll_no[]=new int[100];
    String branch[]=new String[50];
    int i;
    int m;
    int temp=0;
    int n=0;
    void data()
    {
        System.out.println("Enter the number of students:");
        m=scan.nextInt();
        for(i=temp;i<m+n;i++)
        {
            System.out.println("NAME:");
            name[i]=scan.next();
            System.out.println("ROLL NO.:");
            roll_no[i]=scan.nextInt();
            System.out.println("Enter Branch:");
            branch[i]=scan.next();
        }
        
    }
    void display(String s)
    {
        for(i=0;i<m+n;i++)
        {
            if(branch[i].equals(s))
            {
                System.out.println(name[i]+"\t\t\t "+ roll_no[i] +"\t\t"+ branch[i]);
            }
        }
        temp=m+n;
        n=n+m;
        System.out.println("n="+n);
    }
}

class MiniProject extends student
{
    public static void main(String args[])
    {
        int ch,n=1;
        int m,ent;
        int i;
        
        Scanner sc=new Scanner(System.in);
        demo d=new demo();
        student std=new student();
        System.out.println(" \t \t \t THADOMAL SHAHANI ENGINEERING COLLEGE");
        System.out.println(" \n Welcome to the Management System");
        
        while(n!=0)
        {
            int p=1;
            int l=1;
            System.out.println("Do you want to: 1)Display Entries \n 2)Make an Entry \n 3)Exit.");
            ent=sc.nextInt();
            switch(ent)
            {
                    
                case 1:while(p!=0)
                {
                    System.out.println("Select a Branch: \n 1) Electronics and Telecommunication(EXTC) \n 2) Information Technology(IT) \n 3) Computer(COMPS) \n 4) Chemical \n 5) Biomedical Engineering(Bio-med) \n 6) Biotechnological Enigneering(Bio-tech) \n 7)EXIT.");
                    System.out.println("\nPlease Enter Your Choice of Branch to display:");
                    ch=sc.nextInt();
                    switch(ch)
                    {
                        case 1:
                            d.EXTC();
                            std.display("EXTC");
                            break;
                        case 2:
                            d.IT();
                            std.display("IT");
                            break;
                        case 3:
                            d.COMPS();
                            std.display("COMPS");
                            break;
                        case 4:
                            d.CHEM();
                            std.display("CHEM");
                            break;
                        case 5:
                            d.BM();
                            std.display("BM");
                            break;
                        case 6:
                            d.BT();
                            std.display("BT");
                            break;
                        case 7: System.out.println("Thank You.");
                            p=0;
                            break;
                            
                        default: System.out.println("Wrong Choice, Please Enter Again.");
                            System.out.println("\n");
                            break;
                            
                    }//end of switch(ch)
                }//end of while(p!=0)
                    break;
                    
                    
                    
                case 2: while(l!=0)
                {
                    
                    System.out.println("Select a Branch: \n 1) Electronics and Telecommunication(EXTC) \n 2) Information Technology(IT) \n 3) Computer(COMPS) \n 4) Chemical \n 5) Biomedical Engineering(Bio-med) \n 6) Biotechnological Enigneering(Bio-tech) \n 7)EXIT.");
                    System.out.println("\nPlease Enter Your Choice of Branch to make an entry in:");
                    ch=sc.nextInt();
                    switch(ch)
                    {
                        case 1:System.out.println("\t ELECTRONICS AND TELECOMMUNICATION(EXTC)\n");
                            
                            std.data();
                            d.EXTC();
                            std.display("EXTC");
                            break;
                            
                        case 2:System.out.println("\t     INFORMATION TECHNOLOGY(IT)\n");
                            
                            std.data();
                            d.IT();
                            std.display("IT");
                            break;
                            
                        case 3:System.out.println("\t     COMPUTERS(COMPS)\n");
                            
                            std.data();
                            d.COMPS();
                            std.display("COMPS");
                            break;
                            
                        case 4:    System.out.println("\t     CHEMICAL  ENGINEERING\n");
                            std.data();
                            d.CHEM();
                            std.display("CHEM");
                            break;
                            
                        case 5:     System.out.println("\t     BIOMEDICAL ENGINEERING(BIO-MED)\n");
                            std.data();
                            d.BM();
                            std.display("BM");
                            break;
                            
                        case 6: System.out.println("\t     BIOTECHNOLOGICAL ENGINEERING\n");
                            std.data();
                            d.BT();
                            std.display("BT");
                            break;
                            
                            
                        case 7:System.out.println("Thank You.");
                            l=0;
                            break;
                            
                            
                        default:System.out.println("Wrong Choice, Please Enter Again");
                            System.out.println("\n");
                            break;
                            
                    }//end of switch(ch)
                    
                }//end of while(l!=0)
                    break;
                    
                case 3:System.out.println("Thank You.");
                    n=0;
                    break;
                    
            }//end of switch(ent)
        }//end of while (n!=0)
    }//end of main function
}//end of class
