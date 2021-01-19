package org.matsim.contrib.drt.run.examples;

import com.google.common.base.Preconditions;
import org.apache.logging.log4j.core.util.IOUtils;
import org.matsim.contrib.drt.analysis.zonal.DrtZonalSystemParams;
import org.matsim.contrib.drt.optimizer.rebalancing.RebalancingParams;
import org.matsim.contrib.drt.optimizer.rebalancing.mincostflow.MinCostFlowRebalancingStrategyParams;
import org.matsim.contrib.drt.optimizer.rebalancing.plusOne.PlusOneRebalancingStrategyParams;
import org.matsim.contrib.drt.run.DrtConfigGroup;
import org.matsim.contrib.drt.run.DrtControlerCreator;
import org.matsim.contrib.drt.run.MultiModeDrtConfigGroup;
import org.matsim.contrib.drt.run.RunDrtScenario;
import org.matsim.contrib.dvrp.run.DvrpConfigGroup;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.vis.otfvis.OTFVisConfigGroup;

import java.net.MalformedURLException;
import java.net.URL;

public class MyRun {
	public static void main(String[] args) {

		//RunDrtScenario.run(args[0], false);
		String configFile = "multi_mode_one_shared_taxi_config.xml";

		Config config = ConfigUtils.loadConfig(configFile, new MultiModeDrtConfigGroup(), new DvrpConfigGroup(),
				new OTFVisConfigGroup());

		DrtConfigGroup drtConfigGroup = MultiModeDrtConfigGroup.get(config).getModalElements().stream().findAny().orElseThrow();
		RebalancingParams params = new RebalancingParams();
		params.addParameterSet( new PlusOneRebalancingStrategyParams());
		DrtZonalSystemParams zonenParams = new DrtZonalSystemParams();
		zonenParams.setZonesGeneration( DrtZonalSystemParams.ZoneGeneration.GridFromNetwork );
		zonenParams.setCellSize( 500. );

		drtConfigGroup.addParameterSet( params );
		drtConfigGroup.addParameterSet( zonenParams );

		DrtControlerCreator.createControler(config, false).run();
		//RunDrtScenario.run(configFile, false);
	}

}
