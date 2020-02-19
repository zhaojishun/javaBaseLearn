package cn.zhaojishun.javaBase.设计模式.代理模式.静态代理.例子3;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-19 11:03
 */
public class UserServiceLogProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        printLog("add");
    }

    @Override
    public void del() {
        userService.del();
        printLog("del");
    }

    @Override
    public void update() {
        userService.update();
        printLog("update");
    }

    @Override
    public void query() {
        userService.query();
        printLog("query");
    }

    private void printLog(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}