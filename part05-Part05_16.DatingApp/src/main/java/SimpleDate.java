
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {

        this.day++;

        if (this.day > 30) {
            this.day = 1; 
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        }

        
        
        /* more advanced implementation
        //checks months with 31 days
        if ((this.month == 1) ||
            (this.month == 3) ||
            (this.month == 5) ||
            (this.month == 7) ||
            (this.month == 8) ||
            (this.month == 10) ||
            (this.month == 12)) {

            if (this.day == 31) {
                this.day = 1;
                if (this.month < 12) {
                    this.month++;
                } else {
                    this.month = 1;
                    this.year++;
                }
            } else {
                this.day++;
            }
        
        //is leap year
        } else  if (((this.year % 4 == 0) &
                    (!(this.year % 100 == 0))) ||
                    (this.year % 400 == 0)) {  
                    
                    //checks if month is february
                    if (this.month == 2) {
                        if (this.day == 29) {
                            this.day = 1;
                            this.month = 3;    
                        } else {
                            this.day++;
                        }
                    }

                
        
        } else if (this.month == 2) {
            if (this.day == 28) {
                this.day = 1;
                this.month = 3;
            } else {
                this.day++;
            }
            
        //checks months with 30 days    
        } else {
            if (this.day == 30) {
                this.day = 1;
                if (this.month < 12) {
                    this.month++;
                } else {
                    this.month = 1;
                }
            } else {
                this.day++;
            }
        }*/   
        
    }
    public void advance(int howManyDays) {

        this.day = this.day + howManyDays;

        if (this.day > 30) {
            this.day = this.day - 30;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        }

        /* advanced implementation
        
            if ((this.month == 1) ||
            (this.month == 3) ||
            (this.month == 5) ||
            (this.month == 7) ||
            (this.month == 8) ||
            (this.month == 10) ||
            (this.month == 12)) {

            if ((this.day == 31) || (this.day + howManyDays >= 31)) {
                this.day = howManyDays - (31 - this.day);
                if (this.month < 12) {
                    this.month++;
                } else {
                    this.month = 1;
                }
            } else {
                day += howManyDays;
            }

        } else  if (((this.year % 4 == 0) &
                    (!(this.year % 100 == 0))) ||
                    (this.year % 400 == 0)) {
                            
                    if (this.month == 2) {
                        if ((this.day == 29) || (this.day + howManyDays >= 29)) {
                            this.day = howManyDays - (29 - this.day);
                            this.month = 3;    
                            } else {
                                this.day++;
                            }
                    }
        } else if (this.month == 2)  {
            if ((this.day == 28) || (this.day + howManyDays >= 28)) {
                    this.day = howManyDays - (28 - this.day);
                    this.month = 3;
            }
        }

        else {
            if ((this.day == 30) || (this.day + howManyDays >= 30)) {
                this.day = howManyDays - (30 - this.day);
                if (this.month < 12) {
                    this.month++;
                } else {
                    this.month = 1;
                }
            } else {
                this.day += howManyDays;
            }
        }    */
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }
}
