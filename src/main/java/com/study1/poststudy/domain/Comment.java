package com.study1.poststudy.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "postId")
    private int postId;

    @CreationTimestamp
    @Column(name = "createdDateTime")
    private LocalDateTime createdDateTime;

    @Column(name = "writer")
    private String writer;

    @Column(name = "content")
    private String content;
}
