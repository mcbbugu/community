CREATE TABLE question
(
    id int AUTO_INCREMENT PRIMARY KEY,
    title varchar(50),
    description TEXT,
    gmt_create BIGINT,
    gmt_modified BIGINT,
    comment_count int DEFAULT 0,
    view_count int DEFAULT 0,
    like_count int DEFAULT 0,
    creator int,
    tag varchar(256)
);