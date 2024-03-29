package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rest.domain.Board;
import com.rest.repository.BoardRepository;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;
		
    public Board findBoardByIdx(Long idx) {
        return boardRepository.findById(idx).orElse(new Board());
    }
    
    public Page<Board> findBoardList(Pageable pageable){
    	pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0: pageable.getPageNumber()-1, pageable.getPageSize());
    	return boardRepository.findAll(pageable);
    }
}
