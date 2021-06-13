create table questions
(
    id             bigserial primary key,
    search_name    varchar not null,
    questions_json varchar not null,
    answers_json   varchar not null
);
