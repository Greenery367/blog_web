
insert into user_tb(name,user_id,password) values('홍길동','aaaa','aaaa');

insert into blog_tb(name,user_id) values('길동이의 코딩 공부방',1);

insert into category_tb(name,user_id,blog_id) values('파이썬',1,1);
insert into category_tb(name,user_id,blog_id) values('자바',1,1);
insert into category_tb(name,user_id,blog_id) values('스프링부트',1,1);

insert into post_tb(title,content,user_id,blog_id,category_id) values('파이썬 라이브러리-플라스크란?',
'플라스크는 파이썬으로 작성된 마이크로 웹 프레임워크의 하나로, Werkzeug 툴킷과 Jinja2 템플릿 엔진에 기반을 둔다. BSD 라이선스이다. 플라스크의 최신 안정판은 2017년 5월 기준으로 1.1.1이다',1,1,1);
