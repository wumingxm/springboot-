package com.springcloud.sluth.demo.vo;

import java.io.Serializable;
import java.util.Map;

public class MapVO implements Serializable{
	private Map<String,Object>map;

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "MapVO [map=" + map + "]";
	}
	
	
}
