package playground.kai.bvwp;

import playground.kai.bvwp.Values.Entry;
import playground.kai.bvwp.Values.Mode;
import playground.kai.bvwp.Values.Type;

class EconomicValues {

	static Values createEconomicValues1() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType pvValues = roadValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.23 ) ;
				pvValues.setByEntry( Entry.hrs, -5.00 ) ;
			}
			{
				ValuesForAUserType gvValues = roadValues.getByType(Type.GV) ;
				gvValues.setByEntry( Entry.km, -1.00 ) ;
				gvValues.setByEntry( Entry.hrs, -0.00 ) ;
			}
		}
		{
			ValuesForAMode railValues = economicValues.getByMode(Mode.rail) ;
			{
				ValuesForAUserType pvValues = railValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.1 ) ;
				pvValues.setByEntry( Entry.hrs, -5.00 ) ;
			}
			{
				ValuesForAUserType gvValues = railValues.getByType(Type.GV) ;
				gvValues.setByEntry( Entry.km, -0.1 ) ;
				gvValues.setByEntry( Entry.hrs, -0.00 ) ;
			}
		}
	
		return economicValues ;
	}

	static Values createEconomicValues2() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType pvValues = roadValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.0 ) ;
				pvValues.setByEntry( Entry.hrs, -18.00 ) ;
			}
		}
		{
			ValuesForAMode railValues = economicValues.getByMode(Mode.rail) ;
			{
				ValuesForAUserType pvValues = railValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.1 ) ;
				pvValues.setByEntry( Entry.hrs, -18.00 ) ;
			}
		}
	
		return economicValues ;
	}

	static Values createEconomicValues3() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType gvValues = roadValues.getByType(Type.GV) ;
				gvValues.setByEntry( Entry.km, -0.00 ) ;
				gvValues.setByEntry( Entry.hrs, -0.00 ) ;
			}
		}
		{
			ValuesForAMode railValues = economicValues.getByMode(Mode.rail) ;
			{
				ValuesForAUserType gvValues = railValues.getByType(Type.GV) ;
				gvValues.setByEntry( Entry.km, -5. ) ;
				gvValues.setByEntry( Entry.hrs, -0.00 ) ;
			}
		}
	
		return economicValues ;
	}
	
	static Values createEconomicValuesFolienMann() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType pvCommercialValues = roadValues.getByType(Type.PV_COMMERCIAL) ;
				pvCommercialValues.setByEntry( Entry.km, -0.00 ) ;
				pvCommercialValues.setByEntry( Entry.hrs, -23.50 ) ;
			}
			{
				ValuesForAUserType pvValues = roadValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.0 ) ;
				pvValues.setByEntry( Entry.hrs, -6.30 ) ;
			}
			
			economicValues.setValuesForMode( Mode.rail, roadValues.createDeepCopy() ) ;
		}
		return economicValues ;
	}

	/**
	 * I think that a test depends on this one here.  kai, jul'12
	 */
	static Values createEconomicValuesForTest1() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType pvValues = roadValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.23 ) ;
				pvValues.setByEntry( Entry.hrs, -5.00 ) ;
			}
			{
				ValuesForAUserType gvValues = roadValues.getByType(Type.GV) ;
				gvValues.setByEntry( Entry.km, -1.00 ) ;
				gvValues.setByEntry( Entry.hrs, -0.00 ) ;
			}
		}
		{
			ValuesForAMode railValues = economicValues.getByMode(Mode.rail) ;
			{
				ValuesForAUserType pvValues = railValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.1 ) ;
				pvValues.setByEntry( Entry.hrs, -5.00 ) ;
			}
			{
				ValuesForAUserType gvValues = railValues.getByType(Type.GV) ;
				gvValues.setByEntry( Entry.km, -0.1 ) ;
				gvValues.setByEntry( Entry.hrs, -0.00 ) ;
			}
		}
	
		return economicValues ;
	}

	static Values createEconomicValuesAP200PV() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType pvValues = roadValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.50 ) ;
				pvValues.setByEntry( Entry.hrs, -6.00 ) ;
			}
		}
		{
			ValuesForAMode railValues = economicValues.getByMode(Mode.rail) ;
			{
				ValuesForAUserType pvValues = railValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.1 ) ;
				pvValues.setByEntry( Entry.hrs, -6.00 ) ;
			}
		}
	
		return economicValues ;
	}

	static Values createEconomicValuesFictiveExamplePV() {
		Values economicValues = new Values() ;
		{
			ValuesForAMode roadValues = economicValues.getByMode(Mode.road) ;
			{
				ValuesForAUserType pvValues = roadValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.28 ) ;
				pvValues.setByEntry( Entry.hrs, -18.00 ) ;
			}
		}
		{
			ValuesForAMode railValues = economicValues.getByMode(Mode.rail) ;
			{
				ValuesForAUserType pvValues = railValues.getByType(Type.PV_NON_COMMERCIAL) ;
				pvValues.setByEntry( Entry.km, -0.1 ) ;
				pvValues.setByEntry( Entry.hrs, -18.00 ) ;
			}
		}
	
		return economicValues ;
	}

}
