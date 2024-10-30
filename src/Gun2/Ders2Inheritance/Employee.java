package Gun2.Ders2Inheritance;

public  class Employee {
    private String name ;
    private String department ;
    private int salary ; // maaş
    public Employee (String name , String department , int salary ){
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }
    public void showInfos(){
        System.out.println("Bilgiler ... ");
        System.out.println("isim : "+getName());
        System.out.println("department : "+getDepartment());
        System.out.println("maas : "+getSalary());
    }

    public String getName (){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary (int salary){
        this.salary = salary;
    }


}
