package org.ittek14.nekoden.resource;

import java.util.ArrayList;

public class ResourceManager {
	
	public static ArrayList<Resource> resources;
	
	public ResourceManager() {
		resources.add(new ImageResource("resources/sprite.png"));
	}
}