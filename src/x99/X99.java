package x99;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class X99 {
    
   
    
    
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        System.out.println("            Welcame to test maker            ");
        System.out.println("---------------------------------------------");

        String []AdminUser = new String[100];
        String []AdminPass = new String[100];
        
        AdminUser[0]="admin";
        AdminPass[0]="123"; 
        int x1=0;     
       
        
        int randomexp[];
        String Qs[]   = new String[100];
        String As1[]  = new String[100];
        String As2[]  = new String[100];
        String As3[]  = new String[100];
        int Tas[]     = new int[100];
        
        

        Qs[0]  ="Which provides runtime environment for java byte code to be executed?";
        As1[0] ="JDK";
        As2[0] ="JVM";
        As3[0] ="JRE";
        Tas[0] = 2;
       
      
        Qs[1]  ="Which of the following is not a Java features?";
        As1[1] ="Dynamic";
        As2[1] ="Architecture Neutral";
        As3[1] ="Use of pointers";
        Tas[1] = 3;
        
        
         Qs[2]  ="Which of the following are not Java keywords ?";
        As1[2] ="double";
        As2[2] ="switch";
        As3[2] ="then";
        Tas[2] = 3;
        
        
        Qs[3]  ="Which of these have highest precedence?";
        As1[3] ="()";
        As2[3] ="++";
        As3[3] ="*";
        Tas[3] = 1;
        
        
        Qs[4]  ="Which one is a template for creating different objects ?";
        As1[4] ="An Array";
        As2[4] ="A class";
        As3[4] ="Method";
        Tas[4] = 2;
        
        Qs[5]  ="Which of these is returned by Greater Than, Less Than and Equal To (i.e Relational) operator ?";
        As1[5] ="Boolean";
        As2[5] ="Integer";
        As3[5] ="Fload";
        Tas[5] = 1;

        int x2=0;  

        boolean y=false ;       
        

        Scanner in = new Scanner(System.in);
        Scanner sc;
        

        boolean str = true;;

        while (str) {
            System.out.println("*************************");
            System.out.println("You are ? ");
            System.out.println("a. An admin");
            System.out.println("b. A student");
            System.out.println("press q to Exit..");
            System.out.println("*************************");

           String x = in.next();

            System.out.println("---------------------------------------------");
            
            String UserName ="";
            String PassWord ="";
            int L=0;
            int LQ=0;
            
            switch (x) {
            /****************************************************************************************************************************/

                case "a":
                    
                    System.out.println("An admin");
                    System.out.println("Enter UserName : ...");
                    UserName = in.next();
                    System.out.println("Enter PassWord ...");
                    PassWord = in.next();
                    L=AdminUser.length;
                    LQ=Qs.length;
                    
                    for(int i=0;L>i;i++)
                    {if(AdminUser[i]!=null)  
                        if((AdminUser[i].equals(UserName))&&(AdminPass[i].equals(PassWord)))
                        {
                          y = true;
                        }
                          else
                        {
                           y = false;
                           System.out.println("Incorrect username or password !!!" );
                        }
                        while (y) {
                            System.out.println("---------------------------------------------");
                            System.out.println("                  Hi Admin                   ");
                            System.out.println("---------------------------------------------");
                            System.out.println("a. add an admin");
                            System.out.println("b. delete an admin");
                            System.out.println("c. search for an admin");
                            System.out.println("d. show all admins");
                            System.out.println("e. add a question");
                            System.out.println("f. show all questions");
                            System.out.println("g. delete a question");
                            System.out.println("Press q to back...");
                            String Choose = in.next();
                            System.out.println("---------------------------------------------");
                            switch (Choose) {
                                    //---------------------------------------------------
                                    case "a":
                                    for(int k=0;k<AdminUser.length;k++)
                                    {if(AdminUser[k]!=null)  
                                     x1++;
                                     break;
                                    }   
                                    System.out.println("add New admin");
                                    System.out.print("UserName : ");
                                    String UN = in.next();
                                    System.out.print("PassWord : ");
                                    String PW = in.next();
                                    AdminUser[x1] =UN;
                                    AdminPass[x1]=PW;
                                    System.out.println("User Added Successfully");
                                    
                                    break;   
                                    //---------------------------------------------------                                    
                                    case "b":
                                    System.out.println("delete an admin");
                                    System.out.print("UserName : ");
                                    String DeleteUser = in.next();
                                    for(int k=0;L>k;k++)
                                    if(AdminUser[k]!=null)      
                                    if(AdminUser[k].equals(DeleteUser))  
                                    {
                                        AdminUser[k]=null;
                                        AdminPass[k]=null;
                                        
                                    }
                                   System.out.println("User Deleted Successfully");  
                                    break;   
                                    //---------------------------------------------------                                   
                                    case "c":
                                    System.out.println("Enter The User you want to Search about");  
                                    String Sadmin = in.next();
                                    for(int j=0;j<100;j++)
                                    {
                                     if((AdminUser[j])!=null)   
                                       if((AdminUser[j].equals(Sadmin)))
                                       {
                                        System.out.println("User("+(j+1)+"):"+AdminUser[j]+"     Password : "+AdminPass[j]);
                                       }
                                    }
                                    break;   
                                    //---------------------------------------------------
                                    case "d":
                                    System.out.println("show all admins");
                                   
                                    for(int j=0;L>j;j++)
                                    if(AdminUser[j]!=null)  
                                    {System.out.println("User("+(j+1)+"):"+AdminUser[j]+"     Password : "+AdminPass[j]);}
                                    break;   
                                    //---------------------------------------------------
                                    case "e":
                                    
                                    sc= new Scanner(System.in);    
                                    for(int k=0;k<Qs.length;k++)
                                    {if(Qs[k]!=null)  
                                    x2++;
                                    if (k==99)
                                    break;
                                    }
                                    System.out.println("add New admin");
                                    System.out.println("Question is :");
                                    String QQs = sc.nextLine();
                                    System.out.println("Add As1 :");
                                    String AAs1 = sc.nextLine();
                                    System.out.println("Add As2 :");
                                    String AAs2 = sc.nextLine();
                                    System.out.println("Add As3 :");
                                    String AAs3 = sc.nextLine();
                                    System.out.println("TRUE Answer is :");
                                    int TTas = sc.nextInt();
                                    Qs[x2]=QQs;
                                    As1[x2]=AAs1;
                                    As2[x2]=AAs2;
                                    As3[x2]=AAs3;
                                    Tas[x2]=TTas;
                                    break;   
                                    //---------------------------------------------------
                              
                                    case "f":
                                    System.out.println("show all Questions");
                                      System.out.println("-------------------------------------------");
                                    //int xx=0;
                                    for(int j=0;j<LQ;j++)
                                    if(Qs[j]!=null)  
                                    {
                                       
                                       System.out.print((j+1)+" - ");
                                       System.out.println(Qs[j]);
                                       System.out.println("  1-"+As1[j]);
                                       System.out.println("  2-"+As2[j]);
                                       System.out.println("  3-"+As3[j]);                                       System.out.println("The Correct Answer is : "+Tas[j]);
                                       System.out.println("-------------------------------------------");
                                    }                                    
                                    break;   

                                    case "g":
                                    System.out.println("delete Quession");
                                    System.out.println("Enter The Question number you want to delete.");
                                    int DeleteQ = in.nextInt();
                                    DeleteQ--;
                                    for(int k=0;k<Qs.length;k++)
                                    if(Qs[k]!=null)      
                                    if(k==DeleteQ)  
                                    {
                                        Qs[k]=null;
                                    }
                                      System.out.println("Question ("+(DeleteQ+1)+") Deleted Successfully"); 
                                    
                                    break;   
                                     //---------------------------------------------------
                                    case "q":
                                      y = false;
                                    
                                    break;   
                                    //---------------------------------------------------
                            }
                        }
                    }
                                        
                           
                
                    
                                
                    break;
                    
                
                /****************************************************************************************************************************/
                case "b":   
                       y = true;
                       int nn=5; 

                        while (y) {
                            System.out.println("---------------------------------------------");
                            System.out.println("                  Hi Admin                   ");
                            System.out.println("---------------------------------------------");

                            System.out.println("a. Math Exam");
                            System.out.println("b. Java Exam");
                            System.out.println("Press q to back...");

                            String Choose = in.next();
                            System.out.println("---------------------------------------------");

                            switch (Choose) {
                                    
                                   case "a":
                                        
                                   Random rand = new Random(); //instance of random class
                                   int n1,op,n2;
                                   int maxnum = 10;
                           //        int nn=5;
                                   int TrueAnswer=0;
                                   
                                   for(int i=0;i<nn;i++)
                                   {  n1 = rand.nextInt(maxnum)+1;      
                                      op = rand.nextInt(3);      
                                      n2 = rand.nextInt(maxnum)+1;      
                                      int R1=n1+n2;   //  +
                                      int R2=n1-n2;   //  -
                                      int R3=n1*n2;   //  *
                                      int R4=n1/n2;   //  /
                                      int Answer=0;
                                      
                                      if(op==0)
                                      {
                                           System.out.print("How Much Is :  "+n1+" + "+n2+" = ");
                                           Answer = in.nextInt();  
                                           if (Answer==R1)
                                               ++TrueAnswer;
                                      }
                                      if(op==1)
                                      {
                                           System.out.print("How Much Is :  "+n1+" - "+n2+" = ");
                                           Answer = in.nextInt();     
                                           if (Answer==R2)
                                               ++TrueAnswer;
                                      }
                                      if(op==2)
                                      {
                                           System.out.print("How Much Is :  "+n1+" * "+n2+" = ");
                                           Answer = in.nextInt();     
                                           if (Answer==R3)
                                               ++TrueAnswer;
                                      }
                                      if(op==3)
                                      {
                                           System.out.print("How Much Is :  "+n1+" / "+n2+" = ");
                                            Answer = in.nextInt();     
                                           if (Answer==R4)
                                               ++TrueAnswer;
                                      }
                                      
                                      
                                      
                                    
                                    
                                           
                                      
                                       
                                   }   
                                    
                                    if (TrueAnswer>=3)
                                       System.out.println("Nice, you pass the test successfuly with Grade "+TrueAnswer+" from "+nn);
                                    else
                                       System.out.println("Oh, you Failed try Again . . Your Score Is "+TrueAnswer+" / "+nn);
                                        
                                    TrueAnswer=0;
                                    
                                    break;   
                                    
                                    
                                    //---------------------------------------------------                                    
                                    case "b":
                                    Random randJava = new Random(); //instance of random class    
                                   
                                     
                                    
                                    int maxnumJava = 5;
                                    int nnn;
                                    nnn = randJava.nextInt(maxnumJava)+1;      
                                    
                                    
                                    
                                    int AnswerJava=0;
                                    int TrueAnswerJava=0; 
                                    int listofjavaQuestionLength=0;
                                    List<Integer>  exp = new ArrayList<Integer>();
                                    List<Integer>  exptocorrect = new ArrayList<Integer>();

                                    
                                    
                                    for(int j=0;j<Qs.length;j++)
                                    if(Qs[j]!=null)  
                                    {   
                                        exp.add(j);  
                                       ++listofjavaQuestionLength;
                                    }
                                    
                                 
                  
                                    

                                  exptocorrect.removeAll(exp);
                                  for (int i=0; i < nn; ++i) { 	  

                                    Random random = new Random();
                                    Integer randomInt = exp.get(randJava.nextInt(exp.size()));
                                    ////////////////////////////////////////////////////////////////////
                                    System.out.print(i+(1)+" - " );
                                    System.out.println(Qs[randomInt]);
                                    System.out.println("     1- "+As1[randomInt]);
                                    System.out.println("     2- "+As2[randomInt]);
                                    System.out.println("     3- "+As3[randomInt]);
                                    System.out.print("My Answer is : ");
                                    AnswerJava = in.nextInt();     
                                    if (AnswerJava==Tas[randomInt])
                                        ++TrueAnswerJava;
                                    else
                                    exptocorrect.add(randomInt);  
                                    exp.remove(randomInt); 
                                    System.out.println("");
                                    ////////////////////////////////////////////////////////////////////
                                    }

                                    if (TrueAnswerJava>=3)
                                    { 
                                       System.out.println("-------------------------------------------------------------------------");
                                       System.out.println("Nice, you pass the test successfuly with Grade "+TrueAnswerJava+" from "+nn);
                                       System.out.println("-------------------------------------------------------------------------");
                                     
                                       
                                       
                                      if ((nn-TrueAnswerJava)!=0)
                                      {
                                       System.out.println("                            The correction                              ");
                                       System.out.println("-------------------------------------------------------------------------");
                                       exptocorrect.get(0);
                                       exptocorrect.forEach((n) -> System.out.println((n)+"-"+Qs[n]+
                                                                                   "\n    1- "+As1[n]+
                                                                                   "\n    2- "+As2[n]+
                                                                                   "\n    3- "+As3[n]+
                                                                                   "\n The Correct Answer is :" +Tas[n])); 
                                      }
                                    }
                                    else
                                    {
                                       System.out.println("-------------------------------------------------------------------------");
                                       System.out.println("Oh, you Failed try Again . . Your Score Is "+TrueAnswerJava+" / "+5);
                                       System.out.println("-------------------------------------------------------------------------");
                                       
                                    }    
                                    TrueAnswer=0;
                                    break;   

                                    case "q":
                                      y = false;
                                    
                                    break;   
                                    //---------------------------------------------------
                            }
                        }
                    
                    
                break;    

                case "q":   
                    
                    
              
                    
                System.exit(0);
                /****************************************************************************************************************************/
                break;
                        

            }
        }
    }
}
