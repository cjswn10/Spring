package com.bit.exam10;

import java.util.List;

public class ProtocolHandler {
	private List<Filter> filters;

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}
	
	public void pro() {
		for(Filter f : filters) {
			f.filter();
		}
	}
	
}
