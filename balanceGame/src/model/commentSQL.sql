CREATE TABLE user_comments (
    idx NUMBER PRIMARY KEY,
    quest_idx NUMBER REFERENCES questions(idx),
    user_idx NUMBER REFERENCES users(idx),
    user_comment VARCHAR2(1000) NOT NULL,
    reg_date DATE DEFAULT SYSDATE
);