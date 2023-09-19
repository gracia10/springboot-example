package com.rest.event;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import com.rest.domain.Board;

@RepositoryEventHandler(Board.class)
public class BoardEventHandler {
	
	@HandleBeforeCreate
	public void beforeCreateBoard(Board board) {
		board.setCreatedDateNow();
	}
	
	@HandleBeforeSave
	public void beforeSaveBoard(Board board) {
		board.setUpdatedDateNow();
	}
}
