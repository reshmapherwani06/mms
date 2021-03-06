/*******************************************************************************
 * Copyright 2018 Dsilva Software Solution
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
 *	ApplicationFormDao.java
 *	21-Jul-2018
 *	marsh
 *	2018
 *	
 * SRNo		Name					Date 		Tag					Comment			
 ******************************************************************************/
/**
 * 
 */
package com.dsilva.mms.web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author marsh
 *
 * Db related methods to be added to this class for customisation
 */
@Repository
@Transactional
public class ApplicationFormDao<T> extends BaseEntityDao<T> {


	
	/**
	 * 
	 */
	public ApplicationFormDao() {
		
		
	}

	
	
}
