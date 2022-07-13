# 1、查询"01"课程比"02"课程成绩高的学生的信息及课程分数
SELECT student.*,table3.1score,table3.2score from student INNER JOIN(
SELECT table1.s_id,1score,2score from(
(SELECT s_id,s_score as 1score from score where c_id = '1')table1 inner JOIN
(SELECT s_id,s_score as 2score from score where c_id = '2')table2 on table1.s_id=table2.s_id) where 1score>2score
)table3 
on student.s_id = table3.s_id


# 以上查询语句的思路如下
# 首先写出  查询1课程下的学生编号和成绩   查询2课程下的学生编号和成绩
# 将课程1和课程2都有成绩的人查询出来  需要用 inner join  后面  on 相当于 where 是条件  让s_id相等
# 再对以上的结果进行条件查询  让 课程1成绩大于课程2的成绩
# 和student进行连表查询，可使用右连接（right join ）或者内连接（inner join） 条件就是学生表的s_id等于以上查询结果的s_id
# 写出需要查询的结果 学生表的全部=>student.*     成绩=> table3.1score,table3.2score





#2、查询"01"课程比"02"课程成绩低的学生的信息及课程分数
SELECT student.*,table3.1score,table3.2score from student INNER JOIN(
SELECT table1.s_id,1score,2score from(
(SELECT s_id,c_id as 1id,s_score as 1score from score where c_id = '1')table1 inner JOIN
(SELECT s_id,c_id as 2id,s_score as 2score from score where c_id = '2')table2 on table1.s_id=table2.s_id) where 1score<2score
)table3 
on student.s_id = table3.s_id

#3、查询平均成绩大于等于60分的同学的学生编号和学生姓名和平均成绩
SELECT * from (
SELECT student.s_id,student.s_name,table1.avg_score from student RIGHT JOIN(
SELECT s_id,avg(s_score) as avg_score from score GROUP BY s_id)table1 on student.s_id = table1.s_id)table2 where avg_score>60

#4、查询平均成绩小于60分的同学的学生编号和学生姓名和平均成绩(包括有成绩的和无成绩的)
#5、查询所有同学的学生编号、学生姓名、选课总数、所有课程的总成绩
#6、查询"李"姓老师的数量
#7、询学过"张三"老师授课的同学的信息
#8、查询没学过"张三"老师授课的同学的信息
#9、查询学过编号为"01"并且也学过编号为"02"的课程的同学的信息
#10、查询学过编号为"01"但是没有学过编号为"02"的课程的同学的信息
#11、查询没有学全所有课程的同学的信息
#12、查询至少有一门课与学号为"01"的同学所学相同的同学的信息
#13、查询和"01"号的同学学习的课程完全相同的其他同学的信息
#14、查询没学过"张三"老师讲授的任一门课程的学生姓名
#15、查询两门及其以上不及格课程的同学的学号，姓名及其平均成绩
#16、检索"01"课程分数小于60，按分数降序排列的学生信息
#17、按平均成绩从高到低显示所有学生的所有课程的成绩以及平均成绩
#18、查询各科成绩最高分、最低分和平均分，以如下形式显示：
#19、按各科成绩进行排序，并显示排名
#20、查询学生的总成绩并进行排名
#21、查询不同老师所教不同课程平均分从高到低显示
#22、查询所有课程的成绩第2名到第3名的学生信息及该课程成绩
#23、统计各科成绩各分数段人数：课程编号,课程名称,[100-85],[85-70],[70-60],[0-60]及所占百分比
#24、查询学生平均成绩及其名次
#25、查询各科成绩前三名的记录
#26、查询每门课程被选修的学生数
#27、查询出只有两门课程的全部学生的学号和姓名
#28、查询男生、女生人数
#29、查询名字中含有"风"字的学生信息
#30、查询同名同性学生名单，并统计同名人数
#31、查询1990年出生的学生名单
#32、查询每门课程的平均成绩，结果按平均成绩降序排列，平均成绩相同时，按课程编号升序排列
#33、查询平均成绩大于等于85的所有学生的学号、姓名和平均成绩
#34、查询课程名称为"数学"，且分数低于60的学生姓名和分数
#35、查询所有学生的课程及分数情况
#36、查询任何一门课程成绩在70分以上的学生姓名、课程名称和分数
#37、查询课程不及格的学生
#38、查询课程编号为01且课程成绩在80分以上的学生的学号和姓名
#39、求每门课程的学生人数
#40、查询选修"张三"老师所授课程的学生中，成绩最高的学生信息及其成绩
#41、查询不同课程成绩相同的学生的学生编号、课程编号、学生成绩
#42、查询每门课程成绩最好的前三名
#43、统计每门课程的学生选修人数（超过5人的课程才统计）
#44、检索至少选修两门课程的学生学号
#45、查询选修了全部课程的学生信息
#46、查询各学生的年龄(周岁)
#47、查询本周过生日的学生
#48、查询下周过生日的学生
#49、查询本月过生日的学生
#50、查询12月份过生日的学生