USE Servlet_Jsp_Jdbc;

# CREATE TABLE role
CREATE TABLE role(
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name VARCHAR(255) NOT NULL,
  code VARCHAR(255) NOT NULL,
  createddate TIMESTAMP NULL,
  modifieddate TIMESTAMP NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

# CREATE TABLE usr
CREATE TABLE usr (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  username VARCHAR(150) NOT NULL,
  password VARCHAR(150) NOT NULL,
  fullname VARCHAR(150) NULL,
  status int NOT NULL,
  roleId bigint NOT NULL,
  createddate TIMESTAMP NULL,
  modifieddate TIMESTAMP NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

# CREATE FOREIGN KEY . role and usr
ALTER TABLE usr ADD CONSTRAINT fk_usr_role FOREIGN KEY (roleId) REFERENCES role(id);

# CREATE TABLE news
CREATE TABLE news (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  title VARCHAR(255) NULL,
  thumbnail VARCHAR(255) NULL,
  shortdescription TEXT NULL,
  content TEXT NULL,
  categoryId bigint NOT NULL,
  createddate TIMESTAMP NULL,
  modifieddate TIMESTAMP NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

# CREATE TABLE category
CREATE TABLE category (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  name VARCHAR(255) NOT NULL,
  code VARCHAR(255) NOT NULL,
  createddate TIMESTAMP NULL,
  modifieddate TIMESTAMP NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

# CREATE FOREIGN KEY . news with category
ALTER TABLE news ADD CONSTRAINT fk_news_category FOREIGN KEY (categoryId) REFERENCES category(id);

# CREATE TABLE comments
CREATE TABLE comments (
  id bigint NOT NULL PRIMARY KEY auto_increment,
  content TEXT NOT NULL,
  usrId bigint NOT NULL,
  newsId bigint NOT NULL,
  createddate TIMESTAMP NULL,
  modifieddate TIMESTAMP NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

# CREATE FOREIGN KEY . usr with comments
ALTER TABLE comments ADD CONSTRAINT fk_comments_user FOREIGN KEY (usrId) REFERENCES usr(id);

# CREATE FOREIGN KEY . news with comments
ALTER TABLE comments ADD CONSTRAINT fk_comment_news FOREIGN KEY (newsId) REFERENCES news(id);

# Executed!!!
# SELECT * FROM category;