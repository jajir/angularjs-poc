package cz.grr.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cz.grr.dto.Greeting;

@RestController
public class FirstRest {
	public static final String LOREM_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin sem mi, pellentesque eget nibh eget, sagittis feugiat risus. Mauris non sem eleifend turpis cursus imperdiet. Mauris sed semper metus, id blandit lectus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Donec posuere mattis felis, quis mattis quam eleifend posuere. Aliquam erat volutpat. Nunc ac massa quis quam maximus consectetur. Aliquam semper justo id quam ullamcorper, eu finibus mauris suscipit. In eget tellus id lacus scelerisque commodo iaculis eu est. Maecenas diam dui, scelerisque in lorem a, egestas viverra lacus. Donec pharetra sagittis nibh et interdum. Morbi a ullamcorper ex, sed aliquam tortor. Quisque condimentum nulla ut ligula accumsan venenatis. Vivamus sed aliquet mauris, a sodales augue. Donec molestie ut nisi et dapibus.";

	@RequestMapping("/greeting/{id}")
	public Greeting getGreeting(@PathVariable("id") Integer id) {
		Greeting greeting = new Greeting();
		greeting.setId(id);
		int i = (int) (Math.random() * LOREM_IPSUM.length());
		greeting.setGreeting(LOREM_IPSUM.substring(0, i));
		return greeting;
	}

	@RequestMapping("/greeting")
	public Greeting getGreeting() {
		return getGreeting(1);
	}

	@RequestMapping("/greetingList")
	public @ResponseBody List<Greeting> getGreetings() {
		List<Greeting> greetings = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			Greeting greeting = new Greeting();
			greeting.setId(i);
			greeting.setGreeting(LOREM_IPSUM);

			greetings.add(greeting);
		}
		return greetings;

	}
}
