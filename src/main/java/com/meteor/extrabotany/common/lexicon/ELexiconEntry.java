package com.meteor.extrabotany.common.lexicon;

import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.common.lexicon.BLexiconEntry;

import com.meteor.extrabotany.ExtraBotany;

public class ELexiconEntry extends BLexiconEntry{
	
	public ELexiconEntry(String unlocalizedName, LexiconCategory category) {
		super(unlocalizedName, category);
		setKnowledgeType(ExtraBotany.extraKnowledge);
	}
}
