package com.xu.test7;

import java.lang.invoke.SerializedLambda;

public class ManKind {
    private int sex;
    private int salary;

    public void manOrWoman(){
        if (sex == 1){
            System.out.println("man");
        }else if (sex == 0){
            System.out.println("woman");
        }else {
            System.out.println("您输入的数字不合理");
        }
    }

    public void employed(){
        if (salary == 0){
            System.out.println("no job");
        }else if (salary != 0){
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
