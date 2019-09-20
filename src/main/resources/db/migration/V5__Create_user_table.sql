CREATE TABLE comment
(
        id bigint AUTO_INCREMENT PRIMARY KEY,
        parent_id bigint NOT NULL,
        type int,
        comentator int NOT NULL,
        gmt_create bigint,
        gmt_modified bigint,
        like_count bigint DEFAULT 0
);
COMMENT ON COLUMN comment.parent_id IS '父类id';
COMMENT ON COLUMN comment.type IS '区分级别';
COMMENT ON COLUMN comment.comentator IS '评论人id';
COMMENT ON COLUMN comment.gmt_create IS '创建时间';
COMMENT ON COLUMN comment.gmt_modified IS '更新时间';