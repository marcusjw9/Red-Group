import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class historyPage{
	private ArrayList<Event> events = new ArrayList<Event>(); 
	private ArrayList<JLabel> labels = new ArrayList<JLabel>();
	
	public historyPage(Task task) {
		events = new task.getEvents();
	}
	
	public sort() {
		
	}
	public Event getEvent(int index) {
		return events[index];
	}
	
	public void add(Event event, JLabel j){
		events.add(event);
		j.setText(event.createSentence());
		labels.add(j);
		
	}
}



