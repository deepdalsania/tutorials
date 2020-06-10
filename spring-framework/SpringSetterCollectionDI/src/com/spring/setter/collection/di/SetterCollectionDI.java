package com.spring.setter.collection.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SetterCollectionDI {

	private List<String> langList;
	private Set<String> keys;
	private Map<String, Object> resultMap;
	private Properties props;

	public List<String> getLangList() {
		return langList;
	}

	public void setLangList(List<String> langList) {
		this.langList = langList;
	}

	public Set<String> getKeys() {
		return keys;
	}

	public void setKeys(Set<String> keys) {
		this.keys = keys;
	}

	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void displayData() {
		System.out.println("<---- List of languages ---->");
		langList.forEach(lang -> System.out.println(lang));
		System.out.println("<---- Set of keys using ---->");
		keys.stream().forEach(System.out::println);
		System.out.println("<---- Map of keys and values ---->");
		resultMap.forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println("<---- Properties of keys and values ---->");
		props.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}
