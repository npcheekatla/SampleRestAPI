package com.rackspace.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class WordReverse {
	@Path("/{Words}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String convertFtoCfromInput(@PathParam("Words") String content) {
 
		String words[] = content.split("\\s");
		String finalSentence = "";
		System.out.println("Length of the sentence : " + words.length);

		for (int index = 0; index < words.length; index++) {
			if (index == words.length - 1)
				finalSentence = words[index] + finalSentence;
			else
				finalSentence = " " + words[index] + finalSentence;
		}
		System.out.print("Final content which we reversed : " + finalSentence);
		return finalSentence;
	}
}
