insert into tools (id,title,link,description) values (1,'Notion','https://notion.so','All in one tool to organize teams and ideas. Write, plan, collaborate, and get organized.');

insert into tags(id,title) values (1,'organization');
insert into tags(id,title) values (2,'planning');
insert into tags(id,title) values (3,'collaboration');
insert into tags(id,title) values (4,'writing');
insert into tags(id,title) values (5,'calendar');

insert into tools_has_tags(tool_id,tag_id) values (1,1);
insert into tools_has_tags(tool_id,tag_id) values (1,2);
insert into tools_has_tags(tool_id,tag_id) values (1,3);
insert into tools_has_tags(tool_id,tag_id) values (1,4);
insert into tools_has_tags(tool_id,tag_id) values (1,5);

insert into tools (id,title,link,description) values (2,'json-server','https://github.com/typicode/json-server','Fake REST API based on a json schema. Useful for mocking and creating APIs for front-end devs to consume in coding challenges.');

insert into tags(id,title) values (6,'api');
insert into tags(id,title) values (7,'json');
insert into tags(id,title) values (8,'schema');
insert into tags(id,title) values (9,'node');
insert into tags(id,title) values (10,'github');
insert into tags(id,title) values (11,'rest');

insert into tools_has_tags(tool_id,tag_id) values (2,6);
insert into tools_has_tags(tool_id,tag_id) values (2,7);
insert into tools_has_tags(tool_id,tag_id) values (2,8);
insert into tools_has_tags(tool_id,tag_id) values (2,9);
insert into tools_has_tags(tool_id,tag_id) values (2,10);
insert into tools_has_tags(tool_id,tag_id) values (2,11);

insert into tools (id,title,link,description) values (3,'fastify','https://www.fastify.io/','Extremely fast and simple, low-overhead web framework for NodeJS. Supports HTTP2.');

insert into tags(id,title) values (12,'web');
insert into tags(id,title) values (13,'framework');
insert into tags(id,title) values (14,'node');
insert into tags(id,title) values (15,'http2');
insert into tags(id,title) values (16,'https');
insert into tags(id,title) values (17,'localhost');

insert into tools_has_tags(tool_id,tag_id) values (3,12);
insert into tools_has_tags(tool_id,tag_id) values (3,13);
insert into tools_has_tags(tool_id,tag_id) values (3,14);
insert into tools_has_tags(tool_id,tag_id) values (3,15);
insert into tools_has_tags(tool_id,tag_id) values (3,16);
insert into tools_has_tags(tool_id,tag_id) values (3,17);

