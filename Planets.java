//Siddhesh Vivek Joshi
// Z. B. Patil College Dhule
// 9421125097
// YOP : 2017
//mail id : siddheshvj26@gmail.com




package org.java18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Planets {
	private String panetName;
	private int numberOfmoons;
	private boolean rings;
	private List<String> surafaceGases;
	
	public Planets(String panetName,List<String> surafaceGase,int numberOfmoons, boolean rings) {
		super();
		this.panetName = panetName;
		this.numberOfmoons = numberOfmoons;
		this.rings = rings;
		this.surafaceGases = surafaceGases;
	}
	
	public Planets() {
		
	}
	public String getPanetName() {
		return panetName;
	}
	public void setPanetName(String panetName) {
		this.panetName = panetName;
	}
	public int getNumberOfmoons() {
		return numberOfmoons;
	}
	public void setNumberOfmoons(int numberOfmoons) {
		this.numberOfmoons = numberOfmoons;
	}
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	public List<String> getSurafaceGases() {
		return surafaceGases;
	}
	public void setSurafaceGases(List<String> surafaceGases) {
		this.surafaceGases = surafaceGases;
	}


	public static void main(String[] args) {
		Planets obj = new Planets("mercury", null, 0, false);
		Planets obj2 = new Planets("venus", Arrays.asList("Carbon Dioxide", "Nitrogen"), 0, false);
		Planets obj3 = new Planets("earth", Arrays.asList("Nitrogen", "Oxygen"), 1, false);
		Planets obj4 = new Planets("jupitor", Arrays.asList("Hydrogen", "Helium"), 79, true);
		Planets obj5 = new Planets("saturn", Arrays.asList("Hydrogen", "Helium"), 83, true);
		Planets obj6 = new Planets("Uranus", Arrays.asList("Hydrogen", "Helium", "Methane"), 27, true);
		
		List <Planets> list = new ArrayList<Planets>();
		list.add(obj);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		
		Planets planet = new Planets();
		int moonCount=planet.getMoonCount(list);
		System.out.println("Moon count :" + moonCount);
		String gas=planet.findGas(list);
		System.out.println("Gas name is :" + gas);
		
	}
		public int getMoonCount(List <Planets> list){
			int count=0;
			for(Planets planet : list){
			if(planet.isRings()){
			count= count +planet.getNumberOfmoons();
			}
			
			
	}
			return count;
}
		
		public String findGas(List <Planets> list){
			Map <String, Integer> map = new TreeMap<String, Integer>();
			int count=1;
			String gasName="";
			for(Planets planet : list){
				if(null !=planet.surafaceGases ) {
				for (int i=0; i<planet.getSurafaceGases().size();i++)
				map.put(planet.getSurafaceGases().get(i), count);
			count++;
			}
			
			for (Entry<String, Integer> entry : map.entrySet()) {
				for(int i=map.size(); i>0; i--) {
				gasName = entry.getKey();
				continue;
				}
			}
			}
			return gasName;
			}
}

