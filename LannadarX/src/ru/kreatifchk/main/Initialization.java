package ru.kreatifchk.main;

import ru.kreatifchk.game.MonsterList;
import ru.kreatifchk.game.TilesList;

public class Initialization {
	
	public Initialization() {
		new TilesList();
		new Fonts();
		new ImageInit();
		
		new MonsterList();
	}
	
}