import java.util.ArrayList;

import org.masonacm.actorwars.Action;
import org.masonacm.actorwars.ActiveActor;
import org.masonacm.actorwars.LocationFinder;
import org.masonacm.actorwars.Peon;
import org.masonacm.actorwars.Wheat;

import com.gawdl3y.util.DynamicValue;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class WillWheat extends Peon {

	
	@Override
	public void peonAct() {
		Grid<Actor> gr = getGrid();
		ArrayList<Location> eight = new ArrayList<Location>();
        ArrayList<Location> Occ = new ArrayList<Location>(); 
		if (myactions.size() == 0) {
			DynamicValue<Location> l = LocationFinder
					.findClosestInstanceDynamicLocation(getDynamicLocation(), Wheat.class, getGrid());
			if (l.getValue() != null) {
				add(Peon.moveToGradual(l));
			}
			
			if (l.getValue() == null) {
				
			}
			 
	         
	        
	         
	  
	         Wheat temp = new Wheat();
	         
	       Occ = gr.getOccupiedLocations(); 	 
	       eight = gr.getOccupiedAdjacentLocations(this.getLocation());
	       
	           
	      if(eight.isEmpty()) {
	    	  return;
	      }
	        	 for(int i = 0; i<eight.size(); i++) {
	            	 
	           	  if(eight.get(i).getClass().equals(temp.getClass())); {
	           	
	           		 Location WL = new Location(eight.get(i).getRow(), eight.get(i).getCol());
	        		this.setDirection( LocationFinder.directionTo(this.getLocation(),WL ));
	        		this.perform(Action.attackEP(32));
	        		
	        		add(Action.use(Wheat.class));
	        		
	        		
	        		add(Action.spawn(WillZerg.class));
	        	    
	        		
	        		System.out.println(this.getEnergy());
	           	 return;
	           	  
	           	 }
	           }
	         }
	        }
  
		
	}

