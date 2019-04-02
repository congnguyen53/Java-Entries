


import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Holds the first name, last name, Zipc code, address, city, state, and phone number of a person.
 * @author Joseph Spada
 */
public class Entry
{
    /**
     * The first name of the person
     */
    private String firstName;
    /**
     * The last name of the person
     */
    private String lastName;
    /**
     * The Zipc code of the person
     */
    private int Zipcode;
    /**
     * The address of the person
     */
    private String address;
    /**
     * The city of the person
     */
    private String city;
    /**
     * The state of the person
     */
    private String state;
    /**
     * The phone number of the person
     */
    private String phoneNumber;
 
    /**
     * 
     * @param firstN holds the first name
     * @param lastN holds the last name
     * @param Zipc holds the Zipc code
     * @param residence holds the address
     * @param residenceCity holds the city
     * @param residenceState holds the state
     * @param number holds phone number
     */

 
    public Entry(String firstN, String lastN, int Zipc, String residence, String residenceCity, String residenceState, String number)
    {
        firstName = firstN;
        lastName = lastN;
        Zipcode = Zipc;
        address = residence;
        city = residenceCity;
        state = residenceState;
        phoneNumber = number;
    }
 
    /**
     * Returns the first name of the person.
     * @return the first name of the person
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Returns the last name of the person.
     * @return the last name of the person
     */
    
    public String getLastName()
    {
        return lastName;
    }
 
    /**
     * Returns the Zipc code of the person.
     * @return the Zipc code of the person
     */
    public int getZipcodeCode()
    {
        return Zipcode;
    }
        
    /**
     * Returns the address of the person.
     * @return the address of the person
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * Returns the city of the person.
     * @return the city of the person
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * Returns the state of the person.
     * @return the state of the person
     */
    public String getState()
    {
        return state;
    }
    
    /**
     * Returns the phone number of the person.
     * @return the phone number of the person
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    /**
     * Returns a formatted <code>String</code>
     * @return a formatted <code>String</code> made up of all of the person's information
     */
    @Override
    public String toString()
    {
        DecimalFormat Zipc = new DecimalFormat("00000");
        DecimalFormat number = new DecimalFormat("0000000000");
        return String.format("%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s",firstName, lastName, Zipc.format(Zipcode), address, city, state, number.format(phoneNumber));
    }
 
} 
