/*******************************************************************************
 * Copyright 2017 Cognizant Technology Solutions
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package com.cognizant.devops.platformengine.modules.correlation;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * 
 * @author Vishal Ganjare (vganjare)
 * 
 * Entry point for correlation executor.
 *
 */
public class EngineCorrelatorModule implements Job{
	private static boolean isCorrelationExecutionInProgress = false;
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		if(!isCorrelationExecutionInProgress) {
			isCorrelationExecutionInProgress = true;
			CorrelationExecutor correlationsExecutor = new CorrelationExecutor();
			correlationsExecutor.execute();
			isCorrelationExecutionInProgress = false;
		}
	}
}
