class Employee {
    String name;
    String address;
    String email;
    long phone;
    int salary;

    String emp_type;
    // using Constructor

    public Employee(String name, String address, String email, long phone, int salary, String emp_type)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.emp_type = emp_type;
    }
    public void Details(){
        System.out.println("Employee detail" +"  "+ 
        "Name:" + this.name +"  "+
        "Adddress:" + this.address + "  "+
        "Email:" + this.email + "  "+
        "Phone:" + this.phone + "  "+
        "Salary:" + this.salary + "  "+
        "Employee type:" + this.emp_type    
    );
    

    }
}