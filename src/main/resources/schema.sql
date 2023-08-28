CREATE TABLE IF NOT EXISTS Content
(
    id           INTEGER AUTO_INCREMENT,
    title        VARCHAR(255) NOT NULL,
    desc         TEXT,
    url          VARCHAR(255),
    status       VARCHAR(20)  NOT NULL,
    content_type   VARCHAR(50)  NOT NULL,
    date_created TIMESTAMP    NOT NULL,
    date_updated TIMESTAMP,

    PRIMARY KEY (id)
);

INSERT INTO Content(title, desc, status, content_type, date_created)
VALUES ('My Spring Data Blog Post',
        'A Post about spring data',
        'IDEA',
        'ARTICLE',
        CURRENT_TIMESTAMP());