package com.auth0.samples.spring.session;

import org.primefaces.event.ReorderEvent;

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
				"Request handled by: " + getApplicationTitle());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<Product> getProducts() {
		return products;
	}

	public String getApplicationTitle() {
		String appTitle = System.getenv().get("APPLICATION_TITLE");
		if (appTitle == null) {
			appTitle = "default title";
		}
		return appTitle;
	}
}
