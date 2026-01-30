public class Q5{
    public static void main(String[] args) {
        

        
                // Variables
                int performanceRating = 4;
                int yearsAtCompany = 3;
                boolean onProbation = false;
                String role = "EMPLOYEE";
        
                // Boolean expression for bonus eligibility
                boolean bonusEligible = false;
        
                // Logic based on rules
                if(onProbation) {
                    bonusEligible = false; // on probation → deny
                }
                else if(role.equals("MANAGER")) {
                    // manager exception: performance >= 3 sufficient
                    bonusEligible = performanceRating >= 3 && yearsAtCompany >= 2;
                }
                else {
                    // normal employee
                    bonusEligible = performanceRating >= 4 && yearsAtCompany >= 2;
                }
        
                // Output
                System.out.println("Bonus Eligible: " + bonusEligible);
            }
        }
        
    