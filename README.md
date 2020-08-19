- 应用使用Flavor控制不同平台项目，目前分为pad和phone，可在 Build Variant中选择对应的编译项
- 差异部分
    - 如果是资源类的，可以放在 src/main/res 和 src/phone/res 目录下对应位置。分别在layout/drawable/values中调用不同资源
    - 如果是代码类，有两种区分方式
        - 在代码中通过BuildConfig.FLAVOR来区分是哪个项目
        - 将对应类分别放置于 src/main/java 和 src/phone.java 目录下对应包中。

