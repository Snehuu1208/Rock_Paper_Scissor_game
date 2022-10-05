package com.company;
import java.util.*;

public class RockPaperScissorGame
{
    public static void main(String[] args)
    {
        int n=5,w=0,l=0;
          Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value where \n 0 means rock \n 1 means paper \n 2 means Scissor");
          while(n>0) {
              int computer = (int) (Math.random() * 3);
              int user = sc.nextInt();
              System.out.println("Computer chosen "+computer);
              switch(computer)
              {
                  case 0:
                  {
                      if(user==0)
                      {
                          System.out.println("Tie");
                      }
                      else if(user==1)
                      {
                          System.out.println("user wins");
                          w++;
                      }
                      else if(user==2)
                      {
                          System.out.println("computer wins");
                          l++;
                      }
                      break;
                  }
                  case 1:
                  {
                      if(user==1)
                      {
                          System.out.println("Tie");
                      }
                      else if(user==2)
                      {
                          System.out.println("user wins");
                          w++;
                      }
                      else if(user==0)
                      {
                          System.out.println("computer wins");
                          l++;
                      }
                      break;
                  }
                  case 2:
                  {
                      if(user==2)
                      {
                          System.out.println("Tie");
                      }
                      else if(user==0)
                      {
                          System.out.println("user wins");
                          w++;
                      }
                      else if(user==1)
                      {
                          System.out.println("computer wins");
                          l++;
                      }
                      break;
                  }
                      default:
                      break;
              }
              n--;
          }
        System.out.println("After all round ,the winner is found");
          if(w>l)
          {
              System.out.println("The winner is user ");
          }
          else if(l>w)
          {
              System.out.println("The winner is computer");
          }
          else
          {
              System.out.println("It is Tie");
          }


    }
}
