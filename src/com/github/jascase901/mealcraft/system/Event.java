package com.github.jascase901.mealcraft.system;

public class Event{
    String eventName;
    String description;
    int date;

    /** makes calendar object statically*/
    public Event() {

	eventName = "";
	date = 01012012;
        description = "";
    }


    public Event(String inputEvent) {
        eventName = inputEvent;
	date = 01012012;
	description = "";
    }

    public Event(int inputDate) {

	eventName = "";
	date = inputDate;
	description = "";
    }

    public Event(String inputEvent, int inputDate) {

	eventName = inputEvent;
	date = inputDate;
	description = "";
    
    }
    
    public Event(String inputEvent, int inputDate, String inputDescript) {

	eventName = inputEvent;
	date = inputDate;
	description = inputDescript;
    }
}



    /** opens calendar to edit */
	/** public openCalendar() {
    
    }
	*/

