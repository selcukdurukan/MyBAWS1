package com.ba.boost.day27.tender;

import com.ba.boost.day27.tender.i18n.Messages;

public enum Material {

	STEEL(Messages.getString("Materials.STEEL")), TIMBER(Messages.getString("Materials.TIMBER")),
	MASONRY(Messages.getString("Materials.MASONRY"));

	private String localName;

	private Material(String localName) {
		this.localName = localName;
	}

	public static Material getMaterialByLocalName(String localName) throws MaterialNotFoundException {

		if (localName.equalsIgnoreCase(STEEL.localName)) {
			return STEEL;
		}
		if (localName.equalsIgnoreCase(TIMBER.localName)) {
			return TIMBER;
		}
		if (localName.equalsIgnoreCase(MASONRY.localName)) {
			return MASONRY;
		}
		throw new MaterialNotFoundException("Material not found <<< " + localName + " >>>");

	}

}
