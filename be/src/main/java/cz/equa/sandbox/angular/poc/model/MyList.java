package cz.equa.sandbox.angular.poc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyList {

	private List<Integer> list;

	public MyList() {

	}

	public MyList(final List<Integer> list) {
		this.list = list;
	}

	/**
	 * @return the list
	 */
	public List<Integer> getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<Integer> list) {
		this.list = list;
	}
}
