import java.util.Scanner;
abstract class Budget
{     
static Scanner s = new Scanner(System.in);    
static double df ;    
static double save;    
static double income()
{
double  job, savings, anyOther,totalIncome;      
System.out.println("Calculate your monthly income");      
System.out.println("Please enter the of income you receive from your job");       
job = s.nextDouble();        
System.out.println("Please enter the amount of savings you wish to spend, in this month");      
savings = s.nextDouble();       
System.out.println("Please enter any other income you may have");        
anyOther = s.nextDouble();       
totalIncome = job+savings+anyOther;      
return totalIncome;
}     
static double essentialOutgoing() 
{
double totalEssentialOutgoing, rent, travel, insurance, utilityBills, mobilePhone, food;   
System.out.println("ESSENTIAL COSTS");       
System.out.print(" ");       
System.out.println("Please enter the amount of rent you will pay");  
rent = s.nextDouble();       
System.out.println("Please enter the amount of travel costs");      
travel = s.nextDouble();       
System.out.println("If you have insurance, please enter the total cost");
insurance =s.nextDouble();    
System.out.println("Please enter the amount you expect to spend on utility bills. This would include " +    "gas, electric, oil, etc."); 
utilityBills = s.nextDouble(); 
System.out.println("Please enter the amount you expect to spend on you mobile phone");    
mobilePhone = s.nextDouble();     
System.out.println("Please enter how much you expect to spend on groceries per week");    
food = s.nextDouble();       
totalEssentialOutgoing = rent + travel +  food + utilityBills + mobilePhone + insurance;   
return totalEssentialOutgoing;   
 }  
static double otherCosts()  
 {        
 double totalOtherCosts, clothing, socialActivities;      
 System.out.println("OTHER COSTS");       
 System.out.print(" "); 
 System.out.println("Please enter how much you would like to spend on clothing");      
 clothing = s.nextDouble();       
 System.out.println("Please enter how much you would like to spend on social activities");   
 socialActivities = s.nextDouble();       
 totalOtherCosts = socialActivities + clothing;        
 return totalOtherCosts;
}     
public static void main(String[] args)
{
double theTotalIncome=0, theTotalEssentialOutgoing, theTotalOtherCosts, budget1, budget2, spend;   
System.out.println("Welcome to the Home budget calculator!");   
System.out.println("Let's calculate your monthly expenditure");      
System.out.println("Enter How much u want to save");     
save = s.nextDouble();       
theTotalIncome = income();       
System.out.println("Your income for the year is $" + theTotalIncome);       
spend = theTotalIncome-save;       
System.out.println("You have $" + spend + " to spend");     
theTotalEssentialOutgoing = essentialOutgoing();        
budget1 = spend-theTotalEssentialOutgoing;        
System.out.println("You have spent $" + theTotalEssentialOutgoing);
System.out.println("The amount left after the essentials $" + budget1);    
theTotalOtherCosts = otherCosts();     
budget2 = budget1 - theTotalOtherCosts;     
System.out.println("You have spent $" + theTotalOtherCosts + " for other costs");      
System.out.println("You have $" + budget2 + " at the end of the week");
}
}