/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.auth0.samples.spring.session;

import org.primefaces.event.ReorderEvent;
import org.springframework.beans.factory.annotation.Value;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class HomeBean implements Serializable {

	@Value("${application.title}")
	private String applicationTitle;

	private static final long serialVersionUID = 1L;

	private List<Product> products = new ArrayList<>();

	public HomeBean() {
		products.add(new Product("Product A", BigDecimal.valueOf(1)));
		products.add(new Product("Product B", BigDecimal.valueOf(2)));
		products.add(new Product("Product C", BigDecimal.valueOf(3)));
		products.add(new Product("Product D", BigDecimal.valueOf(4)));
		products.add(new Product("Product E", BigDecimal.valueOf(5)));
	}

	public void onRowReorder(ReorderEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Row Moved",
				"Request handled by: " + applicationTitle);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Product> getProducts() {
		return products;
	}

	public String getApplicationTitle() {
		return applicationTitle;
	}
}
