import java.util.Scanner;

public class NokiaMenu {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n**Nokia Menu**");
            System.out.println("1. Phone Book");
            System.out.println("2. Messages");
System.out.println("3. Chat");

            System.out.println("4. Call Register");
            System.out.println("5. Tones");
System.out.println("6. Settings");
System.out.println("7. Call divert");
System.out.println("8. Games");
System.out.println("9. Calculator");
System.out.println("10. Reminders");
System.out.println("11. Clock");
System.out.println("12. Profiles");
System.out.println("13. SIM services");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    phoneBookMenu(input);
                    break;
                case 2:
                    messagesMenu(input);
                    break;
                 case 3:
chatMenu(input);
break;
                

                case 4:
                    callRegisterMenu(input);
                    break;
                case 5:
                    tonesMenu(input);
                    break;
case 6:
settingsMenu(input);
break;
case 7:
callDivertMenu(input);
break;
case 8:
gamesMenu(input);
break;
case 9:
calculatorMenu(input);
break;
case 10:
remindersMenu(input);
break;
case 11:
clockMenu(input);
break;
case 12:
profilesMenu(input);
break;
case 13:
simServicesMenu(input);
break;






                case 14:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void phoneBookMenu(Scanner input) {
        boolean back = false;
        while (!back) {
            System.out.println("\n**Phone Book**");
            System.out.println("1. Search");
		System.out.println("2.Service Nos.");
            System.out.println("3. Add Name");
System.out.println("4. Erase");

            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
System.out.println("7. Send b'card");
System.out.println("8. Options");
System.out.println("9. Speed dials");
System.out.println("10. Voice tags");



            System.out.println("11. Back");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Search functionality");
                    break;
                case 2:
                    System.out.println("Service Nos. functionality");
                    break;
                case 3:
                    System.out.println("Add Name functionality");
                    break;
                case 4:
                    System.out.println("Erase functionality");
                    break;
                case 5:
                    System.out.println("Edit functionality");
                    break;
                case 6:
                    System.out.println("Assign tone functionality");
                    break;
                case 7:
                    System.out.println("Send b'card functionality");
                    break;
                case 8:
                    optionMenu (input);
                    System.out.println("Option functionality");
                    break;
                case 9:
                    System.out.println("Speed dials functionality");
                    break;
                case 10:
                    System.out.println("Voice tags functionality");
                    break;


                case 11:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
}
  }
   }
public static void optionMenu(Scanner input) {
boolean back = false;
while (!back) {
           System.out.println("\n**Option**");
           System.out.println("1. Type of view");
           System.out.println("2.Memory Status");
            System.out.println("3. Back");
           System.out.print("Enter your choice: ");

int choice = input.nextInt();
           input.nextLine(); 
                              
               switch (choice) {

                case 1:
                   System.out.println("Type of view functionality");
                   break;
               case 2:
                   System.out.println("Memory Status functionality");
                   break;
                case 3:
                   back = true;
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");


            }
        }
    }

    private static void messagesMenu(Scanner input) {
        boolean back = false;
        while (!back) {
            System.out.println("\n**Messages**");
            System.out.println("1. Write Messages");
            System.out.println("2. Inbox");
            System.out.println("3. Outbox");
System.out.println("4. Picture messages");
System.out.println("5. Templates");
System.out.println("6. Smileys");
System.out.println("7. Message settings");
System.out.println("8. Info service");
System.out.println("9. Voice mailbox number");
System.out.println("10. Service command editor");





            System.out.println("11. Back");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println("Write Message functionality");
                    break;
                case 2:
                    System.out.println("Inbox functionality");
                    break;
                case 3:
                    System.out.println("Outbox functionality");
                    break;
case 4:
                   System.out.println("Picture Messages functionality");
                   break;
case 5:
                   System.out.println("Templates functionality");
                   break;
case 6:
                   System.out.println("Smileys functionality");
                  break;
                case 7:
                messageSettings (input);
                    System.out.println("Message setting functionality");
                   break;
case 8:
                   System.out.println("Info Service functionality");
                   break;
case 9:
                   System.out.println("Voice mailbox number functionality");
                   break;
case 10:
                   System.out.println("Service command editor functionality");
                   break;

                case 11:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    public static void messageSettings(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Message Settings**");
           System.out.println("1. Set 12");
           System.out.println("2. Common3");
           System.out.println("3. Back");

           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
case 1:
                  setOneTwo (input) ;
                   System.out.println("Set12 functionality");
                   break;
               case 2:
                  commonThree (input) ;
                  System.out.println("Common3 functionality");                   
                    break;
               case 3:
                  back = true;
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
}
  }
   }

