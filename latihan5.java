class Time1
{
    private int hour;
    private int minute;
    private int second;

    // set a new time value using universal time
    // throw an exception if the hour, minute, or second is invalid
    public void setTime(int h, int m, int s){
        if ( ( h >= 0 && h < 24) && ( m >= 0 && m < 60 ) && ( s >= 0 && s < 60 ) ){
            hour = h;
            minute = m;
            second = s;
        }
        else{
            throw new IllegalArgumentException("hour, minute, and/or second was out of range");
        }
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString(){
        return String.format ("%d:%02d:%02d %s", ((hour == 0 || hour == 1) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM"));
    }
}


public class latihan5 {
    public static void main(String[] args){
        // create and initialize a Time1 object
        Time1 time = new Time1(); // invokes Time1 constructor
        // output string representations of the time
        System.out.print("The initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toString());
        System.out.println();
        // change time and output updated time
        time.setTime( 13, 27, 6 );
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toString());
        System.out.println();

        // attempt to set time with invalid values
        try{
            time.setTime(99,99,99);
        }
        catch(IllegalArgumentException e){
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }

        // display time after attempt to set invalid values
        System.out.println("After attempting invalid settings: ");
        System.out.print("Universal time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time: ");
        System.out.println(time.toString());
    }
}