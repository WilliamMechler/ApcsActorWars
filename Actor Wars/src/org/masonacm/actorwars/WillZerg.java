import java.util.ArrayList;

import org.masonacm.actorwars.Action;
import org.masonacm.actorwars.ActiveActor;
import org.masonacm.actorwars.*;
import org.masonacm.actorwars.LocationFinder;
import org.masonacm.actorwars.Peon;
import org.masonacm.actorwars.Rock;
import org.masonacm.actorwars.Wheat;

import com.gawdl3y.util.DynamicValue;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class WillZerg extends Peon {
    
	@Override
	public void peonAct() {
		Grid<Actor> gr = getGrid();
	    ArrayList<Location> Oc = new ArrayList<Location>(); 
	    ArrayList<Location> eight = new ArrayList<Location>();
	    ArrayList<Class> Safe = new ArrayList<Class>();
	    Class target;
	    Location TL;
	    Oc = gr.getOccupiedLocations();
	    Safe.add(Wheat.class);
	    Safe.add(Rock.class);
	    Safe.add(IronOre.class);
	    Safe.add(Tree.class);
	    Safe.add(Quarry.class);
	    Safe.add(WillWheat.class);
	    Safe.add(WillZerg.class);
	    Safe.add(Fence.class);
	    

	    	//testing the occupied loop
	    	for(int x=0; x<=Oc.size()-1; x++) {
	    		   
	    	   
	    		eight = gr.getOccupiedAdjacentLocations(this.getLocation());
	    		
	    		
	    	if(!Safe.contains(gr.get(Oc.get(x)).getClass())) {
	    		 target = gr.get(Oc.get(x)).getClass();
	    		 TL = (Oc.get(x));
	    		// moving to enemy
	    		
	    		if (myactions.size() == 0) {
	    			DynamicValue<Location> l = LocationFinder
	    					.findClosestInstanceDynamicLocation(getDynamicLocation(),target, getGrid());
	    			//System.out.println(gr.get(Oc.get(x)).getClass().toString());
	    			
	    			
	    			if (l.getValue() != null) {
	    				add(Peon.moveToGradual(l));
	    			}
	    			
	    			if (l.getValue() == null) {
	    				
	    			}
	    		}
	    		
	    		
	    		
	    		
	    	    if(eight.isEmpty()) {
	  	    	  return;
	  	      }
	  	        	 for(int i = 0; i<eight.size(); i++) {
	  	            	 
	  	           	  if(eight.get(i).getClass().equals(target)); {
	  	           	
	  	           		Location WL = new Location(TL.getRow(), TL.getCol());
	  	        		this.setDirection( LocationFinder.directionTo(this.getLocation(),WL ));
	  	        		this.perform(Action.attackEP(130));
	  	        		
	  	        		//add(Action.use(Wheat.class));
	  	        		
	  	        		
	  	        		//ad(Action.spawn(WillZerg.class));
	  	        	    
	  	        		System.out.println(target.toString());
	  	        		System.out.println(eight.get(i).toString());
	  	        		System.out.println("Yeet");
	  	           	 return;
	  	           	  
	  	           	 }
	  	           }
	    		
	    		
	    		
	    	
	      }
	    	
	    }
	    
	   
	    
	    
	           
	    
	    
	    
	}   
}	    
	    
		
	

  

