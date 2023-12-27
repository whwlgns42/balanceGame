CREATE TABLE questions (
    idx NUMBER PRIMARY KEY,
    title VARCHAR2(255) NOT NULL,
    content_A VARCHAR2(255) NOT NULL,
    content_B VARCHAR2(255) NOT NULL,
    writer NUMBER REFERENCES users(idx), -- 로그인 필요한 경우에는 users 테이블의 idx 컬럼을 참조할 수 있습니다.
    reg_date DATE DEFAULT SYSDATE
);