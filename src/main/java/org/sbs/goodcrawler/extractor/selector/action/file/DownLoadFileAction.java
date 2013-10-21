/**
 * ########################  SHENBAISE'S WORK  ##########################
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sbs.goodcrawler.extractor.selector.action.file;

import org.sbs.goodcrawler.extractor.selector.action.FileSelectAction;
import org.sbs.goodcrawler.extractor.selector.exception.DownLoadException;

/**
 * @author whiteme
 * @date 2013年10月20日
 * @desc 下载文件（必须同步进行，如果文件下载不完成，不能执行下面的不走）
 */
public class DownLoadFileAction extends FileSelectAction {
	
	/**
	 * 下载文件，返回文件路径
	 */
	@Override
	public String doAction(String remoteFile) throws DownLoadException {
		return null;
	}
	
	
}
