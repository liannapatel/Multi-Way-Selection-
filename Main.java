//Lianna Patel 
//ICS3U 
//Multiway Selection Assignment 
//October 3, 2022
//This program obtains a name and annual income from the user and then by using multi-way election, outputs the Federal marginal tax rate and Federal tax payable for their salary.  

import java.util.Scanner;

class Main {

  static void conclusion(String title, String mrate, String srate, double taxamount, double taxF, double taxP) {
    System.out.println( title + "’ s marginal tax rate is " + mrate + " , surtax rate is " + srate + ", final tax is $ " + taxamount + " , and provincial tax payable is $" + taxP + " total tax payable is $ " + taxF);
    
  }

  static void fedtax(String person,int income) {
    if (income <= 11038){
    //this is if the user has a salary greater than 11038 but less than or equal to 54599
      String mRate1 = new String("0%");
      double tax1 = 0;
      provtax(person,tax1,mRate1);
      //this is if the user has a salary equal to or less than 11038 
    } else if (income <= 54599){
      String mRate2 = new String ("15%");
        double tax2 = (income - 11038) * 15; //this subtracts the income from the second tax bracket and multiples it by the marginal federal tax rate  
      provtax(person,tax2,mRate2);

    } else if (income <= 98161){
      //this is if the user has a salary greater than 54599 but less than or equal to 98161
      String mRate3 = new String ("22%"); 
        double tax3 = 43561*0.15; //subtracting 54599 from 11038 and multiplying the marginal federal tax rate, which gives the fed tax payable
        double tax4 = (income - 54599) * 0.22; //this subtracts the income from the third tax bracket and multiples it by the marginal federal tax rate  
        double totaltax1 = tax3 + tax4; //adding all the totals together 
      provtax(person,totaltax1,mRate3);
      
    } else if (income <=146092){
      //this is if the user has a salary greater than 98161 but less than or equal to 146092
      String mRate4 = new String ("26%"); 
      double tax5 = 43561*0.15;  //subtracting 54599 from 11038 and multiplying the marginal federal tax rate, which gives the fed tax payable
      double tax6 = 43562 * 0.22; //subtracting 98161 from 54599 and multiplying the marginal fed tax rate, which gives the fed tax payable  
      double tax7 = (income - 98161) * 0.26;//this subtracts the income from the fourth tax bracket and multiples it by the marginal federal tax rate 
      double totaltax2 = tax5 + tax6 + tax7;//adding all the totals together 
      provtax(person,totaltax2,mRate4);
    }
    else {
      //this is if the user has a salary greater than 146092 - this code will be executed if the 1st condition is false and the 2nd condition is false. 
      String mRate5 = new String ("29%");
      double tax8 = 43561 * 0.15; //subtracting 54599 from 11038 and multiplying the marginal federal tax rate, which gives the fed tax payable
      double tax9 = 43562 * 0.22;//subtracting 98161 from 54599 and multiplying the marginal fed tax rate, which gives the fed tax payable  
      double tax10 = 47931 * 0.26; //subtracting 146092 from 98161 and it multiplying the marginal fed tax rate, which gives the fed tax payable. 
      double tax11 = (income - 146092) * 0.29; //user salary subtracted by the last tax bracket and multiples it by the marginal federal tax rate. 
      double totaltax3 = tax8 + tax9 + tax10 + tax11;//adding all the totals together 
      provtax(person,totaltax3,mRate5);
    }
  
  }
  
  static void provtax(String ppl, double taxval, String mRate) {
    
    System.out.println("1. Alberta");
    System.out.println("2. British Columbia");
    System.out.println("3. Manitoba");
    System.out.println("4. New Brunswick"); 
    System.out.println("5. Newfoundland & Labrador"); 
    System.out.println("6. Northwest Territories");
    System.out.println("7. Nova Scotia");
    System.out.println("8. Nunavut");
    System.out.println("9. Ontario");
    System.out.println("10. Prince Edward Island"); 
    System.out.println("11. Quebec"); 
    System.out.println("12. Saskatchewan"); 
    System.out.println("13. Yukon");
   
    Scanner scan = new Scanner(System.in);
    System.out.println( "Enter the corresponding number for your Province or Territory ");
    int prov = scan.nextInt(); 
switch (prov) {
  case 1:
  case 4:
  case 10:
    //if provtaxrate is case 1, 4 or 10 then it's 10%
    double surtax1 = 0.1;
    String sRate1 = new String ("10%");//surtax rate
    double taxp1 = taxval * surtax1; //multiplying the provincial surtax rate for these provinces  by the amount of fed tax payable
    double taxf1 = taxp1 + taxval; //total combined tax payable
    conclusion(ppl, mRate, sRate1, taxval, taxf1, taxp1);
    break;
      
  case 2:
  case 6:
  case 9:
    //if provtaxrate is case 2, 6 or 9 then it's 6%
     double surtax2 = 0.06;
     String sRate2 = new String ("6%");
    double taxp2 = taxval * surtax2;//multiplying the provincial surtax rate for these provinces  by the amount of fed tax payable
    double taxf2 = taxp2 + taxval; //total combined tax payable
    conclusion(ppl, mRate, sRate2, taxval, taxf2, taxp2);
    break;

  case 3:
  case 5:
  case 12:
    //if provtaxrate is case 3, 5 or 12 then it's 11%
     double surtax3 = 0.11;
     String sRate3 = new String ("11%");
    double taxp3 = taxval * surtax3;//multiplying the provincial surtax rate for these provinces  by the amount of fed tax payable
    double taxf3 = taxp3 + taxval; //total combined tax payable
    conclusion(ppl, mRate, sRate3, taxval, taxf3, taxp3); 
    break;
  
  case 7:
  case 11:
     //if provtaxrate is case 7 or 11 then it's 9%
     double surtax4 = 0.09; 
     String sRate4 = new String ("9%");
    double taxp4 = taxval * surtax4;//multiplying the provincial surtax rate for these provinces  by the amount of fed tax payable
    double taxf4 = taxp4 + taxval; //total combined tax payable
    conclusion(ppl, mRate, sRate4, taxval, taxf4, taxp4);
    
    break;
  case 8:
     //if provtaxrate is case 8 then it's 4%
     double surtax5 = 0.04;
     String sRate5 = new String ("4%");
    double taxp5 = taxval * surtax5; //multiplying the provincial surtax rate for these provinces  by the amount of fed tax payable
    double taxf5 = taxp5 + taxval; //total combined tax payable
    conclusion(ppl, mRate, sRate5, taxval, taxf5, taxp5);
    
    break;
  case 13:
     //if provtaxrate is case 13 then it's 7%
    double surtax6 = 0.07;
    String sRate6 = new String ("7%");
    double taxp6 = taxval * surtax6; //multiplying the provincial surtax rate for these provinces  by the amount of fed tax payable
    double taxf6 = taxp6 + taxval; //total combined tax payable
    conclusion(ppl , mRate , sRate6 , taxval , taxf6 , taxp6);
    break;
}
}
    
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Hello! Enter your name: ");
    String name = scan.nextLine();
    System.out.print(name + " , Enter your annual income: ");
    int income = scan.nextInt();
    fedtax(name,income);
    
    
  }
}