/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.openhmis.pharmacy.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.openmrs.module.openhmis.pharmacy.web.PharmacyWebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(PharmacyWebConstants.PHARMACY_PAGE)
public class PharmacyPageController {
	@RequestMapping(method = RequestMethod.GET)
	public void pharmacy(ModelMap model, HttpServletRequest request) {
		
	}
}
