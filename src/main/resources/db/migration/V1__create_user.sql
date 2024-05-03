CREATE TABLE IF NOT EXISTS user_Info
(
    id    BIGINT NOT NULL AUTO_INCREMENT,
   user_name  VARCHAR(255),
    user_email VARCHAR(255),
      CONSTRAINT pk_user_info PRIMARY KEY (id)
    );