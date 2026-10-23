
package bolum_10;
import java.util.Timer;

public class Time {
private int hour;    
private int minute;
private int second;

public Time(){
    long totalMillesecond = System.currentTimeMillis() + java.util.TimeZone.getDefault().getRawOffset();
    setTime(totalMillesecond);
}
public Time(long elapsedTime){
    long totalMillesecond = 0;
    setTime(totalMillesecond);
}
public Time(int hour, int minute, int second){
    this.hour=hour;
    this.minute=minute;
    this.second=second;
}

public int getHour(){
    return hour;
}
public int getSecond(){
    return second;
}
public int getMinute(){
    return minute;
}


public void setTime(long elapseTime){
    long totalSeconds = elapseTime / 1000;
    this.second = (int) (totalSeconds % 60);
    int totalSecond = 0;
    long totalMinutes = totalSecond / 60;
    this.minute = (int) (totalMinutes % 60);
    int totlMinutes = 0;
    long totalHours = totlMinutes / 60;
    this.hour = (int) (totalHours % 24);
}
public String toString(){
    return String.format("%02d:%02d:%02d",hour, minute, second);
}
}
