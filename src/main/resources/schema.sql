CREATE TABLE IF NOT EXISTS Content
(
    id           INTEGER AUTO_INCREMENT,
    title        VARCHAR(255) NOT NULL,
    desc         TEXT,
    status       VARCHAR(20)  NOT NULL,
    contentTpe   VARCHAR(50)  NOT NULL,
    url          VARCHAR(255),
    date_created TIMESTAMP    NOT NULL,
    date_updated TIMESTAMP,

    PRIMARY KEY (id)
);

INSERT INTO Content(title, desc, status, contentTpe, date_created)
VALUES ('My Spring Data Blog Post',
        'A Post about spring data',
        'IDEA',
        'ARTICLE',
        CURRENT_TIMESTAMP());