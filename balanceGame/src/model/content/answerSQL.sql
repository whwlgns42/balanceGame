CREATE TABLE user_answers (
    idx NUMBER PRIMARY KEY,
    user_idx NUMBER REFERENCES users(idx),
    quest_idx NUMBER REFERENCES questions(idx),
    content VARCHAR2(255) NOT NULL,
    reg_date DATE DEFAULT SYSDATE
);