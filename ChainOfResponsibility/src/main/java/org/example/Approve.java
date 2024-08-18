package org.example;

class PurchaseRequest{
    private final double amount;

    public PurchaseRequest(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}

abstract class Approver{
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(PurchaseRequest request);
}

class Manager extends Approver{

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() <= 10000){
            System.out.println("Manager approved the purchase");
        } else if (nextApprover != null) {
            System.out.println("Manager cannot approve, passing request to");
            nextApprover.processRequest(request);
        } else System.out.println("None of the approvers can handle the request");
    }
}

class Director extends Approver{

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() <= 30000){
            System.out.println("Director approved the purchase");
        } else if (nextApprover != null) {
            System.out.println("Director cannot approve, passing request to");
            nextApprover.processRequest(request);
        } else System.out.println("None of the approvers can handle the request");
    }
}

class VicePresident extends Approver{

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() <= 50000){
            System.out.println("VP approved the request");
        } else System.out.println("None of the approvers can handle the request");
    }
}