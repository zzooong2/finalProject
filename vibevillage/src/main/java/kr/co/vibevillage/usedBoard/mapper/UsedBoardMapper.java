package kr.co.vibevillage.usedBoard.mapper;

import kr.co.vibevillage.usedBoard.model.UsedBoardDto;
import kr.co.vibevillage.usedBoard.model.UsedBoardImageDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsedBoardMapper {
    public List<UsedBoardDto> usedBoardListXML();
    public UsedBoardDto usedBoardDetailXML(@Param("id") int id);
    public int usedBoardEnrollXML(@Param("usedBoard") UsedBoardDto usedBoard);
    public int usedBoardProductEnrollXML(@Param("usedBoard")UsedBoardDto usedBoard);
}
