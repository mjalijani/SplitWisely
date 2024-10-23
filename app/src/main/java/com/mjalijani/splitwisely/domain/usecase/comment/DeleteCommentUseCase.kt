package com.mjalijani.splitwisely.domain.usecase.comment

import com.mjalijani.splitwisely.domain.repository.CommentRepository
import javax.inject.Inject

class DeleteCommentUseCase @Inject constructor(
    private val commentRepository: CommentRepository
) {

    suspend operator fun invoke(commentId: String) = commentRepository.deleteComment(commentId)

}