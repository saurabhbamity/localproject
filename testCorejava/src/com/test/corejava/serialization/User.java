package com.test.corejava.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable{
    
    
    private static final long serialVersionUID = 7829136421241571167L;
    
    private String firstName;
    private  String lastName;
    private static int accountNumber;
    private transient String password;
 
    public User(String firstName, String lastName, int accountNumber, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        User.accountNumber = accountNumber;
        this.password = password;
    }
     
    public User() {
        super();
    }
    
    
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public int getAccountNumber() {
        return accountNumber;
    }
 
    
 
    public void setFirstName(String aNewFirstName) {
        firstName = aNewFirstName;
    }
 
    public void setLastName(String aNewLastName) {
        lastName = aNewLastName;
    }
 
    public void setAccountNumber(int aNewAccountNumber) {
        accountNumber = aNewAccountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {

        firstName = ois.readUTF();
        lastName = ois.readUTF();
        accountNumber = ois.readInt();
        password = ois.readUTF();
    }
        

    private void writeObject(ObjectOutputStream oos) throws IOException {

        oos.writeUTF(firstName);
        oos.writeUTF(lastName);
        oos.writeInt(accountNumber);
        oos.writeUTF(password);

    }
        
    

}
