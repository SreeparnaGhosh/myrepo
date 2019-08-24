package polymorphism.instrument.play;

public class TestInstrumentPlay {

	public static void main(String[] args) {
		Instrument instruments[]  = new Instrument[10];

		instruments[0] = new Piano();
		instruments[1] = new Flute();
		instruments[2] = new Guitar();
		instruments[3] = new Piano();
		instruments[4] = new Flute();
		instruments[5] = new Guitar();
		instruments[6] = new Piano();
		instruments[7] = new Flute();
		instruments[8] = new Guitar();
		instruments[9] = new Piano();
		
		for(Instrument instrument : instruments) {
			instrument.play();
		}
	}
}
