use rerolog;

alter table Category
    add unique (name);
alter table Post
    add unique (title);
