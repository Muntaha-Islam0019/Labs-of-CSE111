class Clock {
    
    int hours , minutes , seconds ;

    Clock () {
        hours = 12 ;
        minutes = 00 ;
        seconds = 00 ;
    }

    Clock (int hours , int minutes , int seconds) {
        this.hours = hours ;
        this.minutes = minutes ;
        this.seconds = seconds ;
    }

    Clock (int seconds) {
        setClock(seconds) ;
    }

    void setClock (int seconds) {
        
        hours = seconds / 3600; 
      
        seconds %= 3600; 
        minutes = seconds / 60 ; 
      
        seconds %= 60; 
        this.seconds = seconds; 
    }

    int getHours() {
        return hours ;
    }

    int getMinutes() {
        return minutes ;
    }

    int getSeconds() {
        return seconds ;
    }

    void setHours (int hours) {
        this.hours = hours ;
    }

    void setMinutes (int minutes) {
        this.minutes = minutes ;
    }

    void setSeconds (int seconds) {
        this.seconds = seconds ;
    }

    void tick() {
        ++seconds ;
    }

    void addClock ( Clock clockOne ) {
        hours += clockOne.hours ;
        minutes += clockOne.minutes ;
        seconds += clockOne.seconds ;
    }

    public String toString() {
        String str = hours + ":" + minutes + ":" + seconds ;
        return str ;
    }

    void tickDown() {
        --seconds ;
    }

    Clock subtractClock ( Clock clockTwo ) {

        int h = (int) Math.abs(hours - clockTwo.hours) ;
        int m = (int) Math.abs(minutes - clockTwo.minutes) ;
        int s = (int) Math.abs(seconds - clockTwo.seconds) ;

        Clock temp = new Clock (h , m , s) ;

        return temp ;
    }
}