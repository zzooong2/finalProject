package kr.co.vibevillage.experienceAndReviewBoard.service;

import kr.co.vibevillage.experienceAndReviewBoard.dto.ExperienceBoardDTO;
import kr.co.vibevillage.experienceAndReviewBoard.domain.ExperienceBoard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExperienceBoardService {
    List<ExperienceBoard> getAllPosts(int page, int size);
    void createPost(ExperienceBoardDTO experienceBoardDto);
    void updatePost(Long rId, ExperienceBoardDTO experienceBoardDto);
    void deletePost(Long rId);
    ExperienceBoardDTO getPostById(Long rId);
    List<ExperienceBoardDTO> getOtherPosts(Long excludeId);
    List<ExperienceBoardDTO> searchPosts(@Param("keyword") String keyword);
    List<ExperienceBoardDTO> getTopLikedPosts();
    List<ExperienceBoardDTO> getPostsByCategory(Long categoryId);

    void toggleLike(Long rId, Long uNo);
    boolean isPostLikedByUser(Long rId, Long uNo);
    int countLikes(Long rId);

    List<ExperienceBoard> getPostsWithCommentCount();

    List<ExperienceBoardDTO> getPostsWithCommentCount(int page, int size);
}

