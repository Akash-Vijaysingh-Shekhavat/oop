package Lab1;

public class Student {
    long rollNo;
    String FirstName;
    String MiddleName;
    String LastName;
    long MobNo;
    String Address;
    int Class;

    Student()
    {
        System.out.println("Student Data :");
    }

    void   Name(String FirstName, String MiddleName, String LastName)
    {
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;

        System.out.println("Student Name = " + FirstName +  MiddleName  + " "+ LastName);
    }

    void Roll(long rollNo)
    {
        this.rollNo = rollNo;
        System.out.println("Roll Number = " + rollNo);
    }
    void MobileNo(long MobNo)
    {
        this.MobNo = MobNo;
        System.out.println("Mobile Number = " + MobNo);
    }
    void Address(String Address)
    {
        this.Address = Address;
        System.out.println("Address = " + Address);
    }
    void YearOfStudy(int Class)
    {
        this.Class = Class;
        System.out.println("Year of Study = " + Class);
    }

    public static void main(String[] args) {
        Student Ram = new Student();
        Ram.YearOfStudy(2);
        Ram.Name("Akash ","Vijaysingh","Shekhavat");
        Ram.Roll(12011086);
        Ram.MobileNo(9823727);
        Ram.Address("VIT,Pune");


    }


}