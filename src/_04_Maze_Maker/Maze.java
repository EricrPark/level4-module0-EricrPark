package _04_Maze_Maker;

import java.awt.Graphics;

import _03_Conways_Game_of_Life.Cell;

public class Maze {
	// 1. Create a 2D array of cells. Don't initialize it.
	Cell[][] cells;
	private int width;
	private int height;

	public Maze(int w, int h) {
		this.width = w;
		this.height = h;

		// 2. Initialize the cells using the width and height varibles
		cells = new Cell[width][height];
		// 3. Iterated through each cell and initialize it
		// using i and j as the location
		for (Cell[] i : cells) {
			for (Cell j : i) {
				j = new Cell(width, height);
			}
		}
	}

	// 4. This method iterates through the cells and draws them
	public void draw(Graphics g) {

	}

	// 4b. This method returns the selected cell.
	public Cell getCell(int x, int y) {
		return null;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
