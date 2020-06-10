package com.spring.setter.collection.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetterRefCollectionDI {

	/*
	 * Note: If you are using collection with reference bean and also provide value
	 * then use Object instead of specific class like this private List<Object>
	 * langList; also same as for aa the collections
	 */
	private List<ReferenceList> langList;
	private Set<ReferenceSet> keys;
	private Map<ReferenceKeyMap, ReferenceValueMap> resultMap;

	public List<ReferenceList> getLangList() {
		return langList;
	}

	public void setLangList(List<ReferenceList> langList) {
		this.langList = langList;
	}

	public Set<ReferenceSet> getKeys() {
		return keys;
	}

	public void setKeys(Set<ReferenceSet> keys) {
		this.keys = keys;
	}

	public Map<ReferenceKeyMap, ReferenceValueMap> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<ReferenceKeyMap, ReferenceValueMap> resultMap) {
		this.resultMap = resultMap;
	}

	public void displayData() {
		System.out.println("<---- List of languages using reference bean ---->");
		langList.forEach(lang -> System.out.println(lang));
		System.out.println("<---- Set of keys using reference bean ---->");
		keys.stream().forEach(System.out::println);
		System.out.println("<---- Map of keys and values using reference bean ---->");
		resultMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
