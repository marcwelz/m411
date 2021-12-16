package ch.bbw.mw.employee;

import ch.bbw.mw.employee.persistence.EmployeePersistence;

public class App {

    public static void main(String[] args) {
        EmployeePersistence employeePersistence = new EmployeePersistence();
        System.out.println(employeePersistence.getAllEmployees());
    }
}

/*
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-mapping PUBLIC
        "-//Hibernate/Hibernate Configuration DTD//EN"
        "http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd">
<hibernate-mapping>
    <class name="ch.bbw.mw.employee.model.Employee" table="empleyee">
        <id name="id" type="int">
            <column name="id" />
            <generator class="identity" />
        </id>
        <property name="firstname" type="java.lang.String">
            <column name="firstname" />
        </property>
        <property name="lastname" type="java.lang.String">
            <column name="lastname" />
        </property>
        <property name="departmentidfs" type="java.lang.Integer">
            <column name="departmentidfs" />
        </property>
    </class>
</hibernate-mapping>
 */