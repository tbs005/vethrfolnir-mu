/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.vethrfolnir.game.util;

/**
 * @author Vlad
 *
 */
public class MuUtils {

	public static double distanceSquared(int x1, int y1, int x2, int y2)
	{
		int dx =  x1 - x2;
		int dy =  y1 - y2;

		return Math.sqrt((dx * dx) + (dy * dy));
	}
}