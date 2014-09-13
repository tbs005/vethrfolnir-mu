/*
 * This file is strictly bounded by the creators of Vethrfolnir and its prohibited
 * for commercial use, or any use what so ever.
 * Copyright © Vethrfolnir Project 2013
 */
package com.vethrfolnir.game.network.mu.send;

import io.netty.buffer.ByteBuf;

import java.nio.ByteOrder;

import com.vethrfolnir.game.entitys.ComponentIndex;
import com.vethrfolnir.game.entitys.GameObject;
import com.vethrfolnir.game.entitys.annotation.FetchIndex;
import com.vethrfolnir.game.entitys.components.CreatureState;
import com.vethrfolnir.game.entitys.components.Positioning;
import com.vethrfolnir.network.NetworkClient;
import com.vethrfolnir.network.WritePacket;

/**
 * @author Vlad
 *
 */
public class NpcInfo extends WritePacket {

	@FetchIndex
	private ComponentIndex<Positioning> pos;
	
	@FetchIndex
	private ComponentIndex<CreatureState> state;
	
	@Override
	public void write(NetworkClient context, ByteBuf buff, Object... params) {
		GameObject entity = as(params[0]);

		Positioning positioning = entity.get(pos);
		CreatureState cs = entity.get(state);
		
		writeArray(buff, 0xC2, 0x00, 0x0F, 0x13, 0x01); // size
		writeSh(buff, entity.getWorldIndex(), ByteOrder.BIG_ENDIAN);
		writeSh(buff, cs.getNpcId(), ByteOrder.BIG_ENDIAN);
		//writeC(_newNpc.getNpcId());
		//writeArray(_newNpc.getX(), _newNpc.getY(), _newNpc.getX(), _newNpc.getY());

		writeC(buff, positioning.getX());
		writeC(buff, positioning.getY());

		writeC(buff, positioning.getX()); // if moving
		writeC(buff, positioning.getY());
		
		writeC(buff, positioning.getHeading() << 4);
		writeC(buff, cs.getActiveEffect());
	}

}
