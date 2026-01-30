//Task assign hoga employee ko jab:

//Rules:

//Employee ka skillLevel >= 3 hona chahiye

//Employee ka tasksInProgress < 5 hona chahiye

//Employee ka availability = true hona chahiye

//Agar role = "SENIOR" → tasksInProgress ka rule ignore


public class Q6 {
    public static void main(String[] args) {
        
    
            int skillLevel = 4;
            int tasksInProgress = 5;
            boolean availability = true;
            String role = "SENIOR";
    
            boolean canAssign = false;
    
            if(!availability) {
                canAssign = false;
            }
            else if(role.equals("SENIOR")) {
                canAssign = skillLevel >= 3;
            }
            else {
                canAssign = skillLevel >= 3 && tasksInProgress < 5;
            }
    
            System.out.println("Can Assign Task: " + canAssign);
        }
    }
    

