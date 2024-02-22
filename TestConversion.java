// This program shows how to do arithmetic on numerical values that are embedded within a string.

class TestConversion{
    public static void main(String[]args){
        String today = "DEC 19 2022";
        String todaysDayString= today.substring(4,6);
        int todaysDayInt = Integer.parseInt(todaysDayString);
        int nextWeeksDayInt = todaysDayInt + 7;
        String nextWeek = today.substring(0,4)+ nextWeeksDayInt + today.substring(6);

        //Outputs
        System.out.println("Today's date is : "+today);
        System.out.println("Today's day is : "+todaysDayInt);
        System.out.println("Nextweek's day is : "+nextWeeksDayInt);
        System.out.println("Next week's date is : "+ nextWeek);
    }
}