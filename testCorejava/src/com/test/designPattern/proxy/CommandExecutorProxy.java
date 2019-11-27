package com.test.designPattern.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    boolean         isAdmin;
    CommandExecutor cmdExecute;

    public CommandExecutorProxy(String username, String password) {
        if ("saurabh".equals(username) && "chanchal".equalsIgnoreCase(password)) {
            isAdmin = true;
            cmdExecute = new CommandExecutorImpl();
        }
    }

    @Override
    public void executeCommand(String cmd) {
        if (isAdmin) {
            cmdExecute.executeCommand(cmd);
        } else {
            System.out.println("cmd :" + cmd + " Provided user is not permitted to run this command");
        }

    }
}