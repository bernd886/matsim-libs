/* *********************************************************************** *
 * project: org.matsim.*
 * HbefaWarmEmissionFactorKey.java
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2009 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */
package org.matsim.contrib.emissions;

/**
 * @author benjamin
 *
 */
class HbefaWarmEmissionFactorKey {
	
	private HbefaVehicleCategory hbefaVehicleCategory;
	private Pollutant hbefaComponent;
	private String hbefaRoadCategory;
	private HbefaTrafficSituation hbefaTrafficSituation;
	private HbefaVehicleAttributes hbefaVehicleAttributes = new HbefaVehicleAttributes();

	/*package-private*/ HbefaWarmEmissionFactorKey(){
	}

    public HbefaWarmEmissionFactorKey(HbefaWarmEmissionFactorKey key) {
        this.hbefaVehicleCategory = key.hbefaVehicleCategory;
        this.hbefaComponent = key.hbefaComponent;
        this.hbefaRoadCategory = key.hbefaRoadCategory;
        this.hbefaVehicleAttributes = key.hbefaVehicleAttributes;
        this.hbefaTrafficSituation = key.hbefaTrafficSituation;
    }

    HbefaVehicleCategory getHbefaVehicleCategory() {
		return this.hbefaVehicleCategory;
	}

	public void setHbefaVehicleCategory(HbefaVehicleCategory hbefaVehicleCategory) {
		this.hbefaVehicleCategory = hbefaVehicleCategory;
	}

	/* package-private */ Pollutant getHbefaComponent(){
		return this.hbefaComponent;
	}

	public void setHbefaComponent( Pollutant warmPollutant ) {
		this.hbefaComponent = warmPollutant;
	}

	@Deprecated // for refactoring
	public void setHbefaComponent( String warmPollutant ) {
		this.hbefaComponent = Pollutant.valueOf( warmPollutant ) ;
	}

	String getHbefaRoadCategory() {
		return this.hbefaRoadCategory;
	}

	/*package-private*/ void setHbefaRoadCategory(String hbefaRoadCategory) {
		this.hbefaRoadCategory = hbefaRoadCategory;
	}

	/*package-private*/ HbefaTrafficSituation getHbefaTrafficSituation() {
		return this.hbefaTrafficSituation;
	}

	/*package-private*/ void setHbefaTrafficSituation(HbefaTrafficSituation hbefaTrafficSituation) {
		this.hbefaTrafficSituation = hbefaTrafficSituation;
	}

	/*package-private*/ HbefaVehicleAttributes getHbefaVehicleAttributes(){
		return this.hbefaVehicleAttributes;
	}
	
	public void setHbefaVehicleAttributes(HbefaVehicleAttributes hbefaVehicleAttributes) {
		this.hbefaVehicleAttributes = hbefaVehicleAttributes;		
	}
	
	/* need to implement the "equals" method in order to be able to construct an "equal" key
	 later on (e.g. from data available in the simulation)*/
	@Override
	public boolean equals(Object obj) {
	        if(this == obj) {
	              return true;
	         }
	         if (!(obj instanceof HbefaWarmEmissionFactorKey)) {
	                return false; 
	         }
	         HbefaWarmEmissionFactorKey key = (HbefaWarmEmissionFactorKey) obj;
	         return
				 hbefaVehicleCategory.equals(key.getHbefaVehicleCategory())
	         && hbefaComponent.equals(key.getHbefaComponent())
	         && hbefaRoadCategory.equals(key.getHbefaRoadCategory())
	         && hbefaTrafficSituation.equals(key.getHbefaTrafficSituation())
	         && hbefaVehicleAttributes.equals(key.getHbefaVehicleAttributes());

	         // yy The "equals" need to remain there for the time being despite having moved to enums, since some of the tests depend
		// on the null pointer exception caused by "null.equals(...)" but not by "null == ...".  I can't say if this behavior is also used later in
		// the lookups.  kai, feb'20
	}

	// if "equals" is implemented, "hashCode also needs to be implemented
	@Override
	public int hashCode(){
		return toString().hashCode();
	}

	// needed for "hashCode" method
	@Override
	public String toString(){
		return
		  hbefaVehicleCategory + "; " 
		+ hbefaComponent + "; " 
		+ hbefaRoadCategory + "; " 
		+ hbefaTrafficSituation + "; "
		+ hbefaVehicleAttributes;
	}
}
