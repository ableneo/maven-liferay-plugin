package org.mimacom.commons.liferay.adapter620cega1;

/*
 * Copyright (c) 2014 mimacom a.g.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.liferay.portal.kernel.plugin.PluginPackage;
import com.liferay.portal.tools.deploy.HookDeployer;

import java.io.File;
import java.util.Collections;

public class StandaloneHookDeployer extends HookDeployer {
	public StandaloneHookDeployer(String serverType) {
		appServerType = serverType;
		jars = Collections.emptyList();
	}

	/**
	 * @see com.liferay.portal.tools.deploy.HookDeployer#getExtraContent(double,
	 *      java.io.File, String)
	 */
	@Override
	public String getExtraContent(double webXmlVersion, File srcFile,
			String displayName) throws Exception {
		StringBuilder content = new StringBuilder(super.getExtraContent(
				webXmlVersion, srcFile, displayName));
		LiferayToolsImpl.addExtraContent(appServerType, content);
		return super.getExtraContent(webXmlVersion, srcFile, displayName);
	}

	/**
	 * @see com.liferay.portal.tools.deploy.BaseDeployer#getDisplayName(java.io.File)
	 */
	@Override
	public String getDisplayName(File srcFile) {
		return super.getDisplayName(srcFile);
	}

	/**
	 * overwritten to make it visible
	 *
	 * @see com.liferay.portal.tools.deploy.BaseDeployer#deployFile
	 */
	public void deployFile(File srcFile, String specifiedContext)
			throws Exception {
		super.deployFile(srcFile, srcFile, srcFile, specifiedContext, unpackWar, null);
	}

	/**
	 * overwritten to make it visible
	 * 
	 * @see com.liferay.portal.tools.deploy.BaseDeployer#deployDirectory(java.io.File,
	 *      java.io.File, java.io.File, String, boolean,
	 *      com.liferay.portal.kernel.plugin.PluginPackage)
	 */
	@Override
	public void deployDirectory(File srcFile, File mergeDir, File deployDir,
			String displayName, boolean overwrite, PluginPackage pluginPackage)
			throws Exception {
		super.deployDirectory(srcFile, null, null, displayName, overwrite,
				pluginPackage);
	}
}