public static void setOneTwo(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Set12**");
           System.out.println("1. Message centre number");
           System.out.println("2. Message Sent as");
            System.out.println("3. Message validity");

           System.out.println("4. Back");

         System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
           
            case 1:
                 
                  System.out.println("Message centre number functionality");
                   break;
               case 2:
                  
                  System.out.println("Message sent as functionality");
                   break;
                case 3:
                  System.out.println("Message validity functionality");
                   break;
               case 4:
                   back = true;
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
}
 }
  }

public static void commonThree(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Common3**");
           System.out.println("1. Delivery reports");
           System.out.println("2. Reply via same centre");
           System.out.println("3. Character support");
           System.out.println("4. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {

           case 1:

                  System.out.println("Delivery reports functionality");
                   break;
               case 2:

                  System.out.println("Reply via same centre  functionality");
                   break;
               case 3:
                  System.out.println("Character support functionality");
                   break;

              case 4:
                   back = true;
                   break;
               default:
                   System.out.println("Invalid choice. Please try again.");
}
 }
  }






    public static void chatMenu(Scanner input) {
            System.out.println("Chat Menu");
}
           
 public static void callRegisterMenu(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Call Register**");
System.out.println("1. Missed calls");
           System.out.println("2. Recieved Calls");
          System.out.println("3. Dialled numbers");
           System.out.println("4. Erase recent call lists");
System.out.println("5. Show call duration");
System.out.println("6. Show call costs");
System.out.println("7. Call cost settings");
System.out.println("8. Prepaid credit");




           System.out.println("9. Back");
          System.out.print("Enter your choice: ");
           int choice = input.nextInt();
          input.nextLine(); 
           switch (choice) {
               case 1:
                  System.out.println("Missed Calls");
                   break;
              case 2:
                   System.out.println("Recieved Calls");
                  break;
               case 3:
                   System.out.println("Dialled numbers");
                   break;
case 4:
                   System.out.println("Erase recent call lists");
                   break;
case 5:
                  showCallDuration (input) ;
                 System.out.println("Show Call duration");
                   break;
case 6:
                  showCallCosts (input);
                  System.out.println("Show Call costs");
                   break;
case 7:
                  callCostSettings (input);
                  System.out.println("Call Cost settings");
                   break;
case 8:
                  System.out.println("Prepaid credit");
                   break;




              case 9:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
 }
  }
public static void showCallDuration(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Show Call Duration**");
System.out.println("1. Last call duration");
           System.out.println("2. All calls' duration");
           System.out.println("3. Received calls' duration");
           System.out.println("4. Dialled calls' duration");
System.out.println("5. Clear timers");

           System.out.println("6. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Last call duration");
                   break;
               case 2:
                   System.out.println("All calls' duration");
                   break;
               case 3:
                   System.out.println("Received calls' duration");
                   break;
case 4:
                   System.out.println("Dialled calls' duration");
                   break;
case 5:
                  System.out.println("Clear timers");
                   break;


               case 6:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
}
}
public static void showCallCosts(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Show Call Costs**");
            System.out.println("1. Last call cost");
           System.out.println("2. All calls' cost");
           System.out.println("3. Clear counters");
           System.out.println("4. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Last call cost");
                   break;
               case 2:
                   System.out.println("All calls' cost");
                   break;
               case 3:
                   System.out.println("Clear counters");
                   break;
               case 4:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
 }
  }
