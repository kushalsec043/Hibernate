package com.telusko.demorest;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("aliens")
public class AlienResource
{
	AlienRepository repo = new AlienRepository();
	
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public List<Alien> getAliens() throws SQLException
{
	System.out.println("getAlien called...");
	return repo.getAliens();
}

@GET
@Path("alien/{name}")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien getAlien(@PathParam("name") String name) throws SQLException
{
	System.out.println("getAlien called...");
	return repo.getAlien(name);
}

@POST
@Path("alien")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien createAlien(Alien a1) throws SQLException
{
	repo.create(a1);
	return a1;
}

@PUT
@Path("alien")
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public Alien updatealien(Alien a1) throws SQLException
{
	if(repo.getAlien(a1.getName()).getName() == "")
	{
		repo.create(a1);
	}
	else
	{
	repo.Update(a1);
	}
	return a1;
}

@DELETE
@Path("alien/{name}")
public Alien deletealien(@PathParam("name") String name) throws SQLException
{
	Alien a = repo.getAlien(name);
	
	if(a.getName() != "")
	{
	repo.delete(name);
	}
	return a;
}

}
