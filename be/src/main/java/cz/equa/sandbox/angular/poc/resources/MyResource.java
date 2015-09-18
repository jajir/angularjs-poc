package cz.equa.sandbox.angular.poc.resources;

import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.common.collect.Lists;

import cz.equa.sandbox.angular.poc.model.Article;
import cz.equa.sandbox.angular.poc.model.MyList;

@Path("/articles")
public class MyResource {

	@GET()
	@Path("/about")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return "This service allows to manipulate with articles.";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public MyList getList() {
		List<Integer> out = Lists.newArrayList(1, 2);
		return new MyList(out);

	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Article getArticle(@PathParam("id") Integer id) {
		System.out.println("article: " + id);
		Article a = new Article();
		a.setId(1);
		a.setName("O pejskovi a kocicce");
		a.setCreationDate(new Date());
		a.setPerex("Jak pejsek a kocicka varili dort a co je pri tom potkalo.");
		return a;
	}

}
