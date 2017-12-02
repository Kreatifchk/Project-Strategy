﻿package initialize;

import javax.swing.ImageIcon;

public class TilesImage {
	
	//Улица
	public static ImageIcon grass, grassFire, three, water, mount,
	brickWallP, brickWall, three2, water1, grassDark, threeDark, threeDark2, well;
	
	//Дороги
	public static ImageIcon townRoad, path, brickPath, brickPathG, bridge;
	
	//Здания
	public static ImageIcon home01, home02, home03, homeFire;
	
	//Внутри дома
	public static ImageIcon homeWall, flooring, homeWallRigth, homeWallLeft,
	flooringRigth, flooringLeft, voidI, window;
	
	public static ImageIcon[] allImage = new ImageIcon[30];
	
	public String file = "/base/res/Image/Tiles/";
	
	public TilesImage() {
		grass = new ImageIcon(getClass().getResource(file + "grass.png"));
		grassFire = new ImageIcon(getClass().getResource(file + "Animate/GrassFire/1.png"));
		three = new ImageIcon(getClass().getResource(file + "three.png"));
		water  = new ImageIcon(getClass().getResource(file + "water.png"));
		mount  = new ImageIcon(getClass().getResource(file + "mount.png"));
		brickWallP = new ImageIcon(getClass().getResource(file + "brickWallP.png"));
		brickWall = new ImageIcon(getClass().getResource(file + "brickWall.png"));
		three2 = new ImageIcon(getClass().getResource(file + "three2.png"));
		water1 = new ImageIcon(getClass().getResource(file + "water1.png"));
		grassDark = new ImageIcon(getClass().getResource(file + "grassDark.png"));
		threeDark = new ImageIcon(getClass().getResource(file + "threeDark.png"));
		threeDark2 = new ImageIcon(getClass().getResource(file + "three2Dark.png"));
		well = new ImageIcon(getClass().getResource(file + "well.png"));
		
		townRoad = new ImageIcon(getClass().getResource(file + "townRoad.png"));
		brickPath  = new ImageIcon(getClass().getResource(file + "brickPath.png"));
		brickPathG  = new ImageIcon(getClass().getResource(file + "brickPathG.png"));
		bridge  = new ImageIcon(getClass().getResource(file + "bridge.png"));
		path = new ImageIcon(getClass().getResource(file + "path.png"));
		
		home01 = new ImageIcon(getClass().getResource(file + "TilesBuilding/home01.png"));
		home02 = new ImageIcon(getClass().getResource(file + "TilesBuilding/home02.png"));
		home03 = new ImageIcon(getClass().getResource(file + "TilesBuilding/home03.png"));
		homeFire = new ImageIcon(getClass().getResource(file + "TilesBuilding/homeFire.png"));
		
		flooring = new ImageIcon(getClass().getResource(file + "flooring.png"));
		homeWall = new ImageIcon(getClass().getResource(file + "HomeWall.png"));
		homeWallRigth = new ImageIcon(getClass().getResource(file + "HomeWallRight.png"));
		flooringRigth = new ImageIcon(getClass().getResource(file + "flooringRigth.png"));
		homeWallLeft = new ImageIcon(getClass().getResource(file + "HomeWallLeft.png"));
		flooringLeft = new ImageIcon(getClass().getResource(file + "flooringLeft.png"));
		voidI = new ImageIcon(getClass().getResource(file + "void.png"));
		window = new ImageIcon(getClass().getResource(file + "window.png"));
		
		massiv();
	}
	
	private void massiv() {
		allImage[0] = grass;
		allImage[1] = path;
		allImage[2] = three;
		allImage[3] = water;
		allImage[4] = mount;
		allImage[5] = home01;
		allImage[6] = brickPath;
		allImage[7] = brickWallP;
		allImage[8] = brickWall;
		allImage[9] = brickPathG;
		allImage[10] = bridge;
		allImage[11] = three2;
		allImage[12] = water1;
		allImage[13] = home02;
		allImage[14] = home03;
		allImage[15] = homeFire;
		allImage[16] = flooring;
		allImage[17] = homeWall;
		allImage[18] = homeWallRigth;
		allImage[19] = flooringRigth;
		allImage[20] = homeWallLeft;
		allImage[21] = flooringLeft;
		allImage[22] = voidI;
		allImage[23] = window;
		allImage[24] = grassDark;
		allImage[25] = threeDark;
		allImage[26] = threeDark2;
		allImage[27] = grassFire;
		allImage[28] = well;
		allImage[29] = townRoad;
		
	}
	
}
