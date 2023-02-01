public class Accounting {




    

private int electricity;
private int expenditureOnEducation;
private int totalsalaries;





    public Accounting (int electricity, int expenditureOnEducation, int totalsalaries) {

        this.electricity = electricity;
        this.expenditureOnEducation = expenditureOnEducation;
        this.totalsalaries = totalsalaries;

    }




    public int totalMoneyToSpend  (){

        return electricity + expenditureOnEducation + totalsalaries;

    }




    public void askingForDonation () {

        System.out.println("We can not afford our expenditure on education please help!");
    }





    public int getElectricity() {
        return electricity;
    }





    public int getExpenditureOnEducation() {
        return expenditureOnEducation;
    }





    public int getTotalsalaries() {
        return totalsalaries;
    }





    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }





    public void setExpenditureOnEducation(int expenditureOnEducation) {
        this.expenditureOnEducation = expenditureOnEducation;
    }





    public void setTotalsalaries(int totalsalaries) {
        this.totalsalaries = totalsalaries;
    }




    
    
}
