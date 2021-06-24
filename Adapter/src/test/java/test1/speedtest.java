package test1;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import fast.BugattiVeyron;
import fast.Movable;
import fast.MovableAdapter;
import fast.MovableAdapterImpl;

public class speedtest {
	 @Test 
	 public void whenConvertingMPHToKMPH_thenSuccessfullyConverted()
	 { Movable bugattiVeyron = new BugattiVeyron();
	 MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
	 assertEquals(bugattiVeyronAdapter.getSpeed(), 321.868, 0.00001);
	 }
	 @Test 
	 public void TestPrice()
	 { Movable bugattiVeyron = new BugattiVeyron();
	 MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
	 assertEquals(bugattiVeyronAdapter.getPrice(), 920000, 0.00001);
	 }
}
