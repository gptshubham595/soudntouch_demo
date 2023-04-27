package net.surina.soundtouch;

import java.io.IOException;


public interface AudioDecoder
{
	int getChannels() throws IOException;
	long getPlayedDuration();
	long getDuration();
	int getSamplingRate() throws IOException;
	void close();
	boolean decodeChunk();
	boolean sawOutputEOS();
	void seek(long timeInUs, boolean shouldFlush);
	void resetEOS();
	byte[] getLastChunk();
}
