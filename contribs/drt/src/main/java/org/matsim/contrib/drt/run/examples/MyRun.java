package org.matsim.contrib.drt.run.examples;

import com.google.common.base.Preconditions;
import org.apache.logging.log4j.core.util.IOUtils;
import org.matsim.contrib.drt.run.RunDrtScenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;

import java.net.MalformedURLException;
import java.net.URL;

public class MyRun {
	public static void main(String[] args) {

		//RunDrtScenario.run(args[0], false);
		String configFile = "multi_mode_one_shared_taxi_config.xml";

		RunDrtScenario.run(configFile, false);
	}

}
