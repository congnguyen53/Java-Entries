//Cong Nguyen and Mark Kuligoski


import java.util.Scanner;
import java.util.ArrayList;


public class Directory
{
        
 public static void main(String[] args)
 {
  // Asking user for the amount of entries
  Scanner scan = new Scanner(System.in);
  System.out.println("How many entries will be used?");

   // Getting the number of entries         
  int numberOfEntries = scan.nextInt();
                
  // Create a ArrayList for the entries
  ArrayList<Entry> people = new ArrayList<Entry>(numberOfEntries);
  
              
  System.out.println("\nThank you.");
                
              // Asking the user to enter data in the manner following the rule
                System.out.println("\nPlease enter First Name, Last Name, Address, City, State, Zipcode Code,"
                                   + " and Phone Number (each separated by tab)\n");
                
                // Input data
  scan.nextLine();
                
              // Setting up the ArrayList
  String[] tempData = new String[numberOfEntries];
                
              
  for(int i = 0; i < numberOfEntries; i++)
  {
                    System.out.println("Entry " + (i+1) + " (one per line):");
                    tempData[i] = scan.nextLine();
  }

                // Formating
  System.out.println("\nReady:\n");
                
                
  System.out.printf("%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s","First Name", "Last Name", "Address", "City", "State", "Zip code", "Phone Number");
                System.out.println();
                System.out.printf("%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s%-30.30s", "----------", "---------", "-----------", "-------", "----", "-----", "------------");
                System.out.println(); 
                
                // Sending datas to PersonalInfo
  for(int i = 0; i < tempData.length; i++)
  {
                    Entry person = new Entry(extractFirstName(tempData[i]), extractLastName(tempData[i]), extractZipcode(tempData[i]),
                                                           extractAddress(tempData[i]), extractCity(tempData[i]), extractState(tempData[i]),
                                                           extractPhoneNumber(tempData[i]));
                    people.add(person);
                    System.out.println(people.get(i).toString());
                    
  }
  
  
  System.out.println("Do you want to delete an entry? Enter 1 if yes");
  int delete = scan.nextInt();
  if (delete == 1)
  {
System.out.println("The index number of the person ");
 int index = scan.nextInt();
 people.remove(index-1);
}
  
  System.out.println("Do you want to search for a specific entry? Enter 1 if yes"); 
  int search = scan.nextInt();
  if (search == 1)
  {
  System.out.println("Please enter their lastname");
  
   String lastname = scan.nextLine();
   for(int i = 0; i < tempData.length; i++)
  {
     if (lastname.equals(extractLastName(tempData[i])))
     System.out.println(people.get(i).toString());
     
   }
  }

 
  
 }
 //  Displaying Firstname
 public static String extractFirstName(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return temp[0];
 }
 
        // Displaying Lastname
 public static String extractLastName(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return temp[1];
 }
 

        
        // Displaying Address
        public static String extractAddress(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return temp[2] + "";
 }
        
        // Displaying city
        public static String extractCity(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return temp[3];
 }
        
        // Displaying State
        public static String extractState(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return temp[4];
 }
                // Displaying Zip zode
 public static int extractZipcode(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return Integer.valueOf(temp[5]);
 }
        // Displaying Phone Number
        public static String extractPhoneNumber(String rawIndividual)
 {
            String[] temp = rawIndividual.split("\t");
  
            return String.valueOf(temp[6]);
 }
         
 

    
 
}
