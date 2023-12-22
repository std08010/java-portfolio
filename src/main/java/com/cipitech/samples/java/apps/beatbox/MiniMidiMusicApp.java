package com.cipitech.samples.java.apps.beatbox;

import javax.sound.midi.*;

/**
 * Book: Head First Java
 * Chapter: 13
 */
public class MiniMidiMusicApp
{
	public static void main(String[] args)
	{
		MiniMidiMusicApp mini = new MiniMidiMusicApp();
		if (args.length < 2)
		{
			System.out.println("Don’t forget the instrument and note args");
		}
		else
		{
			int instrument = Integer.parseInt(args[0]);
			int note = Integer.parseInt(args[1]);
			mini.play(instrument, note);
		}
	}

	public void play(int instrument, int note)
	{
		try
		{
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);

			Track track = seq.createTrack();

			ShortMessage msg1 = new ShortMessage();
			msg1.setMessage(ShortMessage.PROGRAM_CHANGE, 1, instrument, 0);
			MidiEvent changeInstrument = new MidiEvent(msg1, 1);
			track.add(changeInstrument);

			ShortMessage msg2 = new ShortMessage();
			msg2.setMessage(ShortMessage.NOTE_ON, 1, note, 100);
			MidiEvent noteOn = new MidiEvent(msg2, 1);
			track.add(noteOn);

			ShortMessage msg3 = new ShortMessage();
			msg3.setMessage(ShortMessage.NOTE_OFF, 1, note, 100);
			MidiEvent noteOff = new MidiEvent(msg3, 16);
			track.add(noteOff);

			player.setSequence(seq);
			player.start();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}