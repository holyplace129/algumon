INSERT INTO admin (name, email, password, create_date, is_deleted, authority)
VALUES ('관리자', 'test@test.com', '1234', '2024-10-01', FALSE, 'MASTER'),
       ('중관자', 'test1@test.com', '1234', '2024-10-02', FALSE, 'MANAGER');

INSERT INTO users (email, password, level, experience_point, create_date, visit_cnt, is_blocked,is_deleted)
VALUES ('test@user.com', '1234', 3, 10, '2024-10-03', 4, FALSE, FALSE),
       ('test1@user.com', '1234', 1, 5, '2024-10-03', 1, FALSE, FALSE),
       ('test2@user.com', '1234', 2, 10, '2024-10-03', 3, FALSE, FALSE);

INSERT INTO post (title, content, views, create_date, user_id, category)
VALUES ('우왕', '좋다', 2, '2024-10-04 00:00:00', 1, 'IT'),
       ('test1', 'test12', 1, '2024-10-05 00:00:00', 2, '주방'),
       ('test2', 'test22', 3, '2024-10-05 00:00:00', 3, '자유');

INSERT INTO comment (content, create_date, post_id, user_id)
VALUES ('댓글1', '2024-10-06 00:00:00', 1, 1),
       ('댓글2', '2024-10-06 00:00:00', 1, 2),
       ('댓글3', '2024-10-06 00:00:00', 2, 3);