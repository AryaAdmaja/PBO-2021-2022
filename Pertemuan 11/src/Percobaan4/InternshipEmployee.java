package Percobaan4;


  public class InternshipEmployee extends Employee {
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.length = length;
        super.name = name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+ "\n";
        info += "Registered as internship employee for"+length+ "month/s\n";
        return info;
        
    }
}  
