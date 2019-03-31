package com.rule14.TestCases;

import org.testng.annotations.Test;

import com.rule14.Application.FlightFinder;

public class FindFlightTest
{
  @Test
  public void twoRoundTripEconomyClassTickets() throws InterruptedException
  {
	  FlightFinder flightfind=new FlightFinder();
	  flightfind.getEconomyClassTicket();
  }
  
  @Test
  public void twoOneWayFourfirstClassTickets() throws InterruptedException
  {
	  FlightFinder flightfind=new FlightFinder();
	  flightfind.getFirstClassTicket();
  }
  
  @Test
  public void twoOneWayFiveBusinessClassTickets() throws InterruptedException
  {
	  FlightFinder flightfind=new FlightFinder();
	  flightfind.getBusinessClassTicket();
  }
  
}
