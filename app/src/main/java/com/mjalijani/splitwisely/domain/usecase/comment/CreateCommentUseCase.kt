package com.mjalijani.splitwisely.domain.usecase.comment

import com.mjalijani.splitwisely.domain.entity.comment.CreateComment
import com.mjalijani.splitwisely.domain.repository.CommentRepository
import javax.inject.Inject

class CreateCommentUseCase @Inject constructor(
    private val commentRepository: CommentRepository
) {

    suspend operator fun invoke(newComment: CreateComment) =
        commentRepository.createComment(newComment)

}