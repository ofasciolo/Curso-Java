package academy.learnprogramming;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String customerName, String branchName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, String branchName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName, transaction);
        }

        return false;
    }

    private Branch findBranch(String branch){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName().equals(branch)){
                return branches.get(i);
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers of branch " + branchName + "are: ");
            for(int i = 0; i < branch.getCustomers().size(); i++){
                System.out.println((i + 1) + ". " + branch.getCustomers().get(i));
            }
            return true;
        }
        return false;
    }

}
