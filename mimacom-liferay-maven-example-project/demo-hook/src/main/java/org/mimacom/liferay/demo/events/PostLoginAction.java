package org.mimacom.liferay.demo.events;

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

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostLoginAction extends Action {

    @Override
    public void run(HttpServletRequest request, HttpServletResponse response)
            throws ActionException {
		_log.info("Running....");

      /*  try {
            User user = PortalUtil.getUser(request);
            response.sendRedirect( "/user/" + user.getScreenName());

        } catch (SystemException e) {
            _log.error(e);
        } catch (IOException e) {
            _log.error(e);
        } catch (PortalException e) {
            _log.error(e);
        }*/
    }

    Log _log = LogFactoryUtil.getLog(PostLoginAction.class);

}
