public class PartTimeEmployee {
    private double ratePerHour; 
    private int hoursWorked;
    private double wage;

    // Getters
    public double getRatePerHour() {
        return ratePerHour;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getWage() {
        wage = ratePerHour * hoursWorked;
        return wage;
    }

    // Setters

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    

    public void setWage(double wage) {
        this.wage = wage;
    }


    }


