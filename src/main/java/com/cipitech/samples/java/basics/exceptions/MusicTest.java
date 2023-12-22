package com.cipitech.samples.java.basics.exceptions;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Book: Head First Java
 * Chapter: 13
 */
public class MusicTest
{
	public static void main(String[] args)
	{
		MusicTest mt = new MusicTest();
		mt.play();
	}

	public void play()
	{
		try
		{
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
		}
		catch (MidiUnavailableException e)
		{
			System.out.println("Bummer");
		}
	}
}