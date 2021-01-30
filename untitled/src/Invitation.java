public class Invitation
{
    //attributes
    private String hostName;
    private String address;

    //constructor
    public Invitation(String n, String a)
    {
        hostName = n;
        address =  a;
    }

    //Unit 5 Question 1a
    //accessor
    public String gethostName(){
        return hostName;
    }

    //Unit 5 Question 1b
    //setter
    public void setAddress(String newAddress){
        address = newAddress;
    }

    //Unit 5 Question 1c
    public String inviteMessage(String name){
        String message = "Dear " + name + ", please attend my event at "+ address + ". See you then, " + hostName + ".";
        return message;
    }
    //Unit 5 Question 1d
    //another constructor
    public Invitation(String address){
        this.address = address;
        hostName = "Host";
    }
}