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
package com.vethrfolnir.game.templates;


public class AccountCharacterInfo {
	public int charId;
	public int slot;
	public String name;
	public int level;
	public int access;
	public int classId;
	public static int[] _wearBytes = new int[] { 0xFF, 0xFF, 0xFF, 0xFF, 0xF3, 0x00, 0x00, 0x00, 0xF8, 0x00, 0x00, 0xF0, 0xFF, 0xFF, 0xFF, 0x00, 0x00 };
	public int[] wearBytes = _wearBytes;
	/**
	 * @return
	 */
	public static int[] getWearBytes() {
		return _wearBytes;
	}
	
}