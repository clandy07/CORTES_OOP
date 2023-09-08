/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clandystine
 */
public class MyTime {
    public static void main(String[] args) {
        Time time1 = new Time(12,59,59,false);
        Time time2 = new Time(1);
        Time time3 = new Time();

        System.out.println(time1);

        time1.advanceTime(30);
        time1.display12Hour();
        time1.display24Hour();
        
        time1.tickByHour();
        time1.display12Hour();
        time1.display24Hour();

        time1.tickByMinute();
        time1.display12Hour();
        time1.display24Hour();

        time1.tickBySecond();
        time1.display12Hour();
        time1.display24Hour();

        // --------------------------------------------

        // System.out.println(time2);

        // time2.advanceTime(30);
        // time2.display12Hour();
        // time2.display24Hour();
        
        // time2.tickByHour();
        // time2.display12Hour();
        // time2.display24Hour();

        // time2.tickByMinute();
        // time2.display12Hour();
        // time2.display24Hour();

        // time2.tickBySecond();
        // time2.display12Hour();
        // time2.display24Hour();

        // --------------------------------------------

        // System.out.println(time3);

        // time3.advanceTime(30);
        // time3.display12Hour();
        // time3.display24Hour();
        
        // time3.tickByHour();
        // time3.display12Hour();
        // time3.display24Hour();

        // time3.tickByMinute();
        // time3.display12Hour();
        // time3.display24Hour();

        // time3.tickBySecond();
        // time3.display12Hour();
        // time3.display24Hour();
      
    }
}
