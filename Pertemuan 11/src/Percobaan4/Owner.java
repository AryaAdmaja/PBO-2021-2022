package Percobaan4;

public class Owner {
  public void pay(Payable p){
      System.out.println("Total Payment = " + p.getPaymentAmount());
      if(p instanceof ElectricityBill){
          ElectricityBill eb = (ElectricityBill)p;
          System.out.println("" + eb.getBillInfo());
      } else if (p instanceof PermanentEmployee){
          PermanentEmployee pe = (PermanentEmployee) p;
          pe.getEmployeeInfo();
          System.out.println("" + pe.getEmployeeInfo());
      }
  }  
  
  public void showMyEmployee(Employee e){
      System.out.println("" + e.getEmployeeInfo());
      if(e instanceof PermanentEmployee)
          System.out.println("You Have To Pay Her/Him Monthly !!!");
      else
          System.out.println("No Need To Pay Him/Her :) ");
  }
}
