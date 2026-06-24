public class Test_Employee {
    public static void main(String[] args) 
    {
        Developer d1 = new Developer("Jhon", "KTM", "john@example.com", 
        986904449, 50000, "Full-Time");
        d1.Details();

        Developer d2 = new Developer("Hari", "Sanepa", "hari@bro.com", 
        999999999, 450000, "part-time");
        d2.Details();

        Developer d3 = new Developer("Sita", "Lalitpur", "sita@example.com", 
        999777666, 40000, "Contract");
        d3.Details();

        Developer d4 = new Developer("Gita", "Bhaktapur", "gita@example.com", 
        364556323, 30000, "Intern");
        d4.Details();

        Developer d5 = new Developer("Alok", "kirtipur", "alok@example.com", 
        984848844, 25000, "freelancer");
        d5.Details();
    }                                                                                                                                                                    
}
