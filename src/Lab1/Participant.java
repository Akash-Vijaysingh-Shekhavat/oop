package Lab1;

public class Participant {

    private static int counter;
    private String registrationId;
    private String name ;
    private long contactNumber;
    private String branch;

    Participant(String name, long contactNumber, String branch) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.branch = branch;
        this.registrationId = "D" + counter++;
    }


    public String getRegistrationId() {
        return registrationId;
    }
    public void setRegistrationId(String registrationId)
    {
        this.registrationId =registrationId;
    }

    static  {
        counter = 1001;
    }

    public static int getCounter( )
    {
        return counter;
    }
    public static void setCounter(int counter )
    {
        Participant.counter = counter;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getContactNumber()
    {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber)
    {
        this.contactNumber = contactNumber;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public static void main(String[] args) {
        Participant p1 = new Participant("Rohit",1234567889,"Computer");
        Participant p2 = new Participant("Sayli",1988612300,"Mechanical");
        System.out.println("Hi "+ p1.getName() +"! Your registration id is "+ p1.getRegistrationId());
        System.out.println("Hi "+ p2.getName() +"! Your registration id is "+ p2.getRegistrationId());


    }


}