public static void callCostSettings(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Call cost Settings**");
           System.out.println("1. Call cost limit");
           System.out.println("2. Show costs in");
           System.out.println("3. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
          input.nextLine();
          switch (choice) {
               case 1:
                   System.out.println("Call cost limit");
                   break;
               case 2:
                   System.out.println("Show costs in");
                   break;
              case 3:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
}
 }
public static void prepaidCredit(Scanner input) {
System.out.println("Prepaid credit");
}

public static void tonesMenu(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Tones**");
System.out.println("1. Ringing tone");
          System.out.println("2. Ringing volume");
           System.out.println("3. Incoming call alert");
           System.out.println("4. Composer");
System.out.println("5. Message alert tone");
System.out.println("6. Keypad tones");
System.out.println("7. Warning and game tones");
System.out.println("8. Vibrating alert");
System.out.println("9. Screen saver");





           System.out.println("10. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
          input.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Ringing tone");
                   break;
               case 2:
                   System.out.println("Ringing volume");
                   break;
               case 3:
                   System.out.println("Incoming call alert");
                   break;
case 4:
                   System.out.println("Composer");
                   break;
case 5:
                
                  System.out.println("Message alert tone");
                   break;
case 6:
                  
                  System.out.println("Keypad tones");
                   break;
case 7:
                  callCostSettings (input);
                  System.out.println("Warning and game tones");
                   break;
case 8:
                 System.out.println("Vibrating alert");
                   break;
case 9:
                  System.out.println("Screen saver");
                   break;




               case 10:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
}
  }
public static void settingsMenu(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Settings**");
System.out.println("1. Call Settings");
          System.out.println("2. Phone settings");
           System.out.println("3. Security settings");
           System.out.println("4. Restore factory settings");
           System.out.println("5. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
               case 1:
                    callSettings (input);
                   System.out.println("Call Settings");
                   break;
               case 2:
                    phoneSettings (input);

                   System.out.println("Phone settings");
                   break;
               case 3:
                    securitySettings (input);

                   System.out.println("Security settings");
                   break;
                case 4:
                   System.out.println("Restore factory settings");
                  break;
               case 5:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
 }
}
}
public static void callSettings(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Call Settings**");
System.out.println("1. Automatic redial");
           System.out.println("2. Speed dialling");
           System.out.println("3. Call waiting options");
           System.out.println("4. Own number sending");
System.out.println("5. Phone line in use");
System.out.println("6. Automatic answer");
           System.out.println("7. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
              case 1:
                   System.out.println("Automatic redial");
                   break;
               case 2:
                   System.out.println("Speed dialling");
                   break;
               case 3:
                   System.out.println("Call waiting options");
                   break;
case 4:
                   System.out.println("Own number sending");
                   break;
case 5:
                  System.out.println("Phone line in use");
                   break;
case 6:
                 
                  System.out.println("Automatic answer");
                   break;




               case 7:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
}
 }


public static void phoneSettings(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Phone Settings**");
System.out.println("1. Language");
           System.out.println("2. Cell info display");
           System.out.println("3. Welcome note");
           System.out.println("4. Network selection");
System.out.println("5. Light^2");
System.out.println("6. Confirm SIM service actions");

           System.out.println("7. Back");
          System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Language");
                   break;
              case 2:
                   System.out.println("Cell info display");
                   break;
               case 3:
                   System.out.println("Welcome note");
                   break;
case 4:
                   System.out.println("Network selection");
                   break;
case 5:

                  System.out.println("Light^2");
                   break;
case 6:

                  System.out.println("Confirm SIM service actions");
                   break;




               case 7:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
  }
    }

public static void securitySettings(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Security Settings**");
System.out.println("1. PIN code request");
           System.out.println("2. Call barring service");
           System.out.println("3. Fixed dialling");
           System.out.println("4. Closed user group");
System.out.println("5. Phone security");
System.out.println("6. Change access codes");

           System.out.println("7. Back");
           System.out.print("Enter your choice: ");
           int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
               case 1:
                  System.out.println("PIN code request");
                   break;
               case 2:
                   System.out.println("Call barring service");
                   break;
               case 3:
                   System.out.println("Fixed dialling");
                   break;
case 4:
                   System.out.println("Closed user group");
                   break;
case 5:

                  System.out.println("Phone security");
                   break;
case 6:

                  System.out.println("Change access codes");
                   break;




               case 7:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
 } 
  }

public static void callDivertMenu(Scanner input) {
           System.out.println("Call Divert Menu");
}
public static void gamesMenu(Scanner input) {
           System.out.println("Games Menu");
}
public static void calculatorMenu(Scanner input) {
           System.out.println("Calculator Menu");
}
public static void remindersMenu(Scanner input) {
           System.out.println("Reminder Menu");
}

public static void clockMenu(Scanner input) {
       boolean back = false;
       while (!back) {
           System.out.println("\n**Clock Menu**");
System.out.println("1. Alarm Clock");
           System.out.println("2. Clock Settings");
           System.out.println("3. Date setting");
           System.out.println("4. Stopwatch");
System.out.println("5. Countdown timer");
System.out.println("6. Auto update of date and time");
           System.out.println("7. Back");
           System.out.print("Enter your choice: ");
         int choice = input.nextInt();
           input.nextLine();
           switch (choice) {
               case 1:
                   System.out.println("Alarm Clock");
                   break;
               case 2:
                   System.out.println("Clock Settings");
                   break;
               case 3:
                   System.out.println("Date setting");
                   break;
case 4:
                   System.out.println("Stopwatch");
                   break;
case 5:

                  System.out.println("Countdown timer");
                   break;
case 6:

                  System.out.println("Auto update of date and time");
                   break;



               case 7:
                   back = true;
                   break;
default:
                   System.out.println("Invalid choice. Please try again.");
}
 }
  }

public static void profilesMenu(Scanner input) {
           System.out.println("Call Profiles Menu");
}
public static void simServicesMenu(Scanner input) {
           System.out.println("SIM services Menu");
}
}


           




