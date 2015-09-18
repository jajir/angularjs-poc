package cz.equa.sandbox.angular.poc.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.MoreObjects;

@XmlRootElement
public class Article {

	private Integer id;
	private String name;
	private String perex;
	private Date creationDate;
	private Date updateDate;

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(Article.class).add("id", id)
				.add("name", name).add("creationDate", creationDate)
				.add("updateDate", updateDate).toString();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the perex
	 */
	public String getPerex() {
		return perex;
	}

	/**
	 * @param perex
	 *            the perex to set
	 */
	public void setPerex(String perex) {
		this.perex = perex;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
