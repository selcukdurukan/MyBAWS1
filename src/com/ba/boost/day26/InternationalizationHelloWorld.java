package com.ba.boost.day26;

public class InternationalizationHelloWorld {

	public static void main(String[] args) {
		
		parseProgramArguments(args);
		conservation();

	}

	private static void parseProgramArguments(String[] args) {
		
		System.out.println(args.length); // 0' sa sadece 0 tane argument var demek.
		if (args.length != 1 ) {
			System.err.println("Beklenen arguman sayisi 1, ancak sunulan arguman sayisi " +args.length);
			System.exit(0);  //0 Her zaman sorunsuz bir bitis demektir. 0 harici her değer bir hata anlamına gelir.
		}
		// run configutration args = 'turkce'. 
		if (args[0].equalsIgnoreCase("Avusturyaca")) {		//messages_de'ye gider, messages_de_AT yok.
			Messages.init("de", "AT");
		} else if(args[0].equalsIgnoreCase("Almanca")) {	//messages_de'ye gider, messages_de_DE yok.
			Messages.init("de", "DE");
		} else if(args[0].equalsIgnoreCase("Amerikanca")) {	//messages_en' e gider messages_en_US yok.
			Messages.init("en", "US");
		} else if(args[0].equalsIgnoreCase("Ingilizce")) {  //messages_en' e gider en_EN yok.
			Messages.init("en", "EN");
		} else if(args[0].equalsIgnoreCase("Turkce")) {		//En tepedeki messages properties'e gider, eger messages_tr_TR bulamazsa.
			Messages.init("tr", "TR");
		} 
	}

	private static void conservation() {
		System.out.println(Messages.getString("InternationalizationHelloWorld.HELLO")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalizationHelloWorld.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalizationHelloWorld.SPLITTER")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalizationHelloWorld.THANK_YOU")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalizationHelloWorld.SPLITTER")); //$NON-NLS-1$
		System.out.println(Messages.getString("InternationalizationHelloWorld.SEE_YOU_AGAIN")); //$NON-NLS-1$
	}

}
