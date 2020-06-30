import com.atguigu.mp.beans.Employee;
import com.atguigu.mp.mapper.EmployeeMapper;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMp {

    private ApplicationContext iocContext = new
            ClassPathXmlApplicationContext("applicationContext.xml");
    /**
     * 自定义接口
     */
//    @Test
//    public void TestDelateAllStop() {
//        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        int i = employeeMapper.selectCount();
//        System.out.println(">>>>" + i);
//    }

    /**
     * 乐观锁插件
     */
//    @Test
//    public void TestDelateAllStop() {
//        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        Employee employee = new Employee();
//        employee.setEmail("zhouxioamei@163.com");
//        employee.setVersion(1);
//        employee.setId(2000001);
//        employeeMapper.updateById(employee);
//    }

//    @Test
//    public void TestDelateAllStop() {
//        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        employeeMapper.selectById(1);
//    }

//        @Test
//    public void TestDelateAllStop() {
//        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        employeeMapper.delete(null);
//    }


    //    @Test
    public void TestPageUpdateWrapper() {
        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);

        Page<Employee> page = new Page<Employee>(1, 1);
        List<Employee> employees = employeeMapper.selectPage(page, null);
        employees.forEach(System.out::println);
        System.out.println("总数量>>>>" + page.getTotal());
        System.out.println("当前页数>>" + page.getCurrent());
        System.out.println("总页数>>" + page.getPages());
        System.out.println("每页条数>>" + page.getSize());
        System.out.println("是否有上一页" + page.hasPrevious());
        System.out.println("是否是下一页" + page.hasNext());

        page.setRecords(employees);
    }

    //    @Test
    public void TestUpdateWrapper() {
        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
        Employee em = new Employee();
        em.setLastName("dage");
//         employeeMapper.update(em,new EntityWrapper<Employee>().eq("last_name","aaa"));

//        employeeMapper.delete(new EntityWrapper<Employee>().eq("last_name","dddddd23").eq("gender",0));

//        List<Employee> employees = employeeMapper.selectList(new EntityWrapper<Employee>().last(" limit 1"));
//                for (Employee ee : employees) {
//                    System.out.println(ee.toString());
//        }
    }

    //    @Test
    public void TestWrapper() {
//        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        List<Employee> employees = employeeMapper.selectPage(new Page<Employee>(1, 2), new EntityWrapper<Employee>().between("age", 12, 40)
//                .eq("gender", 1).eq("last_name", "aaa"));
//
//        for(Employee ee:employees){
//            System.out.println(ee.toString());
//        }

//        List<Employee> employees = employeeMapper.selectList(new EntityWrapper<Employee>().eq("gender", 1)
//                .like("last_name", "aaa").orNew().eq("gender", 0));
//        for (Employee ee : employees) {
//            System.out.println(ee.toString());
//        }


    }

    //    @Test
    public void delete() {
        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        Integer integer = employeeMapper.deleteById(1);
//        System.out.println(integer);

//        Map<String,Object>map = new HashMap<>();
//        map.put("id",2);
//        Integer integer = employeeMapper.deleteByMap(map);
//        System.out.println(integer);

        List<Integer> lists = new ArrayList<>();
        lists.add(3);
        lists.add(4);
        Integer integer = employeeMapper.deleteBatchIds(lists);
        System.out.println(integer);
    }

    //    @Test
    public void select() {
        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
//        Employee employee = employeeMapper.selectById(8);
//        System.out.println(employee.toString());

//        Employee employee = new Employee();
//        employee.setId(7);
//        employee.setLastName("dddddd23");
//
//        Employee employee1 = employeeMapper.selectOne(employee);
//        System.out.println(employee1.toString());

//        List<Integer> idList = new ArrayList<Integer>();
//        idList.add(1);
//        idList.add(9);
//        List<Employee> employees = employeeMapper.selectBatchIds(idList);
//        for(Employee em:employees){
//            System.out.println(em.toString());
//        }

//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("last_name", "Tom");
//        List<Employee> employees = employeeMapper.selectByMap(map);
//        for (Employee em : employees) {
//            System.out.println(em.toString());
//        }

//        List<Employee> employees = employeeMapper.selectPage(new Page<>(2, 2), null);
//
//        for (Employee em : employees) {
//            System.out.println(em.toString());
//        }
    }

    /**
     * 更新方法
     */
//    @Test
    public void update() {
        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setId(9);
        employee.setLastName("kkkkkkkkk");
        employee.setEmail("googlebrain@163.com");
        employee.setGender(0);
        employee.setAge(44);
        Integer integer1 = employeeMapper.updateById(employee);
        System.out.println(integer1);
    }

    /**
     * 插入方法
     */
    @Test
    public void insertI() {
        EmployeeMapper employeeMapper = iocContext.getBean("employeeMapper", EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setLastName("dddddd23");
//        employee.setEmail("163.com");
//        employee.setGender(1);
        employee.setAge(22);
//        Integer insert = employeeMapper.insert(employee);
        Integer integer = employeeMapper.insertAllColumn(employee);
        Integer id = employee.getId();
        System.out.println(id);
    }

    /**
     * 测试
     *
     * @throws Exception
     */
//     @Test
    public void testEnvironment() throws Exception {
        DataSource ds = iocContext.getBean("dataSource", DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(">>>>>" + conn);
    }
}
