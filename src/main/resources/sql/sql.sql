use test;
create table student (
  'stu_id' bigint not null  auto_increment comment '主键自增',
  'stu_name' varchar(120) not null comment '名称',
  'c_id' bigint comment '所属班级',
  primary key (stu_id),
  foreign key (c_id) references class (c_id)
) charset = utf8 comment '学生表';

create table class (
  'c_id' bigint not null  auto_increment comment '自增主键',
  'c_name' varchar(120) not null comment '班级名称',
  'g_id' bigint comment '班级外键',
  primary key (c_id),
  foreign key (g_id) references grade (g_id)
) charset = utf8 comment '班级表';


create table grade (
  'g_id' bigint not null auto_increment comment '年级主键',
  'g_name' varchar(120) not null comment '年级名称',
  primary key (g_id)
) charset = utf8 comment '年级表';

create table teacher (
  't_id' bigint not null  auto_increment comment '自增主键',
  't_name' varchar(120) not null comment '老师名称',
  primary key (t_id)
) charset = ut8 comment '教师表';