package com.company;

public class NextDayCalculator {
    private int day = 1;
    private int month = Month.JANUARY;
    private int year = 2018;

    NextDayCalculator(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String displayNextDay(){
        if(checkMonth() == "31Days"){
            return showTheNextDayInMonthHas31Days();
        }else if(checkMonth() == "30Days"){
            return showTheNextDayInMonthHas30Days();
        }else if(checkMonth() == "28Days"){
            return showTheNextDayInFebruary();
        }
        return displayTheDay();
    }

    public String showTheNextDayInMonthHas31Days(){
        if(day == 31){
            day = 1;
            if(month == Month.DECEMBER){
                month = Month.JANUARY;
                year += 1;
            }else{
                month += 1;
            }
        }else{
            day += 1;
        }
        return displayTheDay();
    }

    public String showTheNextDayInMonthHas30Days(){
        if(day == 30){
            day = 1;
            month += 1;
        }else{
            day += 1;
        }
        return  displayTheDay();
    }

    public String showTheNextDayInFebruary(){
        boolean	isDivisibleBy4	=	year	%	4 == 0;
        if(isDivisibleBy4){
            boolean	isDivisibleBy100	=	year	%	100 == 0;
            if	(isDivisibleBy100){
                boolean	isDivisibleBy400	=	year	%	400 == 0;
                if(isDivisibleBy400)
                    if(day == 29){
                        day = 1;
                        month = Month.MARCH;
                    }else{
                        day += 1;
                    }
            } else	{
                if(day == 29){
                    day = 1;
                    month = Month.MARCH;
                }else{
                    day+=1;
                }
            }
        }else{
            if(day == 28){
                day = 1;
                month = Month.MARCH;
            }else{
                day += 1;
            }
        }
        return displayTheDay();
    }

    public String displayTheDay(){
        return "The next day: "+day+"/"+month+"/"+year;
    }

    public String checkMonth(){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return "31Days";
            case 4:
            case 6:
            case 9:
            case 11:
                return "30Days";
            case 2:
                return "28Days";
            default:
                return "31Days";
        }
    }
}
