package com.roopa.learning.core.statickeyword;

import java.time.LocalDateTime;

// Static methods are used to perform operations that are not specific to any instance of the class.
// Static methods are also known as utility methods.
// Static methods can be called using the class name.
// static methods will be mainly used for creating utility methods/ utility classes.
// Utility methods are methods that are not related to any object but are related to the class.
// Utility methods are used to perform common tasks that are not related to any object
// Utility methods can be accessed directly using the class name.
class MathHelper {

    public static int square(int num){
        return num * num;
    }

    public static int cube(int num){
        return num * num * num;
    }

}

class DateHelper {

    public static String getDayOfWeek(int day) {

        switch (day) {
            case 1:
                return "Sunday";

            case 2:
                return "Monday";

            case 3:
                return "Tuesday";

            case 4:
                return "Wednesday";

            case 5:
                return "Thursday";

            case 6:
                return "Friday";

            case 7:
                return "Saturday";

            default:
                return "Invalid Day";
        }

    }

    public static String getMonthOfYear(int month){
        switch (month){
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "Invalid Month";
        }

    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static LocalDateTime convertFromOneTimeZoneToAnother(LocalDateTime dateTime,String fromTimeZone,String toTimeZone){
        return null;
    }

}

public class StaticUtilityMethods {

    public static void main(String[] args) {

        //Static methods can be called using the class name.
        //Utility methods can be accessed directly using the class name.

        System.out.println("Square of 5 is : " + MathHelper.square(5));
        System.out.println("Cube of 5 is : " + MathHelper.cube(5));

        System.out.println("Day of week for 1 is : " + DateHelper.getDayOfWeek(5));
        System.out.println("Month of year for 1 is : " + DateHelper.getMonthOfYear(5));
        System.out.println("Is 2020 a leap year : " + DateHelper.isLeapYear(1987));
    }
}
