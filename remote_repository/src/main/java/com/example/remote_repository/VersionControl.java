package com.example.remote_repository;

//自己的远程仓库测试类
public class VersionControl {

    private static final VersionControl versionControl = new VersionControl();
    private String group;
    private String name;
    private String version;
    private String testField;

    private VersionControl() {
        group = "wonderful";
        name = "remote_test";
        version = "1.0.0";
        testField = "testField";
    }

    public static VersionControl getInstance(){
        return versionControl;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getTestField() {
        return testField;
    }
}
