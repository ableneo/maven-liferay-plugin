package org.mimacom.liferay.demo.events;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Theme;
import com.liferay.portal.service.ThemeLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

public class PreRequestAction extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		

	}
	

	Log _log = LogFactoryUtil.getLog(PreRequestAction.class);

}