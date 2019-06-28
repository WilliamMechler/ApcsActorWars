package org.masonacm.actorwars;

import info.gridworld.actor.Actor;
import info.gridworld.grid.*;
import java.util.ArrayList;

public class WheatBoy extends Peon{
	
	private ArrayList<Location> ws = new ArrayList();
	
	
	@Override
	public void peonAct() {
		ws = findw();
		Location temp = new Location(1,1);
		Location des = new Location(temp.getRow(), temp.getCol());
		
		
	}
	
	public ArrayList findw() {
		Grid<Actor> gr = getGrid();
		ArrayList<Location> Nei = new ArrayList<Location>();
		ArrayList<Location> wsl = new ArrayList<Location>();
		Nei = gr.getOccupiedLocations();
		Wheat W = new Wheat();
		for(int i = 0; i <= Nei.size()-1; i++) {
			if(Nei.get(i).getClass().equals(W.getClass())) {
				Location temp = new Location(Nei.get(i).getRow(),Nei.get(i).getCol());
				wsl.add(temp);
			}
		}
		
		return wsl;
	}
	
	public Location closew(ArrayList<Location> a) {
	
		
		return null;
		
	}

}
